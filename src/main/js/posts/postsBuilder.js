import React from 'react';
import Posts from './posts'
const client = require('../client');
// This PostsBuilder class is used in the app.js as a react component
class PostsBuilder extends React.Component {
  constructor(props) {
    super(props)
    this.state = {posts: []};
  }

  componentDidMount() {
    client({method: 'GET', path: '/api/posts'}).then(response => {
      this.setState({posts: response.entity._embedded.posts});
    });
  }

	render() {
		return (
      <Posts posts={this.state.posts}/>
		)
	}
}

export default PostsBuilder;

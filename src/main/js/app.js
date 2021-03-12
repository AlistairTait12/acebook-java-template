const React = require('react'); // using react
const ReactDOM = require('react-dom');

// import the code from the postsBuilder file
import PostsBuilder from './posts/postsBuilder'
class App extends React.Component {

  render() {
    return (
      <PostsBuilder />
    )
  }
}

ReactDOM.render(
	<App />,
	document.getElementById('app')
)

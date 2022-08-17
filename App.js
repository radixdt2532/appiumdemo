import React from 'react'
import {Text,View, TouchableOpacity} from 'react-native'

const App = () => {
  return(
    <View>
      <TouchableOpacity
        accessibilityLabel = "alertButton"
        style={{width:100,height:100,backgroundColor :"aqua"}}
        onPress = {() => alert("Hello")}
      >
<Text>Hello</Text>
      </TouchableOpacity>
    </View>
  )
}

export default App
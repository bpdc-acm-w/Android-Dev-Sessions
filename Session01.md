
## Content to be covered - Session 1:
Using Layout Editor in Android Studio : 
- Intro to UI of Android Studio
- XML basic Introduction
- Image Views, Text Views, Launcher Icons
- Run the app {Check if on the same page}
- Display Assignment {Can be submitted on Github Classroom, special mention to female participants}
- Inform about various other development platforms { React Native, Xamarin, Flutter}

## Basic Layout of Android Studio
The [Layout Editor](https://developer.android.com/studio/write/layout-editor) appears when you open an XML layout file.

- Palette: List of views and view groups that you can drag into your layout.
- Component Tree: View hierarchy for your layout. Read More about types of layouts available [here](https://developer.android.com/guide/topics/ui/declaring-layout#java)
- Toolbar: Buttons to configure your layout appearance in the editor and to change some layout attributes.
- Design editor: Layout in Design or Blueprint view, or both.
- Attributes: Controls for the selected view's attributes

Other header bar icons:

- Design and blueprint: Select how you'd like to view your layout in the editor; select either the Design view (a real-world preview of your layout), the Blueprint view (only outlines for each view), or Design + Blueprint for both side by side.
Tip: Press B to cycle through these views.

- Screen orientation and layout variants: Select between landscape and portrait screen orientation, or other screen modes for which your app provides alternative layouts, such as night mode. This menu also contains commands for creating a new layout variant. 

- Device type and size: Select the device type (phone/tablet, Android TV, or Wear OS) and screen configuration (size and density). 

- API version: Select the version of Android on which to preview your layout.
- App theme: Select which UI theme to apply to the preview. 
- Language: Select the language to show for your UI strings. This list displays only the languages available in your string resources. If you'd like to edit your translations, click Edit Translations from the drop-down menu (see Localize the UI with Translations Editor).

_Great! So now we know a little bit about the interface to get started making our cookie clicker app!_

Start with an Empty Activity. Untick "Have Kotlin Support"
### TextView 
Lets start by dragging a simple text view onto the layout. 
- Change the text to "Cookie clicker" by double clicking. 
- Modify this to make the font bigger and bolder. 
- Central align it. 

Now that we have our Text View, lets take a look at the various files that describe this. In Android Studio there are two ways to create a layout, one is how you just dragged and dropped & another is using XML. 

## Intro to XML 
Let's take a look at what XML is before we move any further. https://www.w3schools.com/xml/xml_whatis.asp + Compare the layoutmain.xml code to XML learnt.

## Image View, Buttons & Launcher Icons
First we start off by dragging an _ImageView_ onto the layout. We will place the [Cookie Image] (https://drive.google.com/open?id=1ow1tGYvbJqMmBTr3Jt_LJ9RRuSHlhEt0) here.

### Image View:
1. Drag to main layout
2. Replace with cookie image : Click ImageView and choose the image.
3. Add Id: CookieView 

Add the following code in the MainActivity.java
```
ImageView imgv = (ImageView) findViewById(R.id.img_v);
```
### Button:
We will be following the material design [guidelines](https://material.io/design/components/buttons.html#) (Dont Worry if you haven't heard of it before!)
1. Drag to layout
2. Change text to "Click!"
3. Add Id: CookieButton

Click Button & talk about onclick listeners. Add the following code:
```
Button button = (Button) findViewById(R.id.button_send);
button.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
        // Do something in response to button click
    }
});
```

Add a text view on layout, add code to make the text say clicked when button is clicked. (Explain multiple clicks)

Great! Add text view count: and another text view countvalue
countvalue:
1. Initialize a variable for countvalue 
2. increment everytime clicked

```
TextView textView = (TextView) findViewById(R.id.textview);
textView.setText("Count"+countvalue);
```

Build/Run the app: https://developer.android.com/studio/run/emulator
You can connect an usb cable and run it on your physical device as well (Ensure Developer Options is enabled for your Android phone! https://developer.android.com/studio/run/device

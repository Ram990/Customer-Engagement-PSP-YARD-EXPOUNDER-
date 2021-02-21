package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.WebViewer;
import com.google.appinventor.components.runtime.Camcorder;
import com.google.appinventor.components.runtime.Camera;
import com.google.appinventor.components.runtime.personalimageclassifier;
class Screen1 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private HorizontalScrollArrangement HorizontalScrollArrangement1;
  private Button Button1;
  private Button Button2;
  private Button Button3;
  private WebViewer WebViewer1;
  private Camcorder Camcorder1;
  private Camera Camera1;
  private personalimageclassifier personalimageclassifier1;
  protected void $define() {
    this.AppName("FACE_EXPRESSION_DETECTION");
    this.Title("Screen1");
    Label1 = new Label(this);
    Label1.FontSize(22);
    Label1.FontTypeface(3);
    Label1.Text("Result Prediction");
    Label1.TextColor(0x00000000);
    HorizontalScrollArrangement1 = new HorizontalScrollArrangement(this);
    HorizontalScrollArrangement1.AlignVertical(2);
    HorizontalScrollArrangement1.Height(-1015);
    HorizontalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Button1 = new Button(HorizontalScrollArrangement1);
    Button1.BackgroundColor(0xFFFFFFFF);
    Button1.FontItalic(true);
    Button1.FontSize(16);
    Button1.FontTypeface(3);
    Button1.Height(-1010);
    Button1.Width(LENGTH_FILL_PARENT);
    Button1.Shape(1);
    Button1.Text("CAMERA");
    Button2 = new Button(HorizontalScrollArrangement1);
    Button2.BackgroundColor(0xFFFFFFFF);
    Button2.FontItalic(true);
    Button2.FontSize(16);
    Button2.FontTypeface(3);
    Button2.Height(-1010);
    Button2.Width(LENGTH_FILL_PARENT);
    Button2.Shape(1);
    Button2.Text("PREDICT");
    Button2.TextColor(0xFF000000);
    Button3 = new Button(HorizontalScrollArrangement1);
    Button3.BackgroundColor(0xFFFFFFFF);
    Button3.FontItalic(true);
    Button3.FontSize(16);
    Button3.FontTypeface(3);
    Button3.Height(-1010);
    Button3.Width(LENGTH_FILL_PARENT);
    Button3.Shape(1);
    Button3.Text("SELFIE");
    WebViewer1 = new WebViewer(this);
    Camcorder1 = new Camcorder(this);
    Camera1 = new Camera(this);
    personalimageclassifier1 = new personalimageclassifier(this);
    personalimageclassifier1.InputMode(Video);
    personalimageclassifier1.Model(model.mdl);
    personalimageclassifier1.WebViewer(WebViwer1);
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(Button1) && eventName.equals("Click") ){
      Button1Click();
      return true;
    }
    if( component.equals(Button2) && eventName.equals("Click") ){
      Button2Click();
      return true;
    }
    if( component.equals(Button3) && eventName.equals("Click") ){
      Button3Click();
      return true;
    }
    return false;
  }
  public void Button1Click(){
  }
  public void Button2Click(){
  }
  public void Button3Click(){
  }
}
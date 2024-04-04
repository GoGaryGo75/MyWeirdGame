import java.awt.event.KeyListener;
import java.awt.event.KeyEvent

public class KeyboardInputs implements KeyListener {
  private Window window;
  
  public KeyboardInputs(window) {
    this.window = window;
  }
    
  
  @Override
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_W:
        window.get("player").forward()
        break;
      case KeyEvent.VK_A:
        window.get("player").left()
        break;
      case KeyEvent.VK_S:
        window.get("player").backward()
        break;
      case KeyEvent.VK_D:
        window.get("player").right()
        break;
      default:
        break;
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {}

  @Override
  public void keyReleased(KeyEvent e) {}
}

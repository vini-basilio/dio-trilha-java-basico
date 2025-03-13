/**
 * Represents a Smart TV with functionalities such as power on/off, channel
 * control, and volume adjustment.
 *
 * <p>
 * The {@code SmartTv} class simulates the behavior of a Smart TV, allowing
 * users to turn it on or off,
 * change channels, adjust the volume, and view the current settings.
 * </p>
 *
 * <p>
 * It contains the following functionalities:
 * </p>
 * <ul>
 * <li>Turning the TV on and off.</li>
 * <li>Increasing and decreasing the volume.</li>
 * <li>Moving to the next or previous channel.</li>
 * <li>Changing to a specific channel.</li>
 * </ul>
 *
 * <p>
 * The default state of the TV is off, set to channel 1, and volume level 25.
 * </p>
 * 
 * @author Vini
 * @version 1.0
 * @since 13/03/25
 */
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    /**
     * Turns on the Smart TV.
     * Sets the power state to true and displays a confirmation message.
     */
    public void ligar() {
        ligada = true;
        System.out.println("SmartTv ligada.");
    }

    /**
     * Turns off the Smart TV.
     * Sets the power state to false and displays a confirmation message.
     */
    public void desligar() {
        ligada = true;
        System.out.println("SmartTv desligada.");
    }

    /**
     * Increases the TV volume by one unit.
     * Displays the new volume level after the increase.
     */
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume. Novo valor: " + volume);
    }

    /**
     * Decreases the TV volume by one unit.
     * Displays the new volume level after the decrease.
     */
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume. Novo valor: " + volume);
    }

    /**
     * Increases the TV channel number by one.
     * Displays the new channel number after the change.
     */
    public void aumentarCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    /**
     * Decreases the TV channel number by one.
     * Displays the new channel number after the change.
     */
    public void diminuirCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    /**
     * Changes the TV channel to a specified number.
     * 
     * @param novoCanal the new channel number to set
     */
    public void mudarDeCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }
}

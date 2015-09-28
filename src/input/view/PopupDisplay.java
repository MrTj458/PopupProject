package input.view;

import javax.swing.JOptionPane;

/**
 * This Class Provides popups for input and output.
 * @author thod0127
 * @version 1.0 9/24/15
 */
public class PopupDisplay
{
	/**
	 * Provides a popup box for asking a question and returns the user's text answer.
	 * Returns the user's response as a String.
	 * @param input The supplied question for the popup.
	 * @return The user's answer to the supplied question.
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	/**
	 * Displays a popup box showing the text sent to it through the parameter.
	 * @param input The text to be displayed in the popup.
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}

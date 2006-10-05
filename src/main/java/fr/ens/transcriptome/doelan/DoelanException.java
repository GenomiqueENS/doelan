/*
 *                Doelan development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU General Public Licence.  This should
 * be distributed with the code. If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/gpl.txt
 *
 * Copyright (c) 2004-2005 ENS Microarray Platform
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the Doelan project and its aims,
 * or to join the Doelan mailing list, visit the home page
 * at:
 *
 *      http://www.transcriptome.ens.fr/doelan
 */

package fr.ens.transcriptome.doelan;

/**
 * A nestable quality exception. This class came from from Biojava code.
 * @author Laurent Jourdren
 * @author Matthew Pocock
 */
public class DoelanException extends Exception {

  /**
   * Create a new QualityException with a message.
   * @param message the message
   */
  public DoelanException(final String message) {
    super(message);
  }

  /**
   * Create a new QualityException with a cause.
   * @param ex the Throwable that caused this QualityException
   */
  public DoelanException(final Throwable ex) {
    super(ex);
  }

  /**
   * Create a new QualityException with a cause and a message.
   * @param ex the Throwable that caused this QualityException
   * @param message the message
   * @deprecated use new QualityException(message, ex) instead
   */
  public DoelanException(final Throwable ex, final String message) {
    this(message, ex);
  }

  /**
   * Create a new QualityException with a cause and a message.
   * @param message the message
   * @param ex the Throwable that caused this QualityException
   */
  public DoelanException(final String message, final Throwable ex) {
    super(message, ex);
  }

  /**
   * Create a new QualityException.
   */
  public DoelanException() {
    super();
  }
}
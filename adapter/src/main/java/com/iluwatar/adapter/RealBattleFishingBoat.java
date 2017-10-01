
package com.iluwatar.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Adapter class. Adapts the interface of the device ({@link FishingBoat}) into {@link BattleShip}
 * interface expected by the client ({@link Captain}). <br>
 * In this case we added a new function fire to suit the interface. We are reusing the
 * {@link FishingBoat} without changing itself. The Adapter class can just map the functions of the
 * Adaptee or add, delete features of the Adaptee.
 *
 * Da es sich um einen class based adapter handelt erbt er von {@link FishingBoat}
 *
 */
public class RealBattleFishingBoat extends FishingBoat implements BattleShip {

  private static final Logger LOGGER = LoggerFactory.getLogger(RealBattleFishingBoat.class);

  @Override
  public void fire() {
    LOGGER.info("fire!");
  }

  @Override
  public void move() {
    this.sail();
  }

}


package com.iluwatar.abstractfactory;

import com.iluwatar.abstractfactory.ElfKingdomFactory;
import com.iluwatar.abstractfactory.KingdomFactory;
import com.iluwatar.abstractfactory.OrcKingdomFactory;

public final class KingdomFactoryProducer {
    public KingdomFactoryProducer() {
    }

    public static KingdomFactory getFactory(String type) {
        return (KingdomFactory)(type.equalsIgnoreCase("elf")?new ElfKingdomFactory():(type.equalsIgnoreCase("ork")?new OrcKingdomFactory():null));
    }
}

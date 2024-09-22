package com.jagadeesh.learning;


public enum VehicleType {
    BASIC(Branding.GOLD),
    PREMIUM(Branding.SILVER),
    PLUS(Branding.BRONZE);
    private Branding branding;
    VehicleType(Branding branding)
    {
        this.branding=branding;
    }
}

package org.webrtc.voiceengine;

/* loaded from: classes13.dex */
public final class BuildInfo {
    public static java.lang.String getAndroidBuildId() {
        return android.os.Build.ID;
    }

    public static java.lang.String getBrand() {
        return android.os.Build.BRAND;
    }

    public static java.lang.String getBuildRelease() {
        return android.os.Build.VERSION.RELEASE;
    }

    public static java.lang.String getBuildType() {
        return android.os.Build.TYPE;
    }

    public static java.lang.String getDevice() {
        return android.os.Build.DEVICE;
    }

    public static java.lang.String getDeviceManufacturer() {
        return android.os.Build.MANUFACTURER;
    }

    public static java.lang.String getDeviceModel() {
        return android.os.Build.MODEL;
    }

    public static java.lang.String getProduct() {
        return android.os.Build.PRODUCT;
    }

    public static int getSdkVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }
}

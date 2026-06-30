package com.tencent.skyline.jni;

/* loaded from: classes7.dex */
public class SkylineJNI {
    private static com.tencent.skyline.jni.SkylineCronetClientInterface cronetClient;
    private static com.tencent.skyline.jni.SkylineReporterInterface reporter;
    private static com.tencent.skyline.jni.ISkylineExperiment skylineExperiment;

    private SkylineJNI() {
    }

    public static native void disableNewImage();

    public static native void disableNewSVGImage();

    public static native void enableNewImage();

    public static native void enableNewSVGImage();

    public static native void exitFullscreen(int i17, long j17);

    public static java.lang.String getExperiment(java.lang.String str, java.lang.String str2) {
        com.tencent.skyline.jni.ISkylineExperiment iSkylineExperiment = skylineExperiment;
        return iSkylineExperiment == null ? str2 : iSkylineExperiment.get(str, str2);
    }

    public static native void getSkylineDebugInfo(java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public static void idKeyReport(int i17, int i18, int i19) {
        com.tencent.skyline.jni.SkylineReporterInterface skylineReporterInterface = reporter;
        if (skylineReporterInterface != null) {
            skylineReporterInterface.idKeyReport(i17, i18, i19);
        }
    }

    public static void kvStatReport(int i17, java.lang.String str) {
        com.tencent.skyline.jni.SkylineReporterInterface skylineReporterInterface = reporter;
        if (skylineReporterInterface != null) {
            skylineReporterInterface.kvReport(i17, str);
        }
    }

    public static native void notifyCronetResponse(int i17, int i18, int i19, java.lang.String[] strArr, java.lang.String[] strArr2, byte[] bArr);

    public static void setCronetClient(com.tencent.skyline.jni.SkylineCronetClientInterface skylineCronetClientInterface) {
        cronetClient = skylineCronetClientInterface;
    }

    public static native void setDiskCacheDirPath(java.lang.String str);

    public static native void setEnableCronet(long j17, boolean z17);

    public static native void setEnableCronet2(long j17, boolean z17, java.lang.String str, java.lang.String str2);

    public static native void setEnableReport(boolean z17);

    public static void setReporter(com.tencent.skyline.jni.SkylineReporterInterface skylineReporterInterface) {
        reporter = skylineReporterInterface;
    }

    public static void setSkylineExperiment(com.tencent.skyline.jni.ISkylineExperiment iSkylineExperiment) {
        skylineExperiment = iSkylineExperiment;
    }

    public static void startCronetHttpTask(int i17, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        com.tencent.skyline.jni.SkylineCronetClientInterface skylineCronetClientInterface = cronetClient;
        if (skylineCronetClientInterface != null) {
            skylineCronetClientInterface.StartCronetHttpTask(i17, str, hashMap);
        } else {
            notifyCronetResponse(i17, 0, 0, null, null, null);
        }
    }
}

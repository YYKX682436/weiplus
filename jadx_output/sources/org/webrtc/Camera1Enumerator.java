package org.webrtc;

/* loaded from: classes14.dex */
public class Camera1Enumerator implements org.webrtc.CameraEnumerator {
    private static final java.lang.String TAG = "Camera1Enumerator";
    private static java.util.List<java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator() {
        this(true);
    }

    public static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(java.util.List<int[]> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static java.util.List<org.webrtc.Size> convertSizes(java.util.List<android.hardware.Camera.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.hardware.Camera.Size size : list) {
            arrayList.add(new org.webrtc.Size(size.width, size.height));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int r17) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera1Enumerator.enumerateFormats(int):java.util.List");
    }

    public static int getCameraIndex(java.lang.String str) {
        org.webrtc.Logging.d(TAG, "getCameraIndex: " + str);
        for (int i17 = 0; i17 < android.hardware.Camera.getNumberOfCameras(); i17++) {
            if (str.equals(getDeviceName(i17))) {
                return i17;
            }
        }
        throw new java.lang.IllegalArgumentException("No such camera: " + str);
    }

    private static android.hardware.Camera.CameraInfo getCameraInfo(int i17) {
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        try {
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            return cameraInfo;
        } catch (java.lang.Exception e17) {
            org.webrtc.Logging.e(TAG, "getCameraInfo failed on index " + i17, e17);
            return null;
        }
    }

    public static java.lang.String getDeviceName(int i17) {
        android.hardware.Camera.CameraInfo cameraInfo = getCameraInfo(i17);
        if (cameraInfo == null) {
            return null;
        }
        return "Camera " + i17 + ", Facing " + (cameraInfo.facing == 1 ? "front" : "back") + ", Orientation " + cameraInfo.orientation;
    }

    @Override // org.webrtc.CameraEnumerator
    public org.webrtc.CameraVideoCapturer createCapturer(java.lang.String str, org.webrtc.CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new org.webrtc.Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    @Override // org.webrtc.CameraEnumerator
    public java.lang.String[] getDeviceNames() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < android.hardware.Camera.getNumberOfCameras(); i17++) {
            java.lang.String deviceName = getDeviceName(i17);
            if (deviceName != null) {
                arrayList.add(deviceName);
                org.webrtc.Logging.d(TAG, "Index: " + i17 + ". " + deviceName);
            } else {
                org.webrtc.Logging.e(TAG, "Index: " + i17 + ". Failed to query camera name.");
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    @Override // org.webrtc.CameraEnumerator
    public java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(java.lang.String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(java.lang.String str) {
        android.hardware.Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(java.lang.String str) {
        android.hardware.Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 1;
    }

    public Camera1Enumerator(boolean z17) {
        this.captureToTexture = z17;
    }

    public static synchronized java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i17) {
        java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> list;
        synchronized (org.webrtc.Camera1Enumerator.class) {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new java.util.ArrayList();
                for (int i18 = 0; i18 < android.hardware.Camera.getNumberOfCameras(); i18++) {
                    cachedSupportedFormats.add(enumerateFormats(i18));
                }
            }
            list = cachedSupportedFormats.get(i17);
        }
        return list;
    }
}

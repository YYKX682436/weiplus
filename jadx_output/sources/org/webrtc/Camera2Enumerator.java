package org.webrtc;

/* loaded from: classes14.dex */
public class Camera2Enumerator implements org.webrtc.CameraEnumerator {
    private static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    private static final java.lang.String TAG = "Camera2Enumerator";
    private static final java.util.Map<java.lang.String, java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats = new java.util.HashMap();
    final android.hardware.camera2.CameraManager cameraManager;
    final android.content.Context context;

    public Camera2Enumerator(android.content.Context context) {
        this.context = context;
        this.cameraManager = (android.hardware.camera2.CameraManager) context.getSystemService("camera");
    }

    public static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(android.util.Range<java.lang.Integer>[] rangeArr, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Range<java.lang.Integer> range : rangeArr) {
            arrayList.add(new org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange(range.getLower().intValue() * i17, range.getUpper().intValue() * i17));
        }
        return arrayList;
    }

    private static java.util.List<org.webrtc.Size> convertSizes(android.util.Size[] sizeArr) {
        if (sizeArr == null || sizeArr.length == 0) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(sizeArr.length);
        for (android.util.Size size : sizeArr) {
            arrayList.add(new org.webrtc.Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    private android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String str) {
        try {
            return this.cameraManager.getCameraCharacteristics(str);
        } catch (android.util.AndroidException e17) {
            org.webrtc.Logging.e(TAG, "Camera access exception", e17);
            return null;
        }
    }

    public static int getFpsUnitFactor(android.util.Range<java.lang.Integer>[] rangeArr) {
        return (rangeArr.length != 0 && rangeArr[0].getUpper().intValue() >= 1000) ? 1 : 1000;
    }

    public static java.util.List<org.webrtc.Size> getSupportedSizes(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        ((java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        return convertSizes(streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class));
    }

    public static boolean isSupported(android.content.Context context) {
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) context.getSystemService("camera");
        try {
            for (java.lang.String str : cameraManager.getCameraIdList()) {
                if (((java.lang.Integer) cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (android.util.AndroidException | java.lang.RuntimeException e17) {
            org.webrtc.Logging.e(TAG, "Failed to check if camera2 is supported", e17);
            return false;
        }
    }

    @Override // org.webrtc.CameraEnumerator
    public org.webrtc.CameraVideoCapturer createCapturer(java.lang.String str, org.webrtc.CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new org.webrtc.Camera2Capturer(this.context, str, cameraEventsHandler);
    }

    @Override // org.webrtc.CameraEnumerator
    public java.lang.String[] getDeviceNames() {
        try {
            return this.cameraManager.getCameraIdList();
        } catch (android.util.AndroidException e17) {
            org.webrtc.Logging.e(TAG, "Camera access exception", e17);
            return new java.lang.String[0];
        }
    }

    @Override // org.webrtc.CameraEnumerator
    public java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(java.lang.String str) {
        return getSupportedFormats(this.context, str);
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(java.lang.String str) {
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        return cameraCharacteristics != null && ((java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(java.lang.String str) {
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        return cameraCharacteristics != null && ((java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    public static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(android.content.Context context, java.lang.String str) {
        return getSupportedFormats((android.hardware.camera2.CameraManager) context.getSystemService("camera"), str);
    }

    public static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(android.hardware.camera2.CameraManager cameraManager, java.lang.String str) {
        long j17;
        java.util.Map<java.lang.String, java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat>> map = cachedSupportedFormats;
        synchronized (map) {
            if (map.containsKey(str)) {
                return map.get(str);
            }
            org.webrtc.Logging.d(TAG, "Get supported formats for camera index " + str + ".");
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            try {
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                android.util.Range[] rangeArr = (android.util.Range[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                java.util.List<org.webrtc.Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                java.util.Iterator<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> it = convertFramerates.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    i17 = java.lang.Math.max(i17, it.next().max);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (org.webrtc.Size size : supportedSizes) {
                    try {
                        j17 = streamConfigurationMap.getOutputMinFrameDuration(android.graphics.SurfaceTexture.class, new android.util.Size(size.width, size.height));
                    } catch (java.lang.Exception unused) {
                        j17 = 0;
                    }
                    int round = j17 == 0 ? i17 : ((int) java.lang.Math.round(NANO_SECONDS_PER_SECOND / j17)) * 1000;
                    arrayList.add(new org.webrtc.CameraEnumerationAndroid.CaptureFormat(size.width, size.height, 0, round));
                    org.webrtc.Logging.d(TAG, "Format: " + size.width + "x" + size.height + "@" + round);
                }
                cachedSupportedFormats.put(str, arrayList);
                org.webrtc.Logging.d(TAG, "Get supported formats for camera index " + str + " done. Time spent: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
                return arrayList;
            } catch (java.lang.Exception e17) {
                org.webrtc.Logging.e(TAG, "getCameraCharacteristics()", e17);
                return new java.util.ArrayList();
            }
        }
    }
}

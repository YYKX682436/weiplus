package org.webrtc;

/* loaded from: classes14.dex */
public interface CameraEnumerator {
    org.webrtc.CameraVideoCapturer createCapturer(java.lang.String str, org.webrtc.CameraVideoCapturer.CameraEventsHandler cameraEventsHandler);

    java.lang.String[] getDeviceNames();

    java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(java.lang.String str);

    boolean isBackFacing(java.lang.String str);

    boolean isFrontFacing(java.lang.String str);
}

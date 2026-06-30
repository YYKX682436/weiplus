package org.webrtc;

/* loaded from: classes16.dex */
public class ScreenCapturerAndroid implements org.webrtc.VideoCapturer, org.webrtc.VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private org.webrtc.CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private android.media.projection.MediaProjection mediaProjection;
    private final android.media.projection.MediaProjection.Callback mediaProjectionCallback;
    private android.media.projection.MediaProjectionManager mediaProjectionManager;
    private final android.content.Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    private org.webrtc.SurfaceTextureHelper surfaceTextureHelper;
    private android.hardware.display.VirtualDisplay virtualDisplay;
    private int width;

    public ScreenCapturerAndroid(android.content.Intent intent, android.media.projection.MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new java.lang.RuntimeException("capturer is disposed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, 400, 3, new android.view.Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i17, int i18, int i19) {
        checkNotDisposed();
        this.width = i17;
        this.height = i18;
        if (this.virtualDisplay == null) {
            return;
        }
        org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new java.lang.Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.2
            @Override // java.lang.Runnable
            public void run() {
                org.webrtc.ScreenCapturerAndroid.this.virtualDisplay.release();
                org.webrtc.ScreenCapturerAndroid.this.createVirtualDisplay();
            }
        });
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    public android.media.projection.MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(org.webrtc.SurfaceTextureHelper surfaceTextureHelper, android.content.Context context, org.webrtc.CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new java.lang.RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            throw new java.lang.RuntimeException("surfaceTextureHelper not set.");
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.mediaProjectionManager = (android.media.projection.MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame videoFrame) {
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i17, int i18, int i19) {
        checkNotDisposed();
        this.width = i17;
        this.height = i18;
        android.media.projection.MediaProjection mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = mediaProjection;
        mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        this.surfaceTextureHelper.startListening(this);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new java.lang.Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.1
            @Override // java.lang.Runnable
            public void run() {
                org.webrtc.ScreenCapturerAndroid.this.surfaceTextureHelper.stopListening();
                org.webrtc.ScreenCapturerAndroid.this.capturerObserver.onCapturerStopped();
                if (org.webrtc.ScreenCapturerAndroid.this.virtualDisplay != null) {
                    org.webrtc.ScreenCapturerAndroid.this.virtualDisplay.release();
                    org.webrtc.ScreenCapturerAndroid.this.virtualDisplay = null;
                }
                if (org.webrtc.ScreenCapturerAndroid.this.mediaProjection != null) {
                    org.webrtc.ScreenCapturerAndroid.this.mediaProjection.unregisterCallback(org.webrtc.ScreenCapturerAndroid.this.mediaProjectionCallback);
                    org.webrtc.ScreenCapturerAndroid.this.mediaProjection.stop();
                    org.webrtc.ScreenCapturerAndroid.this.mediaProjection = null;
                }
            }
        });
    }
}

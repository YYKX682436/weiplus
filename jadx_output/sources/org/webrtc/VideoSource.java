package org.webrtc;

/* loaded from: classes16.dex */
public class VideoSource extends org.webrtc.MediaSource {
    private final org.webrtc.CapturerObserver capturerObserver;
    private boolean isCapturerRunning;
    private final org.webrtc.NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private org.webrtc.VideoProcessor videoProcessor;
    private final java.lang.Object videoProcessorLock;

    /* loaded from: classes16.dex */
    public static class AspectRatio {
        public static final org.webrtc.VideoSource.AspectRatio UNDEFINED = new org.webrtc.VideoSource.AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i17, int i18) {
            this.width = i17;
            this.height = i18;
        }
    }

    public VideoSource(long j17) {
        super(j17);
        this.videoProcessorLock = new java.lang.Object();
        this.capturerObserver = new org.webrtc.CapturerObserver() { // from class: org.webrtc.VideoSource.1
            @Override // org.webrtc.CapturerObserver
            public void onCapturerStarted(boolean z17) {
                org.webrtc.VideoSource.this.nativeAndroidVideoTrackSource.setState(z17);
                synchronized (org.webrtc.VideoSource.this.videoProcessorLock) {
                    org.webrtc.VideoSource.this.isCapturerRunning = z17;
                    if (org.webrtc.VideoSource.this.videoProcessor != null) {
                        org.webrtc.VideoSource.this.videoProcessor.onCapturerStarted(z17);
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onCapturerStopped() {
                org.webrtc.VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
                synchronized (org.webrtc.VideoSource.this.videoProcessorLock) {
                    org.webrtc.VideoSource.this.isCapturerRunning = false;
                    if (org.webrtc.VideoSource.this.videoProcessor != null) {
                        org.webrtc.VideoSource.this.videoProcessor.onCapturerStopped();
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onFrameCaptured(org.webrtc.VideoFrame videoFrame) {
                org.webrtc.VideoProcessor.FrameAdaptationParameters adaptFrame = org.webrtc.VideoSource.this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
                synchronized (org.webrtc.VideoSource.this.videoProcessorLock) {
                    if (org.webrtc.VideoSource.this.videoProcessor != null) {
                        org.webrtc.VideoSource.this.videoProcessor.onFrameCaptured(videoFrame, adaptFrame);
                        return;
                    }
                    org.webrtc.VideoFrame applyFrameAdaptationParameters = org.webrtc.VideoProcessor.applyFrameAdaptationParameters(videoFrame, adaptFrame);
                    if (applyFrameAdaptationParameters != null) {
                        org.webrtc.VideoSource.this.nativeAndroidVideoTrackSource.onFrameCaptured(applyFrameAdaptationParameters);
                        applyFrameAdaptationParameters.release();
                    }
                }
            }
        };
        this.nativeAndroidVideoTrackSource = new org.webrtc.NativeAndroidVideoTrackSource(j17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$0(org.webrtc.VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$1(final org.webrtc.VideoFrame videoFrame) {
        runWithReference(new java.lang.Runnable() { // from class: org.webrtc.VideoSource$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.VideoSource.this.lambda$setVideoProcessor$0(videoFrame);
            }
        });
    }

    public void adaptOutputFormat(int i17, int i18, int i19) {
        int max = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        adaptOutputFormat(max, min, min, max, i19);
    }

    @Override // org.webrtc.MediaSource
    public void dispose() {
        setVideoProcessor(null);
        super.dispose();
    }

    public org.webrtc.CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void setIsScreencast(boolean z17) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z17);
    }

    public void setVideoProcessor(org.webrtc.VideoProcessor videoProcessor) {
        synchronized (this.videoProcessorLock) {
            org.webrtc.VideoProcessor videoProcessor2 = this.videoProcessor;
            if (videoProcessor2 != null) {
                videoProcessor2.setSink(null);
                if (this.isCapturerRunning) {
                    this.videoProcessor.onCapturerStopped();
                }
            }
            this.videoProcessor = videoProcessor;
            if (videoProcessor != null) {
                videoProcessor.setSink(new org.webrtc.VideoSink() { // from class: org.webrtc.VideoSource$$b
                    @Override // org.webrtc.VideoSink
                    public final void onFrame(org.webrtc.VideoFrame videoFrame) {
                        org.webrtc.VideoSource.this.lambda$setVideoProcessor$1(videoFrame);
                    }
                });
                if (this.isCapturerRunning) {
                    videoProcessor.onCapturerStarted(true);
                }
            }
        }
    }

    public void adaptOutputFormat(int i17, int i18, int i19, int i27, int i28) {
        adaptOutputFormat(new org.webrtc.VideoSource.AspectRatio(i17, i18), java.lang.Integer.valueOf(i17 * i18), new org.webrtc.VideoSource.AspectRatio(i19, i27), java.lang.Integer.valueOf(i19 * i27), java.lang.Integer.valueOf(i28));
    }

    public void adaptOutputFormat(org.webrtc.VideoSource.AspectRatio aspectRatio, java.lang.Integer num, org.webrtc.VideoSource.AspectRatio aspectRatio2, java.lang.Integer num2, java.lang.Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}

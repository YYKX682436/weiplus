package com.tencent.tav.core.compositing;

/* loaded from: classes16.dex */
public class AsynchronousVideoCompositionRequest {
    private final com.tencent.tav.core.AssetExtension assetExtension;
    private final java.lang.Object authorComposition;
    private com.tencent.tav.coremedia.CMTime compositionTime;
    private volatile com.tencent.tav.coremedia.ErrorMsg error;
    private com.tencent.tav.core.compositing.VideoCompositionRenderContext renderContext;
    private com.tencent.tav.core.compositing.IVideoCompositionInstruction videoCompositionInstruction;
    private java.util.List<java.lang.Integer> sourceTrackIDs = new java.util.ArrayList();
    private volatile com.tencent.tav.coremedia.CMSampleBuffer composedVideoFrame = null;
    private volatile int status = Integer.MIN_VALUE;
    private android.util.SparseArray<com.tencent.tav.coremedia.CMSampleBuffer> sampleBuffers = new android.util.SparseArray<>();

    /* loaded from: classes16.dex */
    public @interface RequestStatus {
        public static final int Cancel = 1;
        public static final int Error = -1;
        public static final int Success = 0;
        public static final int UnKnow = Integer.MIN_VALUE;
    }

    public AsynchronousVideoCompositionRequest(java.lang.Object obj, com.tencent.tav.core.AssetExtension assetExtension) {
        this.authorComposition = obj;
        this.assetExtension = assetExtension;
    }

    private void notifyFinish() {
        java.lang.Object obj = this.authorComposition;
        if (obj != null) {
            synchronized (obj) {
                this.authorComposition.notifyAll();
            }
        }
    }

    public void appendCMSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer, int i17) {
        this.sampleBuffers.put(i17, cMSampleBuffer);
        this.sourceTrackIDs.add(java.lang.Integer.valueOf(i17));
    }

    public void finishCancelledRequest() {
        synchronized (this) {
            this.status = 1;
        }
        notifyFinish();
    }

    public void finishWithComposedVideoFrame(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        synchronized (this) {
            this.composedVideoFrame = cMSampleBuffer;
            this.status = 0;
        }
        notifyFinish();
    }

    public void finishWithError(com.tencent.tav.coremedia.ErrorMsg errorMsg) {
        synchronized (this) {
            this.error = errorMsg;
            this.status = -1;
        }
        notifyFinish();
    }

    public com.tencent.tav.core.AssetExtension getAssetExtension() {
        return this.assetExtension;
    }

    public synchronized com.tencent.tav.coremedia.CMSampleBuffer getComposedSampleBuffer() {
        return this.composedVideoFrame;
    }

    public com.tencent.tav.coremedia.CMTime getCompositionTime() {
        return this.compositionTime;
    }

    public com.tencent.tav.core.compositing.VideoCompositionRenderContext getRenderContext() {
        return this.renderContext;
    }

    public java.util.List<java.lang.Integer> getSourceTrackIDs() {
        return this.sourceTrackIDs;
    }

    public synchronized int getStatus() {
        return this.status;
    }

    public com.tencent.tav.core.compositing.IVideoCompositionInstruction getVideoCompositionInstruction() {
        return this.videoCompositionInstruction;
    }

    public void setCompositionTime(com.tencent.tav.coremedia.CMTime cMTime) {
        this.compositionTime = cMTime;
    }

    public void setRenderContext(com.tencent.tav.core.compositing.VideoCompositionRenderContext videoCompositionRenderContext) {
        this.renderContext = videoCompositionRenderContext;
    }

    public void setVideoCompositionInstruction(com.tencent.tav.core.compositing.IVideoCompositionInstruction iVideoCompositionInstruction) {
        this.videoCompositionInstruction = iVideoCompositionInstruction;
    }

    public com.tencent.tav.coremedia.CMSampleBuffer sourceFrameByTrackID(int i17) {
        android.util.SparseArray<com.tencent.tav.coremedia.CMSampleBuffer> sparseArray = this.sampleBuffers;
        if (sparseArray != null) {
            return sparseArray.get(i17);
        }
        return null;
    }

    public java.lang.String toString() {
        return "AsynchronousVideoCompositionRequest{renderContext=" + this.renderContext + ", compositionTime=" + this.compositionTime + ", videoCompositionInstruction=" + this.videoCompositionInstruction + ", sampleBuffers=" + this.sampleBuffers + '}';
    }
}

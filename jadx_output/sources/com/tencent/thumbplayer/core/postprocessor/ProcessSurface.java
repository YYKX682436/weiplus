package com.tencent.thumbplayer.core.postprocessor;

/* loaded from: classes14.dex */
public class ProcessSurface implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final java.lang.String TAG = "sifeng: ProcessSurface";
    private boolean mFrameAvailable;
    private java.lang.Object mFrameSyncObject = new java.lang.Object();
    private int mHeight;
    private android.view.Surface mSurface;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    private com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup mTextureRender;
    private int mWidth;
    private android.os.Handler renderHandler;
    private android.os.HandlerThread renderThread;

    /* renamed from: com.tencent.thumbplayer.core.postprocessor.ProcessSurface$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$thumbplayer$core$postprocessor$ProcessSurface$TPProcessType;

        static {
            int[] iArr = new int[com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.values().length];
            $SwitchMap$com$tencent$thumbplayer$core$postprocessor$ProcessSurface$TPProcessType = iArr;
            try {
                iArr[com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_SHARPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$thumbplayer$core$postprocessor$ProcessSurface$TPProcessType[com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_HDR2SDR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes14.dex */
    public enum TPProcessType {
        TP_PROCESS_UNKNOWN,
        TP_PROCESS_SHARPEN,
        TP_PROCESS_HDR2SDR
    }

    public ProcessSurface(int i17, int i18, java.lang.String str, com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType tPProcessType) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("TP-ProcessSurface-RenderThread");
        this.renderThread = handlerThread;
        handlerThread.start();
        this.renderHandler = new android.os.Handler(this.renderThread.getLooper());
        this.mWidth = i17;
        this.mHeight = i18;
        setup(str, tPProcessType);
    }

    private void setup(java.lang.String str, com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType tPProcessType) {
        int i17 = com.tencent.thumbplayer.core.postprocessor.ProcessSurface.AnonymousClass1.$SwitchMap$com$tencent$thumbplayer$core$postprocessor$ProcessSurface$TPProcessType[tPProcessType.ordinal()];
        if (i17 == 1) {
            this.mTextureRender = new com.tencent.thumbplayer.core.postprocessor.group.SharpenFilterGroup(str);
        } else if (i17 != 2) {
            return;
        } else {
            this.mTextureRender = new com.tencent.thumbplayer.core.postprocessor.group.Hdr2SdrFilterGroup(str);
        }
        this.mTextureRender.genOESTexture();
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("Render surface create");
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.mTextureRender.getOESTextureid());
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this, this.renderHandler);
        this.mSurface = new android.view.Surface(this.mSurfaceTexture);
    }

    public boolean awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            do {
                if (this.mFrameAvailable) {
                    this.mFrameAvailable = false;
                } else {
                    try {
                        this.mFrameSyncObject.wait(16L);
                    } catch (java.lang.InterruptedException unused) {
                        return false;
                    }
                }
            } while (this.mFrameAvailable);
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "sifeng: Surface frame wait timed out");
            throw new java.lang.RuntimeException("sifeng: Surface frame wait timed out");
        }
        com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup.checkGlError("before updateTexImage");
        this.mSurfaceTexture.updateTexImage();
        return true;
    }

    public void drawImage(int i17, int i18, int i19, int i27, boolean z17, int i28) {
        this.mWidth = i17;
        this.mHeight = i18;
        this.mTextureRender.process(this.mSurfaceTexture, i17, i18, i19, i27, z17, i28);
    }

    public android.view.Surface getSurface() {
        return this.mSurface;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            if (this.mFrameAvailable) {
                throw new java.lang.RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.mFrameAvailable = true;
            this.mFrameSyncObject.notifyAll();
        }
    }

    public void release() {
        this.mTextureRender.destroyBuffers();
        this.mTextureRender = null;
        android.view.Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
        android.os.HandlerThread handlerThread = this.renderThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }
}

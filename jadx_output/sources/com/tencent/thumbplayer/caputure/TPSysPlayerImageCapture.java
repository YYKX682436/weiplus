package com.tencent.thumbplayer.caputure;

/* loaded from: classes16.dex */
public class TPSysPlayerImageCapture {
    private static final int EV_CAP_IMAGE = 1;
    private static final int EV_STOP_CAP_IMAGE = 2;
    private static final java.lang.String TAG = "TPSysPlayerImageCapture";
    private static com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture gInstance;
    private byte _hellAccFlag_;
    private com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.EventHandler mCapHandler;
    private android.os.HandlerThread mHandlerThread;
    private android.media.MediaMetadataRetriever mRetriever = null;
    private int mBaseID = 0;

    /* loaded from: classes16.dex */
    public interface CaptureMediaImageListener {
        void onCaptureFailed(int i17, int i18);

        void onCaptureSucceed(int i17, long j17, int i18, int i19, android.graphics.Bitmap bitmap, long j18);
    }

    /* loaded from: classes16.dex */
    public static class CaptureMsg {
        private android.content.res.AssetFileDescriptor assetFileDescriptor;
        private java.io.FileDescriptor fileDescriptor;
        private int height;

        /* renamed from: id, reason: collision with root package name */
        private int f215542id;
        protected com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.CaptureMediaImageListener lis;
        private long positionMs;
        private java.lang.String url;
        private int width;

        private CaptureMsg() {
        }
    }

    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {
        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i17 = message.what;
            if (i17 == 1) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.TAG, "eventHandler EV_CAP_IMAGE");
                com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.this.doRealCaptureImage((com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.CaptureMsg) message.obj);
            } else {
                if (i17 != 2) {
                    com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.TAG, "eventHandler unknow msg");
                    return;
                }
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.TAG, "eventHandler EV_STOP_CAP_IMAGE");
                if (com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.this.mRetriever != null) {
                    com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.this.mRetriever.release();
                    com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.this.mRetriever = null;
                }
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class TPSysImageCaptureParams {
        public android.content.res.AssetFileDescriptor assetFileDescriptor;
        public java.io.FileDescriptor fileDescriptor;
        public int height;
        public long positionMs;
        public java.lang.String url;
        public int width;
    }

    private TPSysPlayerImageCapture() {
        this.mHandlerThread = null;
        this.mCapHandler = null;
        try {
            this.mHandlerThread = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainShareThread();
            this.mCapHandler = new com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.EventHandler(this.mHandlerThread.getLooper());
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6);
            this.mCapHandler = new com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.EventHandler(android.os.Looper.getMainLooper());
        }
    }

    public static synchronized com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture GetImageCaptureInstance() {
        com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture tPSysPlayerImageCapture;
        synchronized (com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.class) {
            if (gInstance == null) {
                gInstance = new com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture();
            }
            tPSysPlayerImageCapture = gInstance;
        }
        return tPSysPlayerImageCapture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRealCaptureImage(com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.CaptureMsg captureMsg) {
        android.media.MediaMetadataRetriever mediaMetadataRetriever;
        try {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                android.media.MediaMetadataRetriever mediaMetadataRetriever2 = this.mRetriever;
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                    this.mRetriever = null;
                }
                this.mRetriever = new android.media.MediaMetadataRetriever();
                if (captureMsg.fileDescriptor != null) {
                    this.mRetriever.setDataSource(captureMsg.fileDescriptor);
                } else if (captureMsg.assetFileDescriptor != null) {
                    this.mRetriever.setDataSource(captureMsg.assetFileDescriptor.getFileDescriptor(), captureMsg.assetFileDescriptor.getStartOffset(), captureMsg.assetFileDescriptor.getLength());
                } else {
                    this.mRetriever.setDataSource(captureMsg.url, new java.util.HashMap());
                }
                android.media.MediaMetadataRetriever mediaMetadataRetriever3 = this.mRetriever;
                long j17 = captureMsg.positionMs * 1000;
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(2);
                aVar.c(java.lang.Long.valueOf(j17));
                yj0.a.d(mediaMetadataRetriever3, aVar.b(), "com/tencent/thumbplayer/caputure/TPSysPlayerImageCapture", "doRealCaptureImage", "(Lcom/tencent/thumbplayer/caputure/TPSysPlayerImageCapture$CaptureMsg;)V", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
                zj0.c.f473285a.set(aVar);
                android.graphics.Bitmap frameAtTime = mediaMetadataRetriever3.getFrameAtTime(((java.lang.Long) aVar.a(0)).longValue(), ((java.lang.Integer) zj0.c.a().a(1)).intValue());
                yj0.a.e(mediaMetadataRetriever3, frameAtTime, "com/tencent/thumbplayer/caputure/TPSysPlayerImageCapture", "doRealCaptureImage", "(Lcom/tencent/thumbplayer/caputure/TPSysPlayerImageCapture$CaptureMsg;)V", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                if (frameAtTime != null) {
                    captureMsg.lis.onCaptureSucceed(captureMsg.f215542id, captureMsg.positionMs, captureMsg.width, captureMsg.height, frameAtTime, currentTimeMillis2);
                } else {
                    captureMsg.lis.onCaptureFailed(captureMsg.f215542id, com.tencent.thumbplayer.core.common.TPGeneralError.FAILED);
                }
                mediaMetadataRetriever = this.mRetriever;
                if (mediaMetadataRetriever == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "doRealCaptureImage, Exception: " + e17.toString());
                captureMsg.lis.onCaptureFailed(captureMsg.f215542id, com.tencent.thumbplayer.core.common.TPGeneralError.FAILED);
                mediaMetadataRetriever = this.mRetriever;
                if (mediaMetadataRetriever == null) {
                    return;
                }
            }
            mediaMetadataRetriever.release();
            this.mRetriever = null;
        } catch (java.lang.Throwable th6) {
            android.media.MediaMetadataRetriever mediaMetadataRetriever4 = this.mRetriever;
            if (mediaMetadataRetriever4 != null) {
                mediaMetadataRetriever4.release();
                this.mRetriever = null;
            }
            throw th6;
        }
    }

    public int captureImageWithPosition(com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.TPSysImageCaptureParams tPSysImageCaptureParams, com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.CaptureMediaImageListener captureMediaImageListener) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "captureImageWithPosition, position: " + tPSysImageCaptureParams.positionMs + ", width: " + tPSysImageCaptureParams.width + ", height: " + tPSysImageCaptureParams.height);
        this.mBaseID = this.mBaseID + 1;
        if (!android.text.TextUtils.isEmpty(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()) && com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName().equals("Lenovo+K900")) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "captureImageWithPosition, Lenovo+K900 no incompatible");
            return -1;
        }
        com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.CaptureMsg captureMsg = new com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture.CaptureMsg();
        captureMsg.f215542id = this.mBaseID;
        captureMsg.fileDescriptor = tPSysImageCaptureParams.fileDescriptor;
        captureMsg.assetFileDescriptor = tPSysImageCaptureParams.assetFileDescriptor;
        captureMsg.url = tPSysImageCaptureParams.url;
        captureMsg.positionMs = tPSysImageCaptureParams.positionMs;
        captureMsg.width = tPSysImageCaptureParams.width;
        captureMsg.height = tPSysImageCaptureParams.height;
        captureMsg.lis = captureMediaImageListener;
        android.os.Message message = new android.os.Message();
        message.what = 1;
        message.obj = captureMsg;
        if (!this.mCapHandler.sendMessage(message)) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "captureImageWithPosition, send msg failed ");
        }
        return this.mBaseID;
    }
}

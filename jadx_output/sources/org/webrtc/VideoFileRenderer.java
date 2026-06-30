package org.webrtc;

/* loaded from: classes16.dex */
public class VideoFileRenderer implements org.webrtc.VideoSink {
    private static final java.lang.String TAG = "VideoFileRenderer";
    private org.webrtc.EglBase eglBase;
    private final android.os.HandlerThread fileThread;
    private final android.os.Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final java.lang.String outputFileName;
    private final int outputFileWidth;
    private final java.nio.ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final android.os.HandlerThread renderThread;
    private final android.os.Handler renderThreadHandler;
    private final java.io.FileOutputStream videoOutFile;
    private org.webrtc.YuvConverter yuvConverter;

    public VideoFileRenderer(java.lang.String str, int i17, int i18, final org.webrtc.EglBase.Context context) {
        if (i17 % 2 == 1 || i18 % 2 == 1) {
            throw new java.lang.IllegalArgumentException("Does not support uneven width or height");
        }
        this.outputFileName = str;
        this.outputFileWidth = i17;
        this.outputFileHeight = i18;
        int i19 = ((i17 * i18) * 3) / 2;
        this.outputFrameSize = i19;
        this.outputFrameBuffer = java.nio.ByteBuffer.allocateDirect(i19);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str);
        this.videoOutFile = fileOutputStream;
        fileOutputStream.write(("YUV4MPEG2 C420 W" + i17 + " H" + i18 + " Ip F30:1 A1:1\n").getBytes(java.nio.charset.Charset.forName("US-ASCII")));
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("VideoFileRendererRenderThread");
        this.renderThread = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.renderThreadHandler = handler;
        android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("VideoFileRendererFileThread");
        this.fileThread = handlerThread2;
        handlerThread2.start();
        this.fileThreadHandler = new android.os.Handler(handlerThread2.getLooper());
        org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(handler, new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                org.webrtc.VideoFileRenderer.this.eglBase = org.webrtc.EglBase.EglBaseStatic.create(context, org.webrtc.EglBase.CONFIG_PIXEL_BUFFER);
                org.webrtc.VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                org.webrtc.VideoFileRenderer.this.eglBase.makeCurrent();
                org.webrtc.VideoFileRenderer.this.yuvConverter = new org.webrtc.YuvConverter();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(java.util.concurrent.CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$3() {
        try {
            this.videoOutFile.close();
            org.webrtc.Logging.d(TAG, "Video written to disk as " + this.outputFileName + ". The number of frames is " + this.frameCount + " and the dimensions of the frames are " + this.outputFileWidth + "x" + this.outputFileHeight + ".");
            this.fileThread.quit();
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Error closing output file", e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderFrameOnRenderThread$1(org.webrtc.VideoFrame.I420Buffer i420Buffer, org.webrtc.VideoFrame videoFrame) {
        org.webrtc.YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(java.nio.charset.Charset.forName("US-ASCII")));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Error writing video to disk", e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderFrameOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void lambda$onFrame$0(final org.webrtc.VideoFrame videoFrame) {
        org.webrtc.VideoFrame.Buffer buffer = videoFrame.getBuffer();
        int i17 = videoFrame.getRotation() % 180 == 0 ? this.outputFileWidth : this.outputFileHeight;
        int i18 = videoFrame.getRotation() % 180 == 0 ? this.outputFileHeight : this.outputFileWidth;
        float width = buffer.getWidth() / buffer.getHeight();
        float f17 = i17 / i18;
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f17 > width) {
            height = (int) (height * (width / f17));
        } else {
            width2 = (int) (width2 * (f17 / width));
        }
        org.webrtc.VideoFrame.Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i17, i18);
        videoFrame.release();
        final org.webrtc.VideoFrame.I420Buffer i420 = cropAndScale.toI420();
        cropAndScale.release();
        this.fileThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer$$d
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.VideoFileRenderer.this.lambda$renderFrameOnRenderThread$1(i420, videoFrame);
            }
        });
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(final org.webrtc.VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer$$c
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.VideoFileRenderer.this.lambda$onFrame$0(videoFrame);
            }
        });
    }

    public void release() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.renderThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.VideoFileRenderer.this.lambda$release$2(countDownLatch);
            }
        });
        org.webrtc.ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.VideoFileRenderer.this.lambda$release$3();
            }
        });
        try {
            this.fileThread.join();
        } catch (java.lang.InterruptedException e17) {
            java.lang.Thread.currentThread().interrupt();
            org.webrtc.Logging.e(TAG, "Interrupted while waiting for the write to disk to complete.", e17);
        }
    }
}

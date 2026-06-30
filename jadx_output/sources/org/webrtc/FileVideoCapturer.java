package org.webrtc;

/* loaded from: classes15.dex */
public class FileVideoCapturer implements org.webrtc.VideoCapturer {
    private static final java.lang.String TAG = "FileVideoCapturer";
    private org.webrtc.CapturerObserver capturerObserver;
    private final org.webrtc.FileVideoCapturer.VideoReader videoReader;
    private final java.util.Timer timer = new java.util.Timer();
    private final java.util.TimerTask tickTask = new java.util.TimerTask() { // from class: org.webrtc.FileVideoCapturer.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            org.webrtc.FileVideoCapturer.this.tick();
        }
    };

    /* loaded from: classes15.dex */
    public interface VideoReader {
        void close();

        org.webrtc.VideoFrame getNextFrame();
    }

    /* loaded from: classes15.dex */
    public static class VideoReaderY4M implements org.webrtc.FileVideoCapturer.VideoReader {
        private static final int FRAME_DELIMETER_LENGTH = 6;
        private static final java.lang.String TAG = "VideoReaderY4M";
        private static final java.lang.String Y4M_FRAME_DELIMETER = "FRAME";
        private final int frameHeight;
        private final int frameWidth;
        private final java.io.RandomAccessFile mediaFile;
        private final java.nio.channels.FileChannel mediaFileChannel;
        private final long videoStart;

        public VideoReaderY4M(java.lang.String str) {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
            this.mediaFile = randomAccessFile;
            this.mediaFileChannel = randomAccessFile.getChannel();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            while (true) {
                int read = this.mediaFile.read();
                if (read == -1) {
                    throw new java.lang.RuntimeException("Found end of file before end of header for file: " + str);
                }
                if (read == 10) {
                    this.videoStart = this.mediaFileChannel.position();
                    java.lang.String str2 = "";
                    int i17 = 0;
                    int i18 = 0;
                    for (java.lang.String str3 : sb6.toString().split("[ ]")) {
                        char charAt = str3.charAt(0);
                        if (charAt == 'C') {
                            str2 = str3.substring(1);
                        } else if (charAt == 'H') {
                            i18 = java.lang.Integer.parseInt(str3.substring(1));
                        } else if (charAt == 'W') {
                            i17 = java.lang.Integer.parseInt(str3.substring(1));
                        }
                    }
                    org.webrtc.Logging.d(TAG, "Color space: " + str2);
                    if (!str2.equals("420") && !str2.equals("420mpeg2")) {
                        throw new java.lang.IllegalArgumentException("Does not support any other color space than I420 or I420mpeg2");
                    }
                    if (i17 % 2 == 1 || i18 % 2 == 1) {
                        throw new java.lang.IllegalArgumentException("Does not support odd width or height");
                    }
                    this.frameWidth = i17;
                    this.frameHeight = i18;
                    org.webrtc.Logging.d(TAG, "frame dim: (" + i17 + ", " + i18 + ")");
                    return;
                }
                sb6.append((char) read);
            }
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public void close() {
            try {
                this.mediaFile.close();
            } catch (java.io.IOException e17) {
                org.webrtc.Logging.e(TAG, "Problem closing file", e17);
            }
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public org.webrtc.VideoFrame getNextFrame() {
            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(android.os.SystemClock.elapsedRealtime());
            org.webrtc.JavaI420Buffer allocate = org.webrtc.JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            java.nio.ByteBuffer dataY = allocate.getDataY();
            java.nio.ByteBuffer dataU = allocate.getDataU();
            java.nio.ByteBuffer dataV = allocate.getDataV();
            int i17 = (this.frameHeight + 1) / 2;
            allocate.getStrideY();
            allocate.getStrideU();
            allocate.getStrideV();
            try {
                int i18 = FRAME_DELIMETER_LENGTH;
                java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(i18);
                if (this.mediaFileChannel.read(allocate2) < i18) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(allocate2) < i18) {
                        throw new java.lang.RuntimeException("Error looping video");
                    }
                }
                java.lang.String str = new java.lang.String(allocate2.array(), java.nio.charset.Charset.forName("US-ASCII"));
                if (str.equals("FRAME\n")) {
                    this.mediaFileChannel.read(dataY);
                    this.mediaFileChannel.read(dataU);
                    this.mediaFileChannel.read(dataV);
                    return new org.webrtc.VideoFrame(allocate, 0, nanos);
                }
                throw new java.lang.RuntimeException("Frames should be delimited by FRAME plus newline, found delimter was: '" + str + "'");
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    public FileVideoCapturer(java.lang.String str) {
        try {
            this.videoReader = new org.webrtc.FileVideoCapturer.VideoReaderY4M(str);
        } catch (java.io.IOException e17) {
            org.webrtc.Logging.d(TAG, "Could not open video file: " + str);
            throw e17;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i17, int i18, int i19) {
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        this.videoReader.close();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(org.webrtc.SurfaceTextureHelper surfaceTextureHelper, android.content.Context context, org.webrtc.CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i17, int i18, int i19) {
        this.timer.schedule(this.tickTask, 0L, 1000 / i19);
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        this.timer.cancel();
    }

    public void tick() {
        org.webrtc.VideoFrame nextFrame = this.videoReader.getNextFrame();
        this.capturerObserver.onFrameCaptured(nextFrame);
        nextFrame.release();
    }
}

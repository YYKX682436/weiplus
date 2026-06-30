package org.webrtc;

/* loaded from: classes13.dex */
class MediaCodecWrapperFactoryImpl implements org.webrtc.MediaCodecWrapperFactory {

    /* loaded from: classes13.dex */
    public static class MediaCodecWrapperImpl implements org.webrtc.MediaCodecWrapper {
        private final android.media.MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(android.media.MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i17);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public android.view.Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueInputBuffer(long j17) {
            return this.mediaCodec.dequeueInputBuffer(j17);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j17);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public java.nio.ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public java.nio.ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public android.media.MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
            this.mediaCodec.queueInputBuffer(i17, i18, i19, j17, i27);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void releaseOutputBuffer(int i17, boolean z17) {
            this.mediaCodec.releaseOutputBuffer(i17, z17);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void setParameters(android.os.Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }
    }

    @Override // org.webrtc.MediaCodecWrapperFactory
    public org.webrtc.MediaCodecWrapper createByCodecName(java.lang.String str) {
        return new org.webrtc.MediaCodecWrapperFactoryImpl.MediaCodecWrapperImpl(android.media.MediaCodec.createByCodecName(str));
    }
}

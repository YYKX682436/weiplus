package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class MediaCodecAudioEncoder implements com.tencent.tav.decoder.AssetWriterAudioEncoder {
    public static final java.lang.String OUTPUT_AUDIO_MIME_TYPE = "audio/mp4a-latm";
    public static final java.lang.String SCENE = "audio-encode";
    private static final java.lang.String TAG = "MediaCodecAudioEncoder";
    private static final long WAIT_TRANSIENT_MS = 20;
    public static final long WRITER_FINISH = -1;
    private com.tencent.tav.codec.MediaCodecAnalyse audioEncoder;
    private long audioPresentationTimeUs;
    private com.tencent.tav.core.ExportConfig encodeOption;
    private com.tencent.tav.decoder.muxer.IMediaMuxer muxer;
    private volatile android.media.MediaFormat audioEncodeFormat = null;
    private volatile android.media.MediaCodec.BufferInfo audioBufferInfo = new android.media.MediaCodec.BufferInfo();
    private boolean isEncodeToEndOfStream = false;

    private int dequeueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse) {
        try {
            return mediaCodecAnalyse.dequeueInputBuffer(1000L);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "dequeueInputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return dequeueInputBuffer(mediaCodecAnalyse);
                }
            }
            throw e17;
        }
    }

    private int dequeueOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, android.media.MediaCodec.BufferInfo bufferInfo) {
        try {
            return mediaCodecAnalyse.dequeueOutputBuffer(bufferInfo, 1000L);
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "dequeueOutputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return dequeueOutputBuffer(mediaCodecAnalyse, bufferInfo);
                }
            }
            throw e17;
        }
    }

    private java.nio.ByteBuffer getInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17) {
        try {
            return com.tencent.tav.decoder.DecoderUtils.getInputBuffer(mediaCodecAnalyse, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "getInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return getInputBuffer(mediaCodecAnalyse, i17);
                }
            }
            throw e17;
        }
    }

    private java.nio.ByteBuffer getOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17) {
        try {
            return com.tencent.tav.decoder.DecoderUtils.getOutputBuffer(mediaCodecAnalyse, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "getOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return getOutputBuffer(mediaCodecAnalyse, i17);
                }
            }
            throw e17;
        }
    }

    private void queueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17, int i18, int i19, long j17, int i27) {
        try {
            mediaCodecAnalyse.queueInputBuffer(i17, i18, i19, j17, i27);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "queueInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    queueInputBuffer(mediaCodecAnalyse, i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    private void releaseOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17, boolean z17) {
        try {
            mediaCodecAnalyse.releaseOutputBuffer(i17, z17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "releaseOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    releaseOutputBuffer(mediaCodecAnalyse, i17, z17);
                }
            }
            throw e17;
        }
    }

    private boolean validAndCorrectBufferInfo(android.media.MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.size > 0 && (bufferInfo.flags & 4) == 0;
    }

    private void waitTime(long j17) {
        try {
            wait(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public boolean endWriteAudioSample() {
        try {
            int dequeueInputBuffer = dequeueInputBuffer(this.audioEncoder);
            if (dequeueInputBuffer < 0) {
                return false;
            }
            queueInputBuffer(this.audioEncoder, dequeueInputBuffer, 0, 0, 0L, 4);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "endWriteAudioSample failed", th6);
            return false;
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public android.media.MediaFormat getEncodeFormat() {
        return this.audioEncodeFormat;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public long getEncodePresentationTimeUs() {
        return this.audioPresentationTimeUs;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public boolean isEncodeToEndOfStream() {
        return this.isEncodeToEndOfStream;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public boolean prepare(com.tencent.tav.core.ExportConfig exportConfig, android.media.MediaFormat mediaFormat) {
        this.encodeOption = exportConfig;
        try {
            com.tencent.tav.decoder.logger.Logger.i(TAG, "prepareAudioEncoder: format = " + mediaFormat);
            com.tencent.tav.codec.MediaCodecAnalyse createEncoderByType = com.tencent.tav.codec.MediaCodecAnalyse.createEncoderByType("audio/mp4a-latm", SCENE);
            this.audioEncoder = createEncoderByType;
            createEncoderByType.configure(mediaFormat, null, null, 1);
            return true;
        } catch (java.lang.Exception e17) {
            throw new com.tencent.tav.core.ExportRuntimeException(new com.tencent.tav.core.ExportErrorStatus(-104, e17, mediaFormat.toString()));
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public void release() {
        com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = this.audioEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.release();
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public void setMediaMuxer(com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer) {
        this.muxer = iMediaMuxer;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public boolean start() {
        this.audioEncoder.start();
        return true;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public void stop() {
        com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = this.audioEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.stop();
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public boolean writeAudioFrame(boolean z17) {
        com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer = this.muxer;
        boolean isStarted = iMediaMuxer != null ? iMediaMuxer.getIsStarted() : false;
        if (isStarted || this.audioEncodeFormat == null) {
            int dequeueOutputBuffer = dequeueOutputBuffer(this.audioEncoder, this.audioBufferInfo);
            if (dequeueOutputBuffer == -1) {
                if (z17) {
                    return false;
                }
            } else {
                if (dequeueOutputBuffer == -2) {
                    this.audioEncodeFormat = this.audioEncoder.getOutputFormat();
                    com.tencent.tav.decoder.logger.Logger.i(TAG, "audio format changed " + this.audioEncodeFormat);
                    return false;
                }
                if (dequeueOutputBuffer < 0) {
                    return false;
                }
                java.nio.ByteBuffer outputBuffer = getOutputBuffer(this.audioEncoder, dequeueOutputBuffer);
                if ((this.audioBufferInfo.flags & 2) != 0) {
                    this.audioBufferInfo.size = 0;
                }
                outputBuffer.position(this.audioBufferInfo.offset);
                outputBuffer.limit(this.audioBufferInfo.offset + this.audioBufferInfo.size);
                if (validAndCorrectBufferInfo(this.audioBufferInfo) && isStarted) {
                    try {
                        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                        bufferInfo.set(this.audioBufferInfo.offset, this.audioBufferInfo.size, this.audioBufferInfo.presentationTimeUs, this.audioBufferInfo.flags);
                        if (this.audioBufferInfo.presentationTimeUs >= 0) {
                            this.muxer.writeSampleDataTime(false, com.tencent.tav.coremedia.CMTime.fromSeconds((float) this.audioBufferInfo.presentationTimeUs));
                        }
                        com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer2 = this.muxer;
                        iMediaMuxer2.writeSampleData(iMediaMuxer2.getAudioId(), outputBuffer, bufferInfo);
                        com.tencent.tav.decoder.logger.Logger.v(TAG, "writeAudioFrame:  " + this.audioBufferInfo.presentationTimeUs);
                        this.audioPresentationTimeUs = this.audioBufferInfo.presentationTimeUs;
                    } catch (java.lang.Exception e17) {
                        com.tencent.tav.decoder.logger.Logger.e(TAG, "writeAudioFrame: ", e17);
                    }
                }
                releaseOutputBuffer(this.audioEncoder, dequeueOutputBuffer, false);
                if ((this.audioBufferInfo.flags & 4) == 0) {
                    return false;
                }
                com.tencent.tav.decoder.logger.Logger.i(TAG, "writeAudioFrame: BUFFER_FLAG_END_OF_STREAM");
                this.audioPresentationTimeUs = -1L;
                this.isEncodeToEndOfStream = true;
            }
        } else if (z17) {
            return false;
        }
        return true;
    }

    @Override // com.tencent.tav.decoder.AssetWriterAudioEncoder
    public long writeAudioSample(long j17, java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int dequeueInputBuffer = dequeueInputBuffer(this.audioEncoder);
        if (dequeueInputBuffer < 0) {
            return 0L;
        }
        java.nio.ByteBuffer inputBuffer = getInputBuffer(this.audioEncoder, dequeueInputBuffer);
        int min = java.lang.Math.min(limit - position, inputBuffer.capacity());
        int i17 = position + min;
        byteBuffer.limit(i17);
        byteBuffer.position(position);
        inputBuffer.put(byteBuffer);
        queueInputBuffer(this.audioEncoder, dequeueInputBuffer, 0, min, j17, 0);
        byteBuffer.position(i17);
        return com.tencent.tav.decoder.DecoderUtils.getAudioDuration(min, this.encodeOption.getAudioChannelCount(), this.encodeOption.getAudioSampleRateHz());
    }
}

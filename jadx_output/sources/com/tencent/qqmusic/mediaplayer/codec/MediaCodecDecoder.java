package com.tencent.qqmusic.mediaplayer.codec;

/* loaded from: classes13.dex */
public class MediaCodecDecoder extends com.tencent.qqmusic.mediaplayer.codec.BaseDecoder {
    private static final int CONTINUOUS_TIMEOUT_COUNT = 500;
    private static final java.lang.String KEY_BIT_RATE = "bit-rate";
    private static final java.lang.String KEY_PCM_ENCODING = "pcm-encoding";
    private static final java.lang.String TAG = "MediaCodecDecoder";
    private static final long TIMEOUT_AUTO_SEEK_INTERVAL_MS = 5000;
    private static final int TIMEOUT_US = 1000;
    private final android.media.MediaExtractor mMediaExtractor = new android.media.MediaExtractor();
    private android.media.MediaCodec mMediaCodec = null;
    private com.tencent.qqmusic.mediaplayer.AudioInformation mInfo = null;
    private boolean mDecoderFinished = false;
    private long mCurrentDecodeTime = 0;
    private volatile byte[] mRemainBuffer = null;
    private com.tencent.qqmusic.mediaplayer.seektable.SeekTable mSeekTable = null;
    private long mFileSize = 0;
    private java.lang.ref.WeakReference<android.media.AudioTrack> mAudioTrackRef = new java.lang.ref.WeakReference<>(null);

    /* loaded from: classes13.dex */
    public static class BufferTimeoutException extends java.lang.Exception {
        public BufferTimeoutException() {
            super("buffer timeout exception");
        }
    }

    /* loaded from: classes13.dex */
    public static class NullInputBufferException extends java.lang.Exception {
        public NullInputBufferException() {
            super("Null Input Buffer exception");
        }
    }

    private int decodeDataInternal(int i17, byte[] bArr) {
        int processInputOutputBuffer;
        byte[] bArr2 = this.mRemainBuffer;
        if (bArr2 != null && bArr2.length > 0) {
            if (i17 >= bArr2.length) {
                java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                int length = bArr2.length;
                this.mRemainBuffer = null;
                return length;
            }
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, i17);
            int length2 = bArr2.length - i17;
            byte[] bArr3 = new byte[length2];
            java.lang.System.arraycopy(bArr2, i17, bArr3, 0, length2);
            this.mRemainBuffer = bArr3;
            return i17;
        }
        if (this.mMediaCodec == null) {
            return 0;
        }
        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
        int i18 = 0;
        int i19 = 0;
        while (!this.mDecoderFinished && i18 <= 0) {
            try {
                processInputOutputBuffer = processInputOutputBuffer(bufferInfo);
            } catch (com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.NullInputBufferException unused) {
            }
            if (processInputOutputBuffer == -3) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "INFO_OUTPUT_BUFFERS_CHANGED");
            } else if (processInputOutputBuffer == -2) {
                android.media.MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
                android.media.AudioTrack audioTrack = this.mAudioTrackRef.get();
                if (audioTrack != null && outputFormat != null) {
                    audioTrack.setPlaybackRate(outputFormat.getInteger("sample-rate"));
                }
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "New format " + outputFormat);
            } else if (processInputOutputBuffer != -1) {
                java.nio.ByteBuffer outputBuffer = this.mMediaCodec.getOutputBuffer(processInputOutputBuffer);
                if (outputBuffer != null) {
                    i18 = java.lang.Math.min(java.lang.Math.min(i17, outputBuffer.remaining()), bArr.length);
                    outputBuffer.get(bArr, 0, i18);
                    int i27 = bufferInfo.size;
                    if (i27 > i17) {
                        int i28 = i27 - i17;
                        this.mRemainBuffer = new byte[i28];
                        outputBuffer.get(this.mRemainBuffer, 0, i28);
                    }
                    outputBuffer.clear();
                    this.mMediaCodec.releaseOutputBuffer(processInputOutputBuffer, false);
                    long j17 = this.mCurrentDecodeTime;
                    this.mCurrentDecodeTime = bufferInfo.presentationTimeUs / 1000;
                    com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation = this.mInfo;
                    if (audioInformation != null && audioInformation.getBitDepth() == 0) {
                        this.mInfo.setBitDept(com.tencent.qqmusic.mediaplayer.AudioRecognition.calcBitDept(bufferInfo.size, this.mCurrentDecodeTime - j17, this.mInfo.getChannels(), this.mInfo.getSampleRate()));
                    }
                }
            } else {
                i19++;
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "dequeueOutputBuffer timed out!");
                if (i19 == 500) {
                    throw new com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.BufferTimeoutException();
                }
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.mDecoderFinished = true;
                this.mCurrentDecodeTime = getDuration();
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "OutputBuffer BUFFER_FLAG_END_OF_STREAM");
            }
        }
        return i18;
    }

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String str) {
        boolean z17;
        com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        try {
            mediaExtractor.setDataSource(str);
            z17 = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "getAudioType", th6);
            z17 = false;
        }
        if (!z17) {
            return audioType;
        }
        com.tencent.qqmusic.mediaplayer.upstream.FileDataSource fileDataSource = new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(str);
        fileDataSource.open();
        com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType2 = getAudioType(mediaExtractor, fileDataSource);
        fileDataSource.close();
        return audioType2;
    }

    private static android.media.MediaFormat getMediaFormatByExtractor(android.media.MediaExtractor mediaExtractor) {
        for (int i17 = 0; i17 < mediaExtractor.getTrackCount(); i17++) {
            android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(i17);
            java.lang.String string = trackFormat.getString("mime");
            if (!android.text.TextUtils.isEmpty(string) && string.startsWith("audio")) {
                return trackFormat;
            }
        }
        return null;
    }

    private boolean initAudioInformation(java.lang.String str, int i17, android.media.MediaFormat mediaFormat, com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource, com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType) {
        android.media.MediaFormat mediaFormat2;
        this.mMediaExtractor.selectTrack(i17);
        android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(str);
        this.mMediaCodec = createDecoderByType;
        createDecoderByType.configure(mediaFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        this.mMediaCodec.start();
        int i18 = -1;
        for (int i19 = 0; i19 < 500 && (i18 == -1 || i18 == -3); i19++) {
            try {
                i18 = processInputOutputBuffer(new android.media.MediaCodec.BufferInfo());
            } catch (com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.NullInputBufferException unused) {
            }
            if (i18 == -2) {
                mediaFormat2 = this.mMediaCodec.getOutputFormat();
                break;
            }
        }
        mediaFormat2 = null;
        if (mediaFormat2 == null) {
            this.mMediaCodec.release();
            return false;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "format:" + mediaFormat + " outputFormat:" + mediaFormat2);
        java.lang.String str2 = KEY_PCM_ENCODING;
        if (mediaFormat2.containsKey(str2)) {
            mediaFormat.setInteger(str2, mediaFormat2.getInteger(str2));
        }
        if (mediaFormat2.containsKey("sample-rate")) {
            mediaFormat.setInteger("sample-rate", mediaFormat2.getInteger("sample-rate"));
        }
        if (mediaFormat2.containsKey("channel-count")) {
            mediaFormat.setInteger("channel-count", mediaFormat2.getInteger("channel-count"));
        }
        setAudioInformationByMediaFormat(this.mInfo, mediaFormat, iDataSource.getSize());
        if (audioType == com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC) {
            this.mSeekTable = new com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable((int) this.mInfo.getSampleRate());
        } else if (audioType == com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.M4A || audioType == com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.MP4) {
            this.mSeekTable = new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable();
        } else if (audioType == com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.MP3) {
            this.mSeekTable = new com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3SeekTable();
        }
        com.tencent.qqmusic.mediaplayer.seektable.SeekTable seekTable = this.mSeekTable;
        if (seekTable != null) {
            try {
                seekTable.parse(iDataSource);
            } catch (com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException e17) {
                this.mSeekTable = null;
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "seek table parse", e17);
            }
        }
        return this.mInfo.getDuration() > 0 && this.mInfo.getChannels() >= 2;
    }

    private boolean initMediaCodecAndFormat(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        for (int i17 = 0; i17 < this.mMediaExtractor.getTrackCount(); i17++) {
            android.media.MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i17);
            java.lang.String string = trackFormat.getString("mime");
            if (!android.text.TextUtils.isEmpty(string) && string.startsWith("audio")) {
                this.mInfo = new com.tencent.qqmusic.mediaplayer.AudioInformation();
                com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = iDataSource.getAudioType();
                this.mInfo.setAudioType(audioType);
                setAudioType(audioType);
                return initAudioInformation(string, i17, trackFormat, iDataSource, audioType);
            }
        }
        return false;
    }

    private int processInputOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo) {
        int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(1000L);
        if (dequeueInputBuffer >= 0) {
            java.nio.ByteBuffer inputBuffer = this.mMediaCodec.getInputBuffer(dequeueInputBuffer);
            if (inputBuffer == null) {
                throw new com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.NullInputBufferException();
            }
            int readSampleData = this.mMediaExtractor.readSampleData(inputBuffer, 0);
            if (readSampleData < 0) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "InputBuffer BUFFER_FLAG_END_OF_STREAM");
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mMediaExtractor.getSampleTime(), 0);
                this.mMediaExtractor.advance();
            }
        }
        return this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 1000L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(2:36|(1:38)(1:39))|4|(2:6|(1:8)(1:28))(2:29|(2:31|(1:33)(1:34))(1:35))|9|(7:11|(1:13)(1:26)|15|16|(1:(1:19))(1:23)|20|21)|27|15|16|(0)(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (r5 != 4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void setAudioInformationByMediaFormat(com.tencent.qqmusic.mediaplayer.AudioInformation r16, android.media.MediaFormat r17, long r18) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "sample-rate"
            int r2 = r1.getInteger(r2)
            java.lang.String r3 = "channel-count"
            int r3 = r1.getInteger(r3)
            java.lang.String r4 = "bitrate"
            boolean r5 = r1.containsKey(r4)
            r6 = 0
            if (r5 == 0) goto L20
            int r4 = r1.getInteger(r4)
            int r4 = r4 / 1000
            goto L30
        L20:
            java.lang.String r4 = "bit-rate"
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L2f
            int r4 = r1.getInteger(r4)
            int r4 = r4 / 1000
            goto L30
        L2f:
            r4 = r6
        L30:
            r7 = 8
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r5 = "durationUs"
            if (r4 <= 0) goto L4b
            boolean r11 = r1.containsKey(r5)
            if (r11 == 0) goto L44
            long r7 = r1.getLong(r5)
            long r7 = r7 / r9
            goto L68
        L44:
            long r9 = (long) r4
            long r9 = r18 / r9
            long r9 = r9 * r7
            int r5 = (int) r9
            long r7 = (long) r5
            goto L68
        L4b:
            boolean r11 = r1.containsKey(r5)
            r12 = 0
            if (r11 == 0) goto L67
            long r4 = r1.getLong(r5)
            long r4 = r4 / r9
            int r9 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r9 <= 0) goto L64
            long r9 = r18 / r4
            long r9 = r9 * r7
            int r7 = (int) r9
            r14 = r4
            r4 = r7
            r7 = r14
            goto L68
        L64:
            r7 = r4
            r4 = r6
            goto L68
        L67:
            r7 = r12
        L68:
            java.lang.String r5 = com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.KEY_PCM_ENCODING
            boolean r9 = r1.containsKey(r5)
            r10 = 3
            r11 = 1
            r12 = 2
            if (r9 == 0) goto L7c
            int r5 = r1.getInteger(r5)
            if (r5 == r10) goto L7e
            r9 = 4
            if (r5 == r9) goto L7f
        L7c:
            r9 = r12
            goto L7f
        L7e:
            r9 = r11
        L7f:
            java.lang.String r5 = "bitrate-mode"
            int r6 = r1.getInteger(r5)     // Catch: java.lang.Exception -> L85
        L85:
            if (r6 == r11) goto L8e
            if (r6 == r12) goto L8a
            goto L91
        L8a:
            r0.setCbr(r11)
            goto L91
        L8e:
            r0.setCbr(r10)
        L91:
            long r1 = (long) r2
            r0.setSampleRate(r1)
            r0.setChannels(r3)
            r0.setDuration(r7)
            r0.setBitrate(r4)
            r0.setBitDept(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.setAudioInformationByMediaFormat(com.tencent.qqmusic.mediaplayer.AudioInformation, android.media.MediaFormat, long):void");
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int decodeData(int i17, byte[] bArr) {
        long currentTime;
        try {
            return decodeDataInternal(i17, bArr);
        } catch (com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.BufferTimeoutException unused) {
            do {
                currentTime = getCurrentTime() + TIMEOUT_AUTO_SEEK_INTERVAL_MS;
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "decodeData buffer timeout, seekTime:" + currentTime);
                seekTo((int) java.lang.Math.min(getDuration(), currentTime));
                try {
                    return decodeDataInternal(i17, bArr);
                } catch (com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.BufferTimeoutException unused2) {
                    if (currentTime < getDuration()) {
                        return -1;
                    }
                }
            } while (currentTime < getDuration());
            return -1;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public com.tencent.qqmusic.mediaplayer.AudioInformation getAudioInformation() {
        return this.mInfo;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getBytePositionOfTime(long j17) {
        int bitrate = this.mInfo.getBitrate();
        com.tencent.qqmusic.mediaplayer.seektable.SeekTable seekTable = this.mSeekTable;
        if (seekTable != null) {
            return seekTable.seek(j17);
        }
        if (bitrate > 0) {
            return j17 * bitrate;
        }
        if (getDuration() > 0) {
            return (this.mFileSize * j17) / getDuration();
        }
        return 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getCurrentTime() {
        return this.mCurrentDecodeTime;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getDuration() {
        com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation = this.mInfo;
        if (audioInformation != null) {
            return audioInformation.getDuration();
        }
        return 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int getErrorCodeMask() {
        return -1;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getMinBufferSize() {
        com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation = this.mInfo;
        if (audioInformation == null) {
            return 0L;
        }
        int bitDepth = audioInformation.getBitDepth();
        return android.media.AudioTrack.getMinBufferSize((int) this.mInfo.getSampleRate(), 12, bitDepth == 1 ? 3 : bitDepth == 4 ? 4 : 2);
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public java.util.List<com.tencent.qqmusic.mediaplayer.NativeLibs> getNativeLibs() {
        return new java.util.ArrayList();
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource iNativeDataSource) {
        return -1;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int release() {
        this.mMediaExtractor.release();
        android.media.MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null) {
            return 0;
        }
        mediaCodec.release();
        return 0;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int seekTo(int i17) {
        this.mMediaCodec.flush();
        this.mRemainBuffer = null;
        this.mMediaExtractor.seekTo(i17 * 1000, 2);
        this.mCurrentDecodeTime = i17;
        return i17;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public void setAudioTrack(android.media.AudioTrack audioTrack) {
        this.mAudioTrackRef = new java.lang.ref.WeakReference<>(audioTrack);
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(java.lang.String str, boolean z17) {
        return init(new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(str));
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(final com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        if (iDataSource == null) {
            return -1;
        }
        try {
            iDataSource.open();
            this.mMediaExtractor.setDataSource(new android.media.MediaDataSource() { // from class: com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.1
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                @Override // android.media.MediaDataSource
                public long getSize() {
                    return iDataSource.getSize();
                }

                @Override // android.media.MediaDataSource
                public int readAt(long j17, byte[] bArr, int i17, int i18) {
                    return iDataSource.readAt(j17, bArr, i17, i18);
                }
            });
            this.mFileSize = iDataSource.getSize();
            return initMediaCodecAndFormat(iDataSource) ? 0 : -1;
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, th6);
            return -1;
        }
    }

    private static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(android.media.MediaExtractor mediaExtractor, com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
        android.media.MediaFormat mediaFormatByExtractor = getMediaFormatByExtractor(mediaExtractor);
        if (mediaFormatByExtractor == null) {
            return audioType;
        }
        java.lang.String string = mediaFormatByExtractor.getString("mime");
        if (android.text.TextUtils.isEmpty(string) || !string.startsWith("audio")) {
            return audioType;
        }
        char c17 = 65535;
        switch (string.hashCode()) {
            case -1003765268:
                if (string.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_VORBIS)) {
                    c17 = 0;
                    break;
                }
                break;
            case -53558318:
                if (string.equals("audio/mp4a-latm")) {
                    c17 = 1;
                    break;
                }
                break;
            case 187094639:
                if (string.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_RAW)) {
                    c17 = 2;
                    break;
                }
                break;
            case 1504619009:
                if (string.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_FLAC)) {
                    c17 = 3;
                    break;
                }
                break;
            case 1504831518:
                if (string.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG)) {
                    c17 = 4;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.OGG;
            case 1:
                return com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegRecognition.isM4a(iDataSource) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.M4A : audioType;
            case 2:
                if (com.tencent.qqmusic.mediaplayer.codec.flac.FLACRecognition.isFlac(iDataSource)) {
                    return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC;
                }
                return com.tencent.qqmusic.mediaplayer.codec.wav.WavRecognition.isWav(iDataSource) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.WAV : audioType;
            case 3:
                return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC;
            case 4:
                return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.MP3;
            default:
                return audioType;
        }
    }
}

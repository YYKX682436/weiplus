package com.tencent.thumbplayer.core.decoder;

/* loaded from: classes14.dex */
public class TPMediaCodecAudioDecoder extends com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder {
    private static final java.lang.String TAG = "TPMediaCodecAudioDecoder";
    private int mAudioFormat;
    private int mChannelCount;
    private byte[] mCsd0Data;
    private boolean mEnableAudioPassThrough;
    private boolean mIsAdts;
    private java.util.ArrayList<java.lang.String> mMimeCandidates;
    private int mSampleRate;

    public TPMediaCodecAudioDecoder(int i17) {
        super(i17);
        this.mMimeCandidates = new java.util.ArrayList<>();
        this.mSampleRate = 0;
        this.mChannelCount = 0;
        this.mAudioFormat = 0;
        this.mCsd0Data = null;
        this.mIsAdts = false;
        this.mEnableAudioPassThrough = false;
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void configCodec(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, java.lang.String str) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "configCodec: ");
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat(str, this.mSampleRate, this.mChannelCount);
        byte[] bArr = this.mCsd0Data;
        if (bArr != null) {
            createAudioFormat.setByteBuffer(com.tencent.thumbplayer.tmediacodec.util.TUtils.CSD_0, java.nio.ByteBuffer.wrap(bArr));
        }
        if (this.mIsAdts) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "configCodec: set is adts");
            createAudioFormat.setInteger("is-adts", 1);
        }
        tMediaCodec.configure(createAudioFormat, (android.view.Surface) null, this.mMediaCrypto, 0);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public java.lang.String getCodecName(java.lang.String str, boolean z17) {
        return com.tencent.thumbplayer.core.common.TPCodecUtils.getDecoderName(str, z17);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public java.lang.String getLogTag() {
        return TAG;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(java.lang.String str, int i17, int i18, int i19, android.view.Surface surface, int i27, int i28, int i29) {
        return false;
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processMediaCodecException(java.lang.Exception exc) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputBuffer(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo) {
        byte[] bArr;
        tPFrameInfo.sampleRate = this.mSampleRate;
        tPFrameInfo.channelCount = this.mChannelCount;
        tPFrameInfo.format = this.mAudioFormat;
        java.nio.ByteBuffer outputBuffer = tMediaCodec.getOutputBuffer(i17);
        if (outputBuffer != null) {
            int i18 = bufferInfo.size;
            bArr = new byte[i18];
            outputBuffer.get(bArr, bufferInfo.offset, i18);
        } else {
            bArr = null;
        }
        tPFrameInfo.data = bArr;
        if (bufferInfo.flags == 4 && bufferInfo.size <= 0) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
            tPFrameInfo.errCode = 2;
        }
        tMediaCodec.releaseOutputBuffer(i17, false);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputConfigData(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo) {
        tMediaCodec.releaseOutputBuffer(i17, false);
        tPFrameInfo.errCode = 1;
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputFormatChanged(android.media.MediaFormat mediaFormat) {
        int i17;
        int i18;
        try {
            if (mediaFormat.containsKey("sample-rate")) {
                this.mSampleRate = mediaFormat.getInteger("sample-rate");
            }
            if (mediaFormat.containsKey("channel-count")) {
                this.mChannelCount = mediaFormat.getInteger("channel-count");
            }
            if (mediaFormat.containsKey("pcm-encoding")) {
                i18 = mediaFormat.getInteger("pcm-encoding");
                try {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "processOutputFormatChanged: MediaFormat.KEY_PCM_ENCODING: " + i18);
                } catch (java.lang.Exception e17) {
                    i17 = i18;
                    e = e17;
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "processOutputFormatChanged got one exception: " + getStackTrace(e));
                    i18 = i17;
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "processOutputFormatChanged, mEnableAudioPassThrough:" + this.mEnableAudioPassThrough + ", mSampleRate: " + this.mSampleRate + ", mChannelCount: " + this.mChannelCount + " mAudioFormat: " + this.mAudioFormat + " pcmFormat:" + i18);
                }
            } else {
                i18 = 2;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            i17 = 2;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "processOutputFormatChanged, mEnableAudioPassThrough:" + this.mEnableAudioPassThrough + ", mSampleRate: " + this.mSampleRate + ", mChannelCount: " + this.mChannelCount + " mAudioFormat: " + this.mAudioFormat + " pcmFormat:" + i18);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f17) {
        return super.setOperateRate(f17);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i17, boolean z17) {
        if (i17 == 2) {
            this.mIsAdts = z17;
            return true;
        }
        if (i17 != 3) {
            return super.setParamBool(i17, z17);
        }
        this.mEnableAudioPassThrough = z17;
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "setParamBool mEnableAudioPassThrough:" + this.mEnableAudioPassThrough);
        return true;
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i17, byte[] bArr) {
        if (i17 == 200) {
            this.mCsd0Data = bArr;
        }
        return super.setParamBytes(i17, bArr);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i17, java.lang.Object obj) {
        return super.setParamObject(i17, obj);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public java.util.ArrayList<java.lang.String> getMimeCandidates() {
        return this.mMimeCandidates;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(java.lang.String str, int i17, int i18, int i19, int i27) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "initDecoder, mimeType:" + str + " sampleRate:" + i17 + " channelCount:" + i18 + " drmType:" + i19 + " audioFormat:" + i27);
        this.mSampleRate = i17;
        this.mChannelCount = i18;
        this.mDrmType = i19;
        this.mAudioFormat = i27;
        this.mMimeCandidates.clear();
        this.mMimeCandidates.add(str);
        return true;
    }
}

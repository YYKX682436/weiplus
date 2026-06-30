package com.tencent.thumbplayer.core.decoder;

/* loaded from: classes14.dex */
public class TPMediaCodecVideoDecoder extends com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder {
    private static final java.lang.String CODEC_HISI_NAME = "hisi";
    private static final java.lang.String DEVICE_NAME_VIVO_X5L = "vivo X5L";
    private static final java.lang.String KEY_CROP_BOTTOM = "crop-bottom";
    private static final java.lang.String KEY_CROP_LEFT = "crop-left";
    private static final java.lang.String KEY_CROP_RIGHT = "crop-right";
    private static final java.lang.String KEY_CROP_TOP = "crop-top";
    private static final int PIXEL_STRIDE_CONTINUOUS = 1;
    public static final int PLAY_MODE_HLG_HDR_2_HDR = 5;
    public static final int PLAY_MODE_HLG_HDR_2_SDR = 3;
    public static final int PLAY_MODE_PQ_HDR_2_HDR = 4;
    public static final int PLAY_MODE_PQ_HDR_2_SDR = 2;
    public static final int PLAY_MODE_SDR_2_SDR = 1;
    public static final int PLAY_MODE_UNKNOWN = 0;
    private static final java.lang.String TAG = "TPMediaCodecVideoDecode";
    private static final int YUV420P_PLANAR_COUNT = 3;
    private boolean hasRenderFirstFrame;
    private int mCropBottom;
    private int mCropLeft;
    private int mCropRight;
    private int mCropTop;
    private byte[] mCsd0Data;
    private byte[] mCsd1Data;
    private byte[] mCsd2Data;
    private boolean mDisableDolbyVisionComponent;
    private com.tencent.thumbplayer.core.postprocessor.DisplaySurface mDisplaySurface;
    private int mDolbyVisionLevel;
    private int mDolbyVisionProfile;
    private boolean mEnableMediaCodecOutputData;
    private java.util.ArrayList<java.lang.String> mMimeCandidates;
    private com.tencent.thumbplayer.core.postprocessor.ProcessSurface mProcessSurface;
    private int mRotation;
    private int mVideoHeight;
    private int mVideoWidth;
    private int playMode;
    private com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType type;

    public TPMediaCodecVideoDecoder(int i17) {
        super(i17);
        this.mEnableMediaCodecOutputData = false;
        this.mMimeCandidates = new java.util.ArrayList<>();
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mCropLeft = 0;
        this.mCropRight = 0;
        this.mCropTop = 0;
        this.mCropBottom = 0;
        this.mRotation = 0;
        this.mDolbyVisionProfile = 0;
        this.mDolbyVisionLevel = 0;
        this.mCsd0Data = null;
        this.mCsd1Data = null;
        this.mCsd2Data = null;
        this.type = com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_UNKNOWN;
        this.mDisableDolbyVisionComponent = false;
        this.mProcessSurface = null;
        this.mDisplaySurface = null;
        this.playMode = 0;
        this.hasRenderFirstFrame = false;
    }

    private void copyVideoDataFromImage(android.media.Image image, com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo) {
        if (image.getFormat() != 35) {
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 3;
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "copyVideoDataFromImage: image format not support!");
            return;
        }
        tPFrameInfo.format = 0;
        int width = image.getWidth();
        int height = image.getHeight();
        android.media.Image.Plane[] planes = image.getPlanes();
        int[] iArr = tPFrameInfo.lineSize;
        if (iArr == null || iArr.length < 3) {
            tPFrameInfo.lineSize = new int[3];
        }
        byte[][] bArr = tPFrameInfo.videoData;
        if (bArr == null || bArr.length < 3) {
            tPFrameInfo.videoData = new byte[3];
        }
        int i17 = 0;
        while (i17 < 3) {
            int i18 = i17 == 0 ? 0 : 1;
            copyVideoDataFromPlane(planes[i17], width >> i18, height >> i18, i17, tPFrameInfo);
            i17++;
        }
    }

    private void copyVideoDataFromPlane(android.media.Image.Plane plane, int i17, int i18, int i19, com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo) {
        java.nio.ByteBuffer buffer = plane.getBuffer();
        tPFrameInfo.lineSize[i19] = i17;
        int i27 = i17 * i18;
        byte[][] bArr = tPFrameInfo.videoData;
        byte[] bArr2 = bArr[i19];
        if (bArr2 == null || bArr2.length < i27) {
            bArr[i19] = new byte[i27];
        }
        if (plane.getPixelStride() == 1) {
            buffer.get(tPFrameInfo.videoData[i19], 0, i27);
            return;
        }
        for (int i28 = 0; i28 < i27; i28++) {
            tPFrameInfo.videoData[i19][i28] = buffer.get(plane.getPixelStride() * i28);
        }
    }

    private boolean enableSurfaceRender() {
        return this.mEnableHdrCustomRender || this.mEnableRendererSharpen > 0;
    }

    private boolean getExtBool() {
        com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType tPProcessType = this.type;
        if (tPProcessType == com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_SHARPEN) {
            return this.mSwitchEnableRendererSharpen;
        }
        if (tPProcessType != com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_HDR2SDR) {
            return false;
        }
        int i17 = this.playMode;
        return i17 == 2 || i17 == 3;
    }

    private int getExtInt() {
        com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType tPProcessType = this.type;
        if (tPProcessType == com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_SHARPEN) {
            return this.mEnableRendererSharpen;
        }
        if (tPProcessType == com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_HDR2SDR) {
            return this.playMode;
        }
        return 0;
    }

    private void processOutputData(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo) {
        if (bufferInfo.flags == 4 && bufferInfo.size <= 0) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 2;
            tMediaCodec.releaseOutputBuffer(i17, false);
            return;
        }
        android.media.Image outputImage = tMediaCodec.getOutputImage(i17);
        if (outputImage != null) {
            copyVideoDataFromImage(outputImage, tPFrameInfo);
            tMediaCodec.releaseOutputBuffer(i17, false);
        } else {
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 3;
            tMediaCodec.releaseOutputBuffer(i17, false);
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "processOutputBuffer: getOutputImage return null");
        }
    }

    private void releaseOpenGlResource() {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "releaseOpenGlResource");
        try {
            com.tencent.thumbplayer.core.postprocessor.DisplaySurface displaySurface = this.mDisplaySurface;
            if (displaySurface != null) {
                displaySurface.makeCurrent();
                com.tencent.thumbplayer.core.postprocessor.ProcessSurface processSurface = this.mProcessSurface;
                if (processSurface != null) {
                    processSurface.release();
                }
                this.mDisplaySurface.release();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "custom render release failed!" + e17.getMessage());
        }
        this.mProcessSurface = null;
        this.mDisplaySurface = null;
    }

    private void renderImpl() {
        this.hasRenderFirstFrame = true;
        this.mDisplaySurface.makeCurrent();
        this.mDisplaySurface.querySurface();
        this.mProcessSurface.drawImage(this.mVideoWidth, this.mVideoHeight, this.mDisplaySurface.getmWidth(), this.mDisplaySurface.getmHeight(), getExtBool(), getExtInt());
        this.mDisplaySurface.swapBuffers();
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void configCodec(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, java.lang.String str) {
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(str, this.mVideoWidth, this.mVideoHeight);
        createVideoFormat.setInteger("rotation-degrees", this.mRotation);
        if (com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName().equalsIgnoreCase(DEVICE_NAME_VIVO_X5L)) {
            createVideoFormat.setInteger("max-input-size", this.mVideoWidth * this.mVideoHeight);
        }
        byte[] bArr = this.mCsd0Data;
        if (bArr != null) {
            createVideoFormat.setByteBuffer(com.tencent.thumbplayer.tmediacodec.util.TUtils.CSD_0, java.nio.ByteBuffer.wrap(bArr));
        }
        byte[] bArr2 = this.mCsd1Data;
        if (bArr2 != null) {
            createVideoFormat.setByteBuffer(com.tencent.thumbplayer.tmediacodec.util.TUtils.CSD_1, java.nio.ByteBuffer.wrap(bArr2));
        }
        byte[] bArr3 = this.mCsd2Data;
        if (bArr3 != null) {
            createVideoFormat.setByteBuffer(com.tencent.thumbplayer.tmediacodec.util.TUtils.CSD_2, java.nio.ByteBuffer.wrap(bArr3));
        }
        if ("video/dolby-vision".equals(str)) {
            createVideoFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, com.tencent.thumbplayer.core.common.TPCodecUtils.convertDolbyVisionToOmxProfile(this.mDolbyVisionProfile));
            createVideoFormat.setInteger(ya.b.LEVEL, com.tencent.thumbplayer.core.common.TPCodecUtils.convertDolbyVisionToOmxLevel(this.mDolbyVisionLevel));
        }
        if (this.mEnableMediaCodecOutputData) {
            createVideoFormat.setInteger("color-format", 2135033992);
            tMediaCodec.configure(createVideoFormat, (android.view.Surface) null, this.mMediaCrypto, 0);
        } else {
            tMediaCodec.configure(createVideoFormat, this.mSurface, this.mMediaCrypto, 0);
        }
        tMediaCodec.setVideoScalingMode(1);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public java.lang.String getCodecName(java.lang.String str, boolean z17) {
        java.lang.String decoderName;
        int i17 = this.mDolbyVisionProfile;
        if (i17 <= 0 || this.mDisableDolbyVisionComponent) {
            decoderName = com.tencent.thumbplayer.core.common.TPCodecUtils.getDecoderName(str, z17);
        } else {
            decoderName = com.tencent.thumbplayer.core.common.TPCodecUtils.getDolbyVisionDecoderName(str, i17, this.mDolbyVisionLevel, z17);
            if (decoderName == null) {
                decoderName = com.tencent.thumbplayer.core.common.TPCodecUtils.getDecoderName(str, z17);
            }
        }
        int cpuHWProducter = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHWProducter(com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHarewareName());
        if (decoderName == null || !decoderName.contains(CODEC_HISI_NAME) || cpuHWProducter == 2 || (decoderName = com.tencent.thumbplayer.core.common.TPCodecUtils.getDecoderNameWithoutCache(str, z17)) != null) {
            return decoderName;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "hisi fall back initMediaCodec failed codecName is null");
        return null;
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public java.lang.String getLogTag() {
        return TAG;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(java.lang.String str, int i17, int i18, int i19, int i27) {
        return false;
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void onInitMediaCodecError() {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "onInitMediaCodecError!");
        releaseOpenGlResource();
        super.onInitMediaCodecError();
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processMediaCodecException(java.lang.Exception exc) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputBuffer(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo) {
        tPFrameInfo.width = this.mVideoWidth;
        tPFrameInfo.height = this.mVideoHeight;
        tPFrameInfo.cropLeft = this.mCropLeft;
        tPFrameInfo.cropRight = this.mCropRight;
        tPFrameInfo.cropTop = this.mCropTop;
        tPFrameInfo.cropBottom = this.mCropBottom;
        tPFrameInfo.format = com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC;
        if (this.mEnableMediaCodecOutputData) {
            processOutputData(tMediaCodec, i17, bufferInfo, tPFrameInfo);
        }
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputConfigData(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo) {
        tPFrameInfo.errCode = 0;
        processOutputBuffer(tMediaCodec, i17, bufferInfo, tPFrameInfo);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputFormatChanged(android.media.MediaFormat mediaFormat) {
        boolean z17 = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
        this.mVideoWidth = mediaFormat.getInteger("width");
        this.mVideoHeight = mediaFormat.getInteger("height");
        if (z17) {
            this.mCropLeft = mediaFormat.getInteger(KEY_CROP_LEFT);
            this.mCropRight = mediaFormat.getInteger(KEY_CROP_RIGHT);
            this.mCropTop = mediaFormat.getInteger(KEY_CROP_TOP);
            this.mCropBottom = mediaFormat.getInteger(KEY_CROP_BOTTOM);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "processOutputFormatChanged: mVideoWidth: " + this.mVideoWidth + ", mVideoHeight: " + this.mVideoHeight + ", mCropLeft: " + this.mCropLeft + ", mCropRight: " + this.mCropRight + ", mCropTop: " + this.mCropTop + ", mCropBottom: " + this.mCropBottom);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int release() {
        int release = super.release();
        releaseOpenGlResource();
        return release;
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int releaseOutputBuffer(int i17, boolean z17, long j17) {
        int releaseOutputBuffer = super.releaseOutputBuffer(i17, z17, j17);
        if (releaseOutputBuffer == 0 && z17 && enableSurfaceRender() && this.mSurface == this.mProcessSurface.getSurface()) {
            try {
                if (this.mProcessSurface.awaitNewImage() && this.mDisplaySurface.getSurface().isValid()) {
                    renderImpl();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "sifeng sharpen render pass failed!" + e17.getMessage());
            }
        }
        return releaseOutputBuffer;
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f17) {
        return super.setOperateRate(f17);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setOutputSurface(android.view.Surface surface) {
        if (this.mEnableMediaCodecOutputData) {
            return 3;
        }
        return super.setOutputSurface(surface);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i17, boolean z17) {
        if (5 == i17) {
            if (this.mStarted) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, getLogTag(), "BOOL_ENABLE_MEDIACODEC_OUTPUT_DATA failed. need set before start, mStart=" + this.mStarted + ", api level is " + android.os.Build.VERSION.SDK_INT + ", support api level = 21");
            } else {
                this.mEnableMediaCodecOutputData = z17;
            }
        } else if (6 == i17) {
            if (this.mStarted) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, getLogTag(), "BOOL_FORCE_DOLBY_VISION_USE_HEVC_CODEC failed. need set before start, mStart=" + this.mStarted);
            } else {
                this.mDisableDolbyVisionComponent = z17;
            }
        }
        return super.setParamBool(i17, z17);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i17, byte[] bArr) {
        if (i17 == 200) {
            this.mCsd0Data = bArr;
        } else if (i17 == 201) {
            this.mCsd1Data = bArr;
        } else if (i17 == 202) {
            this.mCsd2Data = bArr;
        }
        return super.setParamBytes(i17, bArr);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i17, java.lang.Object obj) {
        return super.setParamObject(i17, obj);
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int switchHdrModeWithSurface(android.view.Surface surface, int i17) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "switchHdrModeWithSurface");
        if (!enableSurfaceRender()) {
            return 0;
        }
        this.playMode = i17;
        this.mDisplaySurface.switchPlayMode(i17, surface);
        return 0;
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public java.util.ArrayList<java.lang.String> getMimeCandidates() {
        return this.mMimeCandidates;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(java.lang.String str, int i17, int i18, int i19, android.view.Surface surface, int i27, int i28, int i29) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "initDecoder, mimeType:" + str + " width:" + i17 + " height:" + i18 + " rotation:" + i19 + " dvProfile:" + i28 + " dvLevel:" + i29);
        this.mVideoWidth = i17;
        this.mVideoHeight = i18;
        this.mRotation = i19;
        boolean z17 = false;
        if (surface != null && !surface.isValid()) {
            return false;
        }
        if (this.mEnableRendererSharpen > 0) {
            this.type = com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_SHARPEN;
        } else if (this.mEnableHdrCustomRender) {
            this.type = com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_HDR2SDR;
        }
        com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType tPProcessType = this.type;
        if (tPProcessType != com.tencent.thumbplayer.core.postprocessor.ProcessSurface.TPProcessType.TP_PROCESS_UNKNOWN && !this.mEnableAsyncMode) {
            try {
                com.tencent.thumbplayer.core.postprocessor.DisplaySurface displaySurface = new com.tencent.thumbplayer.core.postprocessor.DisplaySurface(surface, tPProcessType);
                this.mDisplaySurface = displaySurface;
                displaySurface.eglSetup();
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "DisplaySurface eglSetup success!");
                this.mDisplaySurface.makeCurrent();
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "makeCurrent success!");
                this.mProcessSurface = new com.tencent.thumbplayer.core.postprocessor.ProcessSurface(this.mVideoWidth, this.mVideoHeight, this.mSharpenShaderPath, this.type);
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "ProcessSurface create success!");
                this.mSurface = this.mProcessSurface.getSurface();
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "sifeng create render surface success!");
            } catch (java.lang.Exception e17) {
                this.mEnableRendererSharpen = 0;
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                e17.printStackTrace(new java.io.PrintWriter(stringWriter));
                java.lang.String stringWriter2 = stringWriter.toString();
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "sifeng create sharpen surface failed! " + e17.getMessage());
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "stackTraceString: " + stringWriter2);
                releaseOpenGlResource();
            }
        }
        if (!enableSurfaceRender() || this.mEnableAsyncMode || this.mSurface == null) {
            this.mSurface = surface;
        }
        this.mDrmType = i27;
        this.mDolbyVisionProfile = i28;
        this.mDolbyVisionLevel = i29;
        this.mMimeCandidates.clear();
        if ("video/dolby-vision".equals(str)) {
            int convertDolbyVisionToOmxProfile = com.tencent.thumbplayer.core.common.TPCodecUtils.convertDolbyVisionToOmxProfile(this.mDolbyVisionProfile);
            if (convertDolbyVisionToOmxProfile >= 4 && convertDolbyVisionToOmxProfile <= 256) {
                z17 = true;
            }
            if (this.mDisableDolbyVisionComponent && z17) {
                this.mMimeCandidates.add("video/hevc");
            } else {
                this.mMimeCandidates.add(str);
                if (z17) {
                    this.mMimeCandidates.add("video/hevc");
                }
            }
        } else {
            this.mMimeCandidates.add(str);
        }
        return true;
    }
}

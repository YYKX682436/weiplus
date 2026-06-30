package com.tencent.wxmm;

/* loaded from: classes13.dex */
public class v2encoder {
    public static final int EMethodGetRemoteHW = 26;
    public static final int ENUM_AVCEncCfgERROR = 2003;
    public static final int ENUM_AVCEncCreateERROR = 2002;
    public static final int ENUM_AVCEncERROR = 2004;
    public static final int ENUM_AVCEncNotFound = 2001;
    public static final int ENUM_AVCEncOK = 2000;
    public static final boolean SAVEVIDEOSTREAM = true;
    private static final java.lang.String TAG = "v2encoder";
    public static final int VFMT_420SP = 7;
    public static final int VFMT_HEVC_HW = 19;
    public static final int VFMT_ROTATE = 32;
    public static final int VFMT_i264 = 18;
    public static final byte enumCODEC_Vcodec2_hw = 4;
    public static final byte enumCODEC_f264 = 1;
    public static final byte enumCODEC_i264 = 8;
    public static final byte enumCODEC_vcodec2 = 16;
    public static int frameID = 0;
    private static int streamqueuesize = 100;
    public long mGeneratedIdx;
    int mProfileCfg;
    public com.tencent.wxmm.v2service mProtocol;
    int m_CapH;
    int m_CapW;
    int m_br_kbps;
    int m_framerate;
    int m_height;
    int m_width;
    protected android.media.MediaFormat mediaFormat;
    private java.io.BufferedOutputStream outputStream;
    com.tencent.wxmm.v2stqos stQoS;
    private static java.lang.String path = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    public static short[] SizeFormat2WH = {128, 96, 240, 160, 320, 240, 480, 360, 640, 480};
    private static final java.lang.String[] supportedH264HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos.", "OMX.hisi"};
    public static int EMethodGetQosPara = 25;
    public java.lang.String ENCODING = "hevc";
    private int TIMEOUT_USEC = 12000;
    private android.media.MediaCodec mediaCodec = null;
    public byte[] configbyte = null;
    public boolean isRuning = false;
    public int encLen = 0;
    int mPrevResolution = 8;

    /* loaded from: classes6.dex */
    public static class Frame {

        /* renamed from: id, reason: collision with root package name */
        public int f220187id;
        public byte[] frameData = null;
        public int type = 0;

        public Frame(int i17) {
            this.f220187id = i17;
        }
    }

    public v2encoder(int i17, int i18, int i19, int i27, int i28, com.tencent.wxmm.v2service v2serviceVar) {
        this.m_width = i17;
        this.m_height = i18;
        this.m_CapW = i17;
        this.m_CapH = i18;
        this.mProtocol = v2serviceVar;
        this.m_framerate = i19;
        this.m_br_kbps = i27;
        this.mProfileCfg = i28;
        frameID = 0;
        this.mGeneratedIdx = 0L;
        this.stQoS = new com.tencent.wxmm.v2stqos();
    }

    private void NV21ToNV12(byte[] bArr, byte[] bArr2, int i17, int i18, int i19) {
        if (bArr == null || bArr2 == null) {
            return;
        }
        int i27 = i17 * i18;
        int i28 = 0;
        if (i19 == 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i27);
            while (i28 < i27 / 2) {
                int i29 = i27 + i28;
                int i37 = i29 + 1;
                bArr2[i29] = bArr[i37];
                bArr2[i37] = bArr[i29];
                i28 += 2;
            }
            return;
        }
        for (int i38 = 0; i38 < i27; i38++) {
            bArr2[i38] = bArr[(i27 - 1) - i38];
        }
        while (true) {
            if (i28 >= i27 / 2) {
                return;
            }
            bArr2[i27 + i28] = bArr[((r7 + i27) - 1) - i28];
            i28++;
        }
    }

    private void StopEncoder() {
        try {
            android.media.MediaCodec mediaCodec = this.mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mediaCodec.release();
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }

    private boolean SupportAvcCodec(java.lang.String str, int i17) {
        boolean z17 = false;
        for (int codecCount = android.media.MediaCodecList.getCodecCount() - 1; codecCount >= 0; codecCount--) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(codecCount);
            codecInfoAt.getName();
            if (codecInfoAt.isEncoder()) {
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                java.lang.String name = codecInfoAt.getName();
                for (java.lang.String str2 : supportedTypes) {
                    if (str2.equalsIgnoreCase(str)) {
                        for (java.lang.String str3 : supportedH264HwCodecPrefixes) {
                            if (name.startsWith(str3)) {
                                try {
                                    for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecInfoAt.getCapabilitiesForType(str).profileLevels) {
                                        if (codecProfileLevel.profile == i17) {
                                            z17 = true;
                                        }
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return z17;
    }

    private long computePresentationTime(long j17) {
        return ((j17 * 1000000) / 15) + 132;
    }

    private void createfile(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            this.outputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }

    private boolean isRecognizedProfile(int i17) {
        return i17 == 1 || i17 == 2 || i17 == 8;
    }

    private android.media.MediaCodecInfo selectCodec(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                for (java.lang.String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        codecInfoAt.getName();
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    private void trySetBitRateMode(android.media.MediaCodecInfo mediaCodecInfo) {
        android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        try {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(this.ENCODING);
            if (capabilitiesForType != null && (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) != null) {
                if (encoderCapabilities.isBitrateModeSupported(2)) {
                    this.mediaFormat.setInteger("bitrate-mode", 2);
                } else if (encoderCapabilities.isBitrateModeSupported(1)) {
                    this.mediaFormat.setInteger("bitrate-mode", 1);
                }
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    private void trySetProfile(android.media.MediaCodecInfo mediaCodecInfo) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(this.ENCODING);
            if (capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null) {
                return;
            }
            android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.level = 0;
            codecProfileLevel.profile = 0;
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                int i17 = codecProfileLevel2.profile;
                int i18 = codecProfileLevel2.level;
                if (isRecognizedProfile(i17) && i17 >= codecProfileLevel.profile && i18 >= codecProfileLevel.level) {
                    codecProfileLevel.profile = i17;
                    codecProfileLevel.level = i18;
                }
            }
            int i19 = codecProfileLevel.profile;
            int i27 = codecProfileLevel.level;
            if (i19 <= 0 || i27 < 256) {
                return;
            }
            this.mediaFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, i19);
            this.mediaFormat.setInteger(ya.b.LEVEL, 256);
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    public int DoMediacodecEnc(byte[] bArr, int i17) {
        byte[] bArr2;
        int i18 = this.m_CapW;
        int i19 = this.m_CapH;
        int i27 = this.m_width;
        int i28 = this.m_height;
        if (this.stQoS.cSkipFlag == 0) {
            bArr2 = new byte[((i18 * i19) * 3) / 2];
            NV21ToNV12(bArr, bArr2, i27, i28, i17 & 32);
            this.encLen = ((this.m_width * this.m_height) * 3) >> 1;
        } else {
            bArr2 = null;
        }
        if (bArr2 == null) {
            return 0;
        }
        try {
            java.lang.System.currentTimeMillis();
            java.nio.ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
            java.nio.ByteBuffer[] outputBuffers = this.mediaCodec.getOutputBuffers();
            int dequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(-1L);
            if (dequeueInputBuffer >= 0) {
                long computePresentationTime = computePresentationTime(this.mGeneratedIdx);
                java.nio.ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                byteBuffer.clear();
                byteBuffer.put(bArr2, 0, this.encLen);
                this.mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, this.encLen, computePresentationTime, 0);
                this.mGeneratedIdx++;
            }
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, this.TIMEOUT_USEC);
            int i29 = 0;
            while (dequeueOutputBuffer >= 0) {
                int i37 = bufferInfo.size;
                byte[] bArr3 = new byte[i37];
                outputBuffers[dequeueOutputBuffer].get(bArr3);
                java.io.BufferedOutputStream bufferedOutputStream = this.outputStream;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.write(bArr3, 0, i37);
                }
                putH2645Data(bArr3, bufferInfo.flags, i37);
                i29 = bufferInfo.flags;
                frameID++;
                this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, this.TIMEOUT_USEC);
            }
            return i29;
        } catch (java.lang.Exception e17) {
            e17.toString();
            return -2004;
        }
    }

    public void DoQosSvrCtrl() {
        com.tencent.wxmm.v2service v2serviceVar = this.mProtocol;
        if (v2serviceVar != null) {
            int i17 = EMethodGetQosPara;
            byte[] bArr = this.stQoS.s2p;
            if (v2serviceVar.setAppCmd(i17, bArr, bArr.length) >= 0) {
                this.stQoS.parseS2PData();
                this.stQoS.printS2P();
            }
            short s17 = this.stQoS.iKbps;
            int i18 = this.m_br_kbps;
            if (s17 != i18) {
                SetBitRate(i18);
                this.m_br_kbps = this.stQoS.iKbps;
            }
            if (1 == this.stQoS.cIReqFlag) {
                MakeIFrame();
            }
            byte b17 = this.stQoS.cFps;
            if (b17 != this.m_framerate) {
                this.m_framerate = b17;
            }
        }
    }

    public int InitHWEncoder(boolean z17) {
        int i17;
        this.ENCODING = z17 ? "video/avc" : "video/hevc";
        byte[] bArr = new byte[4];
        bArr[0] = 0;
        this.mProtocol.setAppCmd(26, bArr, 4);
        byte b17 = bArr[0];
        if (z17) {
            if ((b17 & 1) == 0 && (b17 & 8) == 0) {
                return -2;
            }
        } else if ((b17 & enumCODEC_vcodec2) == 0 && (b17 & 4) == 0) {
            return -3;
        }
        try {
            i17 = StartEncoder();
        } catch (java.lang.Exception e17) {
            e17.getMessage();
            i17 = -2003;
        }
        if (i17 < 0) {
            return i17;
        }
        createfile(path + "/AVLog/mediacodec.h264");
        return i17;
    }

    public void MakeIFrame() {
        if (this.mediaCodec != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("request-sync", 0);
            this.mediaCodec.setParameters(bundle);
        }
    }

    public boolean SetBitRate(int i17) {
        try {
            if (this.mediaCodec == null) {
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("video-bitrate", i17 * 1000);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (java.lang.Exception e17) {
            e17.toString();
            return false;
        }
    }

    public int StartEncoder() {
        if (this.mediaCodec != null) {
            StopEncoder();
        }
        android.media.MediaCodecInfo selectCodec = selectCodec(this.ENCODING);
        if (selectCodec == null) {
            return -2001;
        }
        selectCodec.getName();
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(this.ENCODING, this.m_width, this.m_height);
        this.mediaFormat = createVideoFormat;
        createVideoFormat.setInteger("color-format", 21);
        this.mediaFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.m_br_kbps * 1000);
        this.mediaFormat.setInteger("frame-rate", this.m_framerate);
        this.mediaFormat.setInteger("i-frame-interval", 1);
        java.lang.String string = this.mediaFormat.getString("mime");
        if (this.ENCODING.equalsIgnoreCase("video/avc")) {
            if (!((this.mProfileCfg & 4) != 0)) {
                trySetProfile(selectCodec);
            } else if (SupportAvcCodec(string, 8)) {
                this.mediaFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, 8);
            }
        }
        this.mediaFormat.setInteger("bitrate-mode", 2);
        try {
            this.mediaCodec = android.media.MediaCodec.createEncoderByType(string);
            java.util.Objects.toString(this.mediaFormat);
            this.mediaCodec.configure(this.mediaFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
            this.mediaCodec.start();
            return 2000;
        } catch (java.lang.Exception e17) {
            e17.toString();
            return -2002;
        }
    }

    public void UninitHWEncoder() {
        this.isRuning = false;
        try {
            StopEncoder();
            java.io.BufferedOutputStream bufferedOutputStream = this.outputStream;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.flush();
                this.outputStream.close();
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }

    public void putH2645Data(byte[] bArr, int i17, int i18) {
        if (bArr == null || this.mProtocol == null) {
            return;
        }
        this.mProtocol.videoEncodeToSend(bArr, i18, this.m_width, i17, this.ENCODING.equalsIgnoreCase("video/hevc") ? 19 : 18);
    }
}

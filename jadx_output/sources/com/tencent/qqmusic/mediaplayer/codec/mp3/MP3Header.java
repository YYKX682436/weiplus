package com.tencent.qqmusic.mediaplayer.codec.mp3;

/* loaded from: classes13.dex */
class MP3Header {
    public static final int MPEG1 = 3;
    public static final int MPEG2 = 2;
    public static final int MPEG25 = 0;
    private int bitrate_index;
    private int framesize;
    private int layer;
    private int lsf;
    private int mode;
    private int mode_extension;
    private int padding;
    private int protection_bit;
    private int sampling_frequency;
    private int sideinfosize;
    private int verID;
    private int[][][] bitrate = {new int[][]{new int[]{0, 32, 64, 96, 128, 160, 192, 224, 256, 288, com.tencent.mapsdk.internal.km.f50100e, com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX, 384, com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, com.tencent.wcdb.FileUtils.S_IRWXU}, new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.tencent.mapsdk.internal.km.f50100e, 384}, new int[]{0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.tencent.mapsdk.internal.km.f50100e}}, new int[][]{new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}}};
    private int[][] samplingRate = {new int[]{11025, 12000, 8000, 0}, new int[]{0, 0, 0, 0}, new int[]{22050, 24000, 16000, 0}, new int[]{44100, 48000, 32000, 0}};

    public void decode(int i17) {
        int i18 = (i17 >> 19) & 3;
        this.verID = i18;
        int i19 = 4 - ((i17 >> 17) & 3);
        this.layer = i19;
        this.protection_bit = (i17 >> 16) & 1;
        int i27 = (i17 >> 12) & 15;
        this.bitrate_index = i27;
        int i28 = (i17 >> 10) & 3;
        this.sampling_frequency = i28;
        int i29 = (i17 >> 9) & 1;
        this.padding = i29;
        int i37 = (i17 >> 6) & 3;
        this.mode = i37;
        this.mode_extension = (i17 >> 4) & 3;
        int i38 = i18 == 3 ? 0 : 1;
        this.lsf = i38;
        if (i19 == 1) {
            int i39 = this.bitrate[i38][0][i27] * 12000;
            this.framesize = i39;
            this.framesize = ((i39 / this.samplingRate[i18][i28]) + i29) << 2;
        } else if (i19 == 2) {
            int i47 = this.bitrate[i38][1][i27] * 144000;
            this.framesize = i47;
            this.framesize = (i47 / this.samplingRate[i18][i28]) + i29;
        } else {
            if (i19 != 3) {
                return;
            }
            int i48 = this.bitrate[i38][2][i27] * 144000;
            this.framesize = i48;
            this.framesize = (i48 / (this.samplingRate[i18][i28] << i38)) + i29;
            if (i18 == 3) {
                this.sideinfosize = i37 != 3 ? 32 : 17;
            } else {
                this.sideinfosize = i37 == 3 ? 9 : 17;
            }
        }
    }

    public int getFrameSize() {
        return this.framesize;
    }

    public void initialize() {
        this.framesize = 0;
        this.sideinfosize = 0;
        this.layer = 0;
        this.verID = 1;
    }

    public boolean isProtected() {
        return this.protection_bit == 0;
    }
}

package com.tencent.mm.plugin.ting.platform.player.tts.extension;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010-\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ1\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086 J-\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0086 J)\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002H\u0086 J\t\u0010\u001d\u001a\u00020\u000eH\u0086 J\u0011\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0086 R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010 R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010 R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010 ¨\u00061"}, d2 = {"Lcom/tencent/mm/plugin/ting/platform/player/tts/extension/TingTPAudioEnhance;", "", "", "channels", "sampleRate", "", "setupMetaInfo", "Ljz5/f0;", "release", "Lbw5/ap0;", "getAuditoryEnhanceEffectArgs", "Lcom/tencent/thumbplayer/api/TPPostProcessFrameBuffer;", "audioFrameBuffer", "processNotifyAudioFrameBuffer", "", "handler", "frameSize", "mode", "nInit", "", "inBuffer", "outBuffer", "nbSamples", "nProcess", "type", "", "paramsInfo", "length", "nSetCmd", "nCreateWaveAuditoryEnhInst", "nDestroyWaveAuditoryEnhInst", "mEnhanceMode", "I", "sampleFrameSize", "mAudioEnhanceHandle", "J", "", "mProcessTimeDist", "[I", "mTotalProcessCount", "", "mTotalProcessTime", "D", "EMETHOD_GET_DENOISE_RATIO", "EMETHOD_GET_VOLUME_GAIN", "enhanceMode", "<init>", "(I)V", "Companion", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class TingTPAudioEnhance {
    private static final java.lang.String TAG = "MicroMsg.TingTPAudioEnhance";
    private final int EMETHOD_GET_DENOISE_RATIO;
    private long mAudioEnhanceHandle;
    private int mEnhanceMode;
    private int mTotalProcessCount;
    private double mTotalProcessTime;
    private int sampleFrameSize;
    private static final java.util.concurrent.atomic.AtomicInteger fileCounter = new java.util.concurrent.atomic.AtomicInteger(0);
    private final int[] mProcessTimeDist = new int[8];
    private final int EMETHOD_GET_VOLUME_GAIN = 1;

    public TingTPAudioEnhance(int i17) {
        this.mEnhanceMode = i17;
    }

    public final bw5.ap0 getAuditoryEnhanceEffectArgs() {
        if (this.mAudioEnhanceHandle == 0) {
            return null;
        }
        bw5.ap0 ap0Var = new bw5.ap0();
        float[] fArr = new float[1];
        float[] fArr2 = new float[1];
        nSetCmd(this.mAudioEnhanceHandle, this.EMETHOD_GET_DENOISE_RATIO, fArr, 1);
        nSetCmd(this.mAudioEnhanceHandle, this.EMETHOD_GET_VOLUME_GAIN, fArr2, 1);
        ap0Var.f25299d = fArr[0];
        boolean[] zArr = ap0Var.f25301f;
        zArr[1] = true;
        ap0Var.f25300e = fArr2[0];
        zArr[2] = true;
        return ap0Var;
    }

    public final native long nCreateWaveAuditoryEnhInst();

    public final native void nDestroyWaveAuditoryEnhInst(long j17);

    public final native int nInit(long handler, int sampleRate, int channels, int frameSize, int mode);

    public final native int nProcess(long handler, byte[] inBuffer, byte[] outBuffer, int nbSamples);

    public final native int nSetCmd(long handler, int type, float[] paramsInfo, int length);

    public final com.tencent.thumbplayer.api.TPPostProcessFrameBuffer processNotifyAudioFrameBuffer(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer audioFrameBuffer) {
        kotlin.jvm.internal.o.g(audioFrameBuffer, "audioFrameBuffer");
        java.lang.System.nanoTime();
        if (this.mAudioEnhanceHandle == 0) {
            return audioFrameBuffer;
        }
        byte[][] data = audioFrameBuffer.data;
        kotlin.jvm.internal.o.f(data, "data");
        int i17 = 0;
        if (!(data.length == 0)) {
            int[] size = audioFrameBuffer.size;
            kotlin.jvm.internal.o.f(size, "size");
            if (!(size.length == 0)) {
                byte[] bArr = audioFrameBuffer.data[0];
                int i18 = audioFrameBuffer.size[0];
                kotlin.jvm.internal.o.d(bArr);
                if (!(bArr.length == 0) && i18 > 0) {
                    long nanoTime = java.lang.System.nanoTime();
                    byte[] bArr2 = new byte[i18];
                    int nProcess = nProcess(this.mAudioEnhanceHandle, bArr, bArr2, i18 / 2);
                    long nanoTime2 = java.lang.System.nanoTime();
                    if (nProcess == 0) {
                        java.lang.System.arraycopy(bArr2, 0, audioFrameBuffer.data[0], 0, i18);
                    }
                    java.lang.System.nanoTime();
                    java.lang.Integer[] numArr = {100, 200, 300, 500, 800, 1000, 2000, 1000000};
                    int i19 = (int) ((nanoTime2 - nanoTime) / 1000);
                    while (i19 > numArr[i17].intValue() && i17 < 7) {
                        i17++;
                    }
                    int[] iArr = this.mProcessTimeDist;
                    iArr[i17] = iArr[i17] + 1;
                    this.mTotalProcessTime += i19;
                    this.mTotalProcessCount++;
                }
            }
        }
        return audioFrameBuffer;
    }

    public final void release() {
        double d17;
        long j17 = this.mAudioEnhanceHandle;
        if (j17 != 0) {
            nDestroyWaveAuditoryEnhInst(j17);
            this.mAudioEnhanceHandle = 0L;
            double[] dArr = new double[8];
            if (this.mTotalProcessCount > 0) {
                for (int i17 = 0; i17 < 8; i17++) {
                    dArr[i17] = (this.mProcessTimeDist[i17] * 100.0d) / this.mTotalProcessCount;
                }
                d17 = this.mTotalProcessTime / this.mTotalProcessCount;
            } else {
                d17 = 0.0d;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TingTPAudioEnhance stop process count: ");
            sb6.append(this.mTotalProcessCount);
            sb6.append(", time avg: ");
            sb6.append(d17);
            sb6.append(", dist: ");
            java.lang.String arrays = java.util.Arrays.toString(dArr);
            kotlin.jvm.internal.o.f(arrays, "toString(...)");
            sb6.append(arrays);
            com.tencent.mars.xlog.Log.i(TAG, sb6.toString());
        }
    }

    public final boolean setupMetaInfo(int channels, int sampleRate) {
        long nCreateWaveAuditoryEnhInst = nCreateWaveAuditoryEnhInst();
        this.mAudioEnhanceHandle = nCreateWaveAuditoryEnhInst;
        int i17 = (int) (sampleRate * channels * 0.02d);
        this.sampleFrameSize = (i17 * 16) / 8;
        int nInit = nCreateWaveAuditoryEnhInst > 0 ? nInit(nCreateWaveAuditoryEnhInst, sampleRate, channels, i17, this.mEnhanceMode) : 0;
        com.tencent.mars.xlog.Log.i(TAG, "TingTPAudioEnhance setupMetaInfo channel: " + channels + ", sampleRate: " + sampleRate + ", mode: " + this.mEnhanceMode);
        return nInit == 0;
    }
}

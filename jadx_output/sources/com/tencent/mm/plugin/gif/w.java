package com.tencent.mm.plugin.gif;

/* loaded from: classes10.dex */
public class w implements com.tencent.mm.plugin.gif.a {

    /* renamed from: a, reason: collision with root package name */
    public long f142210a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f142211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f142212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f142213d;

    /* renamed from: e, reason: collision with root package name */
    public final long f142214e;

    /* renamed from: f, reason: collision with root package name */
    public int f142215f;

    /* renamed from: g, reason: collision with root package name */
    public final int f142216g;

    public w(java.lang.String str, int i17, int i18, long j17) {
        this.f142210a = 0L;
        this.f142216g = -1;
        this.f142211b = str;
        this.f142212c = i17;
        this.f142213d = i18;
        this.f142214e = j17;
        this.f142215f = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxAMEncoder", "create MMWxAMEncoder, width: %s, height: %s, frameDurationMs: %s, outputPath: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str);
    }

    @Override // com.tencent.mm.plugin.gif.a
    public boolean a(byte[] bArr, long j17) {
        if (this.f142210a != 0 && !com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            int length = bArr.length;
            int i17 = this.f142212c;
            int i18 = this.f142213d;
            if (length == i17 * i18 * 4) {
                if (j17 < 0) {
                    j17 = this.f142214e;
                }
                int nativeAddWxAMEncodeRgbaFrame = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeAddWxAMEncodeRgbaFrame(this.f142210a, i17, i18, bArr, j17);
                if (nativeAddWxAMEncodeRgbaFrame < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMWxAMEncoder", "add rgba frame failed: %s", java.lang.Integer.valueOf(nativeAddWxAMEncodeRgbaFrame));
                    return false;
                }
                this.f142215f++;
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxAMEncoder", "add rgba frame failed, frame size or encoder ptr is not match");
        return false;
    }

    @Override // com.tencent.mm.plugin.gif.a
    public boolean b() {
        if (this.f142210a != 0) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_enc_report_a, 0);
            long[] jArr = new long[26];
            byte[] nativeFinishWxAMEncodeReport = Ni == 1 ? com.tencent.mm.plugin.gif.MMWXGFJNI.nativeFinishWxAMEncodeReport(this.f142210a, jArr) : com.tencent.mm.plugin.gif.MMWXGFJNI.nativeFinishWxAMEncode(this.f142210a);
            if (nativeFinishWxAMEncodeReport == null || nativeFinishWxAMEncodeReport.length <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWxAMEncoder", "finish encode error, buf: %s", java.util.Arrays.toString(nativeFinishWxAMEncodeReport));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWxAMEncoder", "encoder buffer size: %s", java.lang.Integer.valueOf(nativeFinishWxAMEncodeReport.length));
                if (Ni == 1) {
                    jx3.f fVar = jx3.f.INSTANCE;
                    int i17 = this.f142212c;
                    int i18 = this.f142213d;
                    fVar.kvStat(com.tencent.mm.plugin.gif.MMWXGFJNI.KV_STAT_WXAM_ENC_REPORT, fVar.s(6, 7, java.lang.Integer.valueOf(i17 * i18 * 4 * this.f142215f), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[6]), java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14]), java.lang.Long.valueOf(jArr[15]), java.lang.Long.valueOf(jArr[16]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), java.lang.Long.valueOf(jArr[19]), java.lang.Long.valueOf(jArr[20]), java.lang.Long.valueOf(jArr[21]), java.lang.Long.valueOf(jArr[22]), java.lang.Long.valueOf(jArr[23]), java.lang.Long.valueOf(jArr[24]), java.lang.Long.valueOf(jArr[25])));
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMWxAMEncoder", "MMWxAMEncoder finishEncode report:scene[%d], type[%d], srcSize[%d], dstSize[%d], ver[%d], time[%d]", 6, java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]));
                }
                java.lang.String str = this.f142211b;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mm.vfs.w6.S(str, nativeFinishWxAMEncodeReport, 0, nativeFinishWxAMEncodeReport.length);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.gif.a
    public boolean init() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_fasthb_a, 0);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_other_roi_a, 0);
        int i17 = Ni != 0 ? 1 : 0;
        long nativeInitWxAMEncoder = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeInitWxAMEncoder(this.f142212c, this.f142213d, this.f142214e, this.f142216g, (i17 << 8) + (Ni2 != 0 ? 1 : 0), 0, 0, 0);
        this.f142210a = nativeInitWxAMEncoder;
        if (nativeInitWxAMEncoder != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxAMEncoder", "successfully init wxam encoder: %s", java.lang.Long.valueOf(nativeInitWxAMEncoder));
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(852, 12);
        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxAMEncoder", "init wxam encoder failed! %s", java.lang.Long.valueOf(this.f142210a));
        return false;
    }

    public w(java.lang.String str, int i17, int i18, long j17, int i19) {
        this.f142210a = 0L;
        this.f142216g = -1;
        this.f142211b = str;
        this.f142212c = i17;
        this.f142213d = i18;
        this.f142214e = j17;
        this.f142215f = 0;
        this.f142216g = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxAMEncoder", "create MMWxAMEncoder, width: %s, height: %s, frameDurationMs: %s, qp: %s, outputPath: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i19), str);
    }
}

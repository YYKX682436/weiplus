package com.tencent.mm.plugin.gif;

/* loaded from: classes8.dex */
public class p implements com.tencent.mm.plugin.gif.a {

    /* renamed from: a, reason: collision with root package name */
    public long f142180a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f142181b;

    /* renamed from: c, reason: collision with root package name */
    public final int f142182c;

    /* renamed from: d, reason: collision with root package name */
    public final int f142183d;

    /* renamed from: e, reason: collision with root package name */
    public final long f142184e;

    public p(java.lang.String str, int i17, int i18, long j17) {
        this.f142181b = str;
        this.f142182c = i17;
        this.f142183d = i18;
        this.f142184e = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGifEncoder", "create MMGifEncoder, width: %s, height: %s, frameDurationMs: %s, outputPath: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str);
    }

    @Override // com.tencent.mm.plugin.gif.a
    public boolean a(byte[] bArr, long j17) {
        if (this.f142180a != 0 && !com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            int length = bArr.length;
            int i17 = this.f142182c;
            int i18 = this.f142183d;
            if (length == i17 * i18 * 4) {
                if (j17 < 0) {
                    j17 = this.f142184e;
                }
                int nativeAddGifEncodeRgbaFrame = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeAddGifEncodeRgbaFrame(this.f142180a, i17, i18, bArr, j17);
                if (nativeAddGifEncodeRgbaFrame >= 0) {
                    return true;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.MMGifEncoder", "add rgba frame failed: %s", java.lang.Integer.valueOf(nativeAddGifEncodeRgbaFrame));
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGifEncoder", "add rgba frame failed, frame size or encoder ptr is not match");
        return false;
    }

    @Override // com.tencent.mm.plugin.gif.a
    public boolean b() {
        long j17 = this.f142180a;
        if (j17 != 0) {
            byte[] nativeFinishGifEncode = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeFinishGifEncode(j17);
            if (nativeFinishGifEncode == null || nativeFinishGifEncode.length <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMGifEncoder", "finish encode error, buf: %s", java.util.Arrays.toString(nativeFinishGifEncode));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMGifEncoder", "encoder buffer size: %s", java.lang.Integer.valueOf(nativeFinishGifEncode.length));
                java.lang.String str = this.f142181b;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mm.vfs.w6.S(str, nativeFinishGifEncode, 0, nativeFinishGifEncode.length);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.gif.a
    public boolean init() {
        long nativeInitGifEncode = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeInitGifEncode(this.f142182c, this.f142183d, this.f142184e);
        this.f142180a = nativeInitGifEncode;
        if (nativeInitGifEncode != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMGifEncoder", "successfully init wxam encoder: %s", java.lang.Long.valueOf(nativeInitGifEncode));
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(852, 11);
        com.tencent.mars.xlog.Log.e("MicroMsg.MMGifEncoder", "init gif encoder failed! %s", java.lang.Long.valueOf(this.f142180a));
        return false;
    }
}

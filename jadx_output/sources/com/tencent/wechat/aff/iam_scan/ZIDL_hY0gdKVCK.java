package com.tencent.wechat.aff.iam_scan;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class ZIDL_hY0gdKVCK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_BX(java.lang.Object obj, int i17) {
        zs5.k kVar = (zs5.k) ((com.tencent.wechat.aff.iam_scan.f0) obj);
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "doInitQBar callback ret: " + i17 + ", cost: " + (java.lang.System.currentTimeMillis() - kVar.f475443a));
        ((ku5.t0) ku5.t0.f312615d).D(new zs5.j(i17, kVar.f475443a, kVar.f475444b));
    }

    private void ZIDL_FX(java.lang.Object obj) {
        zs5.x xVar = (zs5.x) ((com.tencent.wechat.aff.iam_scan.g0) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopSession callback sessionId: ");
        sb6.append(xVar.f475498a);
        sb6.append(", tryStartSessionWhenStopDone: ");
        zs5.y yVar = xVar.f475499b;
        sb6.append(yVar.f475513n);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", sb6.toString());
        yVar.i(new zs5.w(yVar));
    }

    private void ZIDL_GX(java.lang.Object obj, byte[] bArr) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_HX(java.lang.Object obj, byte[] bArr, boolean z17, boolean z18, byte[] bArr2) {
        com.tencent.wechat.aff.iam_scan.x xVar = (com.tencent.wechat.aff.iam_scan.x) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.x.f217151r, bArr);
        com.tencent.wechat.aff.iam_scan.y yVar = (com.tencent.wechat.aff.iam_scan.y) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.y.f217179g, bArr2);
        zs5.h hVar = (zs5.h) ((com.tencent.wechat.aff.iam_scan.e0) obj);
        hVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addDecodeTask complete bufferKey:");
        sb6.append(xVar != null ? java.lang.Long.valueOf(xVar.f217152d) : null);
        sb6.append(", added: ");
        sb6.append(z17);
        sb6.append(", cached: ");
        sb6.append(z18);
        sb6.append(", cost: ");
        sb6.append(java.lang.System.currentTimeMillis() - hVar.f475394a);
        sb6.append(", scanFrameNum: ");
        sb6.append(hVar.f475395b.f475500a);
        sb6.append(", success: ");
        sb6.append(yVar != null ? java.lang.Boolean.valueOf(yVar.f217180d) : null);
        sb6.append(", handledDecodeSuccess: ");
        sb6.append(hVar.f475395b.f475515p);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", sb6.toString());
        if (z17) {
            d75.b.g(new zs5.e(hVar.f475395b));
        }
        zs5.y yVar2 = hVar.f475395b;
        yVar2.i(new zs5.g(yVar2, z17, yVar, hVar.f475396c, hVar.f475397d, hVar.f475398e, hVar.f475399f, z18, hVar.f475400g, hVar.f475401h));
    }

    public native void ZIDL_A(long j17, byte[] bArr);

    public native void ZIDL_BV(long j17, java.lang.Object obj, long j18, byte[] bArr);

    public native void ZIDL_C(long j17, long j18);

    public native void ZIDL_D(long j17, byte[] bArr, com.tencent.wechat.zidl2.ZidlObjHolder2 zidlObjHolder2);

    public native void ZIDL_E(long j17, byte[] bArr);

    public native void ZIDL_FV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_GV(long j17, java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, int i28, byte[] bArr);

    public native void ZIDL_HV(long j17, java.lang.Object obj, java.nio.ByteBuffer byteBuffer, byte[] bArr);

    public native void ZIDL_I(long j17, byte[] bArr, int i17);

    public native void ZIDL_J(long j17, boolean z17, int i17);

    public native byte[] ZIDL_K(long j17);

    public native void ZIDL_L(long j17);

    public native void ZIDL_M(long j17, int i17);

    public native void ZIDL_hY0gdKVCC(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}

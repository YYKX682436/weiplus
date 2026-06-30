package com.tencent.wechat.aff.iam_scan;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class ZIDL_eeBnG6HUzK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_AX(java.lang.Object obj, int i17) {
        vz3.f fVar = (vz3.f) ((com.tencent.wechat.aff.iam_scan.q0) obj);
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "doInitFFE callback ret: " + i17 + ", cost: " + (java.lang.System.currentTimeMillis() - fVar.f441679a));
        ((ku5.t0) ku5.t0.f312615d).D(new vz3.e(i17, fVar.f441679a, fVar.f441680b));
    }

    private void ZIDL_DX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_EX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_FX(java.lang.Object obj, boolean z17) {
        vz3.d dVar = (vz3.d) ((com.tencent.wechat.aff.iam_scan.r0) obj);
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "processFullImageAsync done: " + z17);
        com.tencent.mm.plugin.scanner.model.d1.o(false);
        tz3.c cVar = dVar.f441675a;
        if (cVar != null) {
            cVar.a();
        }
    }

    private void ZIDL_GX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.iam_scan.p0) obj).getClass();
    }

    private void ZIDL_IX(java.lang.Object obj, boolean z17, java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        com.tencent.wechat.aff.iam_scan.m mVar = (com.tencent.wechat.aff.iam_scan.m) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.m.f217099h, bArr);
        vz3.l lVar = (vz3.l) ((com.tencent.wechat.aff.iam_scan.s0) obj);
        lVar.getClass();
        java.lang.System.currentTimeMillis();
        ((sz3.p0) lVar.f441688a).a(z17, byteBuffer, mVar.f217100d, mVar.f217101e);
    }

    public native void ZIDL_AV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_B(long j17);

    public native void ZIDL_C(long j17, byte[] bArr, com.tencent.wechat.zidl2.ZidlObjHolder2 zidlObjHolder2);

    public native void ZIDL_DV(long j17, java.lang.Object obj, long j18);

    public native void ZIDL_EV(long j17, java.lang.Object obj, java.nio.ByteBuffer byteBuffer, byte[] bArr);

    public native void ZIDL_FV(long j17, java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i17, int i18, byte[] bArr);

    public native void ZIDL_GV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_H(long j17, byte[] bArr);

    public native void ZIDL_IV(long j17, java.lang.Object obj, java.nio.ByteBuffer byteBuffer, byte[] bArr, int i17);

    public native void ZIDL_eeBnG6HUzC(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}

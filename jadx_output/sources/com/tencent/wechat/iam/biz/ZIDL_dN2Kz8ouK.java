package com.tencent.wechat.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZIDL_dN2Kz8ouK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_AX(java.lang.Object obj, byte[] bArr) {
        com.tencent.wechat.mm.biz.i3 i3Var = (com.tencent.wechat.mm.biz.i3) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.i3.f218182m, bArr);
        vw.k2 k2Var = (vw.k2) ((com.tencent.wechat.iam.biz.p0) obj);
        k2Var.getClass();
        if (i3Var == null || i3Var.f218183d.f217795d != 0) {
            return;
        }
        pm0.v.K(null, new vw.j2(i3Var, k2Var.f440676a));
    }

    private void ZIDL_BX(java.lang.Object obj, byte[] bArr) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public native void ZIDL_AV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_BV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_dN2Kz8ouC(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}

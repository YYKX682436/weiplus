package com.tencent.wechat.iam.finder_box;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZIDL_M7NeSRzhK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_AX(java.lang.Object obj, byte[] bArr) {
        com.tencent.wechat.mm.finder_box.k2 k2Var = (com.tencent.wechat.mm.finder_box.k2) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.finder_box.k2.f219577m, bArr);
        y40.g0 g0Var = (y40.g0) ((com.tencent.wechat.iam.finder_box.l) obj);
        g0Var.getClass();
        if (k2Var == null || k2Var.f219578d.f217844d != 0) {
            return;
        }
        pm0.v.K(null, new y40.f0(k2Var, g0Var.f459291a));
    }

    public native void ZIDL_AV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_M7NeSRzhC(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}

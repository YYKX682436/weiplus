package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
class ZIDL__CzVbChcB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.iam_scan.d0 f216928a;

    public ZIDL__CzVbChcB(java.lang.Object obj) {
        com.tencent.wechat.aff.iam_scan.d0 d0Var = (com.tencent.wechat.aff.iam_scan.d0) obj;
        this.f216928a = d0Var;
        d0Var.getClass();
    }

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_DX(long j17, long j18);

    public void ZIDL_AV(long j17, long j18, long j19) {
        zs5.y yVar = ((zs5.u) this.f216928a).f475484a;
        yVar.getClass();
        d75.b.g(new zs5.i(j18, yVar, j19));
    }

    public void ZIDL_BV(long j17, long j18, long j19, java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        com.tencent.wechat.aff.iam_scan.e eVar = (com.tencent.wechat.aff.iam_scan.e) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.e.f216995i, bArr);
        zs5.u uVar = (zs5.u) this.f216928a;
        if (eVar == null) {
            uVar.getClass();
        } else {
            zs5.y yVar = uVar.f475484a;
            yVar.i(new zs5.r(yVar, j18, j19, byteBuffer, eVar));
        }
    }

    public void ZIDL_CV(long j17, byte[] bArr) {
        d75.b.g(new zs5.t((com.tencent.wechat.aff.iam_scan.e1) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.e1.f217001f, bArr), ((zs5.u) this.f216928a).f475484a));
    }

    public void ZIDL_DV(long j17, long j18, byte[] bArr) {
        com.tencent.wechat.aff.iam_scan.j0 j0Var = (com.tencent.wechat.aff.iam_scan.j0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.j0.f217075f, bArr);
        zs5.u uVar = (zs5.u) this.f216928a;
        if (j0Var == null) {
            uVar.getClass();
            return;
        }
        zs5.y yVar = uVar.f475484a;
        com.tencent.wechat.aff.iam_scan.d1 d1Var = yVar.f475508i;
        if (!(d1Var != null && d1Var.f216985d == j18) || j0Var.f217077e == 0) {
            return;
        }
        com.tencent.wechat.aff.iam_scan.k0 k0Var = j0Var.f217076d;
        com.tencent.wechat.aff.iam_scan.k0 k0Var2 = com.tencent.wechat.aff.iam_scan.k0.FrameCacheReplaced;
        com.tencent.wechat.aff.iam_scan.k0 k0Var3 = com.tencent.wechat.aff.iam_scan.k0.FrameCacheConsumed;
        if (k0Var == k0Var2 || k0Var == k0Var3) {
            yVar.i(new zs5.p(yVar, j0Var, j18));
            if (j0Var.f217076d == k0Var3) {
                d75.b.g(new zs5.q(yVar));
            }
        }
    }
}

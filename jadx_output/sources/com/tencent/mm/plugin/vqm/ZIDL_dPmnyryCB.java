package com.tencent.mm.plugin.vqm;

/* loaded from: classes14.dex */
class ZIDL_dPmnyryCB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.vqm.g f177292a;

    public ZIDL_dPmnyryCB(java.lang.Object obj) {
        this.f177292a = (com.tencent.mm.plugin.vqm.g) obj;
    }

    public long ZIDL_A() {
        return this.f177292a.b();
    }

    public void ZIDL_B() {
        this.f177292a.e();
    }

    public void ZIDL_C() {
        this.f177292a.d();
    }

    public void ZIDL_D() {
        this.f177292a.c();
    }

    public void ZIDL_E(int i17, byte[] bArr, byte[] bArr2) {
        com.tencent.mm.plugin.vqm.b0 b0Var;
        switch (i17) {
            case 0:
                b0Var = com.tencent.mm.plugin.vqm.b0.Common;
                break;
            case 1:
                b0Var = com.tencent.mm.plugin.vqm.b0.Audio;
                break;
            case 2:
                b0Var = com.tencent.mm.plugin.vqm.b0.Visual;
                break;
            case 3:
                b0Var = com.tencent.mm.plugin.vqm.b0.Matrix;
                break;
            case 4:
                b0Var = com.tencent.mm.plugin.vqm.b0.Wxconf;
                break;
            case 5:
                b0Var = com.tencent.mm.plugin.vqm.b0.Systemauth;
                break;
            case 6:
                b0Var = com.tencent.mm.plugin.vqm.b0.Notification;
                break;
            case 7:
                b0Var = com.tencent.mm.plugin.vqm.b0.App;
                break;
            default:
                b0Var = null;
                break;
        }
        this.f177292a.f(b0Var, bArr, bArr2);
    }

    public void ZIDL_F(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        this.f177292a.g((com.tencent.mm.plugin.vqm.l) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.mm.plugin.vqm.l.E, bArr), (com.tencent.mm.plugin.vqm.h) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.mm.plugin.vqm.h.f177334n, bArr2), (com.tencent.mm.plugin.vqm.p) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.mm.plugin.vqm.p.X, bArr3), (com.tencent.mm.plugin.vqm.j) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.mm.plugin.vqm.j.C, bArr4), (com.tencent.mm.plugin.vqm.z) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.mm.plugin.vqm.z.f177524y, bArr5), (com.tencent.mm.plugin.vqm.t) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.mm.plugin.vqm.t.f177478r, bArr6), (com.tencent.mm.plugin.vqm.a0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.mm.plugin.vqm.a0.R, bArr7), (com.tencent.mm.plugin.vqm.y) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.mm.plugin.vqm.y.f177516n, bArr8));
    }
}

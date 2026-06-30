package com.tencent.wechat.aff.star;

/* loaded from: classes8.dex */
class ZIDL_dZKgH7aUoB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.star.h f217505a;

    public boolean ZIDL_A(byte[][] bArr) {
        com.tencent.wechat.aff.star.h hVar = this.f217505a;
        java.util.ArrayList mmpbListUnSerializeFromBasic = com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(bw5.a40.f25007h, bArr);
        ((ik3.a) hVar).getClass();
        int i17 = com.tencent.mm.plugin.multitask.k0.f150461w0;
        int i18 = com.tencent.mm.plugin.multitask.l0.f150465z0;
        com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
        j75.f Ai = k0Var != null ? ((com.tencent.mm.plugin.multitask.j1) k0Var).Ai() : null;
        if (Ai == null) {
            return false;
        }
        Ai.B3(new ik3.d(mmpbListUnSerializeFromBasic));
        return false;
    }

    public boolean ZIDL_B(byte[][] bArr) {
        com.tencent.wechat.aff.star.h hVar = this.f217505a;
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(bw5.a40.f25007h, bArr);
        hVar.getClass();
        return false;
    }

    public byte[][] ZIDL_C() {
        this.f217505a.getClass();
        return com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(null);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f217505a = (com.tencent.wechat.aff.star.h) obj;
    }
}

package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class su extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f114309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(com.tencent.mm.plugin.finder.live.plugin.iv ivVar) {
        super(0);
        this.f114309d = ivVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kickMember:");
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f114309d;
        r45.xn1 xn1Var = ivVar.f113026y0;
        sb6.append((xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername());
        com.tencent.mars.xlog.Log.i(ivVar.f113016r, sb6.toString());
        dk2.xf W0 = ivVar.W0();
        if (W0 != null) {
            r45.xn1 xn1Var2 = ivVar.f113026y0;
            if (xn1Var2 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            ((dk2.r4) W0).j0(str, true, new com.tencent.mm.plugin.finder.live.plugin.qu(ivVar));
        }
        return jz5.f0.f302826a;
    }
}

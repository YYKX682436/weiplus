package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f115388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        super(0);
        this.f115388d = tyVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kickMember:");
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f115388d;
        r45.xn1 xn1Var = tyVar.V;
        sb6.append((xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername());
        com.tencent.mars.xlog.Log.i(tyVar.f114488q, sb6.toString());
        dk2.xf W0 = tyVar.W0();
        if (W0 != null) {
            r45.xn1 xn1Var2 = tyVar.V;
            if (xn1Var2 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            ((dk2.r4) W0).j0(str, true, new com.tencent.mm.plugin.finder.live.plugin.xx(tyVar));
        }
        return jz5.f0.f302826a;
    }
}

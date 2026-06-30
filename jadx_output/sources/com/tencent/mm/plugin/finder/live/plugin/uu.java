package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class uu extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.r62 f114619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(r45.r62 r62Var) {
        super(1);
        this.f114619d = r62Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        r45.r62 local = (r45.r62) obj;
        kotlin.jvm.internal.o.g(local, "local");
        r45.xn1 xn1Var = (r45.xn1) local.getCustom(0);
        java.lang.String str = null;
        java.lang.String username = (xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername();
        r45.xn1 xn1Var2 = (r45.xn1) this.f114619d.getCustom(0);
        if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(username, str));
    }
}

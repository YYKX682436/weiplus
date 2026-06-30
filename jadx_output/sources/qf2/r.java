package qf2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.q f362551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(km2.q qVar) {
        super(1);
        this.f362551d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        r45.xn1 xn1Var = ((km2.q) obj).f309187r;
        java.lang.String str = null;
        java.lang.String username = (xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername();
        r45.xn1 xn1Var2 = this.f362551d.f309187r;
        if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(username, str));
    }
}

package mm2;

/* loaded from: classes.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yt4 f329179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(r45.yt4 yt4Var) {
        super(1);
        this.f329179d = yt4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String str = ((km2.q) obj).f309172c;
        r45.xn1 xn1Var = (r45.xn1) this.f329179d.getCustom(0);
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(str, (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername()));
    }
}

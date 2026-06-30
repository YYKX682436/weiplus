package gv2;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.i f276058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(jv2.i iVar, gv2.c1 c1Var) {
        super(1);
        this.f276058d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.protocal.protobuf.FinderContact reply_contact = this.f276058d.f302223d.u0().getReply_contact();
        if (reply_contact != null) {
            ya2.d.b(ya2.d.h(reply_contact, null, false, 3, null), false);
        }
        return jz5.f0.f302826a;
    }
}

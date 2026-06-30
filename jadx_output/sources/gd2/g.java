package gd2;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f270530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gd2.i iVar) {
        super(1);
        this.f270530d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        gd2.i iVar = this.f270530d;
        gd2.f fVar = new gd2.f(username, iVar);
        i95.m c17 = i95.n0.c(n13.b0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jd5.a aVar = new jd5.a();
        aVar.p(iVar.f270533b);
        n13.t tVar = new n13.t();
        tVar.f334133a = fVar;
        i95.m c18 = i95.n0.c(n13.a0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((dk5.y) ((n13.a0) c18)).wi(iVar.f270532a, aVar, username, tVar);
        return jz5.f0.f302826a;
    }
}

package tt2;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f421832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f421833f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(tt2.e1 e1Var, l81.b1 b1Var, so2.j5 j5Var) {
        super(2);
        this.f421831d = e1Var;
        this.f421832e = b1Var;
        this.f421833f = j5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        zl2.r4 r4Var = zl2.r4.f473950a;
        tt2.e1 e1Var = this.f421831d;
        r4Var.h3(e1Var.f421880h, false);
        st2.c2 c2Var = st2.c2.f412249a;
        l81.b1 b1Var = this.f421832e;
        c2Var.k(b1Var);
        yz5.p pVar = e1Var.f421892w;
        if (pVar != null) {
            pVar.invoke(1, b1Var);
        }
        yz5.l lVar = e1Var.f421895z;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(((cm2.m0) this.f421833f).f43369w));
        }
        return jz5.f0.f302826a;
    }
}

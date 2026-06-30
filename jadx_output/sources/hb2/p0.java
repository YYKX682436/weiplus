package hb2;

/* loaded from: classes8.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f280081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str, yz5.l lVar, zy2.gc gcVar) {
        super(3);
        this.f280079d = str;
        this.f280080e = lVar;
        this.f280081f = gcVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.l13 resp = (r45.l13) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(3, resp.getString(3));
        if (this.f280079d == null) {
            this.f280080e.invoke(ri2Var);
        } else {
            pm0.v.X(hb2.o0.f280077d);
            hb2.w0.a(hb2.s0.f280090e, this.f280079d, ri2Var, this.f280081f, false, false, null, 56, null);
        }
        return jz5.f0.f302826a;
    }
}

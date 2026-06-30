package il2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.p5 f292070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.r f292071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mm2.p5 p5Var, il2.r rVar) {
        super(3);
        this.f292070d = p5Var;
        this.f292071e = rVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String verifyId = (java.lang.String) obj2;
        java.lang.String url = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(verifyId, "verifyId");
        kotlin.jvm.internal.o.g(url, "url");
        il2.r rVar = this.f292071e;
        mm2.p5 p5Var = this.f292070d;
        if (booleanValue) {
            p5Var.getClass();
            p5Var.f329351c = verifyId;
            p5Var.f329352d = url;
            il2.r.t1(rVar, p5Var);
        } else {
            zl2.j5.f473850a.e(p5Var.f329350b);
            ((mm2.v5) rVar.P0(mm2.v5.class)).f329488n.postValue(mm2.q5.f329367a);
        }
        return jz5.f0.f302826a;
    }
}

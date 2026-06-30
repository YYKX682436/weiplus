package nv2;

/* loaded from: classes10.dex */
public final class a2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f340452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.b2 f340453b;

    public a2(nv2.o1 o1Var, nv2.b2 b2Var) {
        this.f340452a = o1Var;
        this.f340453b = b2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.ThankActionTask", "ThankAction callback " + fVar.f70615a + ' ' + fVar.f70616b + ' ' + fVar.f70617c);
        int i17 = fVar.f70615a;
        nv2.o1 o1Var = this.f340452a;
        if (i17 == 0 && fVar.f70616b == 0) {
            o1Var.a(fp0.u.f265290f, false);
        } else if (i17 == 4) {
            com.tencent.mm.sdk.event.IEvent d17 = this.f340453b.d(false);
            if (d17 != null) {
                d17.e();
            }
            o1Var.a(fp0.u.f265291g, false);
        } else {
            o1Var.a(fp0.u.f265291g, true);
        }
        return jz5.f0.f302826a;
    }
}

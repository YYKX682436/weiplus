package tm2;

/* loaded from: classes3.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(tm2.s2 s2Var) {
        super(0);
        this.f420572d = s2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        h63.s1 s1Var = (h63.s1) i95.n0.c(h63.s1.class);
        tm2.s2 s2Var = this.f420572d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = s2Var.f19600b;
        java.lang.String str = ((mm2.c1) s2Var.c(mm2.c1.class)).f328783b5;
        if (str == null && (str = ((mm2.e1) s2Var.c(mm2.e1.class)).f328988r.getString(22)) == null) {
            str = "";
        }
        int i17 = ((mm2.c1) s2Var.c(mm2.c1.class)).f328788c5;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ((h63.g1) s1Var).Di(appCompatActivity, str, i17, bool, bool, java.lang.Long.valueOf(((mm2.e1) s2Var.c(mm2.e1.class)).f328988r.getLong(0)));
        fm2.b bVar = s2Var.f19601c;
        if (bVar != null) {
            bVar.hideLoadingLayer(false);
        }
        ((mm2.c1) s2Var.c(mm2.c1.class)).O1 = false;
        fm2.b bVar2 = s2Var.f19601c;
        if (bVar2 != null) {
            bVar2.postDelayed(new tm2.p2(s2Var), 200L);
        }
        return jz5.f0.f302826a;
    }
}

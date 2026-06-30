package ms;

/* loaded from: classes5.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms.n f330933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f330934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330935c;

    public m(ms.n nVar, yz5.a aVar, java.lang.String str) {
        this.f330933a = nVar;
        this.f330934b = aVar;
        this.f330935c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.modelbase.m1 m1Var = fVar.f70619e;
        ms.n nVar = this.f330933a;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = nVar.f330936d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyUserPreCheckUIC", "verifyUserPreCheckRequest() called " + fVar.f70615a + ' ' + fVar.f70616b + ' ');
        int i17 = fVar.f70616b;
        if (i17 == -3401 || i17 == -3402) {
            tm.a b17 = tm.a.b(fVar.f70617c);
            if (b17 != null) {
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = "contacts_max_limit_tips";
                if (b17.f420402e == 2 || fVar.f70616b == -3401) {
                    h0Var.f310123d = "contacts_max_limit_pure_tips";
                }
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.lang.String str = this.f330935c;
                ((cy1.a) rVar).Hj("contacts_max_limit_tips", "view_exp", kz5.b1.e(new jz5.l("contacts_max_limit_sort_sessionid", str)), 32337);
                android.app.Activity context = nVar.getContext();
                java.lang.String str2 = b17.f420399b;
                tm.j jVar = b17.f420404g;
                return db5.e1.K(context, false, null, str2, jVar.f420441f, jVar.f420442g, new ms.k(fVar, nVar, str, h0Var), new ms.l(nVar, str, h0Var));
            }
        } else {
            yz5.a aVar = this.f330934b;
            if (aVar != null) {
                aVar.invoke();
                return jz5.f0.f302826a;
            }
        }
        return null;
    }
}

package ku1;

/* loaded from: classes15.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt1.j f312122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku1.l f312123e;

    public k(ku1.l lVar, tt1.j jVar) {
        this.f312123e = lVar;
        this.f312122d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tt1.j jVar = this.f312122d;
        boolean n07 = jVar.n0();
        ku1.l lVar = this.f312123e;
        if (n07) {
            lu1.d.g(lVar.f312130a.f312093b, 0, null, false, jVar);
        } else {
            r45.w50 w50Var = jVar.s0().Z;
            if (w50Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388888q) && !com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388887p)) {
                lu1.d.e(jVar.g(), w50Var, lVar.f312131b.getIntent() != null ? lVar.f312131b.getIntent().getIntExtra("key_from_scene", 3) : 3, lVar.f312131b.getIntent() != null ? lVar.f312131b.getIntent().getIntExtra("key_from_appbrand_type", 0) : 0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 20, jVar.g(), jVar.f(), "", w50Var.f388878d);
            } else if (w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f388881g)) {
                lu1.d.j(lVar.f312130a.f312093b, lu1.a0.k(w50Var.f388881g, w50Var.f388882h), 1);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 9, jVar.g(), jVar.f(), "", w50Var.f388878d);
                if (lu1.a0.C(w50Var, jVar.g())) {
                    lu1.a0.L(jVar.g(), w50Var.f388878d);
                    lu1.d.h(lVar.f312130a.f312093b, jVar.s0().f388552m);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

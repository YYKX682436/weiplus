package ku1;

/* loaded from: classes15.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.w50 f312143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt1.j f312144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ku1.v f312145f;

    public t(ku1.v vVar, r45.w50 w50Var, tt1.j jVar) {
        this.f312145f = vVar;
        this.f312143d = w50Var;
        this.f312144e = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.w50 w50Var = this.f312143d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388888q);
        tt1.j jVar = this.f312144e;
        ku1.v vVar = this.f312145f;
        if (!K0 && !com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388887p)) {
            lu1.d.e(jVar.g(), w50Var, vVar.f312131b.getIntent() != null ? vVar.f312131b.getIntent().getIntExtra("key_from_scene", 3) : 3, vVar.f312131b.getIntent() != null ? vVar.f312131b.getIntent().getIntExtra("key_from_appbrand_type", 0) : 0);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 20, jVar.g(), jVar.f(), "", w50Var.f388878d);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388881g)) {
            com.tencent.mm.ui.MMActivity mMActivity = vVar.f312131b;
            lu1.r.e(mMActivity, mMActivity.getString(com.tencent.mm.R.string.aw9), true);
        } else {
            lu1.d.j(vVar.f312131b, lu1.a0.k(w50Var.f388881g, w50Var.f388882h), 1);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = 9;
            objArr[1] = jVar.g();
            objArr[2] = jVar.f();
            objArr[3] = "";
            java.lang.String str = w50Var.f388878d;
            objArr[4] = str != null ? str : "";
            g0Var.d(11941, objArr);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

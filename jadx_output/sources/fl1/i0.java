package fl1;

/* loaded from: classes7.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f263788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dg7 f263789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263791g;

    public i0(fl1.c1 c1Var, com.tencent.mm.plugin.appbrand.o6 o6Var, r45.dg7 dg7Var, java.lang.Runnable runnable) {
        this.f263791g = c1Var;
        this.f263788d = o6Var;
        this.f263789e = dg7Var;
        this.f263790f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ch1.a aVar = ch1.b.f41276a;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f263788d;
        java.lang.String str = o6Var.u0().f77278d;
        long j17 = o6Var.u0().L;
        long j18 = o6Var.u0().M;
        r45.dg7 dg7Var = this.f263789e;
        aVar.a(str, j17, j18, 2L, 2L, dg7Var.f372460n);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "openGameLiteApp, " + dg7Var.f372458i);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Mj(dg7Var.f372458i, "", new fl1.h0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

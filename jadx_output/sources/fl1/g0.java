package fl1;

/* loaded from: classes7.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f263763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dg7 f263764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263766g;

    public g0(fl1.c1 c1Var, com.tencent.mm.plugin.appbrand.o6 o6Var, r45.dg7 dg7Var, java.lang.Runnable runnable) {
        this.f263766g = c1Var;
        this.f263763d = o6Var;
        this.f263764e = dg7Var;
        this.f263765f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ch1.b.f41276a.a(this.f263763d.u0().f77278d, r0.u0().L, r0.u0().M, 3L, 2L, this.f263764e.f372460n);
        this.f263766g.a();
        this.f263765f.run();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

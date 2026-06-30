package fl1;

/* loaded from: classes4.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f263755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bg7 f263756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263758g;

    public f0(fl1.c1 c1Var, com.tencent.mm.plugin.appbrand.o6 o6Var, r45.bg7 bg7Var, java.lang.Runnable runnable) {
        this.f263758g = c1Var;
        this.f263755d = o6Var;
        this.f263756e = bg7Var;
        this.f263757f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.c1 c1Var = this.f263758g;
        c1Var.i(this.f263755d, true, null, this.f263756e);
        c1Var.a();
        this.f263757f.run();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package fl1;

/* loaded from: classes7.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.o f263800d;

    public l(fl1.o oVar) {
        this.f263800d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.o oVar = this.f263800d;
        ui1.y.b(oVar.f263833x, 2, fl1.o.c(oVar, false), 0, false, 12, null);
        fl1.g2 g2Var = oVar.f263832w;
        if (g2Var != null) {
            g2Var.a(oVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

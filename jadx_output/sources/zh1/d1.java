package zh1;

/* loaded from: classes8.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.e1 f472874d;

    public d1(zh1.e1 e1Var) {
        this.f472874d = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/openmaterial/ListBottomSheetEnhanceLogic$buildMoreOpenWaysView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ListBottomSheetEnhanceLogic", "buildMoreOpenWaysView#onClick");
        zh1.e1 e1Var = this.f472874d;
        e1Var.f472948f.u();
        zh1.v0 v0Var = e1Var.f472950h;
        if (v0Var == null) {
            zh1.a aVar = zh1.n.f472909o;
            zh1.n.f472911q = e1Var.f472946d;
            v0Var = aVar.b(e1Var.f472947e, e1Var.f472948f, e1Var.f472949g, e1Var.f472951i, e1Var.f472952m);
            e1Var.f472950h = v0Var;
        }
        v0Var.show();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/openmaterial/ListBottomSheetEnhanceLogic$buildMoreOpenWaysView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

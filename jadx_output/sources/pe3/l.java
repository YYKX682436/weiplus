package pe3;

/* loaded from: classes7.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.o f353663d;

    public l(pe3.o oVar) {
        this.f353663d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pe3.o oVar = this.f353663d;
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView = oVar.f353668d;
        if (magicBrushSclDemoView == null) {
            kotlin.jvm.internal.o.o("frameSetView");
            throw null;
        }
        magicBrushSclDemoView.f();
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView2 = oVar.f353668d;
        if (magicBrushSclDemoView2 == null) {
            kotlin.jvm.internal.o.o("frameSetView");
            throw null;
        }
        androidx.appcompat.app.AppCompatActivity activity = oVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        magicBrushSclDemoView2.e(((pe3.h) pf5.z.f353948a.a(activity).a(pe3.h.class)).P6());
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView3 = oVar.f353668d;
        if (magicBrushSclDemoView3 == null) {
            kotlin.jvm.internal.o.o("frameSetView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = magicBrushSclDemoView3.getLayoutParams();
        layoutParams.height = 1;
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView4 = oVar.f353668d;
        if (magicBrushSclDemoView4 == null) {
            kotlin.jvm.internal.o.o("frameSetView");
            throw null;
        }
        magicBrushSclDemoView4.setLayoutParams(layoutParams);
        oVar.O6();
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

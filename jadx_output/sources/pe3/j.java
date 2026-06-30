package pe3;

/* loaded from: classes7.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.o f353661d;

    public j(pe3.o oVar) {
        this.f353661d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pe3.o oVar = this.f353661d;
        if (oVar.f353670f == null) {
            oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            oVar.f353670f = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        }
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView = oVar.f353668d;
        if (magicBrushSclDemoView == null) {
            kotlin.jvm.internal.o.o("frameSetView");
            throw null;
        }
        magicBrushSclDemoView.setVisibility(0);
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView2 = oVar.f353668d;
        if (magicBrushSclDemoView2 == null) {
            kotlin.jvm.internal.o.o("frameSetView");
            throw null;
        }
        androidx.appcompat.app.AppCompatActivity activity = oVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        magicBrushSclDemoView2.e(((pe3.h) zVar.a(activity).a(pe3.h.class)).P6());
        androidx.appcompat.app.AppCompatActivity activity2 = oVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        kotlinx.coroutines.y0 y0Var = oVar.f353670f;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new pe3.i(oVar, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

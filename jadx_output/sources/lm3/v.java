package lm3;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f319515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm3.e f319516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f319517f;

    public v(lm3.b0 b0Var, lm3.e eVar, in5.s0 s0Var) {
        this.f319515d = b0Var;
        this.f319516e = eVar;
        this.f319517f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lm3.b0 b0Var = this.f319515d;
        androidx.appcompat.app.AppCompatActivity activity = b0Var.f319470e;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.mv.ui.view.e4 e4Var = ((com.tencent.mm.plugin.mv.ui.uic.e1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.e1.class)).f151109g;
        if (e4Var.isShowing()) {
            e4Var.dismiss();
        }
        lm3.e eVar = this.f319516e;
        fm3.u musicMv = eVar.f319482d;
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        int i17 = musicMv.f264136p;
        boolean z17 = true;
        if (i17 != 1 && i17 != 4) {
            z17 = false;
        }
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity2 = b0Var.f319470e;
            kotlin.jvm.internal.o.g(activity2, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.q7.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.mv.ui.uic.q7) a17).O6(this.f319517f, eVar.f319482d, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

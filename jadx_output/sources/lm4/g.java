package lm4;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.view.TingAddToListenEducationDialog f319561d;

    public g(com.tencent.mm.plugin.ting.view.TingAddToListenEducationDialog tingAddToListenEducationDialog) {
        this.f319561d = tingAddToListenEducationDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk.a8 a8Var = (qk.a8) i95.n0.c(qk.a8.class);
        com.tencent.mm.plugin.ting.view.TingAddToListenEducationDialog tingAddToListenEducationDialog = this.f319561d;
        android.content.Context context = tingAddToListenEducationDialog.f174817r;
        if (context == null) {
            context = tingAddToListenEducationDialog.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        ((ef0.q1) a8Var).Ai(context, bw5.ar0.TingScene_ListenLaterNewUserGuideJump);
        ku5.u0 u0Var = ku5.t0.f312615d;
        lm4.f fVar = new lm4.f(this.f319561d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(fVar, 500L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

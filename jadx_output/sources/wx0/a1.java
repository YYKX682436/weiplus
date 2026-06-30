package wx0;

/* loaded from: classes5.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.b1 f450454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f450455e;

    public a1(wx0.b1 b1Var, yx0.b8 b8Var) {
        this.f450454d = b1Var;
        this.f450455e = b8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/ReplayPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.r6(m7Var, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("view_id", "sc_click_replay");
        ((cy1.a) rVar).yj("sc_click_replay", null, Ai, 6, false);
        android.view.View view2 = this.f450454d.f331814d;
        kotlin.jvm.internal.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        yx0.b8 b8Var = this.f450455e;
        kotlinx.coroutines.r2 r2Var = b8Var.Y1;
        if (!((r2Var == null || ((kotlinx.coroutines.c3) r2Var).A()) ? false : true)) {
            b8Var.Y1 = kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.t4(b8Var, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/ReplayPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

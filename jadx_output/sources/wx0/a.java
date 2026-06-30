package wx0;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.f f450450d;

    public a(wx0.f fVar) {
        this.f450450d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.b7(m7Var, null), 3, null);
        wx0.f fVar = this.f450450d;
        android.view.View view2 = fVar.f331814d;
        kotlin.jvm.internal.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        fVar.f450482o = !fVar.f450482o;
        fVar.b();
        if (fVar.f450482o) {
            yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.w5(m7Var2, null), 3, null);
        } else {
            yy0.m7 m7Var3 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var3.Di(), null, null, new yy0.v5(m7Var3, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

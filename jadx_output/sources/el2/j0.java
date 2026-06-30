package el2;

/* loaded from: classes3.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.l0 f253834d;

    public j0(el2.l0 l0Var) {
        this.f253834d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAssistPromoteWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f473950a;
        el2.l0 l0Var = this.f253834d;
        android.content.Context context = l0Var.f253845d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (r4Var.Y1(context)) {
            com.tencent.mm.plugin.finder.live.plugin.l.q1(l0Var.f253847f, "PORTRAIT_ACTION_PROMOTE_CLICK", null, 2, null);
        } else {
            qo0.c.a(l0Var.f253846e, qo0.b.I2, null, 2, null);
        }
        bf2.c.b(bf2.c.f19598a, l0Var.f253847f.S0(), 2, 0, null, 0, 28, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAssistPromoteWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

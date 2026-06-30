package kd2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f306710d;

    public c(kd2.q qVar) {
        this.f306710d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/floatball/BaseFinderMiniViewHelper$generateCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kd2.q qVar = this.f306710d;
        qVar.f93132d.M.f93090m = 14;
        qVar.t0();
        com.tencent.mm.plugin.finder.viewmodel.component.nb0.F0((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class), false, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/floatball/BaseFinderMiniViewHelper$generateCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

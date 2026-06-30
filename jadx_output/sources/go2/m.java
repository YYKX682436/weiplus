package go2;

/* loaded from: classes2.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f274009d;

    public m(go2.z zVar) {
        this.f274009d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.z zVar = this.f274009d;
        zVar.getClass();
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.ui.widget.dialog.k0 kg6 = w40.e.kg((w40.e) c17, zVar.getContext(), null, 29, 2, null);
        kg6.f211872n = new go2.t(zVar);
        kg6.f211881s = new go2.u(zVar);
        kg6.f211854d = go2.v.f274069d;
        kg6.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package im2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292502d;

    public q0(im2.z3 z3Var) {
        this.f292502d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f292502d;
        com.tencent.mm.plugin.finder.live.widget.c80 c80Var = (com.tencent.mm.plugin.finder.live.widget.c80) ((jz5.n) z3Var.f292669y0).getValue();
        r45.h32 h32Var = new r45.h32();
        r45.vw4 vw4Var = z3Var.f292666x0;
        h32Var.set(18, java.lang.Integer.valueOf(vw4Var != null ? vw4Var.f388624d : 0));
        h32Var.set(14, java.lang.Integer.valueOf(z3Var.Y1));
        if (z3Var.f292634c2) {
            r45.q65 q65Var = new r45.q65();
            q65Var.set(0, java.lang.Boolean.TRUE);
            h32Var.set(10, q65Var);
        }
        c80Var.e0(h32Var, 2, new im2.p0(z3Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

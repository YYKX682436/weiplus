package qs3;

/* loaded from: classes15.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarMemberView f366351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.oi5 f366352e;

    public i(com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView, r45.oi5 oi5Var) {
        this.f366351d = radarMemberView;
        this.f366352e = oi5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        qs3.e eVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView = this.f366351d;
        if (radarMemberView.getState() == null || (eVar = radarMemberView.f154987v) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (eVar != null) {
            ps3.e state = radarMemberView.getState();
            qs3.w0 w0Var = (qs3.w0) eVar;
            r45.oi5 member = this.f366352e;
            kotlin.jvm.internal.o.g(member, "member");
            java.lang.String str = member.f382283d;
            if (str == null && (str = member.f382287h) == null) {
                str = "";
            }
            int i17 = state == null ? -1 : qs3.r0.f366384a[state.ordinal()];
            com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController = w0Var.f366404a;
            if (i17 == 1) {
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(radarViewController.getContext(), new qs3.t0(radarViewController, str, member, state));
            } else if (i17 == 2) {
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(radarViewController.getContext(), new qs3.v0(radarViewController, str, member, state));
            }
        }
        radarMemberView.c();
        yj0.a.h(this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

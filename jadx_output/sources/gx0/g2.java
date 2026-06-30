package gx0;

/* loaded from: classes5.dex */
public final class g2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276445d;

    public g2(gx0.u2 u2Var) {
        this.f276445d = u2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ex0.r n17;
        ax0.e eVar = (ax0.e) obj;
        gx0.u2 u2Var = this.f276445d;
        ex0.a0 a0Var = u2Var.S7().f276642r;
        if (a0Var == null || (n17 = a0Var.n()) == null) {
            return;
        }
        if (n17.f257169c == ug.m.Caption && kz5.z.G(new ax0.e[]{ax0.e.f14979h, ax0.e.f14980i}, eVar) && n17.f257171e == ax0.b.f14965e) {
            ow0.q0.g(u2Var, n17);
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76 = u2Var.n7();
        if (n76 != null) {
            com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(n76, false, 1, null);
        }
    }
}

package gx0;

/* loaded from: classes5.dex */
public final class f2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.g f276387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276388e;

    public f2(ow0.g gVar, gx0.u2 u2Var) {
        this.f276387d = gVar;
        this.f276388e = u2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ex0.r rVar = (ex0.r) obj;
        if (this.f276387d.getCurrentPage() == sw0.f.f413432g) {
            ug.m mVar = rVar != null ? rVar.f257169c : null;
            ug.m mVar2 = ug.m.Caption;
            gx0.u2 u2Var = this.f276388e;
            if (mVar == mVar2) {
                ow0.q0.g(u2Var, rVar);
                if (u2Var.R7().m7()) {
                    com.tencent.maas.base.MJID mjid = rVar.f257167a.f48532a;
                    kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
                    u2Var.W7(mjid);
                }
            } else {
                ((du0.o) ((jz5.n) u2Var.f349281o).getValue()).U6(false);
            }
            ow0.q0.h(u2Var);
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76 = u2Var.n7();
            if (n76 != null) {
                com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(n76, false, 1, null);
            }
        }
    }
}

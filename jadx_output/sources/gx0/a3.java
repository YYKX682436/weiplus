package gx0;

/* loaded from: classes5.dex */
public final class a3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f276183d;

    public a3(gx0.y3 y3Var) {
        this.f276183d = y3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) obj;
        kotlin.jvm.internal.o.d(mJTime);
        gx0.y3 y3Var = this.f276183d;
        if (y3Var.z7().f276255v.getValue() == gx0.fd.f276432h) {
            com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(y3Var.o7(), mJTime, false, 2, null);
        }
        ex0.f fVar = y3Var.f302188q;
        if (fVar == null) {
            return;
        }
        gx0.x4 y76 = y3Var.y7();
        y76.getClass();
        com.tencent.maas.base.MJID mjID = fVar.f257168b;
        kotlin.jvm.internal.o.g(mjID, "mjID");
        if (y76.e7(mjID) && !y76.f7(mjID)) {
            y76.n7(mjID, false, false);
        }
    }
}

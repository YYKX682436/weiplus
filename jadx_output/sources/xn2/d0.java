package xn2;

/* loaded from: classes2.dex */
public final class d0 extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455484a;

    public d0(xn2.p0 p0Var) {
        this.f455484a = p0Var;
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        xn2.p0 p0Var = this.f455484a;
        com.tencent.mars.xlog.Log.i(p0Var.f455545c, "onFloatBallDeleteButtonClick " + ballInfo);
        boolean z17 = false;
        if (ballInfo != null && ballInfo.f93046d == 32) {
            z17 = true;
        }
        if (z17) {
            p0Var.f455550h.f223712w = true;
            com.tencent.mm.plugin.finder.viewmodel.component.nb0.F0((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class), vn2.u0.f438387a.h(), null, 2, null);
            xn2.b bVar = p0Var.f455547e;
            java.lang.Object layoutManager = bVar != null ? ((xn2.f1) bVar).getRecyclerView().getLayoutManager() : null;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int t17 = linearLayoutManager.t();
                int x17 = linearLayoutManager.x();
                if (t17 != -1 && x17 != -1 && t17 <= x17) {
                    while (true) {
                        so2.j5 j5Var = (so2.j5) p0Var.j().getDataListJustForAdapter().get(t17);
                        if (j5Var instanceof zn2.a) {
                            com.tencent.mars.xlog.Log.i(p0Var.f455545c, "updateVisibleFeedPlayProgress " + pm0.v.u(j5Var.getItemId()) + " index=" + t17);
                            xn2.b bVar2 = p0Var.f455547e;
                            if (bVar2 != null) {
                                ((com.tencent.mm.plugin.finder.view.mj) ((xn2.f1) bVar2).a()).onItemRangeChanged(t17, 1, 103);
                            }
                        }
                        if (t17 == x17) {
                            break;
                        } else {
                            t17++;
                        }
                    }
                }
            }
            dw2.c0 c0Var = p0Var.f455550h.f223703n;
            if (c0Var != null) {
                c0Var.w0(p0Var.f455545c);
            }
        }
    }
}

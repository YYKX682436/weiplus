package pk2;

/* loaded from: classes3.dex */
public final class y1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356390h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356391i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356390h = helper.f356083f0;
        this.f356391i = n() ? "FinderRedDotConstants.Path.AnchorLive_More_Lens" : "FinderRedDotConstants.Path.StartLive_More_Lens";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        boolean z17 = true;
        if (n()) {
            D(1);
            return;
        }
        com.tencent.mm.ui.MMActivity activity = o9Var.f356078d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = (com.tencent.mm.plugin.finder.live.viewmodel.b8) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
        if (b8Var != null) {
            b8Var.f116946q = com.tencent.mm.plugin.finder.live.viewmodel.d6.f117035e;
        }
        androidx.lifecycle.c1 c17 = o9Var.c(mm2.c1.class);
        mm2.c1 c1Var = (mm2.c1) c17;
        if (!c1Var.a8() && !c1Var.U7()) {
            z17 = false;
        }
        if (z17) {
            c17 = null;
        }
        if (((mm2.c1) c17) != null) {
            D(0);
        }
    }

    public final void D(int i17) {
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var;
        new android.os.Bundle().putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", i17);
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) this.f364427a.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
        if (r5Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "clickLens");
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.U, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327915e), null, null, null, null, false, 124, null);
            com.tencent.mm.ui.MMActivity N6 = r5Var.N6();
            if (N6 != null && (b8Var = (com.tencent.mm.plugin.finder.live.viewmodel.b8) pf5.z.f353948a.a(N6).e(com.tencent.mm.plugin.finder.live.viewmodel.b8.class)) != null) {
                b8Var.f116946q = com.tencent.mm.plugin.finder.live.viewmodel.d6.f117035e;
            }
            mm2.c1 c1Var = (mm2.c1) r5Var.business(mm2.c1.class);
            if (!c1Var.a8() && !c1Var.U7()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", 0);
                r5Var.X6(qo0.b.f365350f3, bundle);
            }
            if (((mm2.c1) r5Var.business(mm2.c1.class)).l7()) {
                ll2.e.b(ll2.e.f319133a, "startlive.bottom.audiosetting", false, false, 6, null);
            } else {
                ll2.e.b(ll2.e.f319133a, "startlive.bottom.videosetting", false, false, 6, null);
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356391i;
    }

    @Override // qk2.f
    public boolean o() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        pk2.o9 o9Var = this.f364427a;
        if (r4Var.n2(((mm2.e1) o9Var.c(mm2.e1.class)).f328989s)) {
            return true;
        }
        kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) o9Var.f356074b.a(mm2.g1.class)).f329068f;
        return r4Var.G1(j2Var != null ? (r45.q12) ((kotlinx.coroutines.flow.h3) j2Var).getValue() : null);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f356390h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.du_);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.icons_outlined_screen_effect_regular, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    @Override // qk2.h
    public int y() {
        return this.f356390h;
    }
}

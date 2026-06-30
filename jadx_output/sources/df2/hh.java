package df2;

/* loaded from: classes3.dex */
public final class hh extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public int f230326m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f230327n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230328o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230329p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f230330q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230326m = 30;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        com.tencent.mars.xlog.Log.i("Finder.LiveDoubleClickLikeGuideController", "onCleared");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLivePause() {
        super.onLivePause();
        kotlinx.coroutines.r2 r2Var = this.f230328o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f230329p;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        pm0.v.X(new df2.ch(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        java.lang.String str;
        r45.ic1 ic1Var;
        super.onLiveStart(hc1Var);
        kotlinx.coroutines.r2 r2Var = this.f230328o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f230329p;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        if (N6() == null) {
            com.tencent.mars.xlog.Log.e("Finder.LiveDoubleClickLikeGuideController", "hostActivity is null");
            return;
        }
        ae2.in.f3688a.d0();
        r45.kf0 kf0Var = (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.getCustom(85)) == null) ? null : (r45.kf0) ic1Var.getCustom(22);
        this.f230327n = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DOUBLE_CLICK_GUIDE_SHOWN_BOOLEAN_SYNC, false);
        boolean g86 = ((mm2.c1) business(mm2.c1.class)).g8();
        boolean O6 = ((mm2.h7) business(mm2.h7.class)).O6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveStart usedSwipeFun=");
        sb6.append(this.f230327n);
        sb6.append("  isMultiStream=");
        sb6.append(O6);
        sb6.append(" isVrLive=");
        sb6.append(g86);
        sb6.append(' ');
        if (kf0Var != null) {
            str = "time_interval_of_guidance_after_join_live_s=" + kf0Var.getInteger(0);
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append('}');
        com.tencent.mars.xlog.Log.i("Finder.LiveDoubleClickLikeGuideController", sb6.toString());
        if (this.f230327n || g86 || O6) {
            return;
        }
        this.f230326m = kf0Var != null ? kf0Var.getInteger(0) : this.f230326m;
        com.tencent.mars.xlog.Log.i("Finder.LiveDoubleClickLikeGuideController", "tryToStartGuideTimer");
        kotlinx.coroutines.r2 r2Var3 = this.f230328o;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        this.f230328o = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.gh(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i("Finder.LiveDoubleClickLikeGuideController", "onViewMount");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        kotlinx.coroutines.r2 r2Var = this.f230328o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f230329p;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        pm0.v.X(new df2.ch(this));
        com.tencent.mars.xlog.Log.i("Finder.LiveDoubleClickLikeGuideController", "onViewUnmount");
    }
}

package df2;

/* loaded from: classes3.dex */
public final class hm extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230335m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f230336n;

    /* renamed from: o, reason: collision with root package name */
    public int f230337o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230338p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230335m = "Finder.LiveHeatController";
    }

    public static final void Z6(df2.hm hmVar) {
        android.view.ViewGroup viewGroup;
        java.lang.Object obj = hmVar.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view == null || (viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.f485586i92)) == null) {
            return;
        }
        androidx.transition.AutoTransition autoTransition = new androidx.transition.AutoTransition();
        autoTransition.Z(300L);
        u4.g1.a(viewGroup, autoTransition);
    }

    public static final android.view.ViewGroup a7(df2.hm hmVar) {
        android.view.ViewGroup viewGroup;
        java.lang.Object obj = hmVar.f291099e;
        if ((obj instanceof android.view.View ? (android.view.View) obj : null) == null) {
            return null;
        }
        android.view.View b76 = hmVar.b7();
        if (b76 instanceof android.view.ViewStub) {
            android.view.View inflate = ((android.view.ViewStub) b76).inflate();
            if (!(inflate instanceof android.view.ViewGroup)) {
                return null;
            }
            viewGroup = (android.view.ViewGroup) inflate;
        } else {
            if (!(b76 instanceof android.view.ViewGroup)) {
                return null;
            }
            viewGroup = (android.view.ViewGroup) b76;
        }
        return viewGroup;
    }

    public final android.view.View b7() {
        android.view.View findViewById;
        java.lang.Object obj = this.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view == null) {
            return null;
        }
        if (zl2.r4.f473950a.v1(view)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.f485639ig1);
            if (viewGroup == null) {
                return null;
            }
            findViewById = viewGroup.findViewById(com.tencent.mm.R.id.i_o);
        } else {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.f485589i95);
            if (viewGroup2 == null) {
                return null;
            }
            findViewById = viewGroup2.findViewById(com.tencent.mm.R.id.i_o);
        }
        return findViewById;
    }

    public final void c7() {
        boolean z17 = this.f230336n;
        java.lang.String str = this.f230335m;
        if (z17 || !((mm2.c1) business(mm2.c1.class)).a8()) {
            com.tencent.mars.xlog.Log.i(str, "startPolling isPolling:" + this.f230336n + ", liveStarted:" + ((mm2.c1) business(mm2.c1.class)).a8());
            return;
        }
        this.f230336n = true;
        com.tencent.mars.xlog.Log.i(str, "startPolling");
        if (zl2.r4.f473950a.w1()) {
            r45.ub2 ub2Var = new r45.ub2();
            ub2Var.set(0, c01.z1.r());
            ub2Var.set(1, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328983m));
            ub2Var.set(2, xy2.c.e(O6()));
            com.tencent.mars.xlog.Log.i(str, "startPolling anchor, username:" + ub2Var.getString(0) + ", object_id:" + pm0.v.u(ub2Var.getLong(1)) + ", finder_username:" + ub2Var.getString(2));
            dk2.ef efVar = dk2.ef.f233372a;
            dk2.ef.f233392k.e(22, ub2Var, new df2.tl(this, r45.vb2.class), false);
            return;
        }
        r45.sb2 sb2Var = new r45.sb2();
        sb2Var.set(0, c01.z1.r());
        sb2Var.set(1, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328983m));
        sb2Var.set(2, ((mm2.c1) business(mm2.c1.class)).f328852o);
        com.tencent.mars.xlog.Log.i(str, "startPolling visitor, username:" + sb2Var.getString(0) + ", object_id:" + pm0.v.u(sb2Var.getLong(1)) + ", finder_username:" + sb2Var.getString(2));
        dk2.ef efVar2 = dk2.ef.f233372a;
        dk2.ef.f233392k.e(21, sb2Var, new df2.ul(this, r45.tb2.class), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        c7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        c7();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i(this.f230335m, "stopPolling");
        this.f230336n = false;
        dk2.tb tbVar = dk2.ef.f233392k;
        tbVar.f(22);
        tbVar.f(21);
        this.f230337o = 0;
        this.f230338p = null;
    }
}

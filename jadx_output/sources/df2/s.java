package df2;

/* loaded from: classes3.dex */
public final class s extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231278m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f231279n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231278m = "Finder.AnchorMiniViewController";
    }

    public final void Z6() {
        android.view.View S6 = S6(com.tencent.mm.R.id.ra8);
        com.tencent.mars.xlog.Log.i(this.f231278m, "checkShowMiniViewBtn isAnchor:" + zl2.r4.f473950a.x1() + ", isLiveStarted:" + this.f231279n);
        if (!this.f231279n) {
            if (S6 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/AnchorMiniViewController", "checkShowMiniViewBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/finder/live/controller/AnchorMiniViewController", "checkShowMiniViewBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.D1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("type", 1);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        if (S6 != null) {
            S6.setOnClickListener(new df2.p(this));
        }
        if (S6 != null) {
            if2.d0 d0Var = new if2.d0(S6, this);
            this.f291103i = new df2.q(d0Var);
            d0Var.d(0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        this.f231279n = true;
        Z6();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        Z6();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
    }
}

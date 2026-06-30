package df2;

/* loaded from: classes3.dex */
public final class kw extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230603m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f230604n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f230605o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f230606p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230603m = "LiveVisitorGuideController";
        this.f230604n = new java.util.LinkedHashMap();
        this.f230605o = new java.util.LinkedHashSet();
        this.f230606p = jz5.h.b(new df2.dw(this));
    }

    public final boolean Z6() {
        jf2.k0 k0Var = (jf2.k0) controller(jf2.k0.class);
        return k0Var != null && k0Var.f7(20);
    }

    public final void a7(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (!zl2.r4.f473950a.o2()) {
            jSONObject.put("pos", 1);
        } else if (Z6()) {
            jSONObject.put("pos", 3);
        } else {
            jSONObject.put("pos", 2);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327284z2, jSONObject2, 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        yg2.b viewScope;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = pluginLayout instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) pluginLayout : null;
        if (k0Var != null && (viewScope = k0Var.getViewScope()) != null) {
            this.f291103i = new df2.cw(this, viewScope);
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = (com.tencent.mm.plugin.finder.live.view.k0) pluginLayout;
        ((mm2.x6) business(mm2.x6.class)).f329546f.observe(k0Var2, new df2.ew(this));
        ((mm2.c1) business(mm2.c1.class)).f328797e4.observe(k0Var2, df2.fw.f230171d);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        java.util.Map map = this.f230604n;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.widget.sl) ((java.util.Map.Entry) it.next()).getValue()).dismiss();
        }
        this.f230605o.clear();
        ((java.util.LinkedHashMap) map).clear();
    }
}

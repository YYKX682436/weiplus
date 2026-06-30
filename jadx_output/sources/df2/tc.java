package df2;

/* loaded from: classes3.dex */
public final class tc extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f231432m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f231433n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231432m = new java.util.LinkedHashSet();
        this.f231433n = new java.util.LinkedHashMap();
    }

    public static void Z6(df2.tc tcVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = null;
        }
        if ((i18 & 4) != 0) {
            str2 = null;
        }
        if ((i18 & 8) != 0) {
            str3 = null;
        }
        tcVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (str != null) {
            jSONObject.put("msg_id", str);
        }
        if (str2 != null) {
            jSONObject.put("title_length", str2);
        }
        if (str3 != null) {
            jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 50L, t17, null, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        yg2.b viewScope;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = pluginLayout instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) pluginLayout : null;
        if (k0Var == null || (viewScope = k0Var.getViewScope()) == null) {
            return;
        }
        this.f291103i = new df2.kc(this, viewScope);
        kotlinx.coroutines.l.d(viewScope, null, null, new df2.mc(this, pluginLayout, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        java.util.Map map = this.f231433n;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.widget.sl) ((java.util.Map.Entry) it.next()).getValue()).dismiss();
        }
        this.f231432m.clear();
        ((java.util.LinkedHashMap) map).clear();
    }
}

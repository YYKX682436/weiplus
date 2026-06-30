package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b6 implements oe0.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c6 f111976a;

    public b6(com.tencent.mm.plugin.finder.live.plugin.c6 c6Var) {
        this.f111976a = c6Var;
    }

    @Override // oe0.w
    public void a(java.lang.String action, org.json.JSONObject params) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = this.f111976a;
        com.tencent.mars.xlog.Log.i(c6Var.f112117q, "finderLiveCallback action:".concat(action));
        switch (action.hashCode()) {
            case -1556964046:
                if (action.equals("beforeLiveToastAction")) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.a6(params, c6Var));
                    return;
                }
                return;
            case -1031113918:
                if (action.equals("dynamicCardFirstFrameAction")) {
                    java.lang.String optString = params.optString("frameSetName");
                    java.lang.String str = c6Var.f112117q;
                    r45.yq1 yq1Var = c6Var.f112118r.f118068j;
                    r45.y63 y63Var = yq1Var != null ? (r45.y63) yq1Var.getCustom(0) : null;
                    if (y63Var == null || (list = y63Var.getList(0)) == null) {
                        return;
                    }
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (r26.i0.q(((r45.x63) it.next()).getString(3), optString, false, 2, null)) {
                            com.tencent.mars.xlog.Log.i(c6Var.f112117q, "frameFirstRender frameSetName:" + optString + " hideLoading!");
                            com.tencent.mm.plugin.finder.live.widget.d6 d6Var = c6Var.f112118r;
                            d6Var.getClass();
                            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.s5(d6Var));
                        }
                    }
                    return;
                }
                return;
            case -69720490:
                if (action.equals("dynamicCardServerLost")) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.z5(c6Var));
                    return;
                }
                return;
            case 125053251:
                if (action.equals("closePlayTogetherActionSheet")) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.y5(c6Var, params));
                    return;
                }
                return;
            default:
                return;
        }
    }
}

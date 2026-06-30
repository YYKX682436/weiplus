package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zh0 implements oe0.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ai0 f115347a;

    public zh0(com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var) {
        this.f115347a = ai0Var;
    }

    @Override // oe0.w
    public void a(java.lang.String action, org.json.JSONObject params) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var = this.f115347a;
        com.tencent.mars.xlog.Log.i(ai0Var.f111889q, "finderLiveCallback action:".concat(action));
        switch (action.hashCode()) {
            case -1556964046:
                if (action.equals("beforeLiveToastAction")) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.yh0(params, ai0Var));
                    return;
                }
                return;
            case -1031113918:
                if (action.equals("dynamicCardFirstFrameAction")) {
                    java.lang.String optString = params.optString("frameSetName");
                    java.lang.String str = ai0Var.f111889q;
                    r45.yq1 yq1Var = ai0Var.f111890r.f120509r;
                    r45.y63 y63Var = yq1Var != null ? (r45.y63) yq1Var.getCustom(0) : null;
                    if (y63Var == null || (list = y63Var.getList(0)) == null) {
                        return;
                    }
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (r26.i0.q(((r45.x63) it.next()).getString(3), optString, false, 2, null)) {
                            com.tencent.mars.xlog.Log.i(ai0Var.f111889q, "frameFirstRender frameSetName:" + optString + " hideLoading!");
                            com.tencent.mm.plugin.finder.live.widget.z10 z10Var = ai0Var.f111890r;
                            z10Var.getClass();
                            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.t10(z10Var));
                        }
                    }
                    return;
                }
                return;
            case -69720490:
                if (action.equals("dynamicCardServerLost")) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.xh0(ai0Var));
                    return;
                }
                return;
            case 125053251:
                if (action.equals("closePlayTogetherActionSheet")) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.wh0(ai0Var, params));
                    return;
                }
                return;
            default:
                return;
        }
    }
}

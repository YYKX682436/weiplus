package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/wj;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes3.dex */
public final class wj implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String string;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareProductWxaCoverWidget", "createWidget data:" + iPCString.f68406d);
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            java.lang.String string2 = jSONObject.getString("feedId");
            java.lang.String string3 = jSONObject.getString("nonceId");
            long Z = pm0.v.Z(string2);
            java.lang.String optString = jSONObject.optString("lastGMsgId");
            java.lang.String str = "";
            if (optString == null) {
                optString = "";
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderShareProductWxaCoverWidget", "feedId:" + pm0.v.u(Z) + ", nonceId:" + string3 + ", lastGMsgId:" + optString);
            java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(2, 3, 65);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
            zl2.b0 b0Var = zl2.b0.f473663a;
            r45.br2 br2Var = zl2.b0.f473665c;
            if (br2Var != null && (string = br2Var.getString(17)) != null) {
                intent.putExtra("key_enter_live_param_ecsource", string);
            }
            r45.m84 m84Var = new r45.m84();
            m84Var.set(0, java.lang.Long.valueOf(Z));
            m84Var.set(1, 0L);
            m84Var.set(2, string3);
            m84Var.set(3, "");
            m84Var.set(4, "");
            m84Var.set(5, "");
            m84Var.set(6, null);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, Gj);
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((vd2.f1) e0Var).Ri(context, intent, m84Var, true, wk0Var, new com.tencent.mm.plugin.finder.view.vj(intent, optString));
            r45.br2 br2Var2 = zl2.b0.f473665c;
            if (br2Var2 != null) {
                java.lang.String string4 = br2Var2.getString(0);
                if (string4 != null) {
                    str = string4;
                }
                b0Var.g(br2Var2, "enter_live", b0Var.b(br2Var2, str, 1));
            }
        } catch (java.lang.Throwable unused) {
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
    }
}

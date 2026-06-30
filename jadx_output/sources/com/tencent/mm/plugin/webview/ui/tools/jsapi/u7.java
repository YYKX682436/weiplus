package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class u7 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185442e;

    public u7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185442e = c1Var;
        this.f185441d = y2Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.kb3 kb3Var;
        r45.gi5 gi5Var;
        com.tencent.mm.protobuf.f fVar;
        gm0.j1.n().f273288b.q(cc1.w.CTRL_INDEX, this);
        int i19 = -1;
        java.lang.String str2 = "getEnterpriseChat:fail";
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelbase.o oVar = ((r01.j3) m1Var).f368126e;
            kb3Var = (oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.kb3) fVar;
            if (kb3Var != null && (gi5Var = kb3Var.f378573d) != null) {
                i19 = gi5Var.f375288d;
                java.lang.String str3 = gi5Var.f375289e;
                if (str3 != null && str3.length() > 0) {
                    str2 = "getEnterpriseChat:fail_" + kb3Var.f378573d.f375289e;
                }
            }
        } else {
            kb3Var = null;
        }
        nw4.y2 y2Var = this.f185441d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185442e;
        if (i19 != 0) {
            c1Var.i5(y2Var, str2, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", kb3Var.f378574e);
        c1Var.i5(y2Var, "getEnterpriseChat:ok", hashMap);
    }
}

package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class j3 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185210b;

    public j3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185210b = c1Var;
        this.f185209a = y2Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185210b;
        nw4.y2 y2Var = this.f185209a;
        if (K0) {
            c1Var.i5(y2Var, y2Var.f341019i + ":ok", com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.D3(c1Var, jSONObject));
            return;
        }
        c1Var.i5(y2Var, y2Var.f341019i + ":fail_" + str, null);
    }
}

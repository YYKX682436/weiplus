package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class z4 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185586b;

    public z4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185586b = c1Var;
        this.f185585a = y2Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        nw4.y2 y2Var = this.f185585a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185586b;
        if (K0) {
            c1Var.i5(y2Var, "pause_download_task:ok", null);
        } else {
            c1Var.i5(y2Var, "pause_download_task:fail", null);
        }
    }
}

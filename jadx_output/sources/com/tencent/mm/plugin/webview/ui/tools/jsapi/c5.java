package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class c5 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185020b;

    public c5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185020b = c1Var;
        this.f185019a = y2Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        nw4.y2 y2Var = this.f185019a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185020b;
        if (K0) {
            c1Var.i5(y2Var, "resume_download_task:ok", com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.D3(c1Var, jSONObject));
        } else {
            c1Var.i5(y2Var, "resume_download_task:false", com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.D3(c1Var, jSONObject));
        }
    }
}

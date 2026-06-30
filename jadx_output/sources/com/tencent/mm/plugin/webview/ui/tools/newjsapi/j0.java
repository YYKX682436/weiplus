package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class j0 implements q80.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186266b;

    public j0(int i17, com.tencent.mm.ipcinvoker.r rVar) {
        this.f186265a = i17;
        this.f186266b = rVar;
    }

    @Override // q80.a0
    public void onStoreSendResult(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        if (i17 == this.f186265a) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ak(this);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("err_msg", "dispatchLiteAppAction:ok");
            if (str2 == null) {
                str2 = "type";
            }
            jSONObject.put("type", str2);
            jSONObject.put("result", obj);
            com.tencent.mm.ipcinvoker.r rVar = this.f186266b;
            if (rVar != null) {
                rVar.a(jSONObject.toString());
            }
        }
    }

    @Override // q80.a0
    public void onStoreSetData(java.lang.String str, java.util.Map map) {
    }
}

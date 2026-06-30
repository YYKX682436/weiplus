package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class k6 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f186313d;

    public k6(org.json.JSONObject jSONObject) {
        this.f186313d = jSONObject;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        org.json.JSONObject Ai = ((r01.l1) i95.n0.c(r01.l1.class)).Ai(0, "");
        Ai.put("extraInfoFromWebview", this.f186313d.optString("nativeExtraData", ""));
        return Ai.toString();
    }
}

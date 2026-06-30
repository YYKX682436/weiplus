package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class b extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f182560a;

    public b(com.tencent.mm.plugin.webview.luggage.menu.e eVar, boolean z17) {
        this.f182560a = z17;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(ya.b.SUCCESS, this.f182560a);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onAddShortcutStatus";
    }
}

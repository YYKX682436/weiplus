package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f175250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175251e;

    public x(com.tencent.mm.plugin.topstory.ui.webview.l lVar, org.json.JSONObject jSONObject) {
        this.f175251e = lVar;
        this.f175250d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f175251e.f175219f.evaluateJavascript(java.lang.String.format("javascript:window.activity_state_change && activity_state_change(%s)", this.f175250d.toString()), null);
    }
}

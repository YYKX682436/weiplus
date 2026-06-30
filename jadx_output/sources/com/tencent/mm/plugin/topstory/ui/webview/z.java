package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f175253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175254e;

    public z(com.tencent.mm.plugin.topstory.ui.webview.l lVar, org.json.JSONObject jSONObject) {
        this.f175254e = lVar;
        this.f175253d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175254e, "onVideoPlayInfo", this.f175253d.toString());
    }
}

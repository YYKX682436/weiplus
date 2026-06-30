package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class k2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f186297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186299f;

    public k2(java.util.Map map, nw4.k kVar, nw4.y2 y2Var) {
        this.f186297d = map;
        this.f186298e = kVar;
        this.f186299f = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(la5.b.f317600a.g(true));
        java.util.Map map = this.f186297d;
        map.put("isAccessibilityMode", valueOf);
        map.put("isCareMode", java.lang.Boolean.valueOf(((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetUserConfig", "isAccessibilityMode:" + map.get("isAccessibilityMode") + ", isCareMode:" + map.get("isCareMode"));
        this.f186298e.f340863d.e(this.f186299f.f341013c, "getUserConfig:ok", map);
    }
}

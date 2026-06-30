package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class t0 implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186534b;

    public t0(nw4.k kVar, nw4.y2 y2Var) {
        this.f186533a = kVar;
        this.f186534b = y2Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        nw4.y2 y2Var = this.f186534b;
        nw4.k kVar = this.f186533a;
        if (K0) {
            kVar.f340863d.e(y2Var.f341013c, "downloadMediaByUrl failed", null);
            return;
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(str);
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_LOCALID, d17.f182736e);
        kVar.f340863d.e(y2Var.f341013c, "downloadMediaByUrl:ok", hashMap);
    }
}

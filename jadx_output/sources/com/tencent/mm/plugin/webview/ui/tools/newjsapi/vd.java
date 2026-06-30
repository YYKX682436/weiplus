package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class vd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, java.lang.String str, java.lang.String str2) {
        super(1);
        this.f186590d = webViewUI;
        this.f186591e = str;
        this.f186592f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        nw4.n nVar = this.f186590d.f183844p0;
        jz5.l lVar = new jz5.l("sourceType", 1);
        jz5.l lVar2 = new jz5.l("type", "emoticon");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("md5", this.f186591e);
        jSONObject.put("emojiInfo", this.f186592f);
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, path);
        nVar.N(kz5.c1.l(lVar, lVar2, new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString())));
        return jz5.f0.f302826a;
    }
}

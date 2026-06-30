package fy4;

/* loaded from: classes8.dex */
public final class e implements com.tencent.mm.ui.z7, p94.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI f267259d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f267260e;

    public e(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webviewUI) {
        kotlin.jvm.internal.o.g(webviewUI, "webviewUI");
        this.f267259d = webviewUI;
    }

    @Override // p94.u0
    public void a() {
        nw4.n nVar = this.f267259d.f183844p0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        nVar.i0("onReceiveWXKBEvent", null, jSONObject);
    }

    @Override // p94.u0
    public void b(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewInputConnectionHelper", "onReceiveImeEmoji, emojiInfo md5 = " + emojiInfo.getMd5());
        ((com.tencent.mm.feature.emoji.c4) ((com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class))).ij(emojiInfo, false, new fy4.d(this, emojiInfo, fy4.f.f267261a.b(emojiInfo)));
    }

    @Override // p94.u0
    public void c(java.lang.String imgPath) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        nw4.n nVar = this.f267259d.f183844p0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("localData", fy4.f.f267261a.a(imgPath, 2));
        nVar.i0("onGetImageInfo", null, jSONObject);
    }

    @Override // p94.u0
    public void d() {
        nw4.n nVar = this.f267259d.f183844p0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        nVar.i0("onReceiveWXKBEvent", null, jSONObject);
    }
}

package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes12.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem f184924g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184925h;

    public a7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, boolean z17, nw4.y2 y2Var, java.lang.String str, com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem) {
        this.f184925h = c1Var;
        this.f184921d = z17;
        this.f184922e = y2Var;
        this.f184923f = str;
        this.f184924g = webViewJSSDKFileItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f184921d) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f184925h;
            android.content.Context context = c1Var.f184975d;
            c1Var.f184979h = db5.e1.Q(context, j65.q.a(context).getString(com.tencent.mm.R.string.f490573yv), j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.lba), true, true, new com.tencent.mm.plugin.webview.ui.tools.jsapi.y6(this));
        }
        com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent = new com.tencent.mm.autogen.events.ExtTranslateVoiceEvent();
        java.lang.String str = this.f184923f;
        am.v8 v8Var = extTranslateVoiceEvent.f54213g;
        v8Var.f8178b = str;
        v8Var.f8177a = this.f184924g.f182741m;
        v8Var.f8179c = 0;
        v8Var.f8182f = 8;
        v8Var.f8181e = new com.tencent.mm.plugin.webview.ui.tools.jsapi.z6(this, extTranslateVoiceEvent);
        extTranslateVoiceEvent.e();
    }
}

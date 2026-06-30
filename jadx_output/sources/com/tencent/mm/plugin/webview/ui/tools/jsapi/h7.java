package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class h7 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185170c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f185173f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185174g;

    public h7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, nw4.y2 y2Var, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        this.f185174g = c1Var;
        this.f185168a = str;
        this.f185169b = y2Var;
        this.f185170c = str2;
        this.f185171d = str3;
        this.f185172e = str4;
        this.f185173f = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185174g;
        if (!z17) {
            c1Var.i5(this.f185169b, "send_app_msg:cancel", null);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f185168a)) {
            pq5.h.a().q(new com.tencent.mm.plugin.webview.ui.tools.jsapi.g7(this, new com.tencent.mm.plugin.webview.ui.tools.jsapi.b7(this))).h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.e7(this, str));
            return;
        }
        this.f185174g.Q5(null, "", this.f185170c, this.f185168a, this.f185171d, this.f185172e, str, null);
        android.content.Context context = c1Var.f184975d;
        if (context instanceof android.app.Activity) {
            db5.t7.h(context, j65.q.a(context).getString(com.tencent.mm.R.string.f490560yi));
            ((android.app.Activity) c1Var.f184975d).finish();
            c1Var.f184998y = c1Var.f185001z;
        }
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(this.f185170c);
    }
}

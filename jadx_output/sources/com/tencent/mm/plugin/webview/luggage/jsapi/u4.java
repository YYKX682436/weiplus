package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class u4 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.z4 f182478e;

    public u4(com.tencent.mm.plugin.webview.luggage.jsapi.z4 z4Var, java.lang.String str) {
        this.f182478e = z4Var;
        this.f182477d = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 20, 2001, 1, 28, 0, this.f182477d);
        this.f182478e.f182539e.a("cancel", null);
    }
}

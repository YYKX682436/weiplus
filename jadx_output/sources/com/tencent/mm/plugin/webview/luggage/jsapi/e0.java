package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class e0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.g0 f182301d;

    public e0(com.tencent.mm.plugin.webview.luggage.jsapi.g0 g0Var) {
        this.f182301d = g0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        this.f182301d.h("cancel", null);
    }
}

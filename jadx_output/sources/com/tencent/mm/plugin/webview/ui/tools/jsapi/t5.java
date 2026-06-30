package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class t5 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185416e;

    public t5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185416e = c1Var;
        this.f185415d = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        this.f185416e.i5(this.f185415d, "chooseImage:cancel", null);
    }
}

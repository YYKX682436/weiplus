package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class w9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f187017d;

    public w9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var) {
        this.f187017d = u7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f187017d.f186929e.get()).f183844p0.y0(1, dialogInterface == null ? "" : ((com.tencent.mm.ui.widget.dialog.j0) dialogInterface).h(), 0);
    }
}

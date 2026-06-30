package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class j6 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185214d;

    public j6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185214d = c1Var;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185214d;
        android.content.Context context = c1Var.f184975d;
        db5.e1.K(context, true, j65.q.a(context).getString(com.tencent.mm.R.string.l6l), "", j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.l6i), j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.l6j), new com.tencent.mm.plugin.webview.ui.tools.jsapi.h6(this), new com.tencent.mm.plugin.webview.ui.tools.jsapi.i6(this));
        return true;
    }
}

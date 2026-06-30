package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes7.dex */
public class s6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.t6 f187536d;

    public s6(com.tencent.mm.plugin.webview.ui.tools.widget.x6 x6Var, com.tencent.mm.plugin.webview.ui.tools.widget.t6 t6Var) {
        this.f187536d = t6Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f187536d.a(3, null);
    }
}

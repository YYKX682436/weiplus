package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class e6 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182303d;

    public e6(android.content.Context context) {
        this.f182303d = context;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        android.content.Context context = this.f182303d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.l6l);
        android.content.Context context2 = this.f182303d;
        db5.e1.K(context, true, string, "", context2.getString(com.tencent.mm.R.string.l6i), context2.getString(com.tencent.mm.R.string.l6j), new com.tencent.mm.plugin.webview.luggage.jsapi.c6(this), new com.tencent.mm.plugin.webview.luggage.jsapi.d6(this));
        return true;
    }
}

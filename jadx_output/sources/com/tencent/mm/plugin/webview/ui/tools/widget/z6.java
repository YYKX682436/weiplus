package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class z6 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.d7 f187635d;

    public z6(com.tencent.mm.plugin.webview.ui.tools.widget.d7 d7Var) {
        this.f187635d = d7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.ui.tools.widget.d7 d7Var = this.f187635d;
        android.view.ViewTreeObserver viewTreeObserver = d7Var.f187168n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                d7Var.f187168n = d7Var.f187163f.getViewTreeObserver();
            }
            d7Var.f187168n.removeGlobalOnLayoutListener(d7Var);
            d7Var.f187168n = null;
        }
        android.graphics.Bitmap bitmap = d7Var.f187169o;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebMenuContainer", "bitmap recycle %s", d7Var.f187169o.toString());
            d7Var.f187169o.recycle();
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.f7 f7Var = d7Var.f187161d;
        if (f7Var != null) {
            com.tencent.mm.ui.widget.dialog.g.b(f7Var);
        }
    }
}

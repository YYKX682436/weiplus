package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class x implements db5.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.d0 f187592a;

    public x(com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var) {
        this.f187592a = d0Var;
    }

    @Override // db5.j4
    public final void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187592a;
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(((db5.h4) menuItem).A)) {
            return;
        }
        try {
            java.lang.String R9 = d0Var.e().e0().R9(((db5.h4) menuItem).A);
            kotlin.jvm.internal.o.f(R9, "getHeadImgPath(...)");
            android.graphics.Bitmap a17 = hy4.z.f286206a.a(R9);
            if (a17 == null) {
                return;
            }
            android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(a17, true, a17.getWidth() * 0.1f);
            imageView.setVisibility(8);
            imageView2.setImageBitmap(s07);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            d0Var.f187144b.put(str, s07);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HalfScreenWebViewMenuHelper", "handle share to recent friends, ex = " + e17.getMessage());
        }
    }
}

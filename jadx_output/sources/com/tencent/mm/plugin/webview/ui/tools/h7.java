package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class h7 implements db5.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f184800a;

    public h7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f184800a = c6Var;
    }

    @Override // db5.j4
    public void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        java.lang.String str2 = ((db5.h4) menuItem).A;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (com.tencent.mm.sdk.platformtools.w9.f193053a.equals(com.tencent.mm.ipcinvoker.y.a())) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, str2, null);
            } else {
                try {
                    ((com.tencent.mm.feature.avatar.s) ((kv.y) i95.n0.c(kv.y.class))).wi(imageView2, str2);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e17, "attachAvatar for username: " + str2, new java.lang.Object[0]);
                }
            }
            imageView.setVisibility(8);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f184800a;
        c6Var.getClass();
        if (menuItem.getItemId() >= 10000) {
            imageView.setVisibility(8);
            return;
        }
        com.tencent.mm.sdk.platformtools.r2 r2Var = c6Var.f184047d;
        if (r2Var.get(str) != null && !((android.graphics.Bitmap) r2Var.get(str)).isRecycled()) {
            imageView.setImageBitmap((android.graphics.Bitmap) r2Var.get(str));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "on attach icon, load from cache fail");
        try {
            java.lang.String R9 = c6Var.c().L1.A.R9(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(R9)) {
                return;
            }
            java.util.HashMap hashMap = com.tencent.mm.plugin.webview.ui.tools.a1.f183889a;
            android.graphics.Bitmap a17 = hy4.z.f286206a.a(R9);
            if (a17 == null || a17.isRecycled()) {
                return;
            }
            imageView.setImageBitmap(a17);
            r2Var.put(str, a17);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "getheadimg, ex = " + e18.getMessage());
        }
    }
}

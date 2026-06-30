package cw4;

/* loaded from: classes8.dex */
public final class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.WebViewTransHelper f224225d;

    public h1(com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper) {
        this.f224225d = webViewTransHelper;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = this.f224225d;
        webViewTransHelper.getClass();
        wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
        android.content.Context context = webViewTransHelper.f181741d.getContext();
        kotlin.jvm.internal.o.d(context);
        ((vd0.o3) z1Var).fj(context, null);
    }
}

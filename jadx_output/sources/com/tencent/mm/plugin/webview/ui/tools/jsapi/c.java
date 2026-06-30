package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri[] f184966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f184967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f184969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f184970h;

    public c(android.net.Uri[] uriArr, boolean z17, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, int i17, boolean z18) {
        this.f184966d = uriArr;
        this.f184967e = z17;
        this.f184968f = c1Var;
        this.f184969g = i17;
        this.f184970h = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (android.net.Uri uri : this.f184966d) {
            if (uri != null && com.tencent.mm.sdk.platformtools.t8.W0(uri)) {
                boolean z17 = this.f184967e;
                java.lang.String str = z17 ? "choose_video" : "choose_image";
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                int i18 = i17 + 1;
                sb6.append(i17);
                java.lang.String sb7 = sb6.toString();
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("wcf://temp/wv_choose_media"));
                r6Var.J();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(sb7);
                sb8.append('_');
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb8.append(java.lang.System.currentTimeMillis());
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, sb8.toString());
                r6Var2.k();
                java.lang.String o17 = r6Var2.o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                com.tencent.mm.vfs.w6.c(uri.toString(), o17);
                if (com.tencent.mm.vfs.w6.j(o17) && com.tencent.mm.vfs.w6.k(o17) > 0) {
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = z17 ? com.tencent.mm.plugin.webview.model.m4.b(o17) : com.tencent.mm.plugin.webview.model.m4.d(o17);
                    com.tencent.mm.plugin.webview.model.l4.f183002b.a(b17);
                    arrayList.add(b17.f182736e);
                }
                i17 = i18;
            }
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.b(this.f184968f, this.f184969g, this.f184970h, arrayList));
    }
}

package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class t1 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.u1 f143779b;

    public t1(java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.u1 u1Var) {
        this.f143778a = str;
        this.f143779b = u1Var;
    }

    @Override // p11.k
    public void a(java.lang.String url, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... extraObj) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(extraObj, "extraObj");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSingleOperation", "imageLoaderListener onImageLoadComplete %s", url);
        com.tencent.mm.plugin.lite.jsapi.comms.u1 u1Var = this.f143779b;
        if (bitmap != null) {
            if ((!(extraObj.length == 0)) && (obj = extraObj[0]) != null && (obj instanceof java.lang.String) && kotlin.jvm.internal.o.b(url, this.f143778a)) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(java.lang.String.valueOf(extraObj[0]));
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                    u1Var.B(a17.toString());
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonSingleOperation", "download image fail");
        u1Var.f143443f.a("emoticonSingleOperation:fail_missing arguments");
    }
}

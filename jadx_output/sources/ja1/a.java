package ja1;

/* loaded from: classes7.dex */
public class a implements ah.c {
    @Override // ah.c
    public java.lang.String a(java.lang.String str) {
        int i17 = com.tencent.magicbrush.MagicBrush.f48586q;
        return str.equals("mmbox2d") ? com.tencent.luggage.sdk.jsapi.component.service.t1.a("libmmbox2d_v8_13_2") : str.equals("mmphysx") ? com.tencent.luggage.sdk.jsapi.component.service.t1.a("libmmphysx_v8_13_2") : fp.d0.g(str);
    }

    @Override // ah.c
    public void loadLibrary(java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = true;
        if (z65.c.a() && "magicbrush".equals(str)) {
            java.util.HashMap hashMap = ha1.l.f279777f;
            java.lang.Object obj = ha1.l.f279777f.get("localso");
            kotlin.jvm.internal.o.d(obj);
            if (((java.lang.Boolean) ((ha1.l) obj).e()).booleanValue()) {
                if (ja1.e.f298603a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load custom local so libName: %s, skip", "magicbrush");
                    return;
                }
                ja1.e.f298603a = true;
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load custom local so libName: %s", "magicbrush");
                    com.tencent.cso.CsoLoader.g(ja1.e.a("libmagicbrush.so", "/sdcard/magicbrush/libmagicbrush.so").o());
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGame.MBLoadDelegateRegistryWC", e17, "load local so failed", new java.lang.Object[0]);
                    z17 = false;
                }
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, z17 ? "local so succeed: magicbrush" : "local so failed: magicbrush", 0).show();
                return;
            }
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "loadLibrary libName:%s", str);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int i17 = com.tencent.magicbrush.MagicBrush.f48586q;
            if (str.equals("mmbox2d")) {
                java.lang.String a17 = com.tencent.luggage.sdk.jsapi.component.service.t1.a("libmmbox2d_v8_13_2");
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "libmmbox2d.so path is null");
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load libmmbox2d.so by path: %s", a17);
                    com.tencent.cso.CsoLoader.h(a17);
                }
            } else if (str.equals("mmphysx")) {
                if (com.tencent.luggage.sdk.jsapi.component.service.t1.a("libmmphysx_v8_13_2") == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "libmmphysx.so path is null, try download it here");
                    com.tencent.luggage.sdk.jsapi.component.service.t1.f47540a.b("libmmphysx_v8_13_2", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "ilinkres_ae0cf48a");
                }
                java.lang.String a18 = com.tencent.luggage.sdk.jsapi.component.service.t1.a("libmmphysx_v8_13_2");
                if (a18 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "load libmmphysx.so by path: %s", a18);
                    com.tencent.cso.CsoLoader.h(a18);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "fail to download libmmphysx.so");
                    va1.f.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                }
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/game/handler/MBLoadDelegateRegistryWC", "loadSoImpl", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj2, "com/tencent/mm/plugin/appbrand/game/handler/MBLoadDelegateRegistryWC", "loadSoImpl", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "hy: loading library %s using %d ms", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGame.MBLoadDelegateRegistryWC", e18, "hy: link %s error!!", str);
            va1.f.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }
}

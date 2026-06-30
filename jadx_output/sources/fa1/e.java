package fa1;

/* loaded from: classes7.dex */
public class e implements yz5.a {
    public e(fa1.a aVar) {
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String[] strArr = la1.i.f317498a;
        com.tencent.mm.plugin.appbrand.jsapi.p0 p0Var = new com.tencent.mm.plugin.appbrand.jsapi.p0();
        p0Var.g();
        java.util.HashMap hashMap = (java.util.HashMap) p0Var.f82482c;
        hashMap.putAll(com.tencent.mm.plugin.appbrand.jsapi.p0.e());
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(new com.tencent.luggage.game.jsapi.keyboard.r());
        hashSet.add(new com.tencent.luggage.game.jsapi.keyboard.t());
        hashSet.add(new com.tencent.luggage.game.jsapi.keyboard.g());
        hashSet.add(new zd.a());
        hashSet.add(new zd.c());
        hashSet.add(new ut0.b());
        hashSet.add(new com.tencent.mm.minigame.y());
        hashSet.add(new com.tencent.mm.minigame.download.mmdownloader.g());
        hashSet.add(new com.tencent.mm.minigame.download.mmdownloader.i());
        hashSet.add(new com.tencent.mm.minigame.download.mmdownloader.l());
        hashSet.add(new com.tencent.mm.minigame.download.mmdownloader.j());
        hashSet.add(new com.tencent.mm.minigame.download.mmdownloader.k());
        hashSet.add(new ut0.d());
        hashSet.add(new la1.c());
        android.util.SparseArray sparseArray = new android.util.SparseArray(1);
        hashSet.add(new la1.g(sparseArray));
        hashSet.add(new la1.j(sparseArray));
        hashSet.add(new la1.k());
        hashSet.add(new zd.g());
        hashSet.add(new zd.h());
        hashSet.add(new be.e());
        hashSet.add(new ma1.i());
        hashSet.add(new ma1.h());
        hashSet.add(new ma1.m());
        hashSet.add(new ma1.n());
        hashSet.add(new com.tencent.mm.plugin.appbrand.jsapi.webview.t());
        hashSet.add(new com.tencent.mm.plugin.appbrand.jsapi.webview.d0());
        hashSet.add(new com.tencent.mm.plugin.appbrand.jsapi.webview.x());
        hashSet.add(new com.tencent.mm.plugin.appbrand.jsapi.appdownload.b0(com.tencent.mm.plugin.appbrand.vf.f90865e));
        hashSet.add(new la1.a());
        hashSet.add(new yc1.q(1, com.tencent.mm.plugin.appbrand.vf.f90862b));
        hashSet.add(new na1.e());
        hashSet.add(new ad1.e(0, com.tencent.mm.plugin.appbrand.vf.f90863c));
        hashSet.add(new com.tencent.mm.plugin.appbrand.jsapi.fd());
        hashSet.add(new com.tencent.mm.plugin.appbrand.jsapi.ed());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = (com.tencent.mm.plugin.appbrand.jsapi.k0) it.next();
            if (k0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(k0Var.k())) {
                hashMap.put(k0Var.k(), k0Var);
            }
        }
        for (java.lang.String str : la1.i.f317498a) {
            hashMap.remove(str);
        }
        return hashMap;
    }
}

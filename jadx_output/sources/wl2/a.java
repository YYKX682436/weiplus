package wl2;

/* loaded from: classes10.dex */
public final class a extends wl2.d {
    @Override // wl2.d
    public java.lang.String c() {
        return "InnerVersion_Karaoke";
    }

    @Override // wl2.d
    public int d() {
        return 5;
    }

    @Override // wl2.d
    public java.lang.String e() {
        return "LiveKaraokeSdk";
    }

    @Override // wl2.d
    public java.lang.String g() {
        return "KaraokeKTVSoLoader";
    }

    @Override // wl2.d
    public boolean i(com.tencent.wechat.aff.udr.x res) {
        kotlin.jvm.internal.o.g(res, "res");
        java.lang.String f17 = f(res.c() + "/lib_ktv_so", "live_karaoke", "liblive_karaoke.so");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isUnZipFileExit karaokePath: ");
        sb6.append(f17);
        com.tencent.mars.xlog.Log.i(this.f447052a, sb6.toString());
        return h(f17);
    }

    @Override // wl2.d
    public wl2.b l(com.tencent.wechat.aff.udr.x res) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(res, "res");
        jz5.l k17 = k(f(res.c() + "/lib_ktv_so", "live_karaoke", "liblive_karaoke.so"));
        java.lang.Object obj = k17.f302833d;
        if (((java.lang.Boolean) obj).booleanValue()) {
            dn0.b.f241826b = true;
            str = "";
        } else {
            str = "KaraokeSoLoadFail_" + ((java.lang.String) k17.f302834e);
        }
        com.tencent.mars.xlog.Log.i(this.f447052a, "loadSoResource loadKaraokeRes: " + k17);
        return new wl2.b(((java.lang.Boolean) obj).booleanValue(), str);
    }
}

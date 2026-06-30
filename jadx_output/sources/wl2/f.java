package wl2;

/* loaded from: classes10.dex */
public final class f extends wl2.d {
    @Override // wl2.d
    public java.lang.String c() {
        return "InnerVersion";
    }

    @Override // wl2.d
    public int d() {
        return 3;
    }

    @Override // wl2.d
    public java.lang.String e() {
        return "LiveKtvSdk";
    }

    @Override // wl2.d
    public java.lang.String g() {
        return "TMEKTVSoLoader";
    }

    @Override // wl2.d
    public boolean i(com.tencent.wechat.aff.udr.x res) {
        kotlin.jvm.internal.o.g(res, "res");
        java.lang.String str = res.c() + "/lib_ktv_so";
        java.lang.String f17 = f(str, "libktv/lib_singscore-release", "libsingscore.so");
        java.lang.String f18 = f(str, "libktv/lib_singreverb-release", "libsingreverb.so");
        com.tencent.mars.xlog.Log.i(this.f447052a, "isUnZipFileExit scorePath: " + f17 + " reverbPath: " + f18);
        return h(f17) && h(f18);
    }

    @Override // wl2.d
    public wl2.b l(com.tencent.wechat.aff.udr.x res) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(res, "res");
        java.lang.String str2 = res.c() + "/lib_ktv_so";
        jz5.l k17 = k(f(str2, "libktv/lib_singscore-release", "libsingscore.so"));
        java.lang.Object obj = k17.f302833d;
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tme.karaoke.lib_singscore.ScorerNativeBridge.Companion.getClass();
            oy5.f.f350094b = true;
            com.tme.karaoke.lib_singscore.ScorerNativeBridge.loadRet = true;
            str = "";
        } else {
            str = "ScoreSoLoadFail_" + ((java.lang.String) k17.f302834e);
        }
        jz5.l k18 = k(f(str2, "libktv/lib_singreverb-release", "libsingreverb.so"));
        java.lang.Object obj2 = k18.f302833d;
        if (((java.lang.Boolean) obj2).booleanValue()) {
            com.tme.karaoke.lib_singreverb.ReverbNativeBridge.Companion.getClass();
            com.tme.karaoke.lib_singreverb.ReverbNativeBridge.loadRet = true;
            ny5.d.f341479b = true;
        } else {
            if (str.length() > 0) {
                str = str + '\n';
            }
            str = str + "ReverbSoLoadFail" + ((java.lang.String) k18.f302834e);
        }
        com.tencent.mars.xlog.Log.i(this.f447052a, "loadSoResource loadScoreRes: " + k17 + " loadReverbRes: " + k18);
        return new wl2.b(((java.lang.Boolean) obj).booleanValue() && ((java.lang.Boolean) obj2).booleanValue(), str);
    }
}

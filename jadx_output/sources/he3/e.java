package he3;

@j95.b
/* loaded from: classes7.dex */
public final class e extends i95.w implements ie3.i {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f280902d = kz5.c0.i("MagicBrandService", "MagicAdBrandService", "MagicSclPublicService", "MagicAdPublicService", "MagicEcsPublicService", "MagicLiveCard", "MagicAdPlayableBasic", "MagicFinderCard", "MagicWxGameDynamicCard", "MagicNewAdPlayableBasic", "MagicAdMiniProgram", "MagicEcsKFDynamicCard", "MagicEcsTimeline", "MagicEcsShop", "MagicEcsTimelineSubscribe");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public final ge3.a Ai(java.lang.String str) {
        switch (str.hashCode()) {
            case -1856181282:
                if (str.equals("MagicAdBrandService")) {
                    return ge3.b.f270957a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case -1458983536:
                if (str.equals("MagicAdPlayableBasic")) {
                    return ge3.d.f270959a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case -1080459429:
                if (str.equals("MagicBrandService")) {
                    return ge3.f.f270961a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case -758174339:
                if (str.equals("MagicAdMiniProgram")) {
                    return ge3.c.f270958a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case -358306365:
                if (str.equals("MagicFinderCard")) {
                    return ge3.l.f270967a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case -230524450:
                if (str.equals("MagicEcsShop")) {
                    return ge3.i.f270964a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case -135437446:
                if (str.equals("MagicNativeFinderCard")) {
                    return ge3.m.f270968a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case -39249060:
                if (str.equals("MagicAdPublicService")) {
                    return ge3.e.f270960a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case 327252516:
                if (str.equals("MagicEcsPublicService")) {
                    return ge3.h.f270963a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case 531775882:
                if (str.equals("MagicNewAdPlayableBasic")) {
                    return ge3.n.f270969a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case 1013651709:
                if (str.equals("MagicSclPublicService")) {
                    return ge3.q.f270972a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case 1334558505:
                if (str.equals("MagicEcsTimeline")) {
                    return ge3.j.f270965a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case 1600980335:
                if (str.equals("MagicWxGameDynamicCard")) {
                    return ge3.p.f270971a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case 1889897161:
                if (str.equals("MagicLiveCard")) {
                    return ge3.r.f270973a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case 1898010060:
                if (str.equals("MagicEcsKFDynamicCard")) {
                    return ge3.g.f270962a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            case 2116041761:
                if (str.equals("MagicEcsTimelineSubscribe")) {
                    return ge3.k.f270966a;
                }
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
            default:
                com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "getAssetObject error, bizName invalid :".concat(str));
                return null;
        }
    }

    public final int Bi(java.lang.String str) {
        long c17;
        if (cj(str)) {
            ge3.a Ai = Ai(str);
            if (Ai == null) {
                return -1;
            }
            c17 = Ai.d();
        } else {
            ge3.a Ai2 = Ai(str);
            if (Ai2 == null) {
                return -1;
            }
            c17 = Ai2.c();
        }
        return (int) c17;
    }

    public final java.lang.String Di(java.lang.String str) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_boot").getString(Ui(str), "");
        if (string == null) {
            string = "";
        }
        if (u46.l.f(string)) {
            return string;
        }
        com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "boot appConfig null, reset and re-try");
        hj(str, -1);
        Ni(str);
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_boot").getString(Ui(str), "");
        return string2 != null ? string2 : "";
    }

    public final int Ni(java.lang.String str) {
        java.lang.String str2;
        int i17 = com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_boot_version").getInt(Ui(str), -1);
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo Ni = ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Ni(r26.n0.s0(str, "-", str));
        int parseInt = (Ni == null || (str2 = Ni.f147866o) == null) ? -1 : java.lang.Integer.parseInt(str2);
        java.lang.String str3 = Ni != null ? Ni.f147867p : null;
        if (str3 == null) {
            str3 = "";
        }
        if (i17 == -1 || parseInt == -1 || i17 != parseInt) {
            com.tencent.mars.xlog.Log.w("MircoMsg.MagicPkgConfigFeature", "getBootPkgAppConfig version invalid, maybe account initialized, cachedBootVersion:" + i17 + ", currentBootVersion:" + parseInt);
            mj(str, parseInt, str3);
        }
        return parseInt;
    }

    public final java.lang.String Ri(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.lang.String s07 = r26.n0.s0(bizName, "-", bizName);
        if (kotlin.jvm.internal.o.b(s07, "MagicLiveCard")) {
            s07 = "wxe208ce76dfa39515";
        } else if (kotlin.jvm.internal.o.b(s07, "MagicSclPublicService")) {
            s07 = "wx2f3fb5db9f226462";
        }
        return ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Di() + "mbpkgs/" + s07 + ".wspkg";
    }

    public final java.lang.String Ui(java.lang.String instanceName) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        java.lang.String lowerCase = r26.n0.s0(instanceName, "-", instanceName).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public java.lang.String Vi(java.lang.String bizName) {
        int Ni;
        java.lang.String b17;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.lang.String s07 = r26.n0.s0(bizName, "-", bizName);
        if (kotlin.jvm.internal.o.b(s07, "MagicNewAdPlayable")) {
            s07 = "MagicNewAdPlayableBasic";
        }
        java.lang.String str = "";
        if (pj(s07)) {
            com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "use debug appConfig.bizName: ".concat(s07));
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_debug").getString(Ui(s07), "");
            return string == null ? "" : string;
        }
        if (cj(s07)) {
            Ni = aj(s07);
            com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "getUdrPkgVersion, bizName: " + s07 + ", udr version: " + Ni);
        } else {
            Ni = Ni(s07);
            com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "getBootPkgVersion, bizName: " + s07 + ", boot version: " + Ni);
        }
        if (Ni > Bi(s07)) {
            com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "use remote pkg, bizName: ".concat(s07));
            return cj(s07) ? Zi(s07) : Di(s07);
        }
        com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "use asset pkg, bizName: ".concat(s07));
        ge3.a Ai = Ai(s07);
        if (Ai != null && (b17 = Ai.b()) != null) {
            str = b17;
        }
        return str;
    }

    public final java.lang.String Zi(java.lang.String str) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_udr").getString(Ui(str), "");
        if (string == null) {
            string = "";
        }
        if (u46.l.f(string)) {
            return string;
        }
        com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "udr appConfig null, reset and re-try");
        ij(str, -1);
        aj(str);
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_udr").getString(Ui(str), "");
        return string2 != null ? string2 : "";
    }

    public final int aj(java.lang.String str) {
        int i17 = com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_udr_version").getInt(Ui(str), -1);
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(jc3.w0.f299010a.b(str), str);
        java.lang.Number valueOf = Ui != null ? java.lang.Long.valueOf(Ui.f217590e) : -1;
        java.lang.String path = Ui != null ? Ui.getPath() : null;
        if (path == null) {
            path = "";
        }
        if (i17 == -1 || kotlin.jvm.internal.o.b(valueOf, -1) || !(valueOf instanceof java.lang.Integer) || i17 != valueOf.intValue()) {
            com.tencent.mars.xlog.Log.w("MircoMsg.MagicPkgConfigFeature", "getUdrPkgAppConfig version invalid, maybe account initialized, cachedUdrVersion:" + i17 + ",currentUdrVersion:" + valueOf + ' ');
            oj(str, valueOf.intValue(), path);
        }
        return valueOf.intValue();
    }

    public java.lang.String bj(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.lang.String Vi = Vi(bizName);
        if (r26.n0.N(Vi)) {
            com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "pkgConfig is null");
            return "";
        }
        try {
            java.lang.String optString = new org.json.JSONObject(Vi).optString("version", "");
            kotlin.jvm.internal.o.d(optString);
            return optString;
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public final boolean cj(java.lang.String str) {
        return kotlin.jvm.internal.o.b(jc3.w0.f299010a.a(str), java.lang.Boolean.TRUE);
    }

    public final com.tencent.mm.plugin.appbrand.appstorage.y0 fj(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(str);
        if (y8Var.a()) {
            return new com.tencent.mm.plugin.appbrand.appstorage.n3(y8Var);
        }
        com.tencent.mars.xlog.Log.w("MircoMsg.MagicPkgConfigFeature", "provideWxaFileSystem readInfo error calculateMD5:" + com.tencent.mm.vfs.w6.p(str));
        return null;
    }

    public final void hj(java.lang.String str, int i17) {
        com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_boot_version").putInt(Ui(str), i17);
    }

    public final void ij(java.lang.String str, int i17) {
        com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_udr_version").putInt(Ui(str), i17);
    }

    public java.lang.String mj(java.lang.String pkgIdOrBizName, int i17, java.lang.String wxaPkgPath) {
        kotlin.jvm.internal.o.g(pkgIdOrBizName, "pkgIdOrBizName");
        kotlin.jvm.internal.o.g(wxaPkgPath, "wxaPkgPath");
        if (kotlin.jvm.internal.o.b(pkgIdOrBizName, "wxe208ce76dfa39515")) {
            pkgIdOrBizName = "MagicLiveCard";
        } else if (kotlin.jvm.internal.o.b(pkgIdOrBizName, "wx2f3fb5db9f226462")) {
            pkgIdOrBizName = "MagicSclPublicService";
        }
        if (i17 < 0) {
            com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_boot").putString(Ui(pkgIdOrBizName), "");
            hj(pkgIdOrBizName, i17);
            return "";
        }
        com.tencent.mm.plugin.appbrand.appstorage.y0 fj6 = fj(wxaPkgPath);
        if (fj6 != null) {
            java.lang.String e17 = bf3.r0.e(fj6, "/app-config.json");
            com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_boot").putString(Ui(pkgIdOrBizName), e17);
            hj(pkgIdOrBizName, i17);
            com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "saveBootPkgAppConfig success, bizName:".concat(pkgIdOrBizName));
            return e17;
        }
        com.tencent.mars.xlog.Log.w("MircoMsg.MagicPkgConfigFeature", "saveBootPkgAppConfig error, bizName:" + pkgIdOrBizName + ", version:" + i17 + ", path:" + wxaPkgPath);
        com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_boot").putString(Ui(pkgIdOrBizName), "");
        hj(pkgIdOrBizName, -1);
        return "";
    }

    public java.lang.String nj(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        if (kotlin.jvm.internal.o.b(appId, "wxe208ce76dfa39515")) {
            appId = "MagicLiveCard";
        } else if (kotlin.jvm.internal.o.b(appId, "wx2f3fb5db9f226462")) {
            appId = "MagicSclPublicService";
        }
        com.tencent.mm.plugin.appbrand.appstorage.y0 fj6 = fj(Ri(appId));
        if (fj6 == null) {
            com.tencent.mars.xlog.Log.e("MircoMsg.MagicPkgConfigFeature", "saveDebugPkgAppConfig error, bizName:".concat(appId));
            com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_debug").putString(Ui(appId), "");
            return "";
        }
        java.lang.String e17 = bf3.r0.e(fj6, "/app-config.json");
        com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_debug").putString(Ui(appId), e17);
        com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "saveDebugPkgAppConfig success, bizName:".concat(appId));
        return e17;
    }

    public final java.lang.String oj(java.lang.String str, int i17, java.lang.String str2) {
        if (i17 < 0) {
            com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_udr").putString(Ui(str), "");
            ij(str, i17);
            return "";
        }
        com.tencent.mm.plugin.appbrand.appstorage.y0 fj6 = fj(str2);
        if (fj6 != null) {
            java.lang.String e17 = bf3.r0.e(fj6, "/app-config.json");
            com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_udr").putString(Ui(str), e17);
            ij(str, i17);
            com.tencent.mars.xlog.Log.i("MircoMsg.MagicPkgConfigFeature", "saveUdrPkgAppConfig success, bizName:".concat(str));
            return e17;
        }
        com.tencent.mars.xlog.Log.w("MircoMsg.MagicPkgConfigFeature", "saveUdrPkgAppConfig error, bizName:" + str + ", version:" + i17 + ", path:" + str2);
        com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_udr").putString(Ui(str), "");
        ij(str, -1);
        return "";
    }

    public boolean pj(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) && com.tencent.mm.vfs.w6.j(Ri(bizName));
    }

    public void wi(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        if (kotlin.jvm.internal.o.b(bizName, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)) {
            com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_debug").d();
        } else {
            com.tencent.mm.sdk.platformtools.o4.M("magic_pkg_app_config_debug").remove(Ui(bizName));
        }
    }
}

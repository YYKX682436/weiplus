package com.tencent.xweb;

/* loaded from: classes13.dex */
public class c extends com.tencent.xweb.b {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.xweb.c f220217d;

    public static synchronized com.tencent.xweb.c z() {
        com.tencent.xweb.c cVar;
        synchronized (com.tencent.xweb.c.class) {
            if (f220217d == null) {
                com.tencent.xweb.c cVar2 = new com.tencent.xweb.c();
                f220217d = cVar2;
                cVar2.q();
            }
            cVar = f220217d;
        }
        return cVar;
    }

    public final java.lang.String A() {
        if ("appbrand".equalsIgnoreCase(org.xwalk.core.XWalkEnvironment.m("tools"))) {
            by5.c4.f("CommandCfgPlugin", "getSafeModuleForFileReader, use module appbrand");
            return "appbrand";
        }
        by5.c4.f("CommandCfgPlugin", "getSafeModuleForFileReader, use module tools");
        return "tools";
    }

    @Override // com.tencent.xweb.b
    public void b(by5.h[] hVarArr, java.lang.String str, boolean z17) {
        java.lang.String str2;
        if (str == null) {
            by5.c4.f("CommandCfgPlugin", "applyCommandInternal, invalid configVersion");
            return;
        }
        by5.c4.f("CommandCfgPlugin", "applyCommandInternal, configVersion:" + str + ", isRecheck:" + z17);
        e();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (hVarArr == null || hVarArr.length == 0) {
            by5.c4.g("CommandCfgPlugin", "applyCommandInternal, empty new command configs");
            t(str, hashMap);
            return;
        }
        for (int i17 = 0; i17 < hVarArr.length; i17++) {
            by5.h hVar = hVarArr[i17];
            if (hVar != null && (!z17 || !"revertToVersion".equals(hVar.f36472b))) {
                by5.c4.f("CommandCfgPlugin", ">>> applyCommand, command[" + i17 + "]:" + hVarArr[i17]);
                if (!hVarArr[i17].f36471a.a(false, false, "CommandCfgPlugin")) {
                    by5.c4.g("CommandCfgPlugin", "<<< applyCommand, command[" + i17 + "] not match");
                } else if (by5.f.a(hVarArr[i17]).f220205a) {
                    by5.c4.f("CommandCfgPlugin", "<<< applyCommand, command[" + i17 + "] handled");
                } else {
                    by5.h hVar2 = hVarArr[i17];
                    if (hVar2.f36473c != null && (str2 = hVar2.f36474d) != null && !str2.isEmpty()) {
                        by5.c4.g("CommandCfgPlugin", "<<< applyCommand, apply command[" + i17 + "]:" + a(hVarArr[i17], hashMap, hVarArr[i17].f36474d.split(",")));
                    }
                }
            }
        }
        t(str, hashMap);
    }

    @Override // com.tencent.xweb.b
    public java.lang.String n() {
        return "CommandCfgPlugin";
    }

    @Override // com.tencent.xweb.b
    public android.content.SharedPreferences o() {
        return by5.d4.a("XWEB.CMDCFG.PLUGIN", false);
    }

    @Override // com.tencent.xweb.b
    public android.content.SharedPreferences p() {
        return by5.d4.a("XWEB.CMDCFG.PLUGIN.LATEST", false);
    }

    public boolean v(boolean z17) {
        try {
            java.lang.String g17 = g("download_when_not_install", A());
            if (g17 != null && !g17.isEmpty()) {
                return java.lang.Boolean.parseBoolean(g17);
            }
            by5.c4.f("CommandCfgPlugin", "canDownloadWhenNotInstall cmd is empty, return defValue = " + z17);
            return z17;
        } catch (java.lang.Throwable th6) {
            by5.c4.c("CommandCfgPlugin", "canDownloadWhenNotInstall error, return defValue = " + z17 + ", errorMsg = " + th6.getMessage());
            return z17;
        }
    }

    public com.tencent.xweb.i w(java.lang.String str) {
        com.tencent.xweb.i iVar = com.tencent.xweb.i.auto;
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    java.lang.String g17 = g("audio_player_strategy_" + str.toLowerCase(), A());
                    if (g17 != null && !g17.isEmpty()) {
                        return com.tencent.xweb.i.valueOf(g17);
                    }
                    return iVar;
                }
            } catch (java.lang.Throwable th6) {
                by5.c4.c("CommandCfgPlugin", "getAudioPlayerStrategy error:" + th6.getMessage());
            }
        }
        return iVar;
    }

    public com.tencent.xweb.m x(java.lang.String str, java.lang.String str2) {
        java.lang.String g17 = g("use_office_reader_" + str.toLowerCase(), str2);
        com.tencent.xweb.m mVar = com.tencent.xweb.m.none;
        if (g17 == null) {
            return mVar;
        }
        if (!g17.isEmpty()) {
            try {
            } catch (java.lang.Throwable unused) {
                return mVar;
            }
        }
        return com.tencent.xweb.m.valueOf(g17);
    }

    public com.tencent.xweb.k y(java.lang.String str, java.lang.String str2) {
        java.lang.String g17 = g("fr_" + str.toLowerCase(), str2);
        com.tencent.xweb.k kVar = com.tencent.xweb.k.NONE;
        if (g17 == null) {
            return kVar;
        }
        if (!g17.isEmpty()) {
            try {
            } catch (java.lang.Throwable unused) {
                return kVar;
            }
        }
        return com.tencent.xweb.k.valueOf(g17);
    }
}

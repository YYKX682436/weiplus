package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class o2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f220366a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f220367b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f220368c = "Default";

    /* renamed from: d, reason: collision with root package name */
    public static boolean f220369d;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a() {
        /*
            boolean r0 = com.tencent.xweb.WebView.f220193q
            if (r0 == 0) goto L2f
            boolean r0 = com.tencent.xweb.WebView.y0()
            if (r0 == 0) goto L2f
            vx5.l r0 = vx5.k.f441374a
            java.lang.Class<com.tencent.xweb.j1> r1 = com.tencent.xweb.j1.class
            monitor-enter(r1)
            int r2 = com.tencent.xweb.j1.f220318b     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 80035(0x138a3, float:1.12153E-40)
            java.lang.Object r0 = r0.g(r2, r1)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L2f
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L30
        L2c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L2f:
            r0 = 1
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "canModifyProfileNameNow, isXWebCoreInited:"
            r1.<init>(r2)
            boolean r2 = com.tencent.xweb.WebView.f220193q
            r1.append(r2)
            java.lang.String r2 = ", isXWebView:"
            r1.append(r2)
            boolean r2 = com.tencent.xweb.WebView.y0()
            r1.append(r2)
            java.lang.String r2 = ", PinusCount:"
            r1.append(r2)
            java.lang.Class<com.tencent.xweb.j1> r2 = com.tencent.xweb.j1.class
            monitor-enter(r2)
            int r3 = com.tencent.xweb.j1.f220318b     // Catch: java.lang.Throwable -> L68
            monitor-exit(r2)
            r1.append(r3)
            java.lang.String r2 = ", ret:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "XWebMultiProfile"
            by5.c4.f(r2, r1)
            return r0
        L68:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.o2.a():boolean");
    }

    public static synchronized void b() {
        synchronized (com.tencent.xweb.o2.class) {
            if (f220369d) {
                return;
            }
            f220369d = true;
            android.content.SharedPreferences a17 = by5.d4.a("xweb_multi_profile", false);
            com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
            if (by5.d4.e().getInt("multiProfileMode", -1) != -1) {
                by5.c4.c("XWebMultiProfile", "initMultiProfile, debug mode:" + by5.d4.e().getInt("multiProfileMode", -1));
                if (by5.d4.e().getInt("multiProfileMode", -1) == 1) {
                    d(true, a17);
                    return;
                } else if (by5.d4.e().getInt("multiProfileMode", -1) == 0) {
                    d(false, a17);
                    return;
                }
            }
            if (by5.a1.c()) {
                if (com.tencent.xweb.b.m().h("multi_profile_switch", com.tencent.xweb.WebView.getModuleName(), false)) {
                    by5.c4.f("XWebMultiProfile", "initMultiProfile, return true.");
                    d(true, a17);
                    return;
                } else {
                    by5.c4.c("XWebMultiProfile", "initMultiProfile, config switch has been turned off.");
                    d(false, a17);
                    return;
                }
            }
            boolean c17 = c();
            by5.c4.c("XWebMultiProfile", "initMultiProfile, only main process can update multi profile mmkv, isSupportMMSP: " + c17);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c17);
            android.os.Bundle bundle = org.xwalk.core.XWalkEnvironment.f347979l;
            synchronized (bundle) {
                bundle.putBoolean("multiProfile", valueOf.booleanValue());
            }
        }
    }

    public static boolean c() {
        if (f220366a == null) {
            android.content.SharedPreferences a17 = by5.d4.a("xweb_multi_profile", false);
            if (a17 == null) {
                by5.c4.f("XWebMultiProfile", "isSupportMultiProfile, sp is null");
                return false;
            }
            f220366a = java.lang.Boolean.valueOf(a17.getBoolean("SP_KEY_MULTI_PROFILE", false));
            by5.c4.f("XWebMultiProfile", "isSupportMultiProfile, sIsSupportMultiProfile: " + f220366a);
        }
        return f220366a.booleanValue();
    }

    public static void d(boolean z17, android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            by5.c4.f("XWebMultiProfile", "saveMultiProfileStateIfNeed, set sp key: SP_KEY_MULTI_PROFILE, value: " + z17);
            sharedPreferences.edit().putBoolean("SP_KEY_MULTI_PROFILE", z17).commit();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            android.os.Bundle bundle = org.xwalk.core.XWalkEnvironment.f347979l;
            synchronized (bundle) {
                bundle.putBoolean("multiProfile", valueOf.booleanValue());
            }
            f220366a = java.lang.Boolean.valueOf(z17);
        } else {
            by5.c4.f("XWebMultiProfile", "saveMultiProfileStateIfNeed, sp is null");
            f220366a = java.lang.Boolean.FALSE;
        }
        zx5.i0.d("multi_profile_update", f220366a.booleanValue() ? 1 : 0, 0);
    }

    public static synchronized boolean e(java.lang.String str) {
        boolean f17;
        synchronized (com.tencent.xweb.o2.class) {
            b();
            f17 = f(str, false);
            if (!f17) {
                xx5.l.a(0, 1, c());
            }
        }
        return f17;
    }

    public static synchronized boolean f(java.lang.String str, boolean z17) {
        synchronized (com.tencent.xweb.o2.class) {
            by5.c4.f("XWebMultiProfile", "setProfileNameInner, profileName:" + str);
            if (str != null && !str.isEmpty()) {
                f220367b = str;
                if (!c() && !z17) {
                    by5.c4.c("XWebMultiProfile", "setProfileNameInner, Command switch not turned on, use Default.");
                    return false;
                }
                if (f220368c.equals(str)) {
                    by5.c4.f("XWebMultiProfile", "setProfileNameInner, profileName: " + str + " has already been set.");
                    return true;
                }
                if (!f220368c.equals("Default") && !z17) {
                    by5.c4.c("XWebMultiProfile", "setProfileNameInner, dangerous multiple times call, old profileName: " + f220368c + ", new profileName: " + str);
                    xx5.l.a(1, 1, c());
                }
                if (!a()) {
                    by5.c4.c("XWebMultiProfile", "setProfileNameInner, current pinus state does not support profile name changes.");
                    xx5.l.a(12, 1, c());
                }
                f220368c = str;
                if (!com.tencent.xweb.WebView.f220193q) {
                    by5.c4.f("XWebMultiProfile", "setProfileNameInner, may not have finished initializing.");
                    android.os.Bundle bundle = org.xwalk.core.XWalkEnvironment.f347979l;
                    synchronized (bundle) {
                        bundle.putString("profileName", str);
                    }
                    return true;
                }
                try {
                    tx5.i c17 = tx5.j.c(com.tencent.xweb.WebView.getCurrentModuleLastInitWebCoreType());
                    if (c17 != null) {
                        synchronized (com.tencent.xweb.WebView.class) {
                            by5.a1.e(new com.tencent.xweb.WebView$$a(c17));
                        }
                    }
                    if (com.tencent.xweb.WebView.y0()) {
                        com.tencent.xweb.q2.c("profile-name", str);
                    } else {
                        by5.c4.f("XWebMultiProfile", "setProfileNameInner, Sys webview only need update ProfileStore.");
                    }
                    return true;
                } catch (java.lang.Exception e17) {
                    by5.c4.d("XWebMultiProfile", "setProfileNameInner, XWeb error:", e17);
                    return false;
                }
            }
            return false;
        }
    }
}

package com.tencent.mm.plugin.game.commlib;

/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse f139381a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f139382b;

    public static boolean a() {
        if (e() == null) {
            s();
            return false;
        }
        m53.e6 e6Var = f139381a.WepkgControl;
        if (e6Var != null) {
            return e6Var.f323661d;
        }
        return false;
    }

    public static m53.t b() {
        if (e() == null) {
            s();
            return null;
        }
        m53.l1 l1Var = f139381a.GameLifeSetting;
        if (l1Var != null) {
            return l1Var.f323866n;
        }
        return null;
    }

    public static java.lang.String c() {
        return com.tencent.mm.plugin.game.commlib.util.m.d() + "globalconfig";
    }

    public static org.json.JSONArray d() {
        m53.r0 r0Var;
        java.util.LinkedList linkedList;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (e() != null) {
            r0Var = f139381a.GameCommunityInfo;
        } else {
            s();
            r0Var = null;
        }
        if (r0Var != null && (linkedList = r0Var.f323999d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                m53.e eVar = (m53.e) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("appId", eVar.f323637d);
                    jSONObject.put("gameName", eVar.f323638e);
                    jSONObject.put("albumName", eVar.f323639f);
                    jSONObject.put("defaultTitle", eVar.f323640g);
                } catch (org.json.JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public static com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse e() {
        if (!f139382b) {
            s();
        }
        return f139381a;
    }

    public static m53.v0 f() {
        e();
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = f139381a;
        if (getGameCenterGlobalSettingResponse == null) {
            s();
            return null;
        }
        m53.v0 v0Var = getGameCenterGlobalSettingResponse.GameDetailSetting;
        if (v0Var == null) {
            return v0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigManager", "getGameDetailSettingControl jumpType:%d, jumpUrl:%s", java.lang.Integer.valueOf(v0Var.f324116d), v0Var.f324117e);
        return v0Var;
    }

    public static m53.e1 g() {
        e();
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = f139381a;
        if (getGameCenterGlobalSettingResponse == null) {
            s();
            return null;
        }
        m53.e1 e1Var = getGameCenterGlobalSettingResponse.GameIndexSetting;
        if (e1Var == null) {
            return e1Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigManager", "getGameIndexSettingControl jumpType:%d, jumpUrl:%s", java.lang.Integer.valueOf(e1Var.f323642d), e1Var.f323643e);
        return e1Var;
    }

    public static m53.m h() {
        if (e() == null) {
            s();
            return null;
        }
        m53.l1 l1Var = f139381a.GameLifeSetting;
        if (l1Var != null) {
            return l1Var.f323864i;
        }
        return null;
    }

    public static m53.l1 i() {
        if (e() == null) {
            s();
            return null;
        }
        m53.l1 l1Var = f139381a.GameLifeSetting;
        if (l1Var != null) {
            return l1Var;
        }
        return null;
    }

    public static m53.a4 j() {
        if (e() != null) {
            m53.a4 a4Var = f139381a.MessageExposureStrategy;
            if (a4Var != null) {
                return a4Var;
            }
        } else {
            s();
        }
        m53.a4 a4Var2 = new m53.a4();
        a4Var2.f323560d = 12;
        a4Var2.f323562f = 7200;
        a4Var2.f323564h = 0;
        a4Var2.f323561e = 300;
        a4Var2.f323563g = null;
        return a4Var2;
    }

    public static m53.q0 k() {
        e();
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = f139381a;
        if (getGameCenterGlobalSettingResponse == null) {
            s();
            return null;
        }
        m53.q0 q0Var = getGameCenterGlobalSettingResponse.GameCenterTabSetting;
        if (q0Var != null) {
            return q0Var;
        }
        return null;
    }

    public static m53.v3 l() {
        if (e() != null) {
            return f139381a.LiteApp;
        }
        s();
        return null;
    }

    public static m53.b4 m() {
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = f139381a;
        if (getGameCenterGlobalSettingResponse != null) {
            m53.b4 b4Var = getGameCenterGlobalSettingResponse.MessagePullStrategy;
            if (b4Var != null) {
                return b4Var;
            }
        } else {
            s();
        }
        return null;
    }

    public static m53.c4 n() {
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = f139381a;
        if (getGameCenterGlobalSettingResponse != null) {
            m53.c4 c4Var = getGameCenterGlobalSettingResponse.MessageVerifyStrategy;
            if (c4Var != null) {
                return c4Var;
            }
        } else {
            s();
        }
        return null;
    }

    public static boolean o() {
        boolean equalsIgnoreCase;
        e();
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = f139381a;
        if (getGameCenterGlobalSettingResponse != null) {
            equalsIgnoreCase = getGameCenterGlobalSettingResponse.ShowEntrance;
        } else {
            s();
            java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigManager", "getShowEntrance, lang = %s", o17);
            java.lang.String str = "zh_CN".equals(o17) ? "0" : "1";
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("HideGameCenter");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (d17 != null) {
                str = d17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigManager", "hide game center:[%s]", str);
            equalsIgnoreCase = str.equalsIgnoreCase("0");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigManager", "getShowEntrance : " + equalsIgnoreCase);
        return equalsIgnoreCase;
    }

    public static m53.i5 p() {
        if (e() == null) {
            s();
            return null;
        }
        m53.i5 i5Var = f139381a.StatusBarStyle;
        if (i5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigManager", "getStatusBarStyle color:%s, darkModeColor:%s, style:%s", i5Var.f323795d, i5Var.f323797f, i5Var.f323796e);
        }
        return f139381a.StatusBarStyle;
    }

    public static int q() {
        if (e() == null) {
            s();
            return 3600;
        }
        m53.d6 d6Var = f139381a.WebViewControl;
        if (d6Var != null) {
            return d6Var.f323636d;
        }
        return 3600;
    }

    public static java.lang.Boolean r() {
        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).getClass();
        if (!((c01.z1.h() & 2048) != 2048)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigManager", "GameReddot dont show reddot! ReddotService interrupt");
            return java.lang.Boolean.TRUE;
        }
        m53.a4 j17 = j();
        if (j17 != null && j17.f323563g != null) {
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
            m53.i0 i0Var = j17.f323563g;
            if (i17 >= i0Var.f323774d && i17 <= i0Var.f323775e) {
                return java.lang.Boolean.TRUE;
            }
        }
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void s() {
        /*
            java.lang.String r0 = "parseConfigFile, cost: "
            java.lang.String r1 = "parseGlobalConfig: gameConfigResp.parseFrom"
            java.lang.String r2 = "parseGlobalConfig: "
            java.lang.String r3 = "parseGlobalConfig: "
            java.lang.Class<com.tencent.mm.plugin.game.commlib.i> r4 = com.tencent.mm.plugin.game.commlib.i.class
            monitor-enter(r4)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r5 = com.tencent.mm.plugin.game.commlib.i.f139381a     // Catch: java.lang.Throwable -> Lc6
            if (r5 == 0) goto L11
            monitor-exit(r4)
            return
        L11:
            r5 = 1
            com.tencent.mm.plugin.game.commlib.i.f139382b = r5     // Catch: java.lang.Throwable -> Lc6
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc6
            com.tencent.mm.vfs.r6 r7 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r8 = c()     // Catch: java.lang.Throwable -> Lc6
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lc6
            boolean r8 = r7.m()     // Catch: java.lang.Throwable -> Lc6
            if (r8 != 0) goto L29
            monitor-exit(r4)
            return
        L29:
            r8 = 0
            com.tencent.mm.vfs.u6 r9 = new com.tencent.mm.vfs.u6     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L49
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L49
            long r10 = r7.C()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            byte[] r8 = new byte[r10]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            r9.read(r8)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            r9.close()     // Catch: java.io.IOException -> L66 java.lang.Throwable -> Lc6
            goto L66
        L3d:
            r0 = move-exception
            r8 = r9
            goto Lc0
        L41:
            r10 = move-exception
            r13 = r9
            r9 = r8
            r8 = r13
            goto L4b
        L46:
            r0 = move-exception
            goto Lc0
        L49:
            r10 = move-exception
            r9 = r8
        L4b:
            java.lang.String r11 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r10.getMessage()     // Catch: java.lang.Throwable -> L46
            r12.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r12.toString()     // Catch: java.lang.Throwable -> L46
            com.tencent.mars.xlog.Log.e(r11, r3)     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L65
            r8.close()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> Lc6
        L65:
            r8 = r9
        L66:
            if (r8 != 0) goto L6a
            monitor-exit(r4)
            return
        L6a:
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = new com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse     // Catch: java.lang.Exception -> L75 java.lang.OutOfMemoryError -> L8f java.lang.Throwable -> Lc6
            r3.<init>()     // Catch: java.lang.Exception -> L75 java.lang.OutOfMemoryError -> L8f java.lang.Throwable -> Lc6
            com.tencent.mm.plugin.game.commlib.i.f139381a = r3     // Catch: java.lang.Exception -> L75 java.lang.OutOfMemoryError -> L8f java.lang.Throwable -> Lc6
            r3.parseFrom(r8)     // Catch: java.lang.Exception -> L75 java.lang.OutOfMemoryError -> L8f java.lang.Throwable -> Lc6
            goto La8
        L75:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> Lc6
            r8.append(r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> Lc6
            com.tencent.mars.xlog.Log.e(r3, r1)     // Catch: java.lang.Throwable -> Lc6
            r7.l()     // Catch: java.lang.Throwable -> Lc6
            goto La8
        L8f:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Lc6
            r8.append(r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> Lc6
            com.tencent.mars.xlog.Log.e(r3, r1)     // Catch: java.lang.Throwable -> Lc6
            r7.l()     // Catch: java.lang.Throwable -> Lc6
        La8:
            java.lang.String r1 = "MicroMsg.GameConfigManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lc6
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc6
            long r7 = r7 - r5
            r2.append(r7)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lc6
            com.tencent.mars.xlog.Log.i(r1, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r4)
            return
        Lc0:
            if (r8 == 0) goto Lc5
            r8.close()     // Catch: java.io.IOException -> Lc5 java.lang.Throwable -> Lc6
        Lc5:
            throw r0     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.commlib.i.s():void");
    }
}

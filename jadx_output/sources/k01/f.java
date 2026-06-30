package k01;

/* loaded from: classes9.dex */
public abstract class f {
    /* JADX WARN: Can't wrap try/catch for region: R(9:9|(2:11|(7:15|16|17|18|(1:20)|21|22))|26|16|17|18|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeAppPrivateMessageNativeExtraData", r0, "", new java.lang.Object[0]);
        r0 = "{}";
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[Catch: JSONException -> 0x006c, TryCatch #0 {JSONException -> 0x006c, blocks: (B:18:0x0054, B:20:0x0062, B:21:0x0067), top: B:17:0x0054 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent r8, ot0.q r9) {
        /*
            if (r8 == 0) goto L94
            if (r9 == 0) goto L94
            java.lang.Class<ot0.a> r0 = ot0.a.class
            ot0.h r0 = r9.y(r0)
            ot0.a r0 = (ot0.a) r0
            if (r0 == 0) goto L1c
            java.lang.String r1 = r0.f348365u
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto L1c
            am.nx r1 = r8.f54857g
            java.lang.String r2 = r0.f348365u
            r1.F = r2
        L1c:
            if (r0 == 0) goto L7c
            boolean r0 = r0.f348367w
            l15.c r1 = new l15.c
            r1.<init>()
            java.lang.String r2 = r9.I2
            r1.fromXml(r2)
            v05.b r1 = r1.k()
            r2 = 0
            if (r1 == 0) goto L51
            int r4 = r1.f432315e
            int r5 = r4 + 74
            com.tencent.mm.protobuf.f r5 = r1.getCustom(r5)
            w05.h r5 = (w05.h) r5
            if (r5 == 0) goto L51
            int r4 = r4 + 74
            com.tencent.mm.protobuf.f r1 = r1.getCustom(r4)
            w05.h r1 = (w05.h) r1
            int r1 = r1.n()
            if (r1 <= 0) goto L51
            long r4 = java.lang.System.currentTimeMillis()
            goto L52
        L51:
            r4 = r2
        L52:
            am.nx r1 = r8.f54857g
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6c
            r6.<init>()     // Catch: org.json.JSONException -> L6c
            java.lang.String r7 = "isPrivateMessage"
            r6.put(r7, r0)     // Catch: org.json.JSONException -> L6c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L67
            java.lang.String r0 = "click_timestamp"
            r6.put(r0, r4)     // Catch: org.json.JSONException -> L6c
        L67:
            java.lang.String r0 = r6.toString()     // Catch: org.json.JSONException -> L6c
            goto L7a
        L6c:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.WeAppPrivateMessageNativeExtraData"
            java.lang.String r4 = ""
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r0, r4, r2)
            java.lang.String r0 = "{}"
        L7a:
            r1.G = r0
        L7c:
            java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.g0> r0 = com.tencent.mm.pluginsdk.ui.tools.g0.class
            ot0.h r9 = r9.y(r0)
            com.tencent.mm.pluginsdk.ui.tools.g0 r9 = (com.tencent.mm.pluginsdk.ui.tools.g0) r9
            if (r9 == 0) goto L94
            java.lang.String r0 = r9.f191639k
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L94
            am.nx r8 = r8.f54857g
            java.lang.String r9 = r9.f191639k
            r8.f7481p = r9
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k01.f.a(com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent, ot0.q):void");
    }

    public static void b(com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent, ot0.q qVar) {
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7473h = qVar.f348677k2;
        nxVar.f7466a = qVar.f348673j2;
        nxVar.f7467b = qVar.f348669i2;
        int i17 = qVar.f348737z2;
        nxVar.f7468c = i17;
        nxVar.f7477l = qVar.f348685m2;
        nxVar.f7474i = qVar.A2;
        nxVar.f7480o.f70419h = qVar.f348717u2;
        nxVar.f7478m = i17 != 0;
    }

    public static void c(java.lang.String str, k91.v5 v5Var, ot0.q qVar) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).d4(str);
            } catch (java.lang.Exception unused) {
            }
        }
        ((ku5.t0) ku5.t0.f312615d).a(new k01.e(v5Var, qVar));
    }

    public static void d(ot0.q qVar, com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent) {
        java.lang.String wi6;
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        if (aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.R)) {
            return;
        }
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        if (nxVar.f7480o == null) {
            nxVar.f7480o = new com.tencent.mm.modelappbrand.LaunchParamsOptional();
        }
        boolean contains = aVar.R.contains("allPage");
        am.nx nxVar2 = startAppBrandUIFromOuterEvent.f54857g;
        if (!contains) {
            nxVar2.f7485t = aVar.R;
            nxVar2.f7480o.f70420i = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams("subpackage");
            return;
        }
        java.lang.String str = aVar.R;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            wi6 = null;
        } else {
            wi6 = ((com.tencent.mm.plugin.appbrand.jsapi.chattool.w0) ((k01.q0) i95.n0.c(k01.q0.class))).wi(str);
            if (wi6 == null) {
                wi6 = "";
            }
        }
        nxVar2.f7485t = wi6;
        nxVar2.f7480o.f70420i = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams("allPage");
    }

    public static boolean e(ot0.q qVar, k91.v5 v5Var) {
        boolean b17;
        if (v5Var == null) {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            b17 = aVar != null ? k01.i.b(aVar.f348363s, 16) : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[showFinancialLicenseFlag] attrs is null, get showFinancialLicenseFlag flag from AppContentAppBrandPiece showFinancialLicenseFlag:%b", java.lang.Boolean.valueOf(b17));
        } else {
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f77444d || aVar2 == null) {
                b17 = k01.i.b(v5Var.u0() != null ? v5Var.u0().f305644s : 0, 16);
            } else {
                boolean b18 = k01.i.b(aVar2.f348363s, 16);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[showFinancialLicenseFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f77444d));
                b17 = b18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[showFinancialLicenseFlag] use attrs:%b", java.lang.Boolean.valueOf(b17));
        }
        return b17;
    }

    public static boolean f(ot0.q qVar, k91.v5 v5Var) {
        boolean b17;
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        if (v5Var == null) {
            b17 = aVar != null ? k01.i.b(aVar.f348362r, 1) : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[isShowFlagshipTag] attrs is null, get showFlagshipFlag from AppContentAppBrandPiece showFlagshipFlag:%b", java.lang.Boolean.valueOf(b17));
        } else {
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f77444d || aVar == null) {
                b17 = k01.i.b(v5Var.u0() != null ? v5Var.u0().f305643r : 0, 1);
            } else {
                boolean b18 = k01.i.b(aVar.f348362r, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[isShowFlagshipTag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f77444d));
                b17 = b18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[isShowFlagshipTag] use attrs:%b", java.lang.Boolean.valueOf(b17));
        }
        if (b17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_flagship_store, 0) == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(ot0.q qVar, k91.v5 v5Var) {
        boolean b17;
        if (v5Var == null) {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            b17 = aVar != null ? k01.i.b(aVar.f348360p, 16) : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[wantShowRelievedBuyFlag] attrs is null, get showRelievedBuyFlag flag from AppContentAppBrandPiece showRelievedBuyFlag:%b", java.lang.Boolean.valueOf(b17));
        } else {
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f77444d || aVar2 == null) {
                b17 = k01.i.b(v5Var.u0() != null ? v5Var.u0().f305642q : 0, 16);
            } else {
                boolean b18 = k01.i.b(aVar2.f348360p, 16);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[wantShowRelievedBuyFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f77444d));
                b17 = b18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[wantShowRelievedBuyFlag] use attrs:%b", java.lang.Boolean.valueOf(b17));
        }
        if (!b17) {
            return false;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) != 1) {
            return false;
        }
        ot0.a aVar3 = (ot0.a) qVar.y(ot0.a.class);
        return aVar3 != null ? aVar3.f348361q : false;
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, ot0.q qVar, android.os.Bundle bundle) {
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7471f = context;
        b(startAppBrandUIFromOuterEvent, qVar);
        a(startAppBrandUIFromOuterEvent, qVar);
        int i17 = bundle.getInt("chat_type", -1);
        if (com.tencent.mm.storage.z3.p4(str)) {
            nxVar.f7469d = com.tencent.liteav.TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY;
            nxVar.f7470e = qVar.f348689n2 + ":" + str;
        } else {
            nxVar.f7469d = z17 ? 1008 : 1007;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            if (z17) {
                str3 = ":" + str2;
            } else {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(":");
            sb6.append(qVar.f348689n2);
            sb6.append(":");
            sb6.append(i17);
            nxVar.f7470e = sb6.toString();
            int i18 = bundle.getInt("stat_scene", 0);
            if (i18 == 2 || i18 == 1) {
                k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(qVar.f348673j2);
                boolean g17 = g(qVar, Bi);
                boolean f17 = f(qVar, Bi);
                boolean e17 = e(qVar, Bi);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(nxVar.f7470e);
                sb7.append(":");
                sb7.append(g17 ? 1 : 0);
                if (z17) {
                    str4 = "";
                } else {
                    str4 = ":" + str2;
                }
                sb7.append(str4);
                sb7.append(":");
                sb7.append(f17 ? 1 : 0);
                sb7.append(":");
                sb7.append(e17 ? 1 : 0);
                nxVar.f7470e = sb7.toString();
            }
        }
        nxVar.f7489x = bundle;
        nxVar.f7482q = i17;
        nxVar.f7483r = bundle.getString("chatroom_username", "");
        nxVar.f7484s = bundle.getString("chat_username", "");
        nxVar.f7486u = bundle.getString("stat_msg_id", "");
        nxVar.f7488w = bundle.getInt("stat_geta8key_msg_scene", 0);
        nxVar.f7487v = bundle.getString("stat_geta8key_msg_username", "");
        d(qVar, startAppBrandUIFromOuterEvent);
        startAppBrandUIFromOuterEvent.e();
    }

    public static void i(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, ot0.q qVar, android.os.Bundle bundle) {
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        b(startAppBrandUIFromOuterEvent, qVar);
        a(startAppBrandUIFromOuterEvent, qVar);
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7469d = i17;
        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(qVar.f348673j2);
        boolean g17 = g(qVar, Bi);
        boolean f17 = f(qVar, Bi);
        boolean e17 = e(qVar, Bi);
        if (i17 == 1074) {
            nxVar.f7470e = java.lang.String.format("%s:%s:%s:%s:%s:%s", str, qVar.f348654f, qVar.f348669i2, java.lang.Integer.valueOf(g17 ? 1 : 0), java.lang.Integer.valueOf(f17 ? 1 : 0), java.lang.Integer.valueOf(e17 ? 1 : 0));
            nxVar.D = str3;
        } else if (i17 == 1157) {
            nxVar.f7470e = java.lang.String.format("%s:%s:%s:%s:%s:%s:%s", str, qVar.f348654f, str2 == null ? "" : str2, qVar.f348669i2, java.lang.Integer.valueOf(g17 ? 1 : 0), java.lang.Integer.valueOf(f17 ? 1 : 0), java.lang.Integer.valueOf(e17 ? 1 : 0));
            nxVar.D = str3;
        } else if (i17 == 1073) {
            nxVar.f7470e = (g17 ? 1 : 0) + ":" + (f17 ? 1 : 0) + ":" + (e17 ? 1 : 0);
        }
        nxVar.f7489x = bundle;
        nxVar.f7482q = bundle.getInt("chat_type", -1);
        nxVar.f7483r = bundle.getString("chatroom_username", "");
        nxVar.f7484s = bundle.getString("chat_username", "");
        nxVar.f7486u = bundle.getString("stat_msg_id", "");
        nxVar.f7488w = bundle.getInt("stat_geta8key_msg_scene", 0);
        nxVar.f7487v = bundle.getString("stat_geta8key_msg_username", "");
        d(qVar, startAppBrandUIFromOuterEvent);
        startAppBrandUIFromOuterEvent.e();
    }

    public static void j(java.lang.String str, java.lang.String str2, boolean z17, ot0.q qVar, android.os.Bundle bundle) {
        if (android.text.TextUtils.isEmpty(qVar.f348693o2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "visitFromPageWithShareTicketAppMessage shareKey isEmpty, transform to normal visit, talkerUsername[%s] msgUsername[%s] groupChat[%b]", str, str2, java.lang.Boolean.valueOf(z17));
            h(null, str, str2, z17, qVar, bundle);
            return;
        }
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        b(startAppBrandUIFromOuterEvent, qVar);
        a(startAppBrandUIFromOuterEvent, qVar);
        int i17 = bundle.getInt("chat_type", -1);
        boolean p47 = com.tencent.mm.storage.z3.p4(str);
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        if (p47) {
            nxVar.f7469d = com.tencent.liteav.TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY;
            nxVar.f7470e = qVar.f348689n2 + ":" + str;
        } else {
            nxVar.f7469d = 1044;
            nxVar.f7470e = qVar.f348689n2 + ":" + i17 + ":" + str;
            int i18 = bundle.getInt("stat_scene", 0);
            if (i18 == 2 || i18 == 1) {
                k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(qVar.f348673j2);
                nxVar.f7470e += ":" + (g(qVar, Bi) ? 1 : 0) + ":" + (f(qVar, Bi) ? 1 : 0) + ":" + (e(qVar, Bi) ? 1 : 0);
            }
        }
        nxVar.getClass();
        nxVar.getClass();
        com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = nxVar.f7480o;
        launchParamsOptional.f70416e = qVar.f348693o2;
        launchParamsOptional.f70415d = str;
        nxVar.f7482q = i17;
        nxVar.f7483r = bundle.getString("chatroom_username", "");
        nxVar.f7484s = str;
        nxVar.f7486u = bundle.getString("stat_msg_id", "");
        nxVar.f7488w = bundle.getInt("stat_geta8key_msg_scene", 0);
        nxVar.f7487v = bundle.getString("stat_geta8key_msg_username", "");
        nxVar.f7489x = bundle;
        d(qVar, startAppBrandUIFromOuterEvent);
        startAppBrandUIFromOuterEvent.e();
    }
}

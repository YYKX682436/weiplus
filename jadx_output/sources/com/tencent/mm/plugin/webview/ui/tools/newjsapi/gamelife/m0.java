package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes8.dex */
public final class m0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.m0 f186194d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.m0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.d dVar;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.d dVar2;
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = ((java.util.HashMap) msg.f340790a).get("functionType");
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.d.f186171e.getClass();
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.d[] values = com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.d.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                dVar = null;
                break;
            }
            dVar = values[i17];
            if (dVar.f186173d == D1) {
                break;
            }
            i17++;
        }
        java.util.Objects.toString(dVar);
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.d[] values2 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.d.values();
        int length2 = values2.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length2) {
                dVar2 = null;
                break;
            }
            dVar2 = values2[i18];
            if (dVar2.f186173d == D1) {
                break;
            }
            i18++;
        }
        int i19 = dVar2 == null ? -1 : com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.d0.f186174a[dVar2.ordinal()];
        nw4.g gVar = env.f340863d;
        switch (i19) {
            case 1:
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.u.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.h0(env, msg));
                return true;
            case 2:
                java.util.HashMap hashMap = (java.util.HashMap) msg.f340790a;
                java.lang.Object obj2 = hashMap.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (e(str2, env, msg)) {
                    java.lang.Object obj3 = hashMap.get("selfUsername");
                    java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                    java.lang.Object obj4 = hashMap.get("talker");
                    str = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    if (f(str3, env, msg) && f(str, env, msg)) {
                        java.lang.String str4 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                        kotlin.jvm.internal.o.d(str2);
                        kotlin.jvm.internal.o.d(str3);
                        kotlin.jvm.internal.o.d(str);
                        com.tencent.mm.ipcinvoker.extension.l.a(str4, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.AddConversationParams(str2, str3, str), com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.p.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.e0(env, msg));
                    }
                }
                return true;
            case 3:
                java.lang.Object obj5 = ((java.util.HashMap) msg.f340790a).get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
                str = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                if (e(str, env, msg)) {
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.d(str);
                    com.tencent.mm.ipcinvoker.extension.l.a(str5, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.q.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.f0(env, msg));
                }
                return true;
            case 4:
                java.util.HashMap hashMap2 = (java.util.HashMap) msg.f340790a;
                java.lang.Object obj6 = hashMap2.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
                java.lang.String str6 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                java.lang.Object obj7 = hashMap2.get("messageId");
                long E1 = com.tencent.mm.sdk.platformtools.t8.E1(obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null);
                if (E1 < 0) {
                    gVar.e(msg.f341013c, "gamelifeManager fail: messageid < 0", null);
                }
                java.lang.Object obj8 = hashMap2.get("limit");
                int D12 = com.tencent.mm.sdk.platformtools.t8.D1(obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null, 0);
                java.lang.Object obj9 = hashMap2.get("isNeedFromLast");
                boolean y17 = com.tencent.mm.sdk.platformtools.t8.y(obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null, true);
                if (e(str6, env, msg)) {
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.d(str6);
                    com.tencent.mm.ipcinvoker.extension.l.a(str7, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgParams(str6, E1, D12, y17), com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.y.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.j0(env, msg));
                }
                return true;
            case 5:
                java.util.HashMap hashMap3 = (java.util.HashMap) msg.f340790a;
                java.lang.Object obj10 = hashMap3.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
                java.lang.String str8 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                java.lang.Object obj11 = hashMap3.get("content");
                java.lang.String str9 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                java.lang.Object obj12 = hashMap3.get("selfUsername");
                java.lang.String str10 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                java.lang.Object obj13 = hashMap3.get("talker");
                java.lang.String str11 = obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null;
                java.lang.Object obj14 = hashMap3.get("messageType");
                int D13 = com.tencent.mm.sdk.platformtools.t8.D1(obj14 instanceof java.lang.String ? (java.lang.String) obj14 : null, 0);
                if (e(str8, env, msg)) {
                    if (str9 != null) {
                        if (str9.length() == 0) {
                            gVar.e(msg.f341013c, "gamelifeManager: fail content empty", null);
                        }
                    }
                    if (f(str10, env, msg) && f(str11, env, msg)) {
                        java.lang.String str12 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                        kotlin.jvm.internal.o.d(str8);
                        kotlin.jvm.internal.o.d(str9);
                        kotlin.jvm.internal.o.d(str10);
                        kotlin.jvm.internal.o.d(str11);
                        com.tencent.mm.ipcinvoker.extension.l.a(str12, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.SendMsgParams(str8, str9, str10, str11, D13), com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c0.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.l0(env, msg));
                    }
                }
                return true;
            case 6:
                java.util.HashMap hashMap4 = (java.util.HashMap) msg.f340790a;
                java.lang.Object obj15 = hashMap4.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
                java.lang.String str13 = obj15 instanceof java.lang.String ? (java.lang.String) obj15 : null;
                if (e(str13, env, msg)) {
                    java.lang.Object obj16 = hashMap4.get("messageList");
                    java.lang.String str14 = obj16 instanceof java.lang.String ? (java.lang.String) obj16 : null;
                    if (str14 != null) {
                        if (str14.length() == 0) {
                            gVar.e(msg.f341013c, "gamelifeManager fail :empty messageList", null);
                        }
                    }
                    java.lang.Object obj17 = hashMap4.get("deleteAll");
                    boolean y18 = com.tencent.mm.sdk.platformtools.t8.y(obj17 instanceof java.lang.String ? (java.lang.String) obj17 : null, false);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.d(str13);
                    kotlin.jvm.internal.o.d(str14);
                    com.tencent.mm.ipcinvoker.extension.l.a(str15, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.DeleteMsgParams(str13, str14, y18), com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.s.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.g0(env, msg));
                    gVar.e(msg.f341013c, "gamelifeManager: ok", null);
                }
                return true;
            case 7:
                java.lang.Object obj18 = ((java.util.HashMap) msg.f340790a).get("userNameList");
                java.lang.String str16 = obj18 instanceof java.lang.String ? (java.lang.String) obj18 : null;
                if (str16 == null || str16.length() == 0) {
                    gVar.e(msg.f341013c, "gamelifeManager: fail: empty username", null);
                }
                java.lang.String str17 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                kotlin.jvm.internal.o.d(str16);
                com.tencent.mm.ipcinvoker.extension.l.a(str17, new com.tencent.mm.ipcinvoker.type.IPCString(str16), com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.x.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.i0(env, msg));
                return true;
            case 8:
                java.util.HashMap hashMap5 = (java.util.HashMap) msg.f340790a;
                java.lang.Object obj19 = hashMap5.get("selfUsername");
                java.lang.String str18 = obj19 instanceof java.lang.String ? (java.lang.String) obj19 : null;
                java.lang.Object obj20 = hashMap5.get("talker");
                java.lang.String str19 = obj20 instanceof java.lang.String ? (java.lang.String) obj20 : null;
                java.lang.Object obj21 = hashMap5.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                int D14 = com.tencent.mm.sdk.platformtools.t8.D1(obj21 instanceof java.lang.String ? (java.lang.String) obj21 : null, 0);
                if (f(str18, env, msg) && f(str19, env, msg)) {
                    java.lang.String str20 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.d(str18);
                    kotlin.jvm.internal.o.d(str19);
                    com.tencent.mm.ipcinvoker.extension.l.a(str20, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetSessionIdParams(str18, str19, D14), com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.a0.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.k0(env, msg));
                } else {
                    gVar.e(msg.f341013c, "gamelifeManager:fail getSessionId ,wrong username", null);
                }
                return true;
            default:
                gVar.e(msg.f341013c, " gamelifeManagerfail:wrongmsgType", null);
                return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 452;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.u5.NAME;
    }

    public final boolean e(java.lang.String str, nw4.k env, nw4.y2 msg) {
        boolean z17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        nw4.g gVar = env.f340863d;
        if (str == null) {
            gVar.e(msg.f341013c, "gamelifeManager fail: null sessionId", null);
            return false;
        }
        if (str.length() == 0) {
            gVar.e(msg.f341013c, "gamelifeManager fail: empty sessionId", null);
            return false;
        }
        if (com.tencent.mm.storage.z3.a4(str)) {
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "check sessionId failed");
            z17 = false;
        }
        if (z17) {
            return true;
        }
        gVar.e(msg.f341013c, "gamelifeManager fail: invaild sessionId", null);
        return false;
    }

    public final boolean f(java.lang.String str, nw4.k env, nw4.y2 msg) {
        boolean z17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        nw4.g gVar = env.f340863d;
        if (str == null) {
            gVar.e(msg.f341013c, "gamelifeManager fail: null username", null);
            return false;
        }
        if (str.length() == 0) {
            gVar.e(msg.f341013c, "gamelifeManager fail: empty username ", null);
            return false;
        }
        if (com.tencent.mm.storage.z3.Z3(str)) {
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "check username failed");
            z17 = false;
        }
        if (z17) {
            return true;
        }
        gVar.e(msg.f341013c, "gamelifeManager fail: wrong username", null);
        return false;
    }
}

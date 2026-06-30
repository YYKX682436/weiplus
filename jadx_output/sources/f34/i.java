package f34;

/* loaded from: classes11.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f259354a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f259355b;

    public i() {
        this.f259355b = "";
        this.f259355b = g34.a.d();
    }

    public boolean a(java.lang.String str) {
        return java.util.regex.Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public void b() {
        f34.e eVar;
        if (this.f259354a == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f259354a).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f259354a).get(i17);
            if (weakReference != null && (eVar = (f34.e) weakReference.get()) != null) {
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = (com.tencent.mm.plugin.shake.ui.ShakeReportUI) eVar;
                g34.a.a();
                shakeReportUI.q7();
                shakeReportUI.t7();
                shakeReportUI.r7();
            }
        }
    }

    public void c(java.lang.String str, long j17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "msg_id is " + j17);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is empty");
            return;
        }
        f34.h hVar = null;
        f34.f fVar = null;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_ENTRANCE");
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
            if (d17 != null) {
                fVar = new f34.f();
                java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.begintime");
                if (android.text.TextUtils.isEmpty(str2) || !a(str2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml begintime is " + str2);
                    fVar.f259344a = 0;
                } else {
                    fVar.f259344a = com.tencent.mm.sdk.platformtools.t8.P(str2, 0);
                }
                java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.endtime");
                if (android.text.TextUtils.isEmpty(str3) || !a(str3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml endtime is " + str3);
                    fVar.f259345b = 0;
                } else {
                    fVar.f259345b = com.tencent.mm.sdk.platformtools.t8.P(str3, 0);
                }
                fVar.f259346c = (java.lang.String) d17.get(".sysmsg.entrancename");
                java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.activitytype");
                if (android.text.TextUtils.isEmpty(str4) || !a(str4)) {
                    fVar.f259347d = 1;
                } else {
                    fVar.f259347d = com.tencent.mm.sdk.platformtools.t8.P(str4, 0);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml activitytype is " + str4);
                java.lang.String str5 = (java.lang.String) d17.get(".sysmsg.flowcontrollevelmin");
                if (android.text.TextUtils.isEmpty(str5) || !a(str5)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmin is " + str5);
                    fVar.f259348e = 0;
                } else {
                    fVar.f259348e = com.tencent.mm.sdk.platformtools.t8.P(str5, 0);
                }
                fVar.f259350g = (java.lang.String) d17.get(".sysmsg.shakecardentrancetip");
                java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.flowcontrollevelmax");
                if (android.text.TextUtils.isEmpty(str6) || !a(str6)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmax is " + str6);
                    fVar.f259349f = 0;
                } else {
                    fVar.f259349f = com.tencent.mm.sdk.platformtools.t8.P(str6, 0);
                }
            }
            if (fVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg == null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg");
                if (!g34.a.g()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg isShakeCardEntranceOpen is false");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg begintime:" + fVar.f259344a + "  endtime:" + fVar.f259345b + "  flowlevelmin:" + fVar.f259348e + "  flowlevelmax:" + fVar.f259349f + " entrancename:" + fVar.f259346c + " activitytype:" + fVar.f259347d);
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, java.lang.Integer.valueOf(fVar.f259344a));
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, java.lang.Integer.valueOf(fVar.f259345b));
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_NAME_STRING_SYNC, fVar.f259346c);
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, java.lang.Integer.valueOf(fVar.f259347d));
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MIN_INT_SYNC, java.lang.Integer.valueOf(fVar.f259348e));
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MAX_INT_SYNC, java.lang.Integer.valueOf(fVar.f259349f));
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC, fVar.f259350g);
            }
            new com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent().e();
        } else if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_RED_DOT");
            java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
            if (d18 != null) {
                hVar = new f34.h();
                hVar.f259351a = (java.lang.String) d18.get(".sysmsg.reddotid");
                hVar.f259352b = (java.lang.String) d18.get(".sysmsg.reddotdesc");
                hVar.f259353c = (java.lang.String) d18.get(".sysmsg.reddottext");
            }
            if (hVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg == null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg reddotid is " + hVar.f259351a);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveRedDotMsg pre reddotid is ");
                java.lang.String str7 = this.f259355b;
                sb6.append(str7);
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", sb6.toString());
                if (android.text.TextUtils.isEmpty(hVar.f259351a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "msg.reddotid is empty");
                } else if (android.text.TextUtils.isEmpty(str7)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "redDotId is empty, msg.reddotid is not empty");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().p(262154, true);
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, hVar.f259351a);
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, hVar.f259352b);
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, hVar.f259353c);
                    b();
                } else if (!str7.equals(hVar.f259351a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "redDotId and msg.reddotid is not empty, but no equals");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().p(262154, true);
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, hVar.f259351a);
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, hVar.f259352b);
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, hVar.f259353c);
                    b();
                } else if (str7.equals(hVar.f259351a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardMsgMgr", "redDotId equals msg.reddotid");
                }
            }
            new com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent().e();
        }
        g34.a.a();
    }
}

package e01;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f245844a = new java.util.ArrayList();

    public final void a(java.lang.String str, java.util.Map map) {
        java.lang.String str2 = str + "chatting.";
        java.lang.String str3 = (java.lang.String) map.get(str2 + com.tencent.soter.core.biometric.FingerprintManagerProxy.FINGERPRINT_SERVICE);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        if (str2.equals(".sysmsg.banner.monitorbanner_n.") && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingMonitoredBannerStorage", "monitorbanner_n must NOT contain fingerprint.");
            return;
        }
        java.lang.String str4 = (java.lang.String) map.get(str2.concat("deviceuuid"));
        if (str4 == null) {
            str4 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && !ot5.h.f348877a.a(str4, wo.w0.k(), "MicroMsg.ChattingMonitoredBannerStorage", false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingMonitoredBannerStorage", "deviceUuid not match:".concat(str4));
            return;
        }
        java.lang.String str5 = (java.lang.String) map.get(str2.concat("url"));
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = (java.lang.String) map.get(str2.concat("wording"));
        if (str6 == null) {
            str6 = "";
        }
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(str2.concat("duration")), 0L);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str2.concat("autotrigger")), 0) == 1;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str2.concat("closable")), 0) == 1;
        java.lang.String str7 = str + "mainframe.";
        java.lang.String str8 = (java.lang.String) map.get(str7 + "url");
        if (str8 == null) {
            str8 = "";
        }
        java.lang.String str9 = (java.lang.String) map.get(str7 + "wording");
        java.lang.String str10 = str9 != null ? str9 : "";
        java.lang.String str11 = str8;
        java.lang.String str12 = str3;
        long V2 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(str7 + "duration"), 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str7);
        sb6.append("autotrigger");
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb6.toString()), 0) == 1;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str7);
        sb7.append("closable");
        boolean z28 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7.toString()), 0) == 1;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str10) && com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            return;
        }
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_WORDING_STRING_SYNC, str6);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_URL_STRING_SYNC, str5);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_INTERVAL_LONG_SYNC, java.lang.Long.valueOf(V));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z19));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z18));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_FINGER_PRINT_STRING_SYNC, str12);
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p17.x(u3Var, bool);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_WORDING_STRING_SYNC, str10);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_URL_STRING_SYNC, str11);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_INTERVAL_LONG_SYNC, java.lang.Long.valueOf(V2));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z28));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z27));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MONITOR_BANNER_MSG_COME_TIME_TICKS_LONG_SYNC, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MAIN_BANNER_CLOSED_BOOLEAN_SYNC, bool);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MONITOR_IS_TRIGGERED_BOOLEAN_SYNC, bool);
        c01.d9.b().p().i(true);
        b();
    }

    public void b() {
        synchronized (e01.d.class) {
            java.util.Iterator it = this.f245844a.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.chatting.component.df dfVar = (com.tencent.mm.ui.chatting.component.df) ((e01.b) it.next());
                dfVar.f198936a.f198580d.q().post(new com.tencent.mm.ui.chatting.component.cf(dfVar));
            }
        }
    }

    public void c(e01.c cVar) {
        if (cVar == e01.c.Main) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L);
            b();
        } else if (cVar == e01.c.Chatting) {
            if (((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            } else {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L);
            }
            b();
        }
    }

    public boolean d(e01.c cVar) {
        long longValue;
        boolean booleanValue;
        boolean booleanValue2;
        java.lang.String str;
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        long longValue2 = ((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MONITOR_BANNER_MSG_COME_TIME_TICKS_LONG_SYNC, -1L)).longValue();
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_FINGER_PRINT_STRING_SYNC, "");
        if (cVar == e01.c.Chatting) {
            longValue = ((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L)).longValue();
            com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            booleanValue = ((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue();
            booleanValue2 = ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, bool)).booleanValue();
            str = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_WORDING_STRING_SYNC, "");
        } else {
            longValue = ((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L)).longValue();
            com.tencent.mm.storage.n3 p18 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_MAIN_BANNER_CLOSED_BOOLEAN_SYNC;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            booleanValue = ((java.lang.Boolean) p18.m(u3Var2, bool2)).booleanValue();
            booleanValue2 = ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, bool2)).booleanValue();
            str = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_WORDING_STRING_SYNC, "");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !str2.equals(android.os.Build.FINGERPRINT)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(633L, 5L, 1L, false);
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || booleanValue || longValue2 < 0) {
            return false;
        }
        if (booleanValue2 && !((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MONITOR_IS_TRIGGERED_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
            return false;
        }
        if (longValue == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: should always show");
            return true;
        }
        if (longValue2 + longValue > i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: still in show time. show banner");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: expired.");
        return false;
    }

    public void e(int i17, java.util.Map map) {
        if (map == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.o4.M("banner-SvrIdMMKVName").getInt("SvrIdKey", 0) == i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingMonitoredBannerStorage", "error! svrId=" + i17);
        } else {
            com.tencent.mm.sdk.platformtools.o4.M("banner-SvrIdMMKVName").putInt("SvrIdKey", i17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(633L, 3L, 1L, false);
            map.toString();
            a(".sysmsg.banner.monitorbanner_n.", map);
            a(".sysmsg.banner.monitorbanner_o.", map);
        }
    }
}

package q61;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final q61.j f360261a = new q61.j();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f360262b = false;

    /* renamed from: c, reason: collision with root package name */
    public static r45.nf5 f360263c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f360264d = false;

    /* renamed from: e, reason: collision with root package name */
    public static kotlinx.coroutines.z f360265e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f360266f = false;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f360267g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f360268h = "";

    public static final java.util.HashMap d() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("login_sessionid", f360267g);
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k());
        java.lang.String a17 = c01.b9.f37069c.a("login_user_name", "");
        kotlin.jvm.internal.o.f(a17, "getLoginInfo(...)");
        hashMap.put("wx_username", a17);
        return hashMap;
    }

    public static final void e(java.lang.String login_ticket_id, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(login_ticket_id, "login_ticket_id");
        com.tencent.mars.xlog.Log.i("ReportPushLoginURLMainDevice", "reportLoginAssistEnd");
        java.util.HashMap d17 = d();
        d17.put("login_ticket_id", login_ticket_id);
        d17.put("login_assist_device_type", java.lang.Integer.valueOf(i17));
        d17.put("login_assist_result", java.lang.Integer.valueOf(i18));
        d17.put("login_assist_cancel_type", java.lang.Integer.valueOf(i19));
        d17.put("login_assist_error_code", java.lang.Integer.valueOf(i27));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("login_assist_end", d17, 34575);
    }

    public static final void f(java.lang.String login_ticket_id, int i17) {
        kotlin.jvm.internal.o.g(login_ticket_id, "login_ticket_id");
        com.tencent.mars.xlog.Log.i("ReportPushLoginURLMainDevice", "reportLoginAssistSend");
        java.util.HashMap d17 = d();
        d17.put("login_ticket_id", login_ticket_id);
        d17.put("login_assist_device_type", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("login_assist_send", d17, 34575);
    }

    public static final void g(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("ReportPushLoginURLMainDevice", "reportLoginUseOtherDevice");
        java.util.HashMap d17 = d();
        d17.put("page_id", "50272");
        d17.put("page_name", "AccountLoginPage");
        if (i17 == 0) {
            d17.put("view_id", "login_use_other_device");
        } else {
            d17.put("view_id", "login_use_other_device_more");
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(i18 == 0 ? "view_exp" : "view_clk", d17, 34575);
    }

    public static final void h() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        f360267g = wo.w0.k() + '_' + elapsedRealtime;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLoginPageSessionId: ");
        sb6.append(f360267g);
        com.tencent.mars.xlog.Log.i("ReportPushLoginURLMainDevice", sb6.toString());
    }

    public static final void i(java.lang.String mid) {
        kotlin.jvm.internal.o.g(mid, "mid");
        f360268h = mid;
        com.tencent.mars.xlog.Log.i("ReportPushLoginURLMainDevice", "updateLoginTicketId: " + f360268h);
    }

    public final boolean a() {
        java.lang.String a17 = c01.b9.f37069c.a("login_weixin_username", "");
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        kotlin.jvm.internal.o.d(a17);
        if (!((is.f) r0Var).Vi(a17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PushLoginURLMainDeviceCGI", "!isFSEnable expt");
            return false;
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4);
        if (sharedPreferences == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PushLoginURLMainDeviceCGI", "sp == null");
            return false;
        }
        java.lang.String string = sharedPreferences.getString("_auth_key", "");
        if (string == null || string.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PushLoginURLMainDeviceCGI", "aak.isNullOrEmpty()");
            return false;
        }
        java.lang.String string2 = sharedPreferences.getString("server_id", "");
        if (!(string2 == null || string2.length() == 0)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.PushLoginURLMainDeviceCGI", "oldCookie.isNullOrEmpty()");
        return false;
    }

    public final void b(androidx.appcompat.app.AppCompatActivity act, q61.k kVar) {
        kotlin.jvm.internal.o.g(act, "act");
        if (a()) {
            if (f360264d) {
                com.tencent.mars.xlog.Log.i("PushLoginURLTAG3MainDeviceCGI", "hasCheck");
            } else {
                f360264d = true;
                android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4);
                if (sharedPreferences != null) {
                    java.lang.String string = sharedPreferences.getString("_auth_key", "");
                    kotlin.jvm.internal.o.d(string);
                    java.lang.String a17 = c01.b9.f37069c.a("login_weixin_username", "");
                    kotlin.jvm.internal.o.f(a17, "getLoginInfo(...)");
                    byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(string);
                    kotlin.jvm.internal.o.d(sharedPreferences.getString("server_id", ""));
                    com.tencent.mars.xlog.Log.i("PushLoginURLTAG3MainDeviceCGI", "checkLoginURLMainDeviceStatus only once");
                    kotlinx.coroutines.z a18 = kotlinx.coroutines.b0.a(null, 1, null);
                    f360265e = a18;
                    kotlinx.coroutines.l.d(v65.m.f433580a, kotlinx.coroutines.q1.f310568a, null, new q61.g(a17, h17, a18, null), 2, null);
                }
            }
            kotlinx.coroutines.l.d(v65.m.b(act), kotlinx.coroutines.q1.f310568a, null, new q61.e(act, kVar, null), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r9, java.lang.String r10, byte[] r11, q61.k r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q61.j.c(int, java.lang.String, byte[], q61.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

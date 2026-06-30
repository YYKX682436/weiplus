package vd0;

@j95.b
/* loaded from: classes14.dex */
public final class v1 extends i95.w implements wd0.j1 {
    public void Ai(java.lang.String str, java.lang.String eventId, java.util.Map map) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map == null) {
            map = hashMap;
        }
        if (str == null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(eventId, map, 34575);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, eventId, map, 34575);
        }
    }

    public kotlinx.coroutines.f1 Bi(kotlinx.coroutines.y0 lifecycleScope, boolean z17) {
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        return kotlinx.coroutines.l.b(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new vd0.k1(this, z17, null), 2, null);
    }

    public int Di(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return 10 - com.tencent.mm.sdk.platformtools.o4.M("Fingerprint_" + username + "_Retry_Count").o("login_fingerprint_retry_count", 0);
    }

    public boolean Ni(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String concat = "Fingerprint_".concat(username);
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.M(concat).getBoolean("bind_fingerprint_status", false);
        boolean Zi = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Zi(username);
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] isOpenFingerprintLogin uin is " + concat + ", res: " + z17);
        return z17 && Zi;
    }

    public boolean Ri(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return Ni(username) && kotlin.jvm.internal.o.b(c01.uc.f37514c.c(username, "last_logout_fingerprint_permission_status"), "1");
    }

    public boolean Ui(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        boolean z18 = (wo.v1.f447828h.f447811b & 1) > 0;
        boolean z19 = cu5.b.c() && wt5.a.n(context);
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] isSupportFingerprint res: isSrvSupport: " + z18 + ", isNativeSupport: " + z19);
        return !z17 ? z18 && z19 : z19;
    }

    public void Vi(kotlinx.coroutines.y0 lifecycleScope, android.content.Context context, wd0.b2 param, wd0.g2 callback) {
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(callback, "callback");
        ju5.c cVar = new ju5.c(null);
        cVar.f302068c = context;
        cVar.f302069d = 1;
        cVar.f302077l = param.f444697a;
        cVar.f302067b = param.f444699c;
        cVar.f302066a = 920;
        cVar.f302078m = param.f444698b;
        cu5.b.g(new vd0.t1(callback), cVar);
    }

    public void Zi(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] resetUserInfo username: ".concat(username));
        ((is.f) ((js.r0) i95.n0.c(js.r0.class))).hj(username, true);
        com.tencent.mm.sdk.platformtools.o4.M("Fingerprint_" + username + "_Retry_Count").A("login_fingerprint_retry_count", 0);
    }

    public void aj(boolean z17, java.lang.String fingerprintId, java.lang.String username) {
        kotlin.jvm.internal.o.g(fingerprintId, "fingerprintId");
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String concat = "Fingerprint_".concat(username);
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] bind success, uin is " + concat + ", fingerprintId is " + fingerprintId);
        com.tencent.mm.sdk.platformtools.o4.M(concat).putBoolean("bind_fingerprint_status", z17);
        com.tencent.mm.sdk.platformtools.o4.M(concat).putString("bind_fingerprint_fid", fingerprintId);
    }

    public void bj(kotlinx.coroutines.y0 lifecycleScope, wd0.m2 param, java.lang.String username, wd0.c1 callback) {
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(lifecycleScope, null, null, new vd0.u1(callback, param, username, null), 3, null);
    }

    public void wi(kotlinx.coroutines.y0 lifecycleScope, int i17, com.tencent.mm.feature.setting.api.FingerprintVerifyParam fingerprintVerifyParam, wd0.c2 callback) {
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.feature.setting.api.BindFingerprintCallback bindFingerprintCallback = new com.tencent.mm.feature.setting.api.BindFingerprintCallback(0, 0, "", "");
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(fo3.s.INSTANCE.h());
        k57Var.f378396f = cu5Var;
        kotlinx.coroutines.l.d(lifecycleScope, null, null, new vd0.h1(i17, bindFingerprintCallback, callback, fingerprintVerifyParam, this, k57Var, null), 3, null);
    }
}

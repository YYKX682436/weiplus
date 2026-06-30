package oo1;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final oo1.o f347151a = new oo1.o();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f347152b = jz5.h.b(oo1.n.f347150d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f347153c = jz5.h.b(oo1.m.f347149d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f347154d = jz5.h.b(oo1.l.f347148d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f347155e = jz5.h.b(oo1.k.f347147d);

    public final void a(java.lang.String deviceId) {
        java.lang.String g07;
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        if (kotlin.jvm.internal.o.b(deviceId, "deviceId@roam-at")) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupMmkv", "add last active deviceId=".concat(deviceId));
        if (deviceId.length() == 0) {
            return;
        }
        jz5.g gVar = f347155e;
        synchronized (((java.util.LinkedHashSet) ((jz5.n) gVar).getValue())) {
            ((java.util.LinkedHashSet) ((jz5.n) gVar).getValue()).remove(deviceId);
            ((java.util.LinkedHashSet) ((jz5.n) gVar).getValue()).add(deviceId);
            g07 = kz5.n0.g0((java.util.LinkedHashSet) ((jz5.n) gVar).getValue(), ",", null, null, 0, null, null, 62, null);
        }
        c().D("lastActiveDevice", g07);
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("roam_backup_device_info", e(), 1);
        kotlin.jvm.internal.o.f(J2, "getAccountAwareMMKV(...)");
        return J2;
    }

    public final com.tencent.mm.sdk.platformtools.o4 c() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f347154d).getValue();
    }

    public final java.lang.String d() {
        java.lang.String t17 = c().t("phone_id");
        if (t17 == null || t17.length() == 0) {
            t17 = wo.w0.k();
            if (t17.length() == 0) {
                t17 = java.util.UUID.randomUUID().toString();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupMmkv", "Create new phoneId=" + t17 + " for uin=" + e());
            c().D("phone_id", t17);
        }
        kotlin.jvm.internal.o.d(t17);
        return t17;
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) f347152b).getValue()).intValue();
    }

    public final void f(java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f347153c).getValue()).B(talker, c01.id.c());
    }
}

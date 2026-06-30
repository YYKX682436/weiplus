package l14;

/* loaded from: classes8.dex */
public final class c extends x51.i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l14.c f315001a = new l14.c();

    /* renamed from: b, reason: collision with root package name */
    public static long f315002b = 1 * (60 * 1000);

    @Override // x51.i0
    public java.lang.String getEventId() {
        return "msg_notify_status_polling";
    }

    @Override // x51.i0
    public com.tencent.mm.sdk.platformtools.o4 getMmkv() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("settings_notification_report_storage");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    @Override // x51.i0
    public int getRouteRule() {
        return 33328;
    }

    @Override // x51.i0
    public java.lang.String getTAG() {
        return "MicroMsg.SettingsNotificationReporter";
    }

    @Override // x51.i0
    public long getTryIntervalTimeMs() {
        return f315002b;
    }

    @Override // x51.i0
    public void realReport() {
        l14.e eVar = l14.e.f315008a;
        java.util.Map map = l14.e.f315009b;
        ((java.util.LinkedHashMap) map).clear();
        eVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationReporter", "dailyReport reportParams: " + map);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Ej("msg_notify_status_polling", map, 33328);
        }
    }

    @Override // x51.i0
    public void setEventId(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
    }

    @Override // x51.i0
    public void setMmkv(com.tencent.mm.sdk.platformtools.o4 value) {
        kotlin.jvm.internal.o.g(value, "value");
    }

    @Override // x51.i0
    public void setRouteRule(int i17) {
    }

    @Override // x51.i0
    public void setTAG(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
    }

    @Override // x51.i0
    public void setTryIntervalTimeMs(long j17) {
        f315002b = j17;
    }
}

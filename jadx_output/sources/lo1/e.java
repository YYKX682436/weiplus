package lo1;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str) {
        super(0);
        this.f320098d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject put = new org.json.JSONObject().put("deviceId", this.f320098d).put("totalSize", 0).put("usedSize", 0).put("backupUsedSize", 0).put("lastBackupTime", 0).put("cached", false);
        kotlin.jvm.internal.o.d(put);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamJsApiEvent", "post event:deviceInfo, data:" + put);
        put.put("notify_type", "deviceInfo");
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai("wxd930c3b7cf7c92e6", put.toString());
        return jz5.f0.f302826a;
    }
}

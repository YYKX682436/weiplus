package hy4;

/* loaded from: classes8.dex */
public enum b {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public int f286086d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f286087e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f286088f = "";

    b() {
    }

    public void a(java.lang.String str, long j17, int i17, int i18, int i19, int i27, int i28) {
        if (j17 <= 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (currentTimeMillis < 0 || currentTimeMillis > 3600000) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthReport", str + "," + i18 + "," + i17 + "," + i19 + "," + currentTimeMillis + "," + i27 + "," + i28);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16488, str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i27), 0, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f286086d), this.f286088f);
    }

    public void b(int i17, int i18, int i19) {
        int h17 = ot0.g0.h();
        if (h17 == 100) {
            h17 = 0;
        }
        if (i18 < 0 || i18 > 3600000) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17614, java.lang.Integer.valueOf(this.f286086d), java.lang.Integer.valueOf(this.f286087e), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public void d(int i17, java.lang.String str) {
        this.f286086d = (int) (java.lang.System.currentTimeMillis() / 1000);
        this.f286087e = i17;
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        this.f286088f = com.tencent.mm.sdk.platformtools.y9.a(str);
    }
}

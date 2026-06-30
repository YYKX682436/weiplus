package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sport.model.j f171781a;

    /* renamed from: b, reason: collision with root package name */
    public long f171782b;

    /* renamed from: c, reason: collision with root package name */
    public long f171783c;

    public f() {
        ((ve4.f) com.tencent.mm.sdk.event.q.f192403a.a(ve4.f.class)).N6(gm0.j1.b().f273245h, "UploadSportStepEventHandle", new com.tencent.mm.plugin.sport.model.e(this));
    }

    public long a() {
        if (this.f171783c == 0) {
            this.f171783c = com.tencent.mm.plugin.sport.model.z.f171826a.a("KEY_LAST_UPLOAD_EXT_API_STEP_COUNT_LONG", 0L);
        }
        return this.f171783c;
    }

    public long b() {
        long g17 = com.tencent.mm.plugin.sport.model.c0.g();
        com.tencent.mm.plugin.sport.model.z zVar = com.tencent.mm.plugin.sport.model.z.f171826a;
        long a17 = zVar.a("KEY_EXT_API_LAST_STEP_TIME_LONG", 0L);
        long a18 = zVar.a("KEY_EXT_API_TODAY_STEP_LONG", 0L);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(a17);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (g17 == calendar.getTimeInMillis()) {
            return a18;
        }
        return 0L;
    }

    public final boolean c(long j17) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExtApiStepManager", "invalid step %d", java.lang.Long.valueOf(j17));
            return false;
        }
        if (this.f171781a != null) {
            gm0.j1.d().d(this.f171781a);
        }
        long c17 = c01.id.c();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExtApiStepManager", "update Api Step time: %s stepCount: %s", com.tencent.mm.plugin.sport.model.c0.f(c17), java.lang.Long.valueOf(j17));
        this.f171781a = new com.tencent.mm.plugin.sport.model.j("", "gh_43f2581f6fd6", (int) (calendar.getTimeInMillis() / 1000), (int) (c17 / 1000), (int) j17, com.tencent.mm.storage.la.m0(), 2);
        gm0.j1.d().g(this.f171781a);
        this.f171782b = c17;
        com.tencent.mm.plugin.sport.model.z zVar = com.tencent.mm.plugin.sport.model.z.f171826a;
        zVar.d("KEY_LAST_UPLOAD_EXT_API_STEP_TIME_LONG", c17);
        this.f171783c = j17;
        zVar.d("KEY_LAST_UPLOAD_EXT_API_STEP_COUNT_LONG", j17);
        return true;
    }
}

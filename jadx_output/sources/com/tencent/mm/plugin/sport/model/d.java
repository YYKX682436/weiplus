package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sport.model.h f171776a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sport.model.j f171777b;

    /* renamed from: c, reason: collision with root package name */
    public long f171778c;

    /* renamed from: d, reason: collision with root package name */
    public long f171779d;

    public d() {
        ((ve4.f) com.tencent.mm.sdk.event.q.f192403a.a(ve4.f.class)).N6(gm0.j1.b().f273245h, "UploadSportStepEventHandle", new com.tencent.mm.plugin.sport.model.a(this));
        this.f171776a = new com.tencent.mm.plugin.sport.model.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sport.model.d.a():long");
    }

    public void b() {
        com.tencent.mm.plugin.sport.model.h hVar = this.f171776a;
        if (hVar != null) {
            hVar.getClass();
            boolean z17 = com.tencent.mm.plugin.sport.model.c0.a(com.tencent.mm.sdk.platformtools.x2.f193071a) && com.tencent.mm.plugin.sport.model.c0.e();
            hVar.f171789i = z17;
            if (z17) {
                hVar.b();
                hVar.a();
            } else {
                hVar.b();
            }
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, new android.os.Bundle(), com.tencent.mm.plugin.sport.model.k.class, new com.tencent.mm.plugin.sport.model.c(this));
    }

    public void c(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("config", str);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, bundle, com.tencent.mm.plugin.sport.model.o.class, new com.tencent.mm.plugin.sport.model.b(this));
    }

    public final boolean d(long j17) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.DeviceStepManager", "invalid step %d", java.lang.Long.valueOf(j17));
            return false;
        }
        if (this.f171777b != null) {
            gm0.j1.d().d(this.f171777b);
        }
        long g17 = com.tencent.mm.plugin.sport.model.c0.g();
        long c17 = c01.id.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.DeviceStepManager", "update device Step time: %s stepCount: %s", com.tencent.mm.plugin.sport.model.c0.f(c17), java.lang.Long.valueOf(j17));
        this.f171777b = new com.tencent.mm.plugin.sport.model.j("", "gh_43f2581f6fd6", (int) (g17 / 1000), (int) (c17 / 1000), (int) j17, com.tencent.mm.storage.la.m0(), 1);
        gm0.j1.d().g(this.f171777b);
        this.f171779d = c17;
        com.tencent.mm.plugin.sport.model.z zVar = com.tencent.mm.plugin.sport.model.z.f171826a;
        zVar.d("KEY_LAST_UPLOAD_DEVICE_STEP_TIME_LONG", c17);
        this.f171778c = j17;
        zVar.d("KEY_LAST_UPLOAD_DEVICE_STEP_COUNT_LONG", j17);
        return true;
    }
}

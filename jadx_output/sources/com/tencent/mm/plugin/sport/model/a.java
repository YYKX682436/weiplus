package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class a implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sport.model.d f171770d;

    public a(com.tencent.mm.plugin.sport.model.d dVar) {
        this.f171770d = dVar;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = num.intValue();
        com.tencent.mm.plugin.sport.model.d dVar = this.f171770d;
        if (intValue == 1 || intValue == 2 || intValue == 3) {
            com.tencent.mm.plugin.sport.model.t.d();
            dVar.getClass();
            if (com.tencent.mm.plugin.sport.model.c0.a(com.tencent.mm.sdk.platformtools.x2.f193071a) && com.tencent.mm.plugin.sport.model.c0.e()) {
                dVar.b();
                long a17 = dVar.a();
                if (num.intValue() == 1) {
                    r5 = dVar.d(a17);
                } else {
                    if (dVar.f171778c == 0) {
                        dVar.f171778c = com.tencent.mm.plugin.sport.model.z.f171826a.a("KEY_LAST_UPLOAD_DEVICE_STEP_COUNT_LONG", 0L);
                    }
                    if (com.tencent.mm.plugin.sport.model.c0.c(dVar.f171778c, a17)) {
                        r5 = dVar.d(a17);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.DeviceStepManager", "upload step %d %d %b", num, java.lang.Long.valueOf(a17), java.lang.Boolean.valueOf(r5));
                return;
            }
            return;
        }
        if (intValue == 4 || intValue == 5) {
            com.tencent.mm.plugin.sport.model.t.d();
            dVar.getClass();
            if (com.tencent.mm.plugin.sport.model.c0.a(com.tencent.mm.sdk.platformtools.x2.f193071a) && com.tencent.mm.plugin.sport.model.c0.e()) {
                dVar.b();
                long a18 = dVar.a();
                if (dVar.f171779d == 0) {
                    dVar.f171779d = com.tencent.mm.plugin.sport.model.z.f171826a.a("KEY_LAST_UPLOAD_DEVICE_STEP_TIME_LONG", 0L);
                }
                boolean d17 = com.tencent.mm.plugin.sport.model.c0.d(dVar.f171779d, c01.id.c());
                if (dVar.f171778c == 0) {
                    dVar.f171778c = com.tencent.mm.plugin.sport.model.z.f171826a.a("KEY_LAST_UPLOAD_DEVICE_STEP_COUNT_LONG", 0L);
                }
                boolean c17 = com.tencent.mm.plugin.sport.model.c0.c(dVar.f171778c, a18);
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.DeviceStepManager", "upload step %d %d result %b timeCondition %b stepCountCondition %b", num, java.lang.Long.valueOf(a18), java.lang.Boolean.valueOf((c17 || d17) ? dVar.d(a18) : false), java.lang.Boolean.valueOf(d17), java.lang.Boolean.valueOf(c17));
            }
        }
    }
}

package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class e implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sport.model.f f171780d;

    public e(com.tencent.mm.plugin.sport.model.f fVar) {
        this.f171780d = fVar;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = num.intValue();
        com.tencent.mm.plugin.sport.model.f fVar = this.f171780d;
        if (intValue != 1 && intValue != 2 && intValue != 3) {
            if ((intValue == 4 || intValue == 5) && com.tencent.mm.plugin.sport.model.c0.b()) {
                long b17 = fVar.b();
                if (fVar.f171782b == 0) {
                    fVar.f171782b = com.tencent.mm.plugin.sport.model.z.f171826a.a("KEY_LAST_UPLOAD_EXT_API_STEP_TIME_LONG", 0L);
                }
                boolean d17 = com.tencent.mm.plugin.sport.model.c0.d(fVar.f171782b, c01.id.c());
                boolean c17 = com.tencent.mm.plugin.sport.model.c0.c(fVar.a(), b17);
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExtApiStepManager", "upload step %d %d result %b timeCondition %b stepCountCondition %b", num, java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf((c17 || d17) ? fVar.c(b17) : false), java.lang.Boolean.valueOf(d17), java.lang.Boolean.valueOf(c17));
                return;
            }
            return;
        }
        if (com.tencent.mm.plugin.sport.model.c0.b()) {
            long b18 = fVar.b();
            if (num.intValue() == 1) {
                r2 = fVar.c(b18);
                com.tencent.mm.autogen.events.ExtStepCountEvent extStepCountEvent = new com.tencent.mm.autogen.events.ExtStepCountEvent();
                extStepCountEvent.f54211g.f7989a = 1;
                extStepCountEvent.b(android.os.Looper.getMainLooper());
            } else if (com.tencent.mm.plugin.sport.model.c0.c(fVar.a(), b18)) {
                r2 = fVar.c(b18);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExtApiStepManager", "upload step %d %d %b", num, java.lang.Long.valueOf(b18), java.lang.Boolean.valueOf(r2));
        }
    }
}

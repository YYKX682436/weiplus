package me0;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17;
        com.tencent.mm.autogen.events.ExtStepCountEvent extStepCountEvent = (com.tencent.mm.autogen.events.ExtStepCountEvent) iEvent;
        com.tencent.mm.plugin.sport.model.f Ai = ((ue4.r) i95.n0.c(ue4.r.class)).Ai();
        Ai.getClass();
        am.t8 t8Var = extStepCountEvent.f54211g;
        int i18 = t8Var.f7989a;
        am.u8 u8Var = extStepCountEvent.f54212h;
        if (i18 != 2) {
            if (i18 == 3) {
                try {
                    org.json.JSONObject c17 = com.tencent.mm.plugin.sport.model.t.c();
                    org.json.JSONObject optJSONObject = c17.optJSONObject("extStepApiConfig");
                    if (optJSONObject == null) {
                        optJSONObject = c17.optJSONObject("stepExtConfig");
                    }
                    if (optJSONObject != null) {
                        u8Var.f8056a = optJSONObject.toString();
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(u8Var.f8056a)) {
                        jx3.f.INSTANCE.idkeyStat(625L, 5L, 1L, false);
                        u8Var.f8058c = 3905;
                    } else {
                        u8Var.f8058c = 1;
                    }
                } catch (java.lang.Exception unused) {
                    jx3.f.INSTANCE.idkeyStat(625L, 6L, 1L, false);
                    u8Var.f8058c = 3905;
                }
                u8Var.f8057b = true;
            }
            return true;
        }
        long j17 = t8Var.f7990b;
        long c18 = c01.id.c();
        long j18 = extStepCountEvent.f54211g.f7991c;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExtApiStepManager", "ExtStepCountEvent PASSIVE_UPDATE stepCount:%s timestamp:%s version:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c18), java.lang.Long.valueOf(j18));
        if (!com.tencent.mm.plugin.sport.model.c0.e()) {
            i17 = 3906;
        } else if (com.tencent.mm.plugin.sport.model.c0.b()) {
            com.tencent.mm.plugin.sport.model.z zVar = com.tencent.mm.plugin.sport.model.z.f171826a;
            long a17 = zVar.a("KEY_EXT_API_LAST_STEP_TIME_LONG", 0L);
            long a18 = zVar.a("KEY_EXT_API_TODAY_STEP_LONG", 0L);
            if (c18 - a17 < 300000) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Sport.ExtApiStepManager", "update interval must larger than 5 minute, lastUpdateTime:%d lastUpdateStep:%d newUpdateTime:%d newUpdateStep:%d", java.lang.Long.valueOf(a17), java.lang.Long.valueOf(a18), java.lang.Long.valueOf(c18), java.lang.Long.valueOf(j17));
                i17 = 3903;
            } else {
                org.json.JSONObject c19 = com.tencent.mm.plugin.sport.model.t.c();
                if (!com.tencent.mm.sdk.platformtools.t8.T0(c18, a17)) {
                    a17 = com.tencent.mm.plugin.sport.model.c0.g();
                    a18 = 0;
                }
                long j19 = c18 - a17;
                long optInt = ((j19 / 300000) + (j19 % 300000 > 0 ? 1 : 0)) * c19.optInt("stepCounterMaxStep5m");
                long j27 = j17 - a18;
                if (j27 < 0 || j27 > optInt) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Sport.ExtApiStepManager", "invalid step in 5 minute actual: %d max: %d", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(optInt));
                    i17 = 3904;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExtApiStepManager", "can update time: %s, step: %d", com.tencent.mm.plugin.sport.model.c0.f(c18), java.lang.Long.valueOf(j17));
                    zVar.d("KEY_EXT_API_LAST_STEP_TIME_LONG", c18);
                    zVar.d("KEY_EXT_API_TODAY_STEP_LONG", j17);
                    zVar.d("KEY_EXT_API_VERSION_LONG", j18);
                    i17 = 1;
                }
            }
        } else {
            i17 = 3902;
        }
        u8Var.f8058c = i17;
        if (i17 == 1) {
            if (Ai.f171782b == 0) {
                Ai.f171782b = com.tencent.mm.plugin.sport.model.z.f171826a.a("KEY_LAST_UPLOAD_EXT_API_STEP_TIME_LONG", 0L);
            }
            boolean d17 = com.tencent.mm.plugin.sport.model.c0.d(Ai.f171782b, c18);
            boolean c27 = com.tencent.mm.plugin.sport.model.c0.c(Ai.a(), j17);
            if (d17 && c27) {
                Ai.c(j17);
                jx3.f.INSTANCE.idkeyStat(625L, 1L, 1L, false);
            } else {
                jx3.f.INSTANCE.idkeyStat(625L, 2L, 1L, false);
            }
        } else {
            jx3.f.INSTANCE.idkeyStat(625L, 4L, 1L, false);
        }
        u8Var.f8057b = true;
        return true;
    }
}

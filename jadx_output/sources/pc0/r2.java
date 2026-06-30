package pc0;

/* loaded from: classes4.dex */
public final class r2 extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.m.r();
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q && !gm0.m.r()) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_VIDEO_RECORD_CLEAN_BG_MIX_TASK_TIME_LONG;
            java.lang.Object m17 = c17.m(u3Var, 0L);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
            if (com.tencent.mm.sdk.platformtools.t8.H1(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) m17)) > 86400) {
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                lt3.n nVar = lt3.n.f321260a;
                lt3.h hVar = lt3.n.f321261b;
                hVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "clean expired task, num:" + hVar.f321243d.delete(lt3.h.f321242f, "timeStamp< ?-expiredTime", new java.lang.String[]{"" + java.lang.System.currentTimeMillis()}));
            }
        }
    }
}

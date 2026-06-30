package urgen.ur_7522;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lurgen/ur_7522/URS_5E95;", "", "()V", "UR_17B3", "", "UR_6D25", "", "appId", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class URS_5E95 {
    public static final urgen.ur_7522.URS_5E95 INSTANCE = new urgen.ur_7522.URS_5E95();

    private URS_5E95() {
    }

    public static final byte[] UR_17B3() {
        bw5.r6 r6Var;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ecs_order_and_card_take_poi_for_preload_android, 1) == 1) {
            r6Var = ((j20.o) ((c00.y3) i95.n0.c(c00.y3.class))).Ri(1, 0);
        } else {
            r6Var = new bw5.r6();
            r6Var.f32413d = 106;
            r6Var.f32417h[1] = true;
        }
        return r6Var.toByteArray();
    }

    public static final java.lang.String UR_6D25(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        g20.g gVar = (g20.g) ((c00.x3) i95.n0.c(c00.x3.class));
        gVar.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (appId.length() > 0) {
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "main thread conf:" + gVar.f267773d);
                return gVar.f267773d;
            }
            long c17 = c01.id.c();
            z20.e eVar = z20.e.f469542d;
            z20.b bVar = new z20.b();
            bVar.f469537a = eVar;
            bw5.q9 q9Var = new bw5.q9();
            q9Var.f31999d = "getFrontendConfigTimeCost";
            q9Var.f32013u[1] = true;
            q9Var.c(java.lang.System.currentTimeMillis());
            q9Var.b(2);
            bVar.f469538b = q9Var;
            bVar.f(java.lang.String.valueOf(c17));
            bVar.a();
            try {
                com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(((com.tencent.mm.plugin.appbrand.service.o6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class)).Dh(appId, 0).field_pkgPath);
                y8Var.a();
                java.io.InputStream c18 = y8Var.c("/ecs_client_prefetch.json");
                try {
                    kotlin.jvm.internal.o.d(c18);
                    java.lang.String str2 = new java.lang.String(vz5.a.c(c18), r26.c.f368865a);
                    vz5.b.a(c18, null);
                    gVar.f267773d = str2;
                    z20.e eVar2 = z20.e.f469544f;
                    z20.b bVar2 = new z20.b();
                    bVar2.f469537a = eVar2;
                    bw5.q9 q9Var2 = new bw5.q9();
                    q9Var2.f31999d = "getFrontendConfigTimeCost";
                    q9Var2.f32013u[1] = true;
                    q9Var2.c(java.lang.System.currentTimeMillis());
                    q9Var2.b(2);
                    bVar2.f469538b = q9Var2;
                    bVar2.f(java.lang.String.valueOf(c17));
                    bVar2.a();
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "getFrontendConfig (" + java.lang.Thread.currentThread().getName() + ") " + appId + " timeCost:" + (c01.id.c() - c17) + ",ecs_client_prefetch.json -> " + gVar.f267773d);
                    return gVar.f267773d;
                } finally {
                }
            } catch (java.lang.Exception unused) {
                z20.e eVar3 = z20.e.f469545g;
                z20.b bVar3 = new z20.b();
                bVar3.f469537a = eVar3;
                bw5.q9 q9Var3 = new bw5.q9();
                q9Var3.f31999d = "getFrontendConfigTimeCost";
                q9Var3.f32013u[1] = true;
                q9Var3.c(java.lang.System.currentTimeMillis());
                q9Var3.b(2);
                bVar3.f469538b = q9Var3;
                bVar3.f(java.lang.String.valueOf(c17));
                bVar3.a();
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "getFrontendConfig " + appId + " timeCost:" + (c01.id.c() - c17) + ",no ecs_client_prefetch.json");
            }
        }
        return gVar.f267773d;
    }
}

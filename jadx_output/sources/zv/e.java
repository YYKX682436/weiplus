package zv;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475936d;

    public e(boolean z17) {
        this.f475936d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        zv.l.f476018c = true;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (!this.f475936d) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(32325, "EcsBrandEntryActive", 2, "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.util.List<java.lang.String> c17 = zv.l.f476016a.c(zv.g.f475971d);
            com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            for (java.lang.String str : c17) {
                com.tencent.mm.storage.l4 p17 = Di.p(str);
                if (kotlin.jvm.internal.o.b(p17 != null ? p17.W0() : null, "service_officialaccounts")) {
                    Di.M(str);
                }
            }
            Di.k("service_officialaccounts");
            zv.l lVar = zv.l.f476016a;
            lVar.d().putBoolean("key_mmkv_had_enable_brand_service_entry_2", false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(32325, "EcsBrandEntryActive", 3, "" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", "applyBrandServiceEntryEnable, expand finish, using " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            lVar.d().putBoolean("key_mmkv_had_enable_brand_service_entry_2", false);
            lVar.d().putBoolean("key_mmkv_had_checked_place_top", false);
            zv.l.f476018c = false;
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(32325, "EcsBrandEntryActive", 0, "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        zv.l lVar2 = zv.l.f476016a;
        h0Var.f310123d = lVar2.c(zv.d.f475927d);
        com.tencent.mm.storage.m4 Di2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        h0Var.f310123d = zv.l.a(lVar2, (java.util.List) h0Var.f310123d);
        if (!r12.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.Collection) h0Var.f310123d);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (arrayList.size() > 3) {
                arrayList2.addAll(arrayList.subList(arrayList.size() - 3, arrayList.size()));
                arrayList.removeAll(kz5.n0.X0(arrayList2));
                z17 = false;
            } else {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", "applyBrandServiceEntryEnable, delayList:%d, batchList:%d", java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
            Di2.Q((java.lang.String[]) arrayList.toArray(new java.lang.String[0]), "service_officialaccounts", z17, true);
            Di2.b(5, Di2, "");
            ku5.u0 u0Var = ku5.t0.f312615d;
            zv.c cVar = new zv.c(Di2, arrayList2, h0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(cVar, 5000L, null);
            ((vw.o) ((rv.a3) i95.n0.c(rv.a3.class))).getClass();
            if (((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui()) {
                dw.f.f244070a.a();
            }
            g0Var.d(32325, "EcsBrandEntryActive", 1, "" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", "applyBrandServiceEntryEnable, collect finish, using " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", "hy: no brand service account in conversation! no need to display entry");
            lVar2.d().putBoolean("key_mmkv_had_enable_brand_service_entry_2", true);
        }
        zv.l.f476018c = false;
    }
}

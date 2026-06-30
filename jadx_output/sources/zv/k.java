package zv;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f476008d;

    public k(boolean z17) {
        this.f476008d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.tencent.mm.storage.l4 p17 = Di.p("notifymessage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hy: cluster parent ref is ");
        sb6.append(p17 != null ? p17.W0() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", sb6.toString());
        int i17 = 0;
        if (kotlin.jvm.internal.o.b(p17 != null ? p17.W0() : null, "service_officialaccounts")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(32325, "EcsBrandEntryErrReport", 0, "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            Di.M("notifymessage");
        }
        if (this.f476008d) {
            zv.l lVar = zv.l.f476016a;
            if (lVar.d().getBoolean("key_mmkv_had_checked_place_top", false)) {
                return;
            }
            java.util.List<java.lang.String> c17 = lVar.c(zv.f.f475962d);
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", "hy: place top brand service list size:" + c17.size());
            if (!c17.isEmpty()) {
                for (java.lang.String str : c17) {
                    com.tencent.mm.storage.m4 Di2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                    com.tencent.mm.storage.l4 p18 = Di2.p(str);
                    if (kotlin.jvm.internal.o.b(p18 != null ? p18.W0() : null, "service_officialaccounts")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", "hy: releasing " + str + " outside");
                        i17++;
                        Di2.M(str);
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hy: ");
                        sb7.append(str);
                        sb7.append(" is placed-top but parent is ");
                        sb7.append(p18 != null ? p18.W0() : null);
                        sb7.append(" so no need to remove parent");
                        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", sb7.toString());
                    }
                }
                if (i17 > 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(32325, "EcsBrandReleasePlaceTop", java.lang.Integer.valueOf(i17), "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                }
            }
            zv.l.f476016a.d().putBoolean("key_mmkv_had_checked_place_top", true);
        }
    }
}

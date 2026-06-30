package qi4;

/* loaded from: classes11.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final qi4.t f363787d = new qi4.t();

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = 1;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.textstatus.multiple.RepairerConfigTextStatusCacheBigPBOpt()) != 1) {
            qi4.v vVar = qi4.v.f363788a;
            synchronized (vVar) {
                qi4.q qVar = qi4.v.f363791d;
                qi4.q qVar2 = qi4.q.f363782e;
                if (qVar != qVar2) {
                    java.lang.String str = qi4.v.f363791d.f363786d;
                } else {
                    qi4.v.f363791d = qi4.q.f363783f;
                    vVar.b();
                    com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] start");
                    long c17 = c01.id.c() - com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    bw5.um0 selectStatusInfoWithUsername = com.tencent.wechat.aff.status.StatusStorageManager.getInstance().selectStatusInfoWithUsername("", 0, -1, c17);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    if (selectStatusInfoWithUsername == null || !selectStatusInfoWithUsername.f33984d) {
                        com.tencent.mars.xlog.Log.e("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] failed, cost = " + currentTimeMillis2);
                        synchronized (vVar) {
                            qi4.v.f363791d = qVar2;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] load aff db with all users success, size = " + selectStatusInfoWithUsername.f33987g.size() + " cost = " + currentTimeMillis2);
                        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator it = selectStatusInfoWithUsername.f33987g.iterator();
                        while (it.hasNext()) {
                            bw5.sm0 sm0Var = (bw5.sm0) it.next();
                            ai4.f fVar = ai4.f.f5139a;
                            kotlin.jvm.internal.o.d(sm0Var);
                            arrayList.add(ai4.f.e(fVar, sm0Var, null, 2, null));
                        }
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] transform textStatusInfo success, size = " + selectStatusInfoWithUsername.f33987g.size() + " cost = " + (currentTimeMillis4 - currentTimeMillis3));
                        synchronized (vVar) {
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                mj4.k kVar = (mj4.k) ((mj4.h) it6.next());
                                qi4.v.f363789b.put(kVar.o(), kVar);
                            }
                            qi4.v.f363791d = qi4.q.f363784g;
                        }
                        long currentTimeMillis5 = java.lang.System.currentTimeMillis();
                        qi4.v.f363792e.countDown();
                        com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] finish, update cache cost: " + (currentTimeMillis5 - currentTimeMillis4));
                    }
                }
            }
            return;
        }
        qi4.v vVar2 = qi4.v.f363788a;
        synchronized (vVar2) {
            if (qi4.v.f363791d != qi4.q.f363782e) {
                java.lang.String str2 = qi4.v.f363791d.f363786d;
            } else {
                qi4.v.f363791d = qi4.q.f363783f;
                vVar2.b();
                com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDayWithEachUsers] start");
                long c18 = c01.id.c() - com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
                long currentTimeMillis6 = java.lang.System.currentTimeMillis();
                java.util.HashSet hashSet = new java.util.HashSet();
                boolean a17 = com.tencent.mm.contact.d.f64855g.a();
                p75.d dVar = dm.e2.T1;
                l75.e0 e0Var = com.tencent.mm.contact.s.G2;
                int i18 = 0;
                p75.m c19 = dVar.g(1, 1).c(new p75.o0("type", 32, 0)).c(new p75.o0("type", 8, 0));
                com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
                p75.m c27 = c19.c(new p75.o0("verifyFlag", 8, 0)).c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
                p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dm.e2.P1));
                g17.f352656c = "StatusJVMCacheStorage";
                g17.f352657d = c27;
                p75.l0 a18 = g17.a();
                l75.k0 k0Var = gm0.j1.u().f273153f;
                if (!k0Var.isOpen()) {
                    k0Var = null;
                }
                java.util.Iterator it7 = ((java.util.ArrayList) a18.l(k0Var)).iterator();
                while (it7.hasNext()) {
                    hashSet.add((java.lang.String) it7.next());
                }
                long currentTimeMillis7 = java.lang.System.currentTimeMillis() - currentTimeMillis6;
                int size = hashSet.size();
                com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDayWithEachUsers] read contacts with all users success(opt), size = " + size + " cost = " + currentTimeMillis7);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it8 = hashSet.iterator();
                while (it8.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it8.next();
                    if ((str3.length() > 0 ? i17 : i18) != 0) {
                        int i19 = i18;
                        java.util.ArrayList arrayList3 = arrayList2;
                        bw5.um0 selectStatusInfoWithUsername2 = com.tencent.wechat.aff.status.StatusStorageManager.getInstance().selectStatusInfoWithUsername(str3, 0, 1, c18);
                        if (selectStatusInfoWithUsername2 != null && selectStatusInfoWithUsername2.f33984d && selectStatusInfoWithUsername2.f33987g.size() > 0) {
                            ai4.f fVar2 = ai4.f.f5139a;
                            java.lang.Object obj = selectStatusInfoWithUsername2.f33987g.get(i19);
                            kotlin.jvm.internal.o.f(obj, "get(...)");
                            arrayList3.add(ai4.f.e(fVar2, (bw5.sm0) obj, null, 2, null));
                        }
                        i18 = i19;
                        arrayList2 = arrayList3;
                        i17 = 1;
                    }
                }
                java.util.ArrayList arrayList4 = arrayList2;
                com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDayWithEachUsers] load aff db with all users success, size = " + arrayList4.size() + '/' + size + " cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis6));
                long currentTimeMillis8 = java.lang.System.currentTimeMillis();
                long currentTimeMillis9 = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDayWithEachUsers] transform textStatusInfo success, size = " + arrayList4.size() + " cost = " + (currentTimeMillis9 - currentTimeMillis8));
                synchronized (vVar2) {
                    java.util.Iterator it9 = arrayList4.iterator();
                    while (it9.hasNext()) {
                        mj4.k kVar2 = (mj4.k) ((mj4.h) it9.next());
                        qi4.v.f363789b.put(kVar2.o(), kVar2);
                    }
                    qi4.v.f363791d = qi4.q.f363784g;
                }
                long currentTimeMillis10 = java.lang.System.currentTimeMillis();
                qi4.v.f363792e.countDown();
                com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] finish, update cache cost: " + (currentTimeMillis10 - currentTimeMillis9));
            }
        }
    }
}

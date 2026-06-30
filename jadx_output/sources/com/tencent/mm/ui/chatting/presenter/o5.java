package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class o5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.b6 f202411d;

    public o5(com.tencent.mm.ui.chatting.presenter.b6 b6Var) {
        this.f202411d = b6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f202411d.f202139s.set(false);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.chatting.presenter.b6 b6Var = this.f202411d;
        b6Var.getClass();
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).f1(b6Var.f202542e, new java.lang.String[]{"msgId", "createTime"}, com.tencent.mm.ui.chatting.presenter.b6.f202137t);
        if (f17 != null) {
            while (f17.moveToNext()) {
                try {
                    arrayList.add(new long[]{f17.getLong(0), f17.getLong(1)});
                } finally {
                    f17.close();
                }
            }
        }
        java.lang.Object[] objArr = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis3), java.lang.Integer.valueOf(arrayList.size())};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShopAndProductListPresenter", "[perf] Phase1a-idOnly:%dms, count:%d", objArr);
        if (arrayList.isEmpty() || b6Var.f202139s.get()) {
            j17 = currentTimeMillis;
            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        } else {
            java.util.Collections.sort(arrayList, new com.tencent.mm.ui.chatting.presenter.p5(b6Var));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                arrayList2.add(java.lang.Long.valueOf(((long[]) arrayList.get(i18))[0]));
            }
            arrayList.clear();
            long currentTimeMillis4 = java.lang.System.currentTimeMillis();
            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
            java.lang.String X8 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).X8(b6Var.f202542e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i19 = 0; i19 < 9; i19++) {
                if (i19 > 0) {
                    sb6.append(",");
                }
                sb6.append(com.tencent.mm.ui.chatting.presenter.b6.f202138u[i19]);
            }
            java.lang.String str = "SELECT " + ((java.lang.Object) sb6) + " FROM " + X8 + " WHERE msgId IN (";
            int size = ((arrayList2.size() + 200) - 1) / 200;
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
            j17 = currentTimeMillis;
            int i27 = 0;
            while (i27 < arrayList2.size()) {
                int i28 = i27 + 200;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                int i29 = i27;
                for (int min = java.lang.Math.min(i28, arrayList2.size()); i29 < min; min = min) {
                    if (i29 > i27) {
                        sb7.append(",");
                    }
                    sb7.append(arrayList2.get(i29));
                    i29++;
                }
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.q5(b6Var, str + sb7.toString() + ")", concurrentHashMap, countDownLatch));
                i27 = i28;
            }
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShopAndProductListPresenter", "[perf] Phase1b-rawQuery:%dms, batches:%d, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis4), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(concurrentHashMap.size()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShopAndProductListPresenter", "[loadData][perf] Phase1-batchQuery:%dms, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Integer.valueOf(concurrentHashMap.size()));
        if (concurrentHashMap.isEmpty() || this.f202411d.f202139s.get()) {
            if (this.f202411d.f202139s.get()) {
                return;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.n5(this));
            return;
        }
        com.tencent.mm.storage.a3 z07 = com.tencent.mm.storage.z3.R4(this.f202411d.f202542e) ? ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(this.f202411d.f202542e) : null;
        com.tencent.mm.ui.chatting.presenter.b6 b6Var2 = this.f202411d;
        b6Var2.getClass();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(concurrentHashMap.values());
        java.util.Collections.sort(arrayList3, new com.tencent.mm.ui.chatting.presenter.r5(b6Var2));
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3.size());
        for (int i37 = 0; i37 < arrayList3.size(); i37++) {
            arrayList4.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) arrayList3.get(i37)).getMsgId()));
        }
        long currentTimeMillis5 = java.lang.System.currentTimeMillis();
        int i38 = 0;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        com.tencent.mm.ui.chatting.presenter.b6 b6Var3 = this.f202411d;
        b6Var3.getClass();
        if (!arrayList4.isEmpty() && !b6Var3.f202139s.get()) {
            int size2 = arrayList4.size();
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
            java.util.concurrent.CountDownLatch countDownLatch2 = new java.util.concurrent.CountDownLatch(((size2 + 50) - 1) / 50);
            while (i38 < size2) {
                int i39 = i38 + 50;
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.s5(b6Var3, i38, java.lang.Math.min(i39, size2), arrayList4, concurrentHashMap, z07, concurrentLinkedQueue, countDownLatch2));
                i38 = i39;
            }
            try {
                countDownLatch2.await();
            } catch (java.lang.InterruptedException unused2) {
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList(concurrentLinkedQueue);
            java.util.Collections.sort(arrayList5, new com.tencent.mm.ui.chatting.presenter.t5(b6Var3));
            java.util.Iterator it = arrayList5.iterator();
            long j18 = 0;
            while (it.hasNext()) {
                com.tencent.mm.ui.chatting.presenter.z5 z5Var = (com.tencent.mm.ui.chatting.presenter.z5) it.next();
                long a17 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(z5Var.f198408a));
                if (j18 != a17) {
                    b6Var3.f202546i.add(new com.tencent.mm.ui.chatting.adapter.g0(z5Var.f198408a));
                    j18 = a17;
                }
                b6Var3.f202546i.add(z5Var);
                atomicInteger.incrementAndGet();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShopAndProductListPresenter", "[loadData][perf] Phase3-parse+drain:%dms, validItems:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis5), java.lang.Integer.valueOf(atomicInteger.get()));
        com.tencent.mm.ui.chatting.presenter.b6 b6Var4 = this.f202411d;
        int i47 = atomicInteger.get();
        if (!b6Var4.f202139s.get()) {
            b6Var4.n();
            if (!b6Var4.f202546i.isEmpty()) {
                if (((com.tencent.mm.ui.chatting.adapter.f0) b6Var4.f202546i.get(r3.size() - 1)).a() == 2147483646) {
                    b6Var4.f202546i.remove(r3.size() - 1);
                }
            }
            b6Var4.f202547m = b6Var4.f202546i;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.u5(b6Var4, i47));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShopAndProductListPresenter", "[loadData][perf][final] total:%dms, items:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Integer.valueOf(atomicInteger.get()));
    }
}

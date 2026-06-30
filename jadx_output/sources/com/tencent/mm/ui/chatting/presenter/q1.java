package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f202428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.p1 f202429e;

    public q1(com.tencent.mm.ui.chatting.presenter.p1 p1Var, boolean z17) {
        this.f202429e = p1Var;
        this.f202428d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        xg3.m0 u17 = c01.d9.b().u();
        java.lang.String str = this.f202429e.f202542e;
        int[] iArr = com.tencent.mm.ui.chatting.presenter.p1.f202416t;
        int T1 = ((com.tencent.mm.storage.g9) u17).T1(str, iArr);
        java.lang.Object[] objArr = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Integer.valueOf(T1)};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf] Step1-count:%dms, total:%d", objArr);
        if (T1 <= 0 || this.f202429e.f202419s.get()) {
            com.tencent.mm.ui.chatting.presenter.p1.p(this.f202429e, this.f202428d, currentTimeMillis);
            return;
        }
        com.tencent.mm.ui.chatting.presenter.p1 p1Var = this.f202429e;
        p1Var.getClass();
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).f1(p1Var.f202542e, com.tencent.mm.ui.chatting.presenter.p1.f202417u, iArr);
        if (f17 != null) {
            while (f17.moveToNext()) {
                try {
                    arrayList.add(new long[]{f17.getLong(0), f17.getLong(1)});
                } finally {
                    f17.close();
                }
            }
        }
        arrayList.sort(new com.tencent.mm.ui.chatting.presenter.p1$$a());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((long[]) it.next())[0]));
        }
        java.lang.Object[] objArr2 = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis3), java.lang.Integer.valueOf(arrayList2.size())};
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf] Step2a-idOnly+sort:%dms, count:%d", objArr2);
        if (arrayList2.isEmpty() || this.f202429e.f202419s.get()) {
            com.tencent.mm.ui.chatting.presenter.p1.p(this.f202429e, this.f202428d, currentTimeMillis);
            return;
        }
        com.tencent.mm.ui.chatting.presenter.p1 p1Var2 = this.f202429e;
        p1Var2.getClass();
        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.lang.String X8 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).X8(p1Var2.f202542e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < 10; i19++) {
            if (i19 > 0) {
                sb6.append(",");
            }
            sb6.append(com.tencent.mm.ui.chatting.presenter.p1.f202418v[i19]);
        }
        java.lang.String str2 = "SELECT " + sb6.toString() + " FROM " + X8 + " WHERE msgId IN (";
        int size = ((arrayList2.size() + 200) - 1) / 200;
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
        int i27 = 0;
        while (i27 < arrayList2.size()) {
            int i28 = i27 + 200;
            int min = java.lang.Math.min(i28, arrayList2.size());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            long j17 = currentTimeMillis;
            for (int i29 = i27; i29 < min; i29++) {
                if (i29 > i27) {
                    sb7.append(",");
                }
                sb7.append(arrayList2.get(i29));
            }
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.s1(p1Var2, str2 + sb7.toString() + ")", concurrentHashMap, countDownLatch));
            i27 = i28;
            currentTimeMillis = j17;
        }
        long j18 = currentTimeMillis;
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
        }
        java.lang.Object[] objArr3 = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis4), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(concurrentHashMap.size())};
        int i37 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf] Step2b-rawQuery:%dms, batches:%d, found:%d", objArr3);
        com.tencent.mm.ui.chatting.presenter.p1 p1Var3 = this.f202429e;
        p1Var3.getClass();
        long currentTimeMillis5 = java.lang.System.currentTimeMillis();
        int size2 = arrayList2.size();
        if (size2 != 0 && !p1Var3.f202419s.get()) {
            boolean R4 = com.tencent.mm.storage.z3.R4(p1Var3.f202542e);
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
            int i38 = ((size2 + 50) - 1) / 50;
            java.util.concurrent.CountDownLatch countDownLatch2 = new java.util.concurrent.CountDownLatch(i38);
            int i39 = 0;
            while (i39 < size2) {
                int i47 = i39 + 50;
                java.util.concurrent.CountDownLatch countDownLatch3 = countDownLatch2;
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.t1(p1Var3, i39, java.lang.Math.min(i47, size2), concurrentHashMap, arrayList2, R4, concurrentLinkedQueue2, countDownLatch3));
                size2 = size2;
                i39 = i47;
                countDownLatch2 = countDownLatch3;
                i38 = i38;
                concurrentLinkedQueue = concurrentLinkedQueue2;
            }
            int i48 = i38;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
            try {
                countDownLatch2.await();
            } catch (java.lang.InterruptedException unused2) {
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(concurrentLinkedQueue3);
            java.util.Collections.sort(arrayList3, new com.tencent.mm.ui.chatting.presenter.u1(p1Var3));
            java.util.Iterator it6 = arrayList3.iterator();
            long j19 = 0;
            while (it6.hasNext()) {
                com.tencent.mm.ui.chatting.presenter.y1 y1Var = (com.tencent.mm.ui.chatting.presenter.y1) it6.next();
                long a17 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(y1Var.f198408a));
                if (j19 != a17) {
                    p1Var3.f202546i.add(new com.tencent.mm.ui.chatting.adapter.g0(y1Var.f198408a));
                    j19 = a17;
                }
                p1Var3.f202546i.add(y1Var);
            }
            java.lang.Object[] objArr4 = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis5), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(arrayList3.size())};
            int i49 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf] Step3-parse+sort:%dms, chunks:%d, items:%d", objArr4);
        }
        com.tencent.mm.ui.chatting.presenter.p1.p(this.f202429e, this.f202428d, j18);
    }
}

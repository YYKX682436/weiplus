package vp;

/* loaded from: classes14.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f438839a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f438840b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f438841c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f438842d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f438843e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f438844f;

    /* renamed from: g, reason: collision with root package name */
    public u26.w f438845g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f438846h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Comparator f438847i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Comparator f438848j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f438849k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f438850l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f438851m;

    public v0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f438841c = arrayList;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f438842d = reentrantReadWriteLock;
        this.f438843e = new java.util.ArrayList();
        this.f438844f = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f438847i = vp.q0.f438824d;
        this.f438848j = vp.r0.f438826d;
        this.f438849k = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a);
        int i17 = xp.d.f().f455861r;
        this.f438839a = i17;
        reentrantReadWriteLock.writeLock().lock();
        try {
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(i17);
            for (int i18 = 0; i18 < i17; i18++) {
                arrayList2.add(new java.util.ArrayList());
            }
            arrayList.addAll(arrayList2);
            reentrantReadWriteLock.writeLock().unlock();
            java.util.List list = this.f438843e;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = this.f438844f;
            reentrantReadWriteLock2.writeLock().lock();
            try {
                list.clear();
                int i19 = this.f438839a;
                if (i19 > 0) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(i19);
                    for (int i27 = 0; i27 < i19; i27++) {
                        arrayList3.add(new java.util.ArrayList());
                    }
                    list.addAll(arrayList3);
                }
                reentrantReadWriteLock2.writeLock().unlock();
                e();
            } catch (java.lang.Throwable th6) {
                reentrantReadWriteLock2.writeLock().unlock();
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    public static final void a(vp.v0 v0Var, wp.a aVar, java.util.List list) {
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        int i17;
        java.util.List list2;
        java.util.Comparator comparator;
        java.util.ArrayList arrayList2;
        v0Var.getClass();
        java.lang.System.currentTimeMillis();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = v0Var.f438842d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            java.lang.System.currentTimeMillis();
            aVar.c();
            java.util.Iterator it6 = list.iterator();
            int i18 = 0;
            while (true) {
                boolean hasNext = it6.hasNext();
                java.util.Comparator comparator2 = v0Var.f438847i;
                long j17 = 0;
                if (hasNext) {
                    java.lang.Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.util.List list3 = (java.util.List) next;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(new jz5.l(0L, 0L));
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(new jz5.l(0L, 0L));
                    java.util.Iterator it7 = list3.iterator();
                    long j18 = 0;
                    while (true) {
                        if (!it7.hasNext()) {
                            it = it6;
                            arrayList = arrayList3;
                            i17 = i19;
                            break;
                        }
                        wp.a aVar2 = (wp.a) it7.next();
                        java.util.ArrayList arrayList5 = arrayList3;
                        aVar.B = aVar.f448335f;
                        int d17 = v0Var.d(aVar, aVar2);
                        i17 = i19;
                        java.util.Iterator it8 = it7;
                        long d18 = v0Var.d(aVar2, aVar);
                        if (d17 > 0) {
                            j17 = java.lang.Math.max(j17, d18);
                            it = it6;
                            arrayList = arrayList5;
                            if (j17 > aVar.f448345p - j18) {
                                break;
                            }
                        } else {
                            it = it6;
                            arrayList = arrayList5;
                            arrayList.add(new jz5.l(java.lang.Long.valueOf(java.lang.Math.abs(d17)), java.lang.Long.valueOf(d18)));
                        }
                        aVar.B = aVar.f448335f + aVar.f448345p;
                        int d19 = v0Var.d(aVar2, aVar);
                        long d27 = v0Var.d(aVar, aVar2);
                        if (d19 > 0) {
                            j18 = java.lang.Math.max(j18, d27);
                            if (j17 > aVar.f448345p - j18) {
                                break;
                            }
                            arrayList3 = arrayList;
                            i19 = i17;
                            it7 = it8;
                            it6 = it;
                        } else {
                            long j19 = j17;
                            arrayList4.add(new jz5.l(java.lang.Long.valueOf(java.lang.Math.abs(d19)), java.lang.Long.valueOf(d27)));
                            arrayList3 = arrayList;
                            i19 = i17;
                            it7 = it8;
                            it6 = it;
                            j17 = j19;
                        }
                    }
                    java.util.Comparator comparator3 = v0Var.f438848j;
                    kz5.g0.t(arrayList, comparator3);
                    kz5.g0.t(arrayList4, comparator3);
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i27 = 1;
                        while (i27 < size) {
                            jz5.l lVar = (jz5.l) arrayList.get(i27);
                            java.lang.Object obj = lVar.f302834e;
                            java.lang.Object obj2 = lVar.f302833d;
                            list2 = list3;
                            comparator = comparator2;
                            arrayList2 = arrayList4;
                            long max = java.lang.Math.max(((java.lang.Number) obj).longValue(), ((java.lang.Number) ((jz5.l) arrayList.get(i27 - 1)).f302834e).longValue());
                            if (j17 <= ((java.lang.Number) obj2).longValue()) {
                                break;
                            }
                            j17 = java.lang.Math.max(j17, max);
                            if (j17 > aVar.f448345p - j18) {
                                break;
                            }
                            arrayList.set(i27, new jz5.l(obj2, java.lang.Long.valueOf(max)));
                            i27++;
                            list3 = list2;
                            comparator2 = comparator;
                            arrayList4 = arrayList2;
                        }
                    }
                    list2 = list3;
                    comparator = comparator2;
                    arrayList2 = arrayList4;
                    if (!arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i28 = 1;
                        while (i28 < size2) {
                            java.util.ArrayList arrayList6 = arrayList2;
                            jz5.l lVar2 = (jz5.l) arrayList6.get(i28);
                            long max2 = java.lang.Math.max(((java.lang.Number) lVar2.f302834e).longValue(), ((java.lang.Number) ((jz5.l) arrayList6.get(i28 - 1)).f302834e).longValue());
                            if (j18 <= ((java.lang.Number) lVar2.f302833d).longValue()) {
                                break;
                            }
                            j18 = java.lang.Math.max(j18, max2);
                            if (j17 > aVar.f448345p - j18) {
                                break;
                            }
                            arrayList6.set(i28, new jz5.l(((jz5.l) arrayList6.get(i28)).f302833d, java.lang.Long.valueOf(max2)));
                            i28++;
                            arrayList2 = arrayList6;
                        }
                    }
                    if (j17 <= aVar.f448345p - j18) {
                        aVar.B = aVar.f448335f + j17;
                        java.util.List list4 = list2;
                        list4.add(aVar);
                        kz5.g0.t(list4, comparator);
                        java.lang.System.currentTimeMillis();
                        aVar.toString();
                        java.lang.System.currentTimeMillis();
                        break;
                    }
                    i18 = i17;
                    it6 = it;
                } else if (aVar.f448348s) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    aVar.B = aVar.f448335f;
                    int i29 = 0;
                    for (java.lang.Object obj3 : list) {
                        int i37 = i29 + 1;
                        if (i29 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        long j27 = 0;
                        for (wp.a aVar3 : (java.util.List) obj3) {
                            int d28 = v0Var.d(aVar3, aVar);
                            if (d28 > 0) {
                                if (aVar3.o()) {
                                    j27 = java.lang.Math.max(j27, d28);
                                } else {
                                    arrayList8.add(aVar3);
                                }
                            }
                        }
                        arrayList7.add(new jz5.o(java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(j27), arrayList8));
                        i29 = i37;
                    }
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.util.Iterator it9 = arrayList7.iterator();
                    int i38 = -1;
                    long j28 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                    while (it9.hasNext()) {
                        jz5.o oVar = (jz5.o) it9.next();
                        int intValue = ((java.lang.Number) oVar.f302841d).intValue();
                        long longValue = ((java.lang.Number) oVar.f302842e).longValue();
                        ?? r86 = (java.util.List) oVar.f302843f;
                        if (longValue < j28) {
                            arrayList9 = r86;
                            i38 = intValue;
                            j28 = longValue;
                        }
                    }
                    aVar.B += j28;
                    java.util.List list5 = (java.util.List) list.get(i38);
                    java.util.Iterator it10 = arrayList9.iterator();
                    while (it10.hasNext()) {
                        list5.remove((wp.a) it10.next());
                    }
                    list5.add(aVar);
                    kz5.g0.t(list5, comparator2);
                    java.lang.System.currentTimeMillis();
                    aVar.toString();
                    arrayList9.size();
                    java.lang.System.currentTimeMillis();
                } else {
                    java.lang.System.currentTimeMillis();
                    aVar.toString();
                    java.lang.System.currentTimeMillis();
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (java.lang.Throwable th6) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th6;
        }
    }

    public final void b(wp.a danmaku) {
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        if (this.f438850l) {
            com.tencent.mars.xlog.Log.w("DanmakuAsyncDataSource", "addDanmaku: ignored because dataSource is closed");
            return;
        }
        danmaku.toString();
        synchronized (this.f438840b) {
            if (danmaku.f448348s) {
                this.f438840b.addFirst(danmaku);
            } else {
                this.f438840b.addLast(danmaku);
            }
        }
        if (this.f438850l) {
            com.tencent.mars.xlog.Log.w("DanmakuAsyncDataSource", "addDanmakuToDrawListAsync: ignored because dataSource is closed");
        } else {
            kotlinx.coroutines.l.d(this.f438849k, null, null, new vp.n0(this, danmaku, null), 3, null);
        }
    }

    public final void c() {
        int i17 = 0;
        while (true) {
            u26.w wVar = this.f438845g;
            if (wVar == null) {
                kotlin.jvm.internal.o.o("taskChannel");
                throw null;
            }
            if (u26.c0.b(((u26.k) wVar).h()) == null) {
                if (i17 > 0) {
                    com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "cancelAllAddDanmakuJobs: cancelled " + i17 + " pending tasks");
                    return;
                }
                return;
            }
            i17++;
        }
    }

    public final int d(wp.a aVar, wp.a aVar2) {
        if (aVar.j() == -2147483646 || aVar2.j() == -2147483646) {
            return (int) ((aVar.B + aVar.f448334e.f474913a) - aVar2.B);
        }
        float[] g17 = aVar.g(aVar2.B);
        float[] g18 = aVar2.g(aVar2.B);
        if (g17 == null || g18 == null) {
            return -1;
        }
        int i17 = (int) ((g18[0] - g17[2]) / (-(((int) (r0.h() + r0.f448338i)) / (((float) ((wp.f) aVar).f448334e.f474913a) * xp.d.f().f455860q))));
        float[] g19 = aVar.g(aVar.B + aVar.f448334e.f474913a);
        float[] g27 = aVar2.g(aVar.B + aVar.f448334e.f474913a);
        if (g19 == null || g27 == null) {
            return i17;
        }
        return java.lang.Math.max(i17, (int) ((g27[0] - g19[2]) / (-(((int) (r10.h() + r10.f448338i)) / (((float) ((wp.f) aVar2).f448334e.f474913a) * xp.d.f().f455860q)))));
    }

    public final void e() {
        this.f438845g = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        this.f438846h = kotlinx.coroutines.l.d(this.f438849k, null, null, new vp.s0(this, null), 3, null);
    }

    public final void f() {
        int i17 = xp.d.f().f455861r;
        if (i17 != this.f438839a) {
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "rowCount changed from " + this.f438839a + " to " + i17 + ", reinitializing row list");
            if (this.f438850l) {
                com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateDrawListAsync: ignored because dataSource is closed");
            } else {
                this.f438851m = true;
                c();
                this.f438851m = false;
                kotlinx.coroutines.l.d(this.f438849k, null, null, new vp.t0(this, null), 3, null);
            }
            if (this.f438850l) {
                com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateFollowDrawListAsync: ignored because dataSource is closed");
            } else {
                this.f438851m = true;
                c();
                this.f438851m = false;
                kotlinx.coroutines.l.d(this.f438849k, null, null, new vp.u0(this, null), 3, null);
            }
        }
        this.f438839a = i17;
    }
}

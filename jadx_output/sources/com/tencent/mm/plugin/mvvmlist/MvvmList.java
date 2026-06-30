package com.tencent.mm.plugin.mvvmlist;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u00032\u00020\u0004:\u0001\u0012BW\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lxm3/d;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/y;", "Landroidx/lifecycle/v;", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lxm3/n0;", "initConfig", "lifecycleOwner", "Lv65/i;", "workerScope", "", "initDataList", "<init>", "(Lym3/f;Lxm3/n0;Landroidx/lifecycle/y;Lv65/i;Ljava/util/List;)V", "xm3/i", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class MvvmList<T extends xm3.d> implements androidx.lifecycle.y, androidx.lifecycle.v {

    /* renamed from: d */
    public final ym3.f f152057d;

    /* renamed from: e */
    public final xm3.n0 f152058e;

    /* renamed from: f */
    public final androidx.lifecycle.y f152059f;

    /* renamed from: g */
    public final v65.i f152060g;

    /* renamed from: h */
    public final java.util.List f152061h;

    /* renamed from: i */
    public boolean f152062i;

    /* renamed from: m */
    public boolean f152063m;

    /* renamed from: n */
    public volatile int f152064n;

    /* renamed from: o */
    public final java.util.ArrayList f152065o;

    /* renamed from: p */
    public final java.util.ArrayList f152066p;

    /* renamed from: q */
    public xm3.m0 f152067q;

    /* renamed from: r */
    public final androidx.lifecycle.j0 f152068r;

    /* renamed from: s */
    public final kotlinx.coroutines.flow.i2 f152069s;

    /* renamed from: t */
    public final long f152070t;

    /* renamed from: u */
    public final androidx.lifecycle.g0 f152071u;

    /* renamed from: v */
    public final kotlinx.coroutines.flow.n2 f152072v;

    /* renamed from: w */
    public final java.util.concurrent.atomic.AtomicInteger f152073w;

    /* renamed from: x */
    public final jz5.g f152074x;

    /* renamed from: y */
    public final jz5.g f152075y;

    /* renamed from: z */
    public final jz5.g f152076z;

    public MvvmList(ym3.f dataSource, xm3.n0 initConfig, androidx.lifecycle.y lifecycleOwner, v65.i workerScope, java.util.List<? extends T> initDataList) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(workerScope, "workerScope");
        kotlin.jvm.internal.o.g(initDataList, "initDataList");
        this.f152057d = dataSource;
        this.f152058e = initConfig;
        this.f152059f = lifecycleOwner;
        this.f152060g = workerScope;
        this.f152061h = initDataList;
        this.f152062i = true;
        this.f152065o = new java.util.ArrayList(initDataList);
        this.f152066p = new java.util.ArrayList();
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0();
        this.f152068r = j0Var;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(initConfig.f455362g, 0, null, 6, null);
        this.f152069s = b17;
        this.f152070t = 100L;
        this.f152071u = j0Var;
        this.f152072v = b17;
        this.f152073w = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f152074x = jz5.h.b(new xm3.o(this));
        this.f152075y = jz5.h.b(new xm3.p(this));
        this.f152076z = jz5.h.b(new xm3.t(this));
        lifecycleOwner.mo133getLifecycle().a(this);
        if (!initDataList.isEmpty()) {
            v65.i.b(workerScope, null, new xm3.r(this, null), 1, null);
        }
        if (initConfig.f455358c && (initDataList.isEmpty() || initConfig.a())) {
            a(xm3.i.f455327m, initConfig);
        } else {
            v65.i.c(workerScope, null, new xm3.s(this, null), 1, null);
        }
        pm0.v.X(new xm3.h(this));
    }

    public static /* synthetic */ void A(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.d dVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitUpdate");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        mvvmList.y(dVar, z17);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|(2:21|(1:23))|13|14)|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace(r5.c(), r6, "error", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object C(com.tencent.mm.plugin.mvvmlist.MvvmList r5, xm3.n0 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof xm3.l0
            if (r0 == 0) goto L13
            r0 = r7
            xm3.l0 r0 = (xm3.l0) r0
            int r1 = r0.f455352g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f455352g = r1
            goto L18
        L13:
            xm3.l0 r0 = new xm3.l0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f455350e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f455352g
            java.lang.String r3 = "submitRefreshAll"
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r5 = r0.f455349d
            com.tencent.mm.plugin.mvvmlist.MvvmList r5 = (com.tencent.mm.plugin.mvvmlist.MvvmList) r5
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L55
            goto L62
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = r5.c()
            com.tencent.mars.xlog.Log.i(r7, r3)
            boolean r7 = r5.f152063m
            if (r7 != 0) goto L62
            xm3.i r7 = xm3.i.f455325h     // Catch: java.lang.Exception -> L55
            kotlinx.coroutines.r2 r6 = r5.a(r7, r6)     // Catch: java.lang.Exception -> L55
            r0.f455349d = r5     // Catch: java.lang.Exception -> L55
            r0.f455352g = r4     // Catch: java.lang.Exception -> L55
            java.lang.Object r6 = r6.C(r0)     // Catch: java.lang.Exception -> L55
            if (r6 != r1) goto L62
            return r1
        L55:
            r6 = move-exception
            java.lang.String r7 = r5.c()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "error"
            com.tencent.mars.xlog.Log.printErrStackTrace(r7, r6, r1, r0)
        L62:
            java.lang.String r5 = r5.c()
            com.tencent.mars.xlog.Log.i(r5, r3)
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mvvmlist.MvvmList.C(com.tencent.mm.plugin.mvvmlist.MvvmList, xm3.n0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static kotlinx.coroutines.r2 g(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.lang.Object obj, int i17, int i18, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMore");
        }
        if ((i18 & 1) != 0) {
            obj = null;
        }
        if ((i18 & 2) != 0) {
            i17 = mvvmList.f152058e.f455359d;
        }
        return mvvmList.f(obj, i17);
    }

    public static java.lang.Object j(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, int i17, java.lang.Object obj, int i18, yz5.l lVar, kotlin.coroutines.Continuation continuation, int i19, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postLoadMoreTask");
        }
        java.lang.Object obj3 = (i19 & 2) != 0 ? null : obj;
        if ((i19 & 4) != 0) {
            i18 = mvvmList.f152058e.f455359d;
        }
        return mvvmList.i(i17, obj3, i18, (i19 & 8) != 0 ? null : lVar, continuation);
    }

    public static /* synthetic */ void m(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.i iVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitChange");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        mvvmList.l(iVar, z17);
    }

    public static /* synthetic */ void p(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.util.List list, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitInsert");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        mvvmList.n(list, z17);
    }

    public static /* synthetic */ void q(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.d dVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitInsert");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        mvvmList.o(dVar, z17);
    }

    public static void r(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.n0 config, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitRefreshAll");
        }
        if ((i17 & 1) != 0) {
            config = mvvmList.f152058e;
        }
        mvvmList.getClass();
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mars.xlog.Log.i(mvvmList.c(), "submitRefreshAll");
        v65.i.b(mvvmList.f152060g, null, new xm3.c0(mvvmList, config, null), 1, null);
    }

    public static /* synthetic */ void w(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.util.List list, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitReset");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        mvvmList.v(list, z17);
    }

    public final java.lang.Object B(int i17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.i.b(this.f152060g, null, new xm3.k0(i17, this, lVar, rVar, null), 1, null);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final kotlinx.coroutines.r2 a(xm3.i iVar, xm3.n0 n0Var) {
        return v65.i.b(this.f152060g, null, new xm3.l(this, iVar, this.f152073w.incrementAndGet(), n0Var, null), 1, null);
    }

    public final androidx.lifecycle.b0 b() {
        return (androidx.lifecycle.b0) ((jz5.n) this.f152076z).getValue();
    }

    public java.lang.String c() {
        return "MicroMsg.Mvvm.MvvmList";
    }

    public final void d(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        v65.i.b(this.f152060g, null, new xm3.q(this, callback, null), 1, null);
    }

    public java.util.List e(java.util.List snapshotList) {
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        kz5.g0.s(snapshotList);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(snapshotList, 10));
        java.util.Iterator it = snapshotList.iterator();
        while (it.hasNext()) {
            java.lang.Object y07 = ((xm3.d) it.next()).y0();
            kotlin.jvm.internal.o.e(y07, "null cannot be cast to non-null type T of com.tencent.mm.plugin.mvvmlist.MvvmList.handleSnapshotList$lambda$2");
            arrayList.add((xm3.d) y07);
        }
        return arrayList;
    }

    public final kotlinx.coroutines.r2 f(java.lang.Object obj, int i17) {
        if (this.f152058e.a()) {
            com.tencent.mars.xlog.Log.i(c(), "auto load mode");
            return null;
        }
        return v65.i.b(this.f152060g, null, new xm3.u(this, obj, i17, null), 1, null);
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return b();
    }

    public final void h(ym3.o oVar, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MvvmList", "postLiveStatData loadState:" + oVar.f463177a + " source:" + i17);
        this.f152068r.postValue(oVar);
        v65.i.b(this.f152060g, null, new xm3.y(this, oVar, null), 1, null);
    }

    public final java.lang.Object i(int i17, java.lang.Object obj, int i18, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i(c(), "postLoadMoreTask " + this.f152062i + ' ' + i17);
        boolean z17 = this.f152062i;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            k(true);
            h(new ym3.o(ym3.p.f463180e, null), 1);
            java.lang.Object a17 = ((kotlinx.coroutines.flow.x0) kotlinx.coroutines.flow.l.r(this.f152057d.a(this.f152060g, new ym3.c(i17, this.f152066p.size(), i18, obj)), 1)).a(new xm3.z(this, lVar), continuation);
            if (a17 == pz5.a.f359186d) {
                return a17;
            }
        }
        return f0Var;
    }

    public final void k(boolean z17) {
        com.tencent.mars.xlog.Log.i(c(), "updateLoadingDataState:" + z17);
        this.f152063m = z17;
    }

    public final void l(xm3.i iVar, boolean z17) {
        int i17;
        int i18;
        com.tencent.mars.xlog.Log.i(c(), "submitChange type:" + iVar + " pending:" + z17);
        long a17 = hq.d.a();
        java.util.List e17 = e(this.f152066p);
        long a18 = hq.d.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f152065o) {
            arrayList.addAll(this.f152065o);
            i17 = this.f152064n;
        }
        long a19 = hq.d.a();
        androidx.recyclerview.widget.c0 a27 = androidx.recyclerview.widget.h0.a(new xm3.g(arrayList, e17), true);
        xm3.p0 p0Var = new xm3.p0();
        a27.a(p0Var);
        if (this.f152058e.c() && com.tencent.mm.sdk.platformtools.u3.e()) {
            i18 = i17;
            x(new xm3.o0(e17, i17, p0Var.f455370a, kz5.b0.c(iVar), 0, 16, null));
        } else {
            i18 = i17;
            ((com.tencent.mm.sdk.event.pending.UIPendingEventNotifier) this.f152075y.getValue()).a(new xm3.o0(e17, i18, p0Var.f455370a, kz5.b0.c(iVar), 0, 16, null), z17);
        }
        com.tencent.mars.xlog.Log.i(c(), "check snapshot diff step1:" + (a18 - a17) + " step2:" + (a19 - a18) + " step3:" + (hq.d.a() - a18) + " dataListVersion:" + i18);
    }

    public final void n(java.util.List itemList, boolean z17) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        com.tencent.mars.xlog.Log.i(c(), "submitInsert: " + itemList.size() + " allowDuplicated:" + z17);
        v65.i.b(this.f152060g, null, new xm3.b0(itemList, this, z17, null), 1, null);
    }

    public final void o(xm3.d item, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i(c(), "submitInsert: " + item.v() + " allowDuplicated:" + z17);
        v65.i.b(this.f152060g, null, new xm3.a0(z17, this, item, null), 1, null);
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        if (event == androidx.lifecycle.m.ON_DESTROY) {
            v65.i.b(this.f152060g, null, new xm3.x(this, null), 1, null);
        }
    }

    public final void s(java.lang.String uniqueId) {
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        com.tencent.mars.xlog.Log.i(c(), "submitRemove: uniqueId = ".concat(uniqueId));
        v65.i.b(this.f152060g, null, new xm3.d0(this, uniqueId, null), 1, null);
    }

    public final void t(java.util.List uniqueIdList) {
        kotlin.jvm.internal.o.g(uniqueIdList, "uniqueIdList");
        com.tencent.mars.xlog.Log.i(c(), "submitRemove: uniqueIdList = " + uniqueIdList.size());
        v65.i.b(this.f152060g, null, new xm3.e0(this, uniqueIdList, null), 1, null);
    }

    public final void u(xm3.d item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i(c(), "submitRemove: " + item.v());
        v65.i.b(this.f152060g, null, new xm3.f0(this, item, null), 1, null);
    }

    public final void v(java.util.List itemList, boolean z17) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        com.tencent.mars.xlog.Log.i(c(), "submitReset: " + itemList.size() + " loading:" + this.f152063m);
        if (!z17) {
            v65.i.b(this.f152060g, null, new xm3.g0(this, itemList, null), 1, null);
        } else {
            java.util.ArrayList arrayList = this.f152066p;
            arrayList.clear();
            arrayList.addAll(itemList);
            l(xm3.i.f455324g, false);
        }
    }

    public final void x(xm3.o0 o0Var) {
        java.lang.String c17 = c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("submitUIChange callback:");
        xm3.m0 m0Var = this.f152067q;
        sb6.append(m0Var != null ? java.lang.Integer.valueOf(m0Var.hashCode()) : null);
        sb6.append(" eventVersion:");
        sb6.append(o0Var.f455368e);
        sb6.append(" compareDataListVersion:");
        sb6.append(o0Var.f455365b);
        sb6.append(" currentDataListVersion:");
        sb6.append(this.f152064n);
        com.tencent.mars.xlog.Log.i(c17, sb6.toString());
        if (this.f152064n > o0Var.f455365b) {
            return;
        }
        synchronized (this.f152065o) {
            this.f152065o.clear();
            this.f152065o.addAll(o0Var.f455364a);
            this.f152064n++;
        }
        xm3.m0 m0Var2 = this.f152067q;
        if (m0Var2 != null) {
            m0Var2.k(o0Var);
        }
        h(new ym3.o(ym3.p.f463181f, null), 0);
    }

    public final void y(xm3.d item, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i(c(), "submitUpdate: " + item.v() + " notFoundInsert:" + z17);
        v65.i.b(this.f152060g, null, new xm3.h0(this, item, z17, null), 1, null);
    }

    public final void z(yz5.l handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        v65.i.b(this.f152060g, null, new xm3.j0(handler, this, null), 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MvvmList(ym3.f r14, xm3.n0 r15, androidx.lifecycle.y r16, v65.i r17, java.util.List r18, int r19, kotlin.jvm.internal.i r20) {
        /*
            r13 = this;
            r0 = r19 & 8
            if (r0 == 0) goto L23
            com.tencent.mm.sdk.coroutines.LifecycleScope r0 = new com.tencent.mm.sdk.coroutines.LifecycleScope
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MvvmList.LifecycleScope_"
            r1.<init>(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r0
            r3 = r16
            r1.<init>(r2, r3, r4, r5, r6)
            r11 = r0
            goto L25
        L23:
            r11 = r17
        L25:
            r0 = r19 & 16
            if (r0 == 0) goto L2d
            kz5.p0 r0 = kz5.p0.f313996d
            r12 = r0
            goto L2f
        L2d:
            r12 = r18
        L2f:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mvvmlist.MvvmList.<init>(ym3.f, xm3.n0, androidx.lifecycle.y, v65.i, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}

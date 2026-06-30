package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class w extends com.tencent.mm.plugin.sns.ui.wsfold.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f171446d;

    /* renamed from: e, reason: collision with root package name */
    public long f171447e;

    /* renamed from: f, reason: collision with root package name */
    public volatile r45.qb6 f171448f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f171449g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f171450h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f171451i;

    /* renamed from: m, reason: collision with root package name */
    public int f171452m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f171453n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f171454o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f171446d = new java.util.ArrayList();
        this.f171453n = jz5.h.b(com.tencent.mm.plugin.sns.ui.wsfold.t.f171435d);
        this.f171454o = jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.j(this, activity));
    }

    public static final com.tencent.mm.plugin.sns.ui.wsfold.g1 P6(com.tencent.mm.plugin.sns.ui.wsfold.w wVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$buildCurrentRequestKey", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        wVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCurrentRequestKey", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = wVar.f171446d;
        int indexOf = arrayList2.indexOf(java.lang.Long.valueOf(wVar.f171447e)) + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        int intValue = ((java.lang.Number) ((jz5.n) wVar.f171453n).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.util.List subList = arrayList2.subList(indexOf, java.lang.Math.min(intValue + indexOf, arrayList2.size()));
        kotlin.jvm.internal.o.f(subList, "subList(...)");
        java.util.List S0 = kz5.n0.S0(subList);
        arrayList.addAll(S0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", "request list:".concat(kz5.n0.g0(S0, ";", null, null, 0, null, com.tencent.mm.plugin.sns.ui.wsfold.c.f171342d, 30, null)));
        wVar.f171447e = ((java.lang.Number) kz5.n0.i0(arrayList)).longValue();
        long longExtra = wVar.getIntent().getLongExtra("key_ws_feed_id", 0L);
        boolean V6 = wVar.V6();
        int i17 = wVar.f171452m;
        wVar.f171452m = i17 + 1;
        com.tencent.mm.plugin.sns.ui.wsfold.g1 g1Var = new com.tencent.mm.plugin.sns.ui.wsfold.g1(V6, arrayList, i17, longExtra, arrayList2.size());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCurrentRequestKey", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$buildCurrentRequestKey", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return g1Var;
    }

    public static final /* synthetic */ java.util.ArrayList Q6(com.tencent.mm.plugin.sns.ui.wsfold.w wVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTotalFeedList$p", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.util.ArrayList arrayList = wVar.f171446d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTotalFeedList$p", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x013c, code lost:
    
        if (kotlinx.coroutines.l.g(r0, r1, r6) == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTotalList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if ((r1.length == 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r8 = r23;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (kotlinx.coroutines.l.g(r8, r11, r6) == r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R6(com.tencent.mm.plugin.sns.ui.wsfold.w r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.wsfold.w.R6(com.tencent.mm.plugin.sns.ui.wsfold.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object S6(com.tencent.mm.plugin.sns.ui.wsfold.w wVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        wVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        wVar.T6().d(new com.tencent.mm.plugin.sns.ui.wsfold.u(rVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return j17;
    }

    public final com.tencent.mm.plugin.mvvmlist.MvvmList T6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLiveList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = (com.tencent.mm.plugin.mvvmlist.MvvmList) ((jz5.n) this.f171454o).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return mvvmList;
    }

    public final void U6(o75.c cVar) {
        java.util.HashMap hashMap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDBEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("db id:");
        sb6.append(cVar.f343587a);
        sb6.append(" info:");
        sb6.append(cVar.f343590d);
        sb6.append(" size:");
        java.util.HashMap hashMap2 = cVar.f343591e;
        sb6.append(hashMap2 != null ? java.lang.Integer.valueOf(hashMap2.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", sb6.toString());
        o75.b bVar = o75.b.f343581b;
        o75.b bVar2 = o75.b.f343583d;
        o75.b bVar3 = cVar.f343587a;
        if (kotlin.jvm.internal.o.b(bVar3, bVar2)) {
            xc4.p pVar = (xc4.p) cVar.f343590d;
            if (pVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", "handleDBEvent update id:" + bVar3 + " info:" + pVar.W0());
                xc4.p pVar2 = new xc4.p();
                pVar2.convertFrom(pVar.t0(), false);
                com.tencent.mm.plugin.mvvmlist.MvvmList.A(T6(), new zc4.b(pVar2, false), false, 2, null);
            }
        } else if (kotlin.jvm.internal.o.b(bVar3, o75.b.f343585f) && (hashMap = cVar.f343591e) != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                U6((o75.c) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDBEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
    }

    public final boolean V6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasMoreData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.util.ArrayList arrayList = this.f171446d;
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasMoreData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
            return false;
        }
        boolean z17 = ((java.lang.Number) kz5.n0.i0(arrayList)).longValue() != this.f171447e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasMoreData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return z17;
    }

    public final kotlinx.coroutines.r2 W6(yz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launchAfterJobFinish", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.sns.ui.wsfold.i(this, h0Var, lVar, null), 2, null);
        h0Var.f310123d = d17;
        kotlinx.coroutines.r2 r2Var = d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launchAfterJobFinish", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return r2Var;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        long longExtra = getIntent().getLongExtra("key_ws_feed_id", 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", "onCreate feed id:" + ca4.z0.t0(longExtra));
        if (longExtra == 0) {
            getActivity().finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).Q6(getActivity(), new com.tencent.mm.plugin.sns.ui.wsfold.l(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("observerLiveListEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.sns.ui.wsfold.r(this, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("observerLiveListEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        kotlinx.coroutines.r2 r2Var = this.f171449g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f171449g = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
    }
}

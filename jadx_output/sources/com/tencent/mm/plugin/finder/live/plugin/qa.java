package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qa extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113980p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f113981q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.viewmodel.s5 f113982r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x031c, code lost:
    
        if (r1 == null) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qa(android.view.ViewGroup r26, qo0.c r27) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.qa.<init>(android.view.ViewGroup, qo0.c):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        t1().getClass();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal != 197) {
                return;
            }
            com.tencent.mm.plugin.finder.live.viewmodel.b8 t17 = t1();
            t17.getClass();
            t17.f116946q = com.tencent.mm.plugin.finder.live.viewmodel.d6.f117034d;
            t17.S6();
            return;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.b8 t18 = t1();
        t18.a7();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.u1 u1Var = ml2.u1.U;
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        ml2.s1 s1Var = ml2.s1.f327915e;
        zy2.zb.I8(zbVar, u1Var, j0Var.bj(s1Var), null, null, null, null, false, 124, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.f328040e, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(s1Var), null, null, null, null, false, 124, null);
        qm2.k kVar = (qm2.k) ((jz5.n) t18.f116951v).getValue();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = kVar.f364734f;
        if (atomicBoolean.get()) {
            com.tencent.mars.xlog.Log.w("FinderStartLiveNetSpeedTestUIC", "Network speed test is already running");
            return;
        }
        atomicBoolean.set(true);
        kVar.f364732d = new qm2.f(0, 0, 0.0f, 0.0f, false, false, 0, 127, null);
        com.tencent.mars.xlog.Log.i("FinderStartLiveNetSpeedTestUIC", "Preparing speed test");
        androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        if (mMFinderUI != null) {
            pq5.g l17 = new ek2.f3(1, 1, 524288, 1024, 6).l();
            l17.K(new qm2.g(kVar));
            l17.f(mMFinderUI);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final com.tencent.mm.plugin.finder.live.viewmodel.b8 t1() {
        return (com.tencent.mm.plugin.finder.live.viewmodel.b8) this.f113981q.getValue();
    }

    @Override // qo0.a
    public void y0(boolean z17, int i17) {
        pk2.j9 j9Var;
        com.tencent.mm.plugin.finder.live.widget.e5 e5Var;
        pk2.o9 o9Var = this.f113982r.f117394d;
        if (o9Var == null || (j9Var = o9Var.f356084g) == null || (e5Var = j9Var.f355886b) == null) {
            return;
        }
        e5Var.a(i17, z17);
    }
}

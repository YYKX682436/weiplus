package ke5;

/* loaded from: classes9.dex */
public abstract class a implements ke5.f0, hd5.k {

    /* renamed from: a, reason: collision with root package name */
    public final hd5.r f307040a;

    /* renamed from: b, reason: collision with root package name */
    public final yb5.d f307041b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f307042c;

    /* renamed from: d, reason: collision with root package name */
    public int f307043d;

    /* renamed from: e, reason: collision with root package name */
    public ke5.e0 f307044e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f307045f = 3;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f307046g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f307047h;

    public a(yb5.d dVar, hd5.r rVar) {
        this.f307041b = dVar;
        this.f307042c = dVar.x();
        this.f307040a = rVar;
    }

    @Override // ke5.f0
    public void a(hd5.n nVar, boolean z17, android.os.Bundle bundle) {
        yb5.d dVar = this.f307041b;
        ((tb5.d0) ((tb5.n0) dVar.f460708c.a(tb5.n0.class))).m0("onLoadStart", nVar);
        boolean H = dVar.H();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[onLoad] action:" + nVar + " isBlock:" + z17 + " username:" + dVar.x() + "readOnly:" + H);
        hd5.n nVar2 = hd5.n.ACTION_ENTER;
        if (!H || nVar == nVar2 || nVar == hd5.n.ACTION_TOP) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(dVar.x())) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.AbstractDataPresenter", "[onLoad] username is null!");
                return;
            }
            com.tencent.mm.plugin.report.service.f0.a(13);
            com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "[lockNotify] isLockNotify:%s notifyCountWhileLock:%s", java.lang.Boolean.valueOf(kVar.f198422l1), java.lang.Integer.valueOf(kVar.f198424p1));
            boolean z18 = true;
            if (!kVar.f198422l1) {
                kVar.f198422l1 = true;
                kVar.f198424p1 = 0;
            }
            if (nVar == nVar2 && z17 && dVar.f460717l != null) {
                jz5.g gVar = com.tencent.mm.ui.chatting.adapter.m.f198435a;
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            } else {
                z18 = false;
            }
            ke5.b bVar = new ke5.b(this, bundle, nVar);
            hd5.v vVar = (hd5.v) this.f307040a;
            vVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ListDataLoader", "[load] mode:%s isBlock:%s thread:%s optBlock:%s", nVar, java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Boolean.valueOf(z18));
            if (nVar == nVar2 && z17 && z18) {
                hd5.j jVar = (hd5.j) vVar.f280654e;
                jVar.a();
                yb5.d dVar2 = jVar.f280612c;
                dVar2.q().postDelayed(jVar.f280616g, 1000L);
                dVar2.p().f().setVisibility(8);
                z17 = false;
            }
            hd5.t tVar = new hd5.t(vVar, nVar, z17, bVar, vVar.f280651b);
            if (z17) {
                tVar.run();
            } else {
                vVar.f280650a.post(tVar);
            }
        }
    }

    @Override // ke5.f0
    public void b(hd5.n nVar, boolean z17) {
        a(nVar, z17, null);
    }

    @Override // hd5.k
    public void c(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, hd5.q qVar) {
        ke5.f0 f0Var;
        yb5.d dVar = this.f307041b;
        ((tb5.d0) ((tb5.n0) dVar.f460708c.a(tb5.n0.class))).m0("onViewUpdate", qVar.f280630b);
        if (qVar.f280630b == hd5.n.ACTION_TOP) {
            mMChattingListView.post(new ke5.c(this));
        }
        com.tencent.mm.plugin.report.service.f0.b(13);
        mMChattingListView.getBaseAdapter().h(qVar);
        if (android.os.Looper.getMainLooper().isCurrentThread()) {
            mMChattingListView.J1 = true;
        }
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "[unLockNotify] isLockNotify:%s notifyCountWhileLock:%s", java.lang.Boolean.valueOf(kVar.f198422l1), java.lang.Integer.valueOf(kVar.f198424p1));
        if (kVar.f198422l1) {
            kVar.f198422l1 = false;
            if (kVar.f198424p1 > 0 && (f0Var = kVar.Z) != null) {
                f0Var.b(hd5.n.ACTION_UPDATE, false);
            }
            kVar.f198424p1 = 0;
        }
    }

    public abstract he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar);

    public void f(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, int i17, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, boolean z17, int i18, boolean z18, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[matteHighLightItem] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.l(this.f307046g);
        ke5.e eVar = new ke5.e(this, i17, z17, i18, z18, mMChattingListView, msgIdTalker, bundle);
        this.f307046g = eVar;
        com.tencent.mm.sdk.platformtools.u3.i(eVar, 300L);
    }

    public void g(int i17, boolean z17, int i18, boolean z18) {
        this.f307045f = 3;
        yb5.d dVar = this.f307041b;
        if (dVar.f460721p) {
            dVar.U(i17, i65.a.b(dVar.g(), 120), z18, z17);
        } else {
            dVar.T(i17, z18, z17, i18);
        }
        dVar.p().postDelayed(new ke5.d(this, i17, i18, z18, z17), 200L);
    }

    @Override // ke5.f0
    public void onCancel() {
        hd5.v vVar = (hd5.v) this.f307040a;
        synchronized (vVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ListDataLoader", "[cancel]");
            vVar.f280651b.set(true);
            vVar.f280651b = new java.util.concurrent.atomic.AtomicBoolean(false);
            vVar.f280650a.removeCallbacksAndMessages(null);
            vVar.f280652c.removeCallbacksAndMessages(null);
            hd5.j jVar = (hd5.j) vVar.f280654e;
            jVar.a();
            yb5.l lVar = jVar.f280612c.f460726u;
            if (!kotlin.jvm.internal.o.b(lVar.f460740a, lVar.f460741b)) {
                lVar.f460740a = lVar.f460741b;
            }
        }
        ke5.e0 e0Var = this.f307044e;
        if (e0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "initResetLoadStateListener onCancel");
            int i17 = com.tencent.mm.ui.chatting.view.MMChattingListView.L1;
            com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = ((com.tencent.mm.ui.chatting.view.i0) e0Var).f202959a;
            mMChattingListView.f197536q = false;
            mMChattingListView.f197537r = true;
            com.tencent.mm.ui.chatting.hc hcVar = mMChattingListView.f202843l1;
            if (hcVar != null) {
                hcVar.b();
                mMChattingListView.f202843l1 = null;
            }
        }
    }

    public java.lang.String toString() {
        return getClass().getName();
    }
}

package pv0;

/* loaded from: classes5.dex */
public abstract class y extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f358560n;

    /* renamed from: o, reason: collision with root package name */
    public final gw0.e f358561o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.k0 f358562p;

    /* renamed from: q, reason: collision with root package name */
    public final pv0.w f358563q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f358564r;

    /* renamed from: s, reason: collision with root package name */
    public pv0.o f358565s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f358560n = jz5.h.b(new pv0.u(this));
        this.f358561o = new gw0.e(Q6());
        this.f358562p = new pv0.v(this);
        this.f358563q = new pv0.w(this);
        this.f358564r = new java.util.HashMap();
        this.f358565s = new pv0.o(new java.util.concurrent.atomic.AtomicInteger(0), false);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        pv0.m mVar = new pv0.m(getActivity());
        mVar.setTimbreCallback(this.f358563q);
        return mVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        this.f358561o.f276146c.removeObserver(this.f358562p);
        gx0.hf.b7((gx0.hf) ((jz5.n) this.f358560n).getValue(), null, null, 3, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void c7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        pv0.m panel = (pv0.m) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(gx0.bf.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        gx0.bf bfVar = (gx0.bf) a17;
        bfVar.D = -1;
        com.tencent.maas.model.time.MJTimeRange PositiveInfiniteTimeRange = com.tencent.maas.model.time.MJTimeRange.PositiveInfiniteTimeRange;
        kotlin.jvm.internal.o.f(PositiveInfiniteTimeRange, "PositiveInfiniteTimeRange");
        bfVar.o7(PositiveInfiniteTimeRange, true);
    }

    public final dw0.c k7() {
        dw0.d dVar = (dw0.d) this.f358561o.f276146c.getValue();
        if (dVar == null) {
            return null;
        }
        return (dw0.c) kz5.n0.a0(dVar.f244090a, dVar.f244091b.f244094b);
    }

    public final dw0.c l7(java.lang.String roleID) {
        kotlin.jvm.internal.o.g(roleID, "roleID");
        dw0.d dVar = (dw0.d) this.f358561o.f276146c.getValue();
        java.lang.Object obj = null;
        if (dVar == null) {
            return null;
        }
        java.util.Iterator it = dVar.f244090a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.o.b(dw0.f.a(((dw0.c) next).f244086a), roleID)) {
                obj = next;
                break;
            }
        }
        return (dw0.c) obj;
    }

    public final boolean m7() {
        pv0.m mVar = (pv0.m) this.f69240i;
        return mVar != null && mVar.M;
    }

    public abstract gx0.hf n7();

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /* renamed from: o7, reason: merged with bridge method [inline-methods] */
    public void a7(pv0.m panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        pv0.h timbrePanelArgs$plugin_mj_template_release = panel.getTimbrePanelArgs$plugin_mj_template_release();
        pp0.r0 r0Var = null;
        if (timbrePanelArgs$plugin_mj_template_release == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            timbrePanelArgs$plugin_mj_template_release = null;
        }
        if (timbrePanelArgs$plugin_mj_template_release == null) {
            return;
        }
        com.tencent.maas.moviecomposing.segments.Segment segment = timbrePanelArgs$plugin_mj_template_release.f358525a;
        boolean z17 = timbrePanelArgs$plugin_mj_template_release.f358529e;
        pv0.a aVar = timbrePanelArgs$plugin_mj_template_release.f358526b;
        pv0.j jVar = timbrePanelArgs$plugin_mj_template_release.f358528d;
        pp0.s0 s0Var = S6().f243445i;
        if (s0Var == null) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            s0Var = null;
        }
        if (s0Var != null) {
            pp0.r0 r0Var2 = Q6().f243443g;
            if (r0Var2 == null) {
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            } else {
                r0Var = r0Var2;
            }
            if (r0Var != null) {
                this.f358565s = new pv0.o(new java.util.concurrent.atomic.AtomicInteger(0), false);
                com.tencent.maas.model.time.MJTimeRange B = segment.B();
                kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
                if (B.isValid()) {
                    android.app.Activity context = getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(gx0.bf.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    ((gx0.bf) a17).o7(B, true);
                }
                pv0.g gVar = new pv0.g(new pv0.n(this, aVar), s0Var, r0Var);
                java.util.HashMap hashMap = this.f358564r;
                ug.m C = segment.C();
                kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
                hashMap.put(C, gVar);
                java.lang.String b17 = ru0.a.b(segment);
                if (b17 == null) {
                    b17 = "";
                }
                kotlinx.coroutines.l.d(getMainScope(), null, null, new pv0.r(jVar, b17, this, segment, z17, null), 3, null);
            }
        }
        this.f358561o.f276146c.observe(panel, this.f358562p);
        java.lang.String b18 = ru0.a.b(timbrePanelArgs$plugin_mj_template_release.f358525a);
        panel.setResult(java.lang.Boolean.TRUE);
        panel.I(new pv0.s(this, b18), new pv0.t(this, b18));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        java.util.HashMap hashMap = this.f358564r;
        java.util.Set entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            vu0.s sVar = (vu0.s) ((jz5.n) ((pv0.g) ((java.util.Map.Entry) it.next()).getValue()).f358523d).getValue();
            sVar.a();
            yu0.m mVar = (yu0.m) ((jz5.n) sVar.f440153e).getValue();
            if (mVar != null) {
                mVar.b();
            }
        }
        hashMap.clear();
    }

    public final void p7(ug.m segmentType, java.util.List timbreRequestGroupList) {
        dw0.c k76;
        kotlin.jvm.internal.o.g(segmentType, "segmentType");
        kotlin.jvm.internal.o.g(timbreRequestGroupList, "timbreRequestGroupList");
        segmentType.toString();
        java.lang.Object obj = this.f358564r.get(segmentType);
        if (obj == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            obj = null;
        }
        pv0.g gVar = (pv0.g) obj;
        if (gVar == null) {
            return;
        }
        if (!m7() && (k76 = k7()) != null) {
            this.f358565s = new pv0.o(new java.util.concurrent.atomic.AtomicInteger(timbreRequestGroupList.size()), true);
            pv0.m mVar = (pv0.m) this.f69240i;
            if (mVar != null) {
                mVar.B();
            }
            this.f358561o.f(k76);
        }
        gVar.a(timbreRequestGroupList);
    }

    public final boolean q7(yz5.p pVar) {
        com.tencent.maas.moviecomposing.segments.Segment segment;
        dw0.c k76 = k7();
        if (k76 == null || (segment = k76.f244087b) == null) {
            return true;
        }
        java.lang.Object obj = this.f358564r.get(segment.C());
        if (obj == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            obj = null;
        }
        pv0.g gVar = (pv0.g) obj;
        if (gVar == null) {
            return true;
        }
        return ((java.lang.Boolean) pVar.invoke(gVar, k76)).booleanValue();
    }

    public final void r7(dw0.c cVar, boolean z17) {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new pv0.x(this, z17, cVar, null), 3, null);
    }
}

package th5;

/* loaded from: classes12.dex */
public final class l0 extends pf3.g implements uf3.a {
    public long A;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.media.live.LivePlayButton f419401v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f419402w;

    /* renamed from: x, reason: collision with root package name */
    public lg3.a f419403x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f419404y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f419405z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.BizPhotoLiveBottomBar");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
    }

    @Override // rf3.h
    public void D() {
        h0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        h0();
        mf3.s sVar = this.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        if (qVar != null) {
            android.view.View view = this.f419402w;
            boolean z17 = false;
            if (view != null && view.getVisibility() == 0) {
                z17 = true;
            }
            th5.v0 v0Var = th5.v0.f419470a;
            if (z17) {
                v0Var.a(qVar.f419344c, qVar.f419342a, qVar.f419343b, th5.a.f419333e, th5.e.f419366e);
            }
            v0Var.a(qVar.f419344c, qVar.f419342a, qVar.f419343b, th5.a.f419334f, th5.e.f419366e);
        }
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dzt, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        android.view.View view = this.f419402w;
        if (view == null) {
            return;
        }
        Y(this, new th5.j0(view));
        b0();
    }

    public final boolean g0(th5.q qVar) {
        if (!qVar.h()) {
            return true;
        }
        if (!(qVar.f419452j.length() == 0) && com.tencent.mm.vfs.w6.j(qVar.f419452j)) {
            if (!(qVar.f419454l.length() == 0) && com.tencent.mm.vfs.w6.j(qVar.f419454l)) {
                return true;
            }
        }
        return false;
    }

    @Override // rf3.h
    public void h() {
        h0();
    }

    public final void h0() {
        com.tencent.mm.plugin.media.live.LivePlayButton livePlayButton;
        mf3.s sVar = this.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        android.view.View view = this.f419402w;
        if (view == null || (livePlayButton = this.f419401v) == null) {
            return;
        }
        Y(this, new th5.k0(livePlayButton, qVar, this, view));
        a0();
    }

    public final void i0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        vf3.e eVar;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (X6 = ((vf3.i) aVar).X6(kVar)) == null || !((eVar = X6.f436389a) == vf3.e.f436378e || eVar == vf3.e.f436381h || eVar == vf3.e.f436384n)) {
            this.f419404y = true;
            return;
        }
        uf3.c cVar = (uf3.c) g(uf3.c.class);
        if (cVar != null) {
            ((uf3.g) cVar).X();
        }
    }

    public final void j0() {
        mf3.k kVar;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || kVar.getLevel() != mf3.w.f326128d) {
            return;
        }
        kVar.f(mf3.w.f326129e);
        uf3.c cVar = (uf3.c) g(uf3.c.class);
        if (cVar != null) {
            ((uf3.g) cVar).V();
        }
    }

    @Override // uf3.a
    public void m(vf3.e state, vf3.f extraInfo) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        mf3.s sVar = this.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        if (qVar == null) {
            return;
        }
        if (state == vf3.e.f436386p || state == vf3.e.f436385o) {
            c0();
            return;
        }
        boolean z17 = false;
        if (state == vf3.e.f436381h) {
            if (this.f419404y) {
                i0();
                this.f419404y = false;
            }
            if (this.f419405z) {
                j0();
                this.f419405z = false;
            }
        }
        lg3.a aVar = this.f419403x;
        if (aVar != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).h(qVar, extraInfo);
        }
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            h0();
        } else if (ordinal == 4) {
            if (qVar.f419450h == mf3.w.f326129e && g0(qVar)) {
                z17 = true;
            }
            if (!z17) {
                h0();
            }
        }
        mf3.w wVar = qVar.f419450h;
        mf3.w wVar2 = mf3.w.f326129e;
        if (wVar == wVar2 && state == vf3.e.f436380g) {
            a0();
        }
        if (qVar.f419450h == wVar2 && state == vf3.e.f436383m) {
            h0();
        }
    }

    @Override // mf3.l
    public void onResume() {
        h0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        lg3.a aVar;
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.f419405z = false;
        this.f419404y = false;
        mf3.k kVar = bindContext.f326117a;
        th5.q qVar = kVar instanceof th5.q ? (th5.q) kVar : null;
        if (qVar == null) {
            return;
        }
        if (qVar.h() && !g0(qVar)) {
            vf3.a aVar2 = (vf3.a) H(vf3.a.class);
            vf3.f X6 = aVar2 != null ? ((vf3.i) aVar2).X6(qVar) : null;
            if (qVar.f419450h == mf3.w.f326129e && X6 != null) {
                vf3.e eVar = X6.f436389a;
                vf3.e eVar2 = vf3.e.f436380g;
                if (eVar == eVar2) {
                    lg3.a aVar3 = this.f419403x;
                    if (aVar3 != null) {
                        ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar3).h(qVar, new vf3.f(eVar2, null, 0, X6.f436392d, 6, null));
                    }
                }
            }
            lg3.a aVar4 = this.f419403x;
            if (aVar4 != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar4).h(qVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
            }
            long j17 = qVar.f419343b;
            if (j17 > 0 && (aVar = this.f419403x) != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).g(new vf3.b(0L, j17, 0L, 0L, 0L, false, 61, null));
            }
        }
        h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        this.f419401v = (com.tencent.mm.plugin.media.live.LivePlayButton) M().findViewById(com.tencent.mm.R.id.smh);
        android.view.View findViewById = M().findViewById(com.tencent.mm.R.id.smo);
        this.f419402w = findViewById;
        this.f419403x = findViewById instanceof lg3.a ? (lg3.a) findViewById : null;
        com.tencent.mm.plugin.media.live.LivePlayButton livePlayButton = this.f419401v;
        if (livePlayButton != null) {
            pf3.d.W(this, livePlayButton, null, 1, null);
            T(livePlayButton, new pf3.j(0, 24, 0, 24), new th5.h0(this));
        }
        android.view.View view = this.f419402w;
        if (view != null) {
            pf3.d.W(this, view, null, 1, null);
            pf3.d.U(this, view, null, new th5.i0(this), 1, null);
        }
    }

    @Override // uf3.a
    public void v(vf3.b bVar) {
        lg3.a aVar = this.f419403x;
        if (aVar != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).g(bVar);
        }
    }
}

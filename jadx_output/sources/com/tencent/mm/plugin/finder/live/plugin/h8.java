package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h8 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f112784p;

    /* renamed from: q, reason: collision with root package name */
    public te2.j0 f112785q;

    /* renamed from: r, reason: collision with root package name */
    public te2.k0 f112786r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112784p = statusMonitor;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        te2.k0 k0Var;
        com.tencent.mm.plugin.finder.live.widget.h7 h7Var;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 27) {
            te2.j0 j0Var = this.f112785q;
            if (j0Var != null) {
                ((te2.p1) j0Var).y();
                return;
            }
            tn0.w0 f17 = dk2.ef.f233372a.f();
            if (f17 != null) {
                f17.F0();
                return;
            }
            return;
        }
        if (ordinal == 115) {
            java.lang.String string = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_MUSIC_ID") : null;
            dk2.p Z6 = ((mm2.c1) P0(mm2.c1.class)).Z6();
            if (string == null) {
                string = "";
            }
            jz5.l b17 = Z6.b(string);
            java.lang.Object obj = b17.f302833d;
            dk2.vg vgVar = (dk2.vg) obj;
            if (vgVar != null) {
                te2.j0 j0Var2 = this.f112785q;
                if (j0Var2 != null) {
                    ((te2.p1) j0Var2).m(vgVar, ((java.lang.Number) b17.f302834e).intValue(), false);
                }
                te2.d4 d4Var = te2.d4.f417948a;
                boolean a86 = ((mm2.c1) P0(mm2.c1.class)).a8();
                kotlin.jvm.internal.o.d(obj);
                d4Var.c(a86, 2, (dk2.vg) obj, true, false);
                return;
            }
            return;
        }
        if (ordinal == 116) {
            te2.j0 j0Var3 = this.f112785q;
            if (j0Var3 != null) {
                ((te2.p1) j0Var3).s(((te2.p1) j0Var3).f418297r);
                return;
            }
            return;
        }
        switch (ordinal) {
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PREPARE /* 91 */:
                if (bundle != null) {
                    java.lang.String string2 = bundle.getString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID");
                    te2.j0 j0Var4 = this.f112785q;
                    if (j0Var4 != null) {
                        ((te2.p1) j0Var4).s(string2);
                    }
                } else {
                    te2.j0 j0Var5 = this.f112785q;
                    if (j0Var5 != null) {
                        te2.j0.N4(j0Var5, null, 1, null);
                    }
                }
                if (dk2.ef.f233372a.x()) {
                    ll2.e.b(ll2.e.f319133a, "anchorlive.bottom.music.bgmusic", false, false, 6, null);
                    return;
                } else {
                    ll2.e.b(ll2.e.f319133a, "startlive.bottom.music.bgmusic", false, false, 6, null);
                    return;
                }
            case 92:
                te2.j0 j0Var6 = this.f112785q;
                if (j0Var6 != null) {
                    com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "onMusicAdded");
                    pm0.v.X(new te2.v0((te2.p1) j0Var6, 0));
                    return;
                }
                return;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PAUSE /* 93 */:
                te2.j0 j0Var7 = this.f112785q;
                if (j0Var7 != null && (k0Var = ((te2.p1) j0Var7).f418290h) != null && (h7Var = ((te2.q1) k0Var).f418351m) != null) {
                    h7Var.g0(false, null);
                }
                android.support.v4.media.f.a(X0(com.tencent.mm.plugin.finder.live.plugin.m8.class));
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        te2.j0 j0Var = this.f112785q;
        if (j0Var != null) {
            ((te2.p1) j0Var).onDetach();
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

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        if (this.f112785q == null || this.f112786r == null) {
            gk2.e S0 = S0();
            android.view.ViewGroup viewGroup = this.f365323d;
            this.f112785q = new te2.p1(viewGroup, S0, this.f112784p, this);
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f112786r = new te2.q1(viewGroup, (com.tencent.mm.ui.MMActivity) context, S0(), this.f112785q);
        }
        te2.j0 j0Var = this.f112785q;
        if (j0Var != null) {
            te2.k0 k0Var = this.f112786r;
            kotlin.jvm.internal.o.d(k0Var);
            ((te2.p1) j0Var).onAttach(k0Var);
        }
        te2.j0 j0Var2 = this.f112785q;
        if (j0Var2 != null) {
            te2.p1 p1Var = (te2.p1) j0Var2;
            p1Var.f418286d.post(new te2.o0(p1Var));
        }
    }
}

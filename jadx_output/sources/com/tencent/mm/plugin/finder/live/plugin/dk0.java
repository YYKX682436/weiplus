package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dk0 extends com.tencent.mm.plugin.finder.live.plugin.l implements io0.a {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.live.core.view.LivePreviewView f112299p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        root.getContext();
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.icy);
        ((com.tencent.mm.live.core.view.LivePreviewView) findViewById).setPluginCallback(this);
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        this.f112299p = (com.tencent.mm.live.core.view.LivePreviewView) findViewById;
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
        int i17 = cVar != null ? cVar.f454533c : 0;
        if (i17 == 2 || i17 == 3 || i17 == 8) {
            this.f112299p.getRenderRatioLayout().setBackgroundColor(this.f365323d.getContext().getResources().getColor(com.tencent.mm.R.color.f479077pf));
        } else {
            this.f112299p.getRenderRatioLayout().setBackground(null);
        }
        java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext() && !com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) it.next()).f309170a, ((mm2.c1) P0(mm2.c1.class)).m8())) {
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void I0() {
    }

    @Override // qo0.a
    public void J0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderLiveVisitorPreviewPlugin", "setVisible " + i17, new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            mm2.o4 o4Var = (mm2.o4) P0(mm2.o4.class);
            o4Var.A.observe(this, new com.tencent.mm.plugin.finder.live.plugin.bk0(this));
            return;
        }
        if (ordinal != 8) {
            if (ordinal == 10) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "switchCamera");
                co0.s u17 = u1();
                if (u17 != null) {
                    hn0.h.h(u17, 0, null, 3, null);
                    return;
                }
                return;
            }
            if (ordinal == 16) {
                if (bundle != null) {
                    bundle.getBoolean("PARAM_HANGUP_SELF", false);
                }
                co0.s u18 = u1();
                if (u18 != null) {
                    u18.j1();
                }
                dk2.ef.f233372a.W();
                return;
            }
            if (ordinal != 27 && ordinal != 28) {
                if (ordinal == 45) {
                    co0.s u19 = u1();
                    if (u19 != null) {
                        u19.j1();
                        return;
                    }
                    return;
                }
                if (ordinal != 46) {
                    return;
                }
                K0(0);
                v1();
                com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = this.f112299p.renderRatioLayout;
                tRTCVideoRatioLayout.getClass();
                tRTCVideoRatioLayout.f68576o.d(false);
                co0.s u110 = u1();
                if (u110 != null) {
                    kn0.p pVar = u110.D;
                    pVar.getClass();
                    pVar.f309583c = kn0.j.f309564f;
                    android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.mic_user_leave);
                    kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
                    hn0.h.i(u110, pm0.v.o(drawable, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1280, android.graphics.Bitmap.Config.ARGB_8888), 0, 2, null);
                    vn0.e eVar = u110.f420764m;
                    if (eVar != null) {
                        eVar.i(false);
                    }
                    u110.d0(false);
                    u110.c0(false);
                    u110.n();
                    return;
                }
                return;
            }
        }
        t1();
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // io0.a
    public java.lang.String getSelfUserId() {
        java.lang.String m86 = ((mm2.c1) P0(mm2.c1.class)).m8();
        return m86 == null ? "" : m86;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        co0.s u17 = u1();
        if (u17 != null) {
            u17.F(new com.tencent.mm.plugin.finder.live.plugin.zj0());
        }
    }

    public final co0.s u1() {
        return co0.b.f43709e2.c(V0().f309129d.f68537e);
    }

    public final void v1() {
        hn0.f fVar;
        hn0.f fVar2;
        hn0.f fVar3;
        java.lang.Object obj;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "visitor startPreview");
        ko0.l0 l0Var = ko0.l0.f309878a;
        dk2.ug ugVar = dk2.ug.f234218a;
        l0Var.c(dk2.ug.f234219b);
        ugVar.c(l0Var.b());
        co0.s u17 = u1();
        if (u17 != null && (fVar3 = u17.f420773t) != null) {
            lo0.k0 k0Var = l0Var.b().f320063d;
            if (k0Var.f320036b) {
                java.util.List<lo0.h0> list = k0Var.f320040f;
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((lo0.h0) obj).f320002f) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                lo0.h0 h0Var = (lo0.h0) obj;
                if (h0Var == null || (str = h0Var.f320000d) == null) {
                    str = "";
                }
                hn0.p pVar = (hn0.p) fVar3;
                pVar.b();
                pVar.f282400b.l(new hn0.n(pVar, k0Var.f320039e, str));
                for (lo0.h0 h0Var2 : list) {
                    pVar.f(h0Var2.f320001e, h0Var2.f320006j);
                }
                if (h0Var != null) {
                    hn0.f.a(fVar3, h0Var.f320006j, false, false, 4, null);
                }
            }
        }
        co0.s u18 = u1();
        if (u18 != null && (fVar2 = u18.f420773t) != null) {
            ((hn0.p) fVar2).i(dk2.ef.f233372a.F());
        }
        co0.s u19 = u1();
        if (u19 != null && (fVar = u19.f420773t) != null) {
            ((hn0.p) fVar).j(dk2.ef.f233372a.G());
        }
        co0.s u110 = u1();
        if (u110 != null) {
            hn0.h.b(u110, this.f112299p, ko0.c0.f309825a.b().f319996e, 0, 4, null);
        }
    }

    public final void w1() {
        kn0.p pVar;
        co0.s u17 = u1();
        if (u17 != null) {
            u17.f420774u = this.f112299p;
        }
        co0.s u18 = u1();
        if (u18 != null) {
            co0.s u19 = u1();
            u18.P0((u19 == null || (pVar = u19.D) == null) ? null : pVar.f309586f);
        }
    }
}

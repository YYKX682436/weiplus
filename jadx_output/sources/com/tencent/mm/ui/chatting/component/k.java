package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.c.class)
/* loaded from: classes7.dex */
public final class k extends com.tencent.mm.ui.chatting.component.a implements sb5.c, g05.j {

    /* renamed from: e, reason: collision with root package name */
    public long f199322e = java.lang.System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f199323f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f199324g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f199325h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f199326i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f199327m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f199328n;

    public k() {
        new android.os.Handler(android.os.Looper.getMainLooper());
        this.f199323f = new java.util.HashMap();
        this.f199327m = new com.tencent.mm.ui.chatting.component.g(this);
        this.f199328n = jz5.h.b(com.tencent.mm.ui.chatting.component.h.f199133d);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingEnterAnimEnd");
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onComponentUnInstall, this:" + hashCode());
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Ri();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        if (m0()) {
            this.f199324g = false;
            this.f199326i = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingExitAnimEnd");
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Zi();
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Ri();
            android.view.View view = this.f199325h;
            if (view != null) {
                view.removeOnLayoutChangeListener(this.f199327m);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onComponentInstall, this:" + hashCode());
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingInit");
        }
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        jc3.i0 i0Var;
        if (!m0() || java.lang.System.currentTimeMillis() - this.f199322e < ((java.lang.Number) ((jz5.n) this.f199328n).getValue()).longValue()) {
            return;
        }
        android.view.View view2 = this.f199325h;
        int height = view2 != null ? view2.getHeight() : -1;
        android.view.View view3 = this.f199325h;
        int i28 = view3 != null ? pm0.v.s(view3)[1] : -1;
        double c17 = i65.a.c(this.f198580d.g(), height);
        double d17 = i28;
        iq0.c Di = ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Di();
        if (Di != null) {
            i95.m c18 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            nq0.p pVar = (nq0.p) ((gq0.t) c18);
            synchronized (Di) {
                i0Var = (jc3.i0) ((java.util.LinkedHashMap) pVar.f338944f).get(Di);
                if (i0Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                } else if (!(i0Var instanceof hq0.h)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
                }
                i0Var = null;
            }
            hq0.h hVar = (hq0.h) i0Var;
            if (hVar != null) {
                hq0.b0 b0Var = (hq0.b0) hVar;
                iq0.e eVar = b0Var.f282970x.f293663i;
                if (eVar == null) {
                    com.tencent.mars.xlog.Log.e(b0Var.f282971y, "removeFrameSetView rootConfig nil");
                } else {
                    d75.b.g(new hq0.x(b0Var, eVar, d17, c17));
                }
            }
        }
        this.f199322e = java.lang.System.currentTimeMillis();
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (m0()) {
            if (i17 == 1 || i17 == 2) {
                this.f199326i = true;
            }
        }
    }

    public final boolean m0() {
        return this.f198580d.x().equals("gh_25d9ac85a4bc");
    }

    public void n0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "markAllView update isForeGround:" + this.f199324g);
        o0();
        if (this.f199324g) {
            this.f198580d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    public final void o0() {
        java.util.Collection<com.tencent.mm.ui.chatting.viewitems.g0> values = this.f199323f.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (com.tencent.mm.ui.chatting.viewitems.g0 g0Var : values) {
            kotlin.jvm.internal.o.d(g0Var);
            p0(g0Var, true);
        }
    }

    public final void p0(com.tencent.mm.ui.chatting.viewitems.g0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.storage.f9 currentMsgInfo = holder.getCurrentMsgInfo(this.f198580d);
        if (currentMsgInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "holder msg is null");
            return;
        }
        com.tencent.mm.storage.a9 a9Var = currentMsgInfo.f193927g2;
        kotlin.jvm.internal.o.e(a9Var, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgWxGameDynamicCard.MsgExtInfoAppMsgWxGameDynamicCard");
        com.tencent.mm.ui.chatting.viewitems.af afVar = (com.tencent.mm.ui.chatting.viewitems.af) a9Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "johnjh markViewUpdate msgid: " + currentMsgInfo.getMsgId() + ", msg extinfo oldrefresh:" + afVar.f203350d + ", newrefresh:" + z17);
        afVar.f203350d = z17;
        currentMsgInfo.f193927g2 = afVar;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingResume, component:" + hashCode());
            this.f199324g = true;
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "onEnterChattingRoom");
            g05.r rVar = (g05.r) ((g05.i) i95.n0.c(g05.i.class));
            rVar.getClass();
            rVar.f267488h = new java.lang.ref.WeakReference(this);
            android.view.View c17 = this.f198580d.c(com.tencent.mm.R.id.f483683bp0);
            this.f199325h = c17;
            if (c17 != null) {
                c17.addOnLayoutChangeListener(this.f199327m);
            }
            o0();
            if (!((g05.r) ((g05.i) i95.n0.c(g05.i.class))).f267489i) {
                ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Bi();
            }
            this.f198580d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (m0()) {
            this.f199324g = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingPause");
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingEnterAnimStart, component:" + hashCode());
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "onEnterChattingRoom");
            g05.r rVar = (g05.r) ((g05.i) i95.n0.c(g05.i.class));
            rVar.getClass();
            rVar.f267488h = new java.lang.ref.WeakReference(this);
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Bi();
            this.f198580d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }
}

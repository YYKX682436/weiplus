package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cj implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f112156d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f112157e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f112158f;

    /* renamed from: g, reason: collision with root package name */
    public final cm2.t f112159g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f112160h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f112161i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f112162m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f112163n;

    /* renamed from: o, reason: collision with root package name */
    public hq0.e0 f112164o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f112165p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f112166q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnAttachStateChangeListener f112167r;

    public cj(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112156d = context;
        this.f112157e = buContext;
        this.f112158f = statusMonitor;
        this.f112159g = tVar;
        this.f112160h = "FinderLiveGamePromoteBubble";
        this.f112161i = "PORTRAIT_ACTIONFinderLiveGamePromoteBubble";
        this.f112162m = "PORTRAIT_ACTION_BUNDLE_OPEN_GAME_PROMOTION";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dag, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f112163n = viewGroup;
        this.f112165p = (androidx.constraintlayout.widget.ConstraintLayout) viewGroup.findViewById(com.tencent.mm.R.id.b8g);
        this.f112167r = new com.tencent.mm.plugin.finder.live.plugin.xi(this);
        com.tencent.mars.xlog.Log.i("FinderLiveGamePromoteBubble", "initGameBubble");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f112159g;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (kotlin.jvm.internal.o.b(string, this.f112161i)) {
            r45.n63 n63Var = new r45.n63();
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            byte[] byteArray = bundle2 != null ? bundle2.getByteArray(this.f112162m) : null;
            if (byteArray == null) {
                return;
            }
            try {
                n63Var.parseFrom(byteArray);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void a(android.view.ViewGroup viewGroup, r45.n63 n63Var, hq0.e0 e0Var) {
        com.tencent.mars.xlog.Log.i(this.f112160h, "createFrameSetView");
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = new com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer(context, null, 0, 6, null);
        java.lang.String string = n63Var.getString(0);
        if (string != null) {
            magicSclViewContainer.e(string);
        }
        magicSclViewContainer.setId(android.view.View.generateViewId());
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1);
        viewGroup.addView(magicSclViewContainer);
        magicSclViewContainer.setLayoutParams(layoutParams);
        magicSclViewContainer.a(e0Var);
        magicSclViewContainer.bringToFront();
        magicSclViewContainer.getId();
        c(n63Var);
    }

    public final void b(cm2.u uVar) {
        android.view.ViewGroup viewGroup = this.f112163n;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.eqy);
        ((androidx.constraintlayout.widget.ConstraintLayout) viewGroup.findViewById(com.tencent.mm.R.id.b8g)).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.yi(this, uVar));
        if (zl2.r4.f473950a.y1(this.f112157e)) {
            weImageView.setVisibility(4);
        } else {
            weImageView.setVisibility(0);
            weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.zi(uVar));
        }
    }

    public final void c(r45.n63 n63Var) {
        hq0.e0 e0Var;
        com.tencent.mars.xlog.Log.i(this.f112160h, "updateDynamicBubbleData");
        java.lang.String string = n63Var.getString(0);
        com.tencent.mm.protobuf.g byteString = n63Var.getByteString(1);
        java.lang.String i17 = byteString != null ? byteString.i() : null;
        n63Var.getLong(2);
        if (string == null || i17 == null) {
            return;
        }
        if (string.length() > 0) {
            if (!(i17.length() > 0) || (e0Var = this.f112164o) == null) {
                return;
            }
            hq0.e0.b(e0Var, i17, string, null, 4, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.u) {
            cm2.u uVar = (cm2.u) data;
            b(uVar);
            c(uVar.f43400v);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        return this.f112163n;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.cj.l(java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
        java.lang.String str = this.f112160h;
        com.tencent.mars.xlog.Log.i(str, "onBubbleDel");
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.f112167r;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f112165p;
        constraintLayout.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        com.tencent.mars.xlog.Log.i(str, "releaseDynamicCardEnv");
        this.f112166q = false;
        constraintLayout.removeAllViews();
        hq0.e0 e0Var = this.f112164o;
        if (e0Var != null) {
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Bi(e0Var.f282984e);
        }
        this.f112164o = null;
        ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
        xg4.m mVar = xg4.m.f454446a;
        if (mVar.c()) {
            xg4.p pVar = xg4.m.f454447b;
            if (pVar != null) {
                pVar.C = null;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "setFinderLiveCallback not open!");
        }
        ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
        mVar.a(2000L);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void onPause() {
        hq0.e0 e0Var = this.f112164o;
        if (e0Var != null) {
            e0Var.f();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void onResume() {
        com.tencent.mars.xlog.Log.i(this.f112160h, "onResume");
        hq0.e0 e0Var = this.f112164o;
        if (e0Var != null) {
            e0Var.j();
        }
        hq0.e0 e0Var2 = this.f112164o;
        if (e0Var2 != null) {
            e0Var2.g();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.b8g;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void r0(android.os.Bundle bundle, long j17) {
    }
}

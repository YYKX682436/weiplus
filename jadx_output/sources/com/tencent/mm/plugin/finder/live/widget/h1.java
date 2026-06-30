package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public abstract class h1 extends com.tencent.mm.plugin.finder.live.widget.n8 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f118490y = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f118491h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f118492i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f118493m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f118494n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f118495o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f118496p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f118497q;

    /* renamed from: r, reason: collision with root package name */
    public gk2.e f118498r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f118499s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f118500t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.eh0 f118501u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f118502v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f118503w;

    /* renamed from: x, reason: collision with root package name */
    public zy2.gc f118504x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f118491h = "BaseJoinFansClubWidget";
        this.f118492i = kotlinx.coroutines.z0.b();
        this.f118501u = com.tencent.mm.plugin.finder.live.plugin.eh0.f112416f;
    }

    public final void b() {
        jz5.f0 f0Var;
        long j17;
        r45.o72 o72Var;
        dk2.xf W0;
        long j18;
        r45.nw1 nw1Var;
        gk2.e eVar = this.f118498r;
        if (eVar != null && ((mm2.d) eVar.a(mm2.d.class)).f328942f) {
            gk2.e eVar2 = this.f118498r;
            if (eVar2 != null) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r4Var.Q(context, eVar2, new com.tencent.mm.plugin.finder.live.widget.f1(this));
                return;
            }
            return;
        }
        ya2.g gVar = ya2.h.f460484a;
        gk2.e eVar3 = this.f118498r;
        ya2.b2 b17 = gVar.b(eVar3 != null ? ((mm2.c1) eVar3.a(mm2.c1.class)).f328852o : null);
        java.lang.String str = this.f118491h;
        if (b17 != null) {
            boolean f17 = hc2.s.f(b17);
            boolean a17 = hc2.s.a(b17);
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            java.lang.String e17 = xy2.c.e(context2);
            gk2.e eVar4 = this.f118498r;
            long j19 = eVar4 != null ? ((mm2.e1) eVar4.a(mm2.e1.class)).f328983m : 0L;
            com.tencent.mars.xlog.Log.i(str, "doFollowLogic, nickName:" + b17.w0() + ", objectId:" + j19 + ", participantFinderUsername:" + e17 + ", isPrivate:" + f17 + " , isBlock" + a17);
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context3 = getRoot().getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).c(zy2.ra.class))).V6();
            java.lang.String D0 = b17.D0();
            com.tencent.mm.plugin.finder.live.plugin.l basePlugin = getBasePlugin();
            if (basePlugin == null || (W0 = basePlugin.W0()) == null) {
                j17 = j19;
                o72Var = null;
            } else {
                gk2.e eVar5 = this.f118498r;
                if (eVar5 == null || (nw1Var = ((mm2.e1) eVar5.a(mm2.e1.class)).f328988r) == null) {
                    j17 = j19;
                    j18 = 0;
                } else {
                    j17 = j19;
                    j18 = nw1Var.getLong(0);
                }
                o72Var = ((dk2.r4) W0).K(j18);
            }
            c61.yb.R8(ybVar, V6, D0, 1, j17, f17, e17, o72Var, null, null, null, null, null, null, 8064, null);
            if (a17) {
                java.lang.String D02 = b17.D0();
                com.tencent.mars.xlog.Log.i(str, "[doBlockOpLog] ");
                this.f118504x = new com.tencent.mm.plugin.finder.live.widget.e1(this);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                zy2.j9.b(ya2.r.f460525a, D02, false, null, null, this.f118504x, 12, null);
            }
            this.f118503w = true;
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "doFollowLogic anchorContact is null!");
            db5.t7.g(getContext(), getContext().getString(com.tencent.mm.R.string.ddq));
            this.f118503w = false;
        }
    }

    public abstract void c();

    public final void d() {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f118493m;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f118493m = null;
        this.f118503w = false;
    }

    public abstract void e(gk2.e eVar, boolean z17, com.tencent.mm.plugin.finder.live.plugin.eh0 eh0Var);

    public final com.tencent.mm.ui.widget.dialog.y1 getBottomSheet() {
        return this.f118493m;
    }

    public final gk2.e getBuContext() {
        return this.f118498r;
    }

    public final yz5.l getDirectJoinListener() {
        return this.f118495o;
    }

    public final boolean getFollow() {
        return this.f118502v;
    }

    public final boolean getFromGiftPanel() {
        return this.f118500t;
    }

    public final com.tencent.mm.plugin.finder.live.plugin.eh0 getFromScene() {
        return this.f118501u;
    }

    public final yz5.a getHelpClickListener() {
        return this.f118496p;
    }

    public final yz5.l getJoinClickListener() {
        return this.f118494n;
    }

    public final boolean getNeedPurcahse() {
        return this.f118499s;
    }

    public abstract android.view.View getRoot();

    public final yz5.a getSubscribeSuperFansCallback() {
        return this.f118497q;
    }

    public final boolean getTryFollowing() {
        return this.f118503w;
    }

    public final void setBottomSheet(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f118493m = y1Var;
    }

    public final void setBuContext(gk2.e eVar) {
        this.f118498r = eVar;
    }

    public final void setDirectJoinListener(yz5.l lVar) {
        this.f118495o = lVar;
    }

    public final void setFollow(boolean z17) {
        this.f118502v = z17;
    }

    public final void setFromGiftPanel(boolean z17) {
        this.f118500t = z17;
    }

    public final void setFromScene(com.tencent.mm.plugin.finder.live.plugin.eh0 eh0Var) {
        kotlin.jvm.internal.o.g(eh0Var, "<set-?>");
        this.f118501u = eh0Var;
    }

    public final void setHelpClickListener(yz5.a aVar) {
        this.f118496p = aVar;
    }

    public final void setJoinClickListener(yz5.l lVar) {
        this.f118494n = lVar;
    }

    public final void setNeedPurcahse(boolean z17) {
        this.f118499s = z17;
    }

    public final void setSubscribeSuperFansCallback(yz5.a aVar) {
        this.f118497q = aVar;
    }

    public final void setTryFollowing(boolean z17) {
        this.f118503w = z17;
    }
}

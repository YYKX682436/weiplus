package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class e30 extends com.tencent.mm.plugin.finder.live.plugin.l implements jf2.o, jf2.l, jf2.n {
    public int A;
    public final android.widget.TextView B;
    public final java.lang.Object C;
    public final boolean D;
    public boolean E;
    public int F;
    public final int G;
    public final long H;
    public final java.lang.Runnable I;

    /* renamed from: J, reason: collision with root package name */
    public kotlinx.coroutines.r2 f118210J;
    public kotlinx.coroutines.r2 K;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f118211p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f118212q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f118213r;

    /* renamed from: s, reason: collision with root package name */
    public final int f118214s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.FrameLayout f118215t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.RelativeLayout f118216u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f118217v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f118218w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f118219x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView f118220y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f118221z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e30(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118211p = statusMonitor;
        this.f118212q = basePlugin;
        this.f118213r = "Finder.FinderLiveVisitorLikeWidget";
        ae2.in inVar = ae2.in.f3688a;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.f3911w5).getValue()).r();
        java.lang.Integer num = (java.lang.Integer) (((java.lang.Number) r17).intValue() > 0 ? r17 : null);
        this.f118214s = num != null ? num.intValue() : 9;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) root.findViewById(com.tencent.mm.R.id.f6f);
        this.f118215t = frameLayout;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.f6e);
        relativeLayout.setContentDescription(root.getContext().getString(com.tencent.mm.R.string.f491589dm0));
        this.f118216u = relativeLayout;
        this.f118217v = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.f6g);
        this.f118218w = (com.tencent.mm.view.MMPAGView) root.findViewById(com.tencent.mm.R.id.f6h);
        android.view.ViewParent parent = root.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f118219x = (android.widget.TextView) ((android.view.ViewGroup) parent).findViewById(com.tencent.mm.R.id.f6i);
        this.f118220y = (com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView) root.findViewById(com.tencent.mm.R.id.euv);
        this.f118221z = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.eus);
        this.B = (android.widget.TextView) basePlugin.f113324f.findViewById(com.tencent.mm.R.id.too);
        this.C = root.getContext().getSystemService("vibrator");
        this.D = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Q1).getValue()).r()).intValue() == 0;
        this.G = root.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8);
        this.H = 200L;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(frameLayout, "finder_live_room_like");
        K0(8);
        frameLayout.setOnTouchListener(new com.tencent.mm.plugin.finder.live.widget.j20(this, root));
        android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        zl2.r4.o3(zl2.r4.f473950a, root, "Finder.FinderLiveVisitorLikeWidget", false, false, 12, null);
        this.I = new com.tencent.mm.plugin.finder.live.widget.v20(this);
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.widget.e30 e30Var, android.view.View view, float f17) {
        e30Var.getClass();
        view.animate().setDuration(100L).scaleX(f17).scaleY(f17).start();
    }

    @Override // jf2.l
    public void F(int i17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        x1(false);
    }

    @Override // jf2.o
    public void b() {
        K0(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_call_good), java.lang.Integer.valueOf(com.tencent.mm.R.string.daw));
    }

    @Override // jf2.o
    public void g() {
        K0(8);
    }

    @Override // jf2.o
    public boolean i() {
        if (((mm2.c1) this.f118212q.P0(mm2.c1.class)).T) {
            return false;
        }
        return !(((mm2.n0) this.f118212q.P0(mm2.n0.class)).f329273r) && ((mm2.c1) this.f118212q.P0(mm2.c1.class)).F;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    @Override // jf2.o
    public int type() {
        return 14;
    }

    public final void u1() {
        r45.i62 i62Var;
        r45.i62 i62Var2;
        ((mm2.c1) P0(mm2.c1.class)).L1++;
        df2.cn cnVar = (df2.cn) U0(df2.cn.class);
        if (cnVar != null) {
            long j17 = ((mm2.c1) P0(mm2.c1.class)).L1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkShowBubble] enable = ");
            r45.k62 k62Var = cnVar.E;
            boolean z17 = false;
            sb6.append(k62Var != null ? java.lang.Boolean.valueOf(k62Var.getBoolean(0)) : null);
            sb6.append(", limit = ");
            r45.k62 k62Var2 = cnVar.E;
            sb6.append(k62Var2 != null ? java.lang.Integer.valueOf(k62Var2.getInteger(2)) : null);
            sb6.append(", bubble = ");
            r45.k62 k62Var3 = cnVar.E;
            sb6.append((k62Var3 == null || (i62Var2 = (r45.i62) k62Var3.getCustom(1)) == null) ? null : pm0.b0.g(i62Var2));
            sb6.append(", cnt = ");
            sb6.append(j17);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = cnVar.f229892p;
            com.tencent.mars.xlog.Log.i(str, sb7);
            r45.k62 k62Var4 = cnVar.E;
            if (k62Var4 != null) {
                if (k62Var4.getBoolean(0) && ((r45.i62) k62Var4.getCustom(1)) != null && j17 >= k62Var4.getInteger(2)) {
                    z17 = true;
                }
                r45.k62 k62Var5 = z17 ? k62Var4 : null;
                if (k62Var5 == null || (i62Var = (r45.i62) k62Var5.getCustom(1)) == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i(str, "[checkShowBubble] show bubble by like, cnt = " + j17);
                cnVar.f229899w.setValue(i62Var);
            }
        }
    }

    public final void v1(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f118213r, "[ken_startPostLike] likeCount+1 = " + (this.A + 1) + ", MAX_LIKE_ONE_TIME = " + this.f118214s);
        this.f118210J = com.tencent.mm.plugin.finder.live.util.y.m(this, null, kotlinx.coroutines.a1.UNDISPATCHED, new com.tencent.mm.plugin.finder.live.widget.w20(this, z17, null), 1, null);
    }

    public final void w1(boolean z17) {
        kotlinx.coroutines.r2 r2Var = this.K;
        boolean z18 = false;
        if (r2Var != null && r2Var.a()) {
            z18 = true;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i(this.f118213r, "[startUpLoadLike] upload like job is running");
        } else {
            this.K = com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.widget.x20(z17, this, null), 3, null);
        }
    }

    public final void x1(boolean z17) {
        com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView cheerCountDownView = this.f118220y;
        if (cheerCountDownView.getVisibility() == 0) {
            android.widget.ImageView imageView = this.f118221z;
            if (z17) {
                cheerCountDownView.animate().alpha(0.0f).setDuration(1000L).setListener(new com.tencent.mm.plugin.finder.live.widget.y20(this)).start();
                imageView.animate().alpha(0.0f).setDuration(1000L).setListener(new com.tencent.mm.plugin.finder.live.widget.z20(this)).start();
                return;
            }
            kotlinx.coroutines.r2 r2Var = cheerCountDownView.f111524h;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            cheerCountDownView.f111526m = 360.0f;
            imageView.setVisibility(8);
            cheerCountDownView.setVisibility(8);
        }
    }

    public final void y1(java.lang.String str, yz5.l lVar) {
        java.lang.String str2 = this.f118213r;
        com.tencent.mars.xlog.Log.i(str2, "updateCheerIcon:" + str);
        if (this.E) {
            com.tencent.mars.xlog.Log.i(str2, "applaud mode ,return");
            return;
        }
        if (str == null || str.length() == 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.d30(this, lVar));
            return;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        com.tencent.mm.plugin.finder.live.widget.c30 c30Var = new com.tencent.mm.plugin.finder.live.widget.c30(this, lVar);
        a17.getClass();
        a17.f447873d = c30Var;
        a17.f();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
    }

    public final void z1() {
        java.lang.Object obj = this.C;
        if (obj instanceof android.os.Vibrator) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                ((android.os.Vibrator) obj).vibrate(android.os.VibrationEffect.createOneShot(10L, 255));
            } else {
                ((android.os.Vibrator) obj).vibrate(10L);
            }
        }
    }
}

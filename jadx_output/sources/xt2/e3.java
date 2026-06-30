package xt2;

/* loaded from: classes3.dex */
public final class e3 extends android.widget.FrameLayout {
    public final com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView A;
    public com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView B;
    public final android.widget.ImageView C;
    public xt2.k1 D;
    public int E;
    public kotlinx.coroutines.r2 F;
    public final android.widget.TextView G;
    public android.view.View H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f456701J;
    public final java.util.ArrayList K;
    public so2.t2 L;
    public final dk2.f M;
    public yz5.a N;
    public kotlinx.coroutines.r2 P;
    public final long Q;
    public gk2.e R;
    public r45.y23 S;
    public final jz5.g T;
    public cm2.m0 U;
    public yt2.v V;
    public java.lang.Runnable W;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f456702d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f456703e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.qt2 f456704f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.ea0 f456705g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f456706h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f456707i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f456708m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f456709n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f456710o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f456711p;

    /* renamed from: p0, reason: collision with root package name */
    public cm2.m0 f456712p0;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f456713q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer f456714r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f456715s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f456716t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingBubbleTextView f456717u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f456718v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView f456719w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f456720x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f456721x0;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f456722y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.LinearLayout f456723z;

    /* renamed from: y0, reason: collision with root package name */
    public static final xt2.a2 f456700y0 = new xt2.a2(null);

    /* renamed from: l1, reason: collision with root package name */
    public static final java.util.HashMap f456699l1 = new java.util.HashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(android.content.Context context, android.view.ViewGroup entranceRoot, android.view.ViewGroup parent, qo0.c statusMonitor, r45.qt2 qt2Var, com.tencent.mm.plugin.finder.live.plugin.ea0 plugin) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(entranceRoot, "entranceRoot");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f456702d = parent;
        this.f456703e = statusMonitor;
        this.f456704f = qt2Var;
        this.f456705g = plugin;
        this.f456706h = "Finder.LiveShoppingBubbleWidget";
        context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480472yx);
        context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl);
        ym5.x.a(context, 2.0f);
        ym5.x.a(context, 20.0f);
        ym5.x.a(context, 12.0f);
        this.K = new java.util.ArrayList();
        this.L = new so2.t2();
        this.M = new dk2.f(qt2Var);
        this.Q = 5000L;
        this.T = jz5.h.b(new xt2.c3(context, this));
        xt2.g2 g2Var = new xt2.g2(this);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dau, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f456707i = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f484816fm5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f456708m = findViewById;
        this.f456710o = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hhj);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f486441l74);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f456711p = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.u49);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f456713q = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.lce);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f456714r = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.cug);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f456715s = findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.cux);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById6;
        this.f456716t = textView;
        textView.setTextSize(2, 12.0f);
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.l6m);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingBubbleTextView finderLiveShoppingBubbleTextView = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingBubbleTextView) findViewById7;
        this.f456717u = finderLiveShoppingBubbleTextView;
        finderLiveShoppingBubbleTextView.setTextSize(2, 14.0f);
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.l7n);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f456718v = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.l58);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f456719w = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView) findViewById9;
        this.B = (com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView) inflate.findViewById(com.tencent.mm.R.id.ckg);
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.lc_);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f456723z = (android.widget.LinearLayout) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.bys);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById11;
        this.f456720x = weImageView;
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.bzl);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById12;
        this.f456722y = weImageView2;
        android.view.View findViewById13 = inflate.findViewById(com.tencent.mm.R.id.r_d);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.A = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView) findViewById13;
        zl2.r4.c3(zl2.r4.f473950a, weImageView, 0, 0, 6, null);
        weImageView.setOnClickListener(g2Var);
        weImageView2.setOnClickListener(g2Var);
        android.view.View findViewById14 = inflate.findViewById(com.tencent.mm.R.id.l6c);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById14;
        this.G = textView2;
        android.view.View findViewById15 = inflate.findViewById(com.tencent.mm.R.id.uuk);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.H = findViewById15;
        android.view.View findViewById16 = inflate.findViewById(com.tencent.mm.R.id.uum);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById16;
        android.view.View findViewById17 = inflate.findViewById(com.tencent.mm.R.id.uul);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.f456701J = (android.widget.ImageView) findViewById17;
        this.H.setOnClickListener(new xt2.x1(this));
        this.I.setTextSize(2, 14.0f);
        textView2.setOnClickListener(new xt2.y1(this));
        textView2.setTextSize(2, 14.0f);
        android.view.View findViewById18 = inflate.findViewById(com.tencent.mm.R.id.qbe);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.C = (android.widget.ImageView) findViewById18;
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.B;
        if (finderLiveShoppingCouponView != null) {
            finderLiveShoppingCouponView.setCallback(new xt2.z1(this, context));
        }
        setClipChildren(false);
    }

    public static final void b(xt2.e3 e3Var) {
        android.view.ViewGroup viewGroup = e3Var.f456709n;
        jz5.f0 f0Var = null;
        if (viewGroup != null) {
            viewGroup.setTag(null);
        }
        xt2.k1 k1Var = e3Var.D;
        if (k1Var != null) {
            xt2.p0 p0Var = k1Var.f456845d;
            if (p0Var != null) {
                p0Var.b(3);
            }
            yt2.g gVar = k1Var.f456846e;
            if (gVar != null) {
                gVar.b(3);
            }
        }
        e3Var.k();
        e3Var.c();
        gk2.e eVar = e3Var.R;
        mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
        if (f6Var != null) {
            f6Var.I = null;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            gk2.e eVar2 = e3Var.R;
            so2.j5 j5Var = eVar2 != null ? ((mm2.f6) eVar2.a(mm2.f6.class)).f329049w : null;
            if (j5Var != null) {
                r45.f52 f52Var = new r45.f52();
                c61.bc bcVar = (c61.bc) j5Var;
                f52Var.set(4, java.lang.Long.valueOf(bcVar.c()));
                if (j5Var instanceof cm2.m0) {
                    f52Var.set(0, 5);
                } else if (j5Var instanceof cm2.k0) {
                    f52Var.set(0, 6);
                }
                f52Var.set(2, new com.tencent.mm.protobuf.g(bcVar.b().toByteArray()));
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i(e3Var.f456706h, "[hideShoppingBubble] but not promotting product");
            }
            k0Var.statusChange(bVar, bundle);
        }
        e3Var.f456705g.w1(false);
        e3Var.f456714r.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveShopPromoteContainer", "recycled");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView getSubsidyOverlay() {
        return (com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView) ((jz5.n) this.T).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0581, code lost:
    
        if (r13 != null) goto L238;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(xt2.e3 r32, r45.y23 r33, boolean r34, boolean r35, int r36, java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.e3.j(xt2.e3, r45.y23, boolean, boolean, int, java.lang.Object):void");
    }

    private final void setupCouponView(boolean z17) {
        android.view.ViewGroup viewGroup = this.f456710o;
        if (viewGroup != null) {
            viewGroup.setVisibility(z17 ? 8 : 0);
        }
        this.f456720x.setVisibility((z17 || (getContext() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveReplayUI) || kotlin.jvm.internal.o.b(((je2.h) this.f456705g.P0(je2.h.class)).f299233f.getValue(), java.lang.Boolean.TRUE)) ? 8 : 0);
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.B;
        if (finderLiveShoppingCouponView != null) {
            finderLiveShoppingCouponView.setVisibility(z17 ? 0 : 8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f456722y;
        if (!z17 || e()) {
            weImageView.setVisibility(8);
        } else {
            weImageView.setVisibility(0);
        }
        if (z17) {
            i65.a.f(getContext(), com.tencent.mm.R.dimen.f479688cn);
        } else if (e() || getContext().getResources().getConfiguration().orientation != 2) {
            i65.a.f(getContext(), com.tencent.mm.R.dimen.f480468ys);
        } else {
            i65.a.f(getContext(), com.tencent.mm.R.dimen.f479657bu);
        }
    }

    public final void c() {
        r45.y23 y23Var;
        if (this.U != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelSubsidyAnim productId=");
            cm2.m0 m0Var = this.U;
            sb6.append((m0Var == null || (y23Var = m0Var.f43368v) == null) ? null : java.lang.Long.valueOf(y23Var.getLong(0)));
            com.tencent.mars.xlog.Log.i(this.f456706h, sb6.toString());
        }
        java.lang.Runnable runnable = this.W;
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView finderLiveShoppingPriceView = this.f456719w;
        if (runnable != null) {
            finderLiveShoppingPriceView.removeCallbacks(runnable);
        }
        this.W = null;
        yt2.v vVar = this.V;
        if (vVar != null) {
            vVar.a();
        }
        this.V = null;
        getSubsidyOverlay().d();
        this.U = null;
        finderLiveShoppingPriceView.animate().cancel();
        finderLiveShoppingPriceView.setAlpha(1.0f);
        finderLiveShoppingPriceView.setTranslationY(0.0f);
        android.widget.LinearLayout linearLayout = this.f456723z;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        cm2.m0 m0Var2 = this.f456712p0;
        if (m0Var2 != null) {
            m(m0Var2);
            this.f456712p0 = null;
        }
        this.f456721x0 = false;
    }

    public final void d(android.content.Context context, cm2.k0 item) {
        dk2.xf W0;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        zl2.r4.f473950a.h3(context, true);
        boolean e17 = e();
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f456705g;
        bf2.c cVar = bf2.c.f19598a;
        java.lang.String str = item.f43361w;
        if (!e17) {
            gk2.e eVar = this.R;
            kotlin.jvm.internal.o.d(eVar);
            bf2.c.c(cVar, eVar, 5, 6, java.lang.String.valueOf(str), 0, null, 0, 0, null, 0, 1008, null);
            gk2.e eVar2 = this.R;
            if (eVar2 == null || (W0 = ea0Var.W0()) == null) {
                return;
            }
            ((dk2.r4) W0).R((com.tencent.mm.ui.MMActivity) context, ((mm2.e1) eVar2.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar2.a(mm2.e1.class)).f328983m, ((mm2.e1) eVar2.a(mm2.e1.class)).f328984n, ((mm2.c1) eVar2.a(mm2.c1.class)).f328852o, ((mm2.e1) eVar2.a(mm2.e1.class)).f328985o, item.f43362x, 3, ((mm2.c1) eVar2.a(mm2.c1.class)).f328844m5, new xt2.q2(context, this, eVar2, item));
            return;
        }
        gk2.e eVar3 = this.R;
        kotlin.jvm.internal.o.d(eVar3);
        bf2.c.c(cVar, eVar3, 5, 6, java.lang.String.valueOf(str), 0, null, 0, 0, null, 0, 1008, null);
        gk2.e eVar4 = this.R;
        if (eVar4 != null) {
            st2.s2.f412456a.a(eVar4, false);
        }
        dk2.xf W02 = ea0Var.W0();
        if (W02 != null) {
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            java.lang.String str2 = item.f43362x;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            int i17 = item.f43360v.getInteger(26) == 1 ? 1 : 0;
            r45.n90 n90Var = (r45.n90) item.f43360v.getCustom(24);
            ((dk2.r4) W02).Z(mMActivity, str3, 2, i17, n90Var != null ? n90Var.getLong(0) : 0L, new xt2.o2(context, this, item));
        }
    }

    public final boolean e() {
        if (zl2.r4.f473950a.w1()) {
            return true;
        }
        gk2.e eVar = this.R;
        return eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T;
    }

    public final void f(cm2.m0 m0Var, int i17) {
        java.lang.String str = this.f456706h;
        com.tencent.mars.xlog.Log.i(str, "parse showBox index " + i17);
        java.util.LinkedList list = m0Var.f43368v.getList(54);
        r45.q56 q56Var = list != null ? (r45.q56) kz5.n0.a0(list, i17) : null;
        java.util.LinkedList list2 = q56Var != null ? q56Var.getList(0) : null;
        boolean z17 = list2 == null || list2.isEmpty();
        android.widget.LinearLayout linearLayout = this.f456723z;
        if (z17) {
            xt2.k1 k1Var = this.D;
            if (k1Var != null) {
                k1Var.b(str, linearLayout);
                return;
            }
            return;
        }
        int measuredWidth = linearLayout.getMeasuredWidth();
        com.tencent.mars.xlog.Log.i(str, "parse showbox, promoteGroupWidth = " + measuredWidth);
        if (this.f456705g.x0()) {
            getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480467yr);
        } else {
            getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480473yy);
            com.tencent.mm.ui.bl.b(getContext());
            ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 124.0f);
        }
        xt2.k1 k1Var2 = this.D;
        if (k1Var2 == null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            k1Var2 = new xt2.k1(context, null, 2, null);
        }
        this.D = k1Var2;
        com.tencent.mm.plugin.finder.live.util.y.m(this.f456705g, null, null, new xt2.s2(this, list2, measuredWidth, null), 3, null);
    }

    public final void g(int i17, r45.y23 y23Var) {
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        zl2.r4 r4Var = zl2.r4.f473950a;
        qo0.c cVar = this.f456703e;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        ((c61.p2) ybVar).Kj(this.f456704f, 18054, zl2.r4.k0(r4Var, ((com.tencent.mm.plugin.finder.live.view.k0) cVar).getBuContext(), i17, java.lang.String.valueOf(y23Var.getLong(0)), 0, y23Var.getString(50), 8, null));
    }

    public final android.widget.TextView getActionBtn() {
        return this.G;
    }

    public final android.view.View getActionBtnNew() {
        return this.H;
    }

    public final android.widget.ImageView getActionBtnNewIcon() {
        return this.f456701J;
    }

    public final android.widget.TextView getActionBtnNewTv() {
        return this.I;
    }

    public final android.view.View getBubbleRoot() {
        return this.f456707i;
    }

    public final com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView getCouponView() {
        return this.B;
    }

    public final kotlinx.coroutines.r2 getJob() {
        return this.P;
    }

    public final gk2.e getLiveData() {
        return this.R;
    }

    public final com.tencent.mm.plugin.finder.live.plugin.ea0 getPlugin() {
        return this.f456705g;
    }

    public final r45.y23 getProductData() {
        return this.S;
    }

    public final r45.qt2 getReportObj() {
        return this.f456704f;
    }

    public final so2.t2 getShoppingUIConfig() {
        return this.L;
    }

    public final xt2.k1 getShowBox() {
        return this.D;
    }

    public final yz5.a getUserActionClick() {
        return this.N;
    }

    public final void h(cm2.m0 m0Var) {
        r45.y23 y23Var = m0Var.f43368v;
        r45.gt3 gt3Var = (r45.gt3) y23Var.getCustom(61);
        boolean z17 = true;
        java.lang.String string = gt3Var != null ? gt3Var.getString(1) : null;
        int i17 = (string == null || string.length() == 0) ? 1 : 0;
        st2.g3 g3Var = st2.g3.f412326a;
        org.json.JSONObject k17 = g3Var.k(y23Var);
        k17.put("if_explaining", m0Var.G);
        k17.put("product_tag", this.f456705g.z1(m0Var));
        k17.put("is_gift_show", i17 ^ 1);
        r45.bd5 bd5Var = (r45.bd5) y23Var.getCustom(70);
        java.lang.String string2 = bd5Var != null ? bd5Var.getString(0) : null;
        if (string2 != null && string2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            string2 = m0Var.K;
        }
        k17.put("buy_btn_word", string2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("product_button_info button_wording:");
        r45.bd5 bd5Var2 = (r45.bd5) y23Var.getCustom(70);
        sb6.append(bd5Var2 != null ? bd5Var2.getString(0) : null);
        sb6.append(", button_wording:");
        sb6.append(m0Var.K);
        com.tencent.mars.xlog.Log.i(this.f456706h, sb6.toString());
        g3Var.h(k17, y23Var.getList(54));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.f327431e, null, pm0.v.u(m0Var.f43369w), null, null, null, 0, 0L, k17, null, null, null, false, null, 16120, null);
    }

    public final void i(cm2.k0 data, boolean z17) {
        gk2.e eVar;
        yg2.b bVar;
        kotlin.jvm.internal.o.g(data, "data");
        kotlinx.coroutines.r2 r2Var = this.P;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        boolean e17 = e();
        if (z17) {
            com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.B;
            if (finderLiveShoppingCouponView != null) {
                finderLiveShoppingCouponView.c(data, e17, false);
            }
        } else {
            com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView2 = this.B;
            if (finderLiveShoppingCouponView2 != null) {
                finderLiveShoppingCouponView2.c(data, e17, false);
                finderLiveShoppingCouponView2.getLayoutParams().height = i65.a.f(getContext(), e17 ? com.tencent.mm.R.dimen.f480474yz : com.tencent.mm.R.dimen.f480475z0);
            }
            setupCouponView(true);
            long itemId = data.getItemId();
            com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f456705g;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.m(ea0Var, kotlinx.coroutines.internal.b0.f310484a, null, new xt2.f2(itemId, this, null), 2, null);
        }
        if (zl2.r4.f473950a.w1() || data.f43360v.getInteger(21) != 0 || (eVar = this.R) == null || (bVar = eVar.f272475i) == null) {
            return;
        }
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(bVar, kotlinx.coroutines.internal.b0.f310484a, null, new xt2.x2(this, data, null), 2, null);
    }

    public final void k() {
        com.tencent.mars.xlog.Log.i(this.f456706h, "stop play shoBox, job = " + this.F);
        kotlinx.coroutines.r2 r2Var = this.F;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.F = null;
    }

    public final void l(cm2.m0 m0Var, r45.z64 z64Var) {
        r45.y23 y23Var;
        cm2.m0 m0Var2 = this.U;
        java.lang.String str = this.f456706h;
        if (m0Var2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerSubsidyAnim skipped: already playing productId=");
            cm2.m0 m0Var3 = this.U;
            sb6.append((m0Var3 == null || (y23Var = m0Var3.f43368v) == null) ? null : java.lang.Long.valueOf(y23Var.getLong(0)));
            sb6.append(", incoming=");
            sb6.append(m0Var.f43368v.getLong(0));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            return;
        }
        this.U = m0Var;
        com.tencent.mars.xlog.Log.i(str, "triggerSubsidyAnim productId=" + m0Var.f43368v.getLong(0) + " → play immediately");
        xt2.m2 m2Var = new xt2.m2(this, z64Var, m0Var);
        android.view.View view = this.f456715s;
        if (view.getWidth() > 0) {
            m2Var.invoke();
        } else {
            com.tencent.mars.xlog.Log.i(str, "doTriggerSubsidyAnim but descContainer width still 0, wait for layout");
            view.getViewTreeObserver().addOnGlobalLayoutListener(new xt2.h2(this, m0Var, m2Var));
        }
    }

    public final void m(cm2.m0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        int width = ((this.f456715s.getWidth() - (((r45.bd5) item.f43368v.getCustom(70)) != null ? this.H : this.G).getWidth()) - i65.a.f(getContext(), com.tencent.mm.R.dimen.f479646bl)) - i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv);
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView finderLiveShoppingPriceView = this.f456719w;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        float f17 = width;
        boolean z17 = item.f43368v.getInteger(31) != 0;
        boolean z18 = item.f43368v.getInteger(36) != 0;
        java.lang.String string = item.f43368v.getString(43);
        xt2.i5 a17 = finderLiveShoppingPriceView.a(context, item, f17, true, true, z17, z18, !(string == null || string.length() == 0), i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 17.0f));
        int i17 = os5.w.X0;
        this.f456719w.b(1, item, a17);
    }

    public final void n(gk2.e eVar, java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.R = eVar;
        boolean z17 = data instanceof cm2.m0;
        bf2.c cVar = bf2.c.f19598a;
        java.lang.String str = this.f456706h;
        if (!z17) {
            if (data instanceof cm2.k0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update shopping bubble,");
                cm2.k0 k0Var = (cm2.k0) data;
                sb6.append(k0Var.f43362x);
                sb6.append(", productId:");
                sb6.append(k0Var.B);
                sb6.append(", sending:");
                sb6.append(k0Var.G);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                if (eVar != null) {
                    bf2.c.c(cVar, eVar, 1, 6, java.lang.String.valueOf(k0Var.f43361w), 0, null, 0, 0, null, 0, 1008, null);
                }
                i(k0Var, false);
                if (this.f456703e.getLiveRole() == 0 && this.f456702d.getVisibility() == 0) {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0.Fj((ml2.r0) c17, ml2.f4.f327444r, k0Var, null, null, 12, null);
                    return;
                }
                return;
            }
            return;
        }
        kotlinx.coroutines.r2 r2Var = this.P;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("update shopping bubble, productId:");
        cm2.m0 m0Var = (cm2.m0) data;
        sb7.append(m0Var.f43369w);
        sb7.append(", promoting:");
        sb7.append(m0Var.G);
        sb7.append(", platformName:");
        sb7.append(m0Var.D);
        sb7.append(",platformId:");
        sb7.append(m0Var.H);
        sb7.append(",seq:");
        sb7.append(m0Var.I);
        sb7.append('!');
        com.tencent.mars.xlog.Log.i(str, sb7.toString());
        mm2.c1 c1Var = (mm2.c1) this.f456705g.P0(mm2.c1.class);
        java.lang.String string = m0Var.f43368v.getString(17);
        if (string == null) {
            string = "";
        }
        c1Var.y9(string);
        if (eVar != null) {
            bf2.c.c(cVar, eVar, 1, 5, java.lang.String.valueOf(m0Var.f43369w), 0, null, 0, 0, null, 0, 1008, null);
        }
        j(this, m0Var.f43368v, false, false, 6, null);
        ym5.a1.h(this.f456707i, new xt2.d3(this, data));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dk2.f fVar = this.M;
        kotlinx.coroutines.y0 y0Var = fVar.f233413b;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        fVar.b();
        xt2.k1 k1Var = this.D;
        if (k1Var != null) {
            xt2.p0 p0Var = k1Var.f456845d;
            if (p0Var != null) {
                p0Var.b(3);
            }
            yt2.g gVar = k1Var.f456846e;
            if (gVar != null) {
                gVar.b(3);
            }
        }
        k();
        c();
        gk2.e eVar = this.R;
        if (eVar != null) {
            ((mm2.f6) eVar.a(mm2.f6.class)).I = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setActionBtn(cm2.m0 r20) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.e3.setActionBtn(cm2.m0):void");
    }

    public final void setActionBtnNew(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.H = view;
    }

    public final void setActionBtnNewIcon(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.f456701J = imageView;
    }

    public final void setActionBtnNewTv(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.I = textView;
    }

    public final void setCouponView(com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        this.B = finderLiveShoppingCouponView;
    }

    public final void setJob(kotlinx.coroutines.r2 r2Var) {
        this.P = r2Var;
    }

    public final void setLiveData(gk2.e eVar) {
        this.R = eVar;
    }

    public final void setProductData(r45.y23 y23Var) {
        this.S = y23Var;
    }

    public final void setShoppingUIConfig(so2.t2 t2Var) {
        kotlin.jvm.internal.o.g(t2Var, "<set-?>");
        this.L = t2Var;
    }

    public final void setUserActionClick(yz5.a aVar) {
        this.N = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        android.view.ViewGroup viewGroup = this.f456709n;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(i17);
    }
}

package qn2;

/* loaded from: classes3.dex */
public abstract class z extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: z, reason: collision with root package name */
    public static final qn2.s f365219z = new qn2.s(null);

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f365220p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f365221q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f365222r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f365223s;

    /* renamed from: t, reason: collision with root package name */
    public qn2.r f365224t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f365225u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f365226v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f365227w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f365228x;

    /* renamed from: y, reason: collision with root package name */
    public r45.cz1 f365229y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f365220p = statusMonitor;
        this.f365229y = new r45.cz1();
        zl2.q4.f473933a.R("FinderLiveLotteryCardPlugin");
        v1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0071  */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K0(int r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.z.K0(int):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 145) {
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS") : true;
            km2.z zVar = ((on2.z2) P0(on2.z2.class)).f347092m;
            if ((zVar != null ? zVar.f309232d : null) != null) {
                w1(z17, zVar);
                return;
            }
            K0(8);
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryCardPlugin", "openCard statusChange:" + z17 + " but lotteryInfo is empty!");
            return;
        }
        if (ordinal == 146) {
            K0(4);
            return;
        }
        if (ordinal == 148 && w0() == 0) {
            km2.z zVar2 = ((on2.z2) P0(on2.z2.class)).f347092m;
            if ((zVar2 != null ? zVar2.f309232d : null) != null) {
                w1(false, zVar2);
            } else {
                K0(8);
                com.tencent.mars.xlog.Log.i("FinderLiveLotteryCardPlugin", "updateCard lotteryInfo is empty!");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r0.f() == true) goto L12;
     */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O0() {
        /*
            r2 = this;
            super.O0()
            android.view.View r0 = r2.f365226v
            if (r0 != 0) goto L8
            goto Lc
        L8:
            r1 = 0
            r0.setBackground(r1)
        Lc:
            com.tencent.mm.view.MMPAGView r0 = r2.f365222r
            if (r0 == 0) goto L18
            boolean r0 = r0.f()
            r1 = 1
            if (r0 != r1) goto L18
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto L22
            com.tencent.mm.view.MMPAGView r0 = r2.f365222r
            if (r0 == 0) goto L22
            r0.n()
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.z.O0():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public void t1() {
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCardPlugin", "changeToUnvisible");
    }

    public final void u1(yz5.a callback) {
        java.lang.String str;
        r45.cz1 cz1Var;
        kotlin.jvm.internal.o.g(callback, "callback");
        dk2.xf W0 = W0();
        if (W0 != null) {
            km2.z zVar = ((on2.z2) P0(on2.z2.class)).f347092m;
            if (zVar == null || (cz1Var = zVar.f309232d) == null || (str = cz1Var.getString(0)) == null) {
                str = "";
            }
            ((dk2.r4) W0).N(str, null, new qn2.t(this, callback));
        }
    }

    public void v1() {
        qn2.u uVar = new qn2.u(this);
        android.view.ViewGroup viewGroup = this.f365323d;
        viewGroup.setOnClickListener(uVar);
        this.f365225u = viewGroup.findViewById(com.tencent.mm.R.id.b98);
        this.f365226v = viewGroup.findViewById(com.tencent.mm.R.id.b6y);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f365226v, "finder_live_lucky_result_card");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f365226v, 32, 25561);
        this.f365221q = (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.f484709f83);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.bys);
        this.f365227w = weImageView;
        if (weImageView != null) {
            weImageView.setOnClickListener(new qn2.v(this));
        }
        if (!x0()) {
            android.view.View view = this.f365226v;
            if (view != null) {
                view.setScaleX(1.0f);
            }
            android.view.View view2 = this.f365226v;
            if (view2 != null) {
                view2.setScaleY(1.0f);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f365227w;
            if (weImageView2 == null) {
                return;
            }
            weImageView2.setTranslationY(0.0f);
            return;
        }
        float f17 = com.tencent.mm.ui.bl.b(viewGroup.getContext()).y * 0.81f;
        int a17 = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 424.0f);
        float f18 = a17;
        float f19 = f17 / f18;
        if (f19 <= 0.0f) {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryCardPlugin", "adjustLayout invalid scale:" + f19 + ",targetHeight:" + f17 + ",sourceHeight:" + a17);
            return;
        }
        int a18 = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 320.0f);
        float f27 = a18;
        float f28 = f27 * f19;
        float f29 = f18 - f17;
        float f37 = f27 - f28;
        float f38 = 2;
        float f39 = f29 / f38;
        float f47 = -(f37 / f38);
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCardPlugin", "adjustLayout targetHeight:" + f17 + ",targetWidth:" + f28 + ",sourceHeight:" + a17 + ",sourceWidth:" + a18 + ",scale:" + f19 + ",diffHeight:" + f29 + ",translationY:" + f39 + ",diffWidth:" + f37 + ',' + f47);
        android.view.View view3 = this.f365226v;
        if (view3 != null) {
            view3.setScaleX(f19);
        }
        android.view.View view4 = this.f365226v;
        if (view4 != null) {
            view4.setScaleY(f19);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f365227w;
        if (weImageView3 != null) {
            weImageView3.setTranslationY(f39);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f365227w;
        if (weImageView4 == null) {
            return;
        }
        weImageView4.setTranslationX(f47);
    }

    public void w1(boolean z17, km2.z lotteryInfoWrapper) {
        kotlin.jvm.internal.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        int i17 = lotteryInfoWrapper.f309229a;
        qo0.c cVar = this.f365220p;
        if (i17 == 2) {
            qo0.b bVar = qo0.b.f365388n3;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_LOTTERY_VISIBILITY_CACHE", true);
            cVar.statusChange(bVar, bundle);
            return;
        }
        if (i17 != 3) {
            return;
        }
        qo0.b bVar2 = qo0.b.f365388n3;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("PARAM_FINDER_LIVE_LOTTERY_VISIBILITY_CACHE", true);
        cVar.statusChange(bVar2, bundle2);
        on2.z2 z2Var = (on2.z2) P0(on2.z2.class);
        r45.cz1 cz1Var = lotteryInfoWrapper.f309232d;
        z2Var.c7(cz1Var != null ? cz1Var.getString(0) : null);
    }

    public final void x1(km2.z lotteryInfoWrapper, r45.cz1 lotteryInfo, int i17, yz5.l callback) {
        kotlin.jvm.internal.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        kotlin.jvm.internal.o.g(lotteryInfo, "lotteryInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f365228x = callback;
        this.f365229y = lotteryInfo;
        boolean z17 = lotteryInfoWrapper.f309231c;
        boolean z18 = w0() == 0;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playLotteringAnim id:");
        sb6.append(lotteryInfo.getString(0));
        sb6.append(" status:");
        sb6.append(i17);
        sb6.append(", haveLottering:");
        sb6.append(z17);
        sb6.append(", isCardShowing:");
        sb6.append(z18);
        sb6.append(", lottering:");
        sb6.append(this.f365223s);
        sb6.append(",callback:");
        yz5.l lVar = this.f365228x;
        sb6.append(lVar != null ? java.lang.Integer.valueOf(lVar.hashCode()) : null);
        sb6.append(",isPagEnable:true");
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCardPlugin", sb6.toString());
        if (this.f365223s) {
            return;
        }
        if (z17) {
            yz5.l lVar2 = this.f365228x;
            if (lVar2 != null) {
                lVar2.invoke(this.f365229y);
                return;
            }
            return;
        }
        lotteryInfoWrapper.f309231c = true;
        if (!z18) {
            this.f365223s = true;
            com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new qn2.y(this, new qn2.w(this, lotteryInfo, i17), null), 3, null);
        } else {
            yz5.l lVar3 = this.f365228x;
            if (lVar3 != null) {
                lVar3.invoke(this.f365229y);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        android.content.Context context;
        android.content.res.Resources resources;
        super.z0();
        android.view.View view = this.f365226v;
        if (view == null) {
            return;
        }
        view.setBackground((view == null || (context = view.getContext()) == null || (resources = context.getResources()) == null) ? null : resources.getDrawable(com.tencent.mm.R.drawable.icon_live_lottery_card_bg));
    }
}

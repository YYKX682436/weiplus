package te2;

/* loaded from: classes3.dex */
public final class o implements te2.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418261d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f418262e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f418263f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f418264g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f418265h;

    public o(android.view.View root, com.tencent.mm.ui.MMActivity activity, te2.a aVar, yz5.l setRootVisibleFunction) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(setRootVisibleFunction, "setRootVisibleFunction");
        this.f418261d = root;
        this.f418262e = activity;
        this.f418263f = setRootVisibleFunction;
        root.setOnClickListener(new te2.m(this));
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) root.findViewById(com.tencent.mm.R.id.f482944sh);
        if (this.f418264g == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubbleViewCallback", "#initSmallAnim create smallAnim!");
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            android.content.Context context = root.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
            this.f418264g = mMPAGView;
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463328x0));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(mo0.h.a(activity, 72.0f), mo0.h.a(activity, 172.0f));
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.f418264g;
            if (mMPAGView2 != null) {
                mMPAGView2.setLayoutParams(layoutParams);
            }
            com.tencent.mm.view.MMPAGView mMPAGView3 = this.f418264g;
            if (mMPAGView3 != null) {
                mMPAGView3.setScaleMode(1);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f418264g);
            }
        }
        setRootVisibleFunction.invoke(8);
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubbleViewCallback", "#hideBubbleView");
        this.f418263f.invoke(8);
    }

    public void g() {
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubbleViewCallback", "#showBubbleView");
        if (this.f418261d.isShown()) {
            return;
        }
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.R;
            ml2.e2[] e2VarArr = ml2.e2.f327374d;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(1), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((ml2.r0) c18).Yj(ml2.f2.f327423e, "");
        }
        this.f418263f.invoke(0);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f418264g;
        if (mMPAGView != null) {
            mMPAGView.n();
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f418264g;
        if (mMPAGView2 != null) {
            android.content.res.AssetManager assets = this.f418262e.getAssets();
            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
            mMPAGView2.k(assets, "finder_live_allowance_gift_bubble_icon.pag");
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = this.f418264g;
        if (mMPAGView3 != null) {
            mMPAGView3.setRepeatCount(1);
        }
        com.tencent.mm.view.MMPAGView mMPAGView4 = this.f418264g;
        if (mMPAGView4 != null) {
            mMPAGView4.setProgress(0.0d);
        }
        com.tencent.mm.view.MMPAGView mMPAGView5 = this.f418264g;
        if (mMPAGView5 != null) {
            mMPAGView5.g();
        }
        com.tencent.mm.view.MMPAGView mMPAGView6 = this.f418264g;
        if (mMPAGView6 != null) {
            mMPAGView6.d();
        }
        com.tencent.mm.view.MMPAGView mMPAGView7 = this.f418264g;
        if (mMPAGView7 != null) {
            mMPAGView7.a(new te2.n(this));
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f418262e;
    }
}

package pn2;

/* loaded from: classes3.dex */
public final class c0 extends ie2.a implements pn2.b {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f356974g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f356975h;

    /* renamed from: i, reason: collision with root package name */
    public final pn2.a f356976i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f356977m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f356978n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f356979o;

    /* renamed from: p, reason: collision with root package name */
    public pn2.t f356980p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f356981q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.Animator f356982r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f356983s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z17, android.view.View root, com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout, com.tencent.mm.ui.MMActivity activity, pn2.a aVar) {
        super(root, frameBubbleContentLayout);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f356974g = z17;
        this.f356975h = activity;
        this.f356976i = aVar;
        this.f356977m = "FinderLiveLotteryBubbleViewCallback" + hashCode();
        this.f356978n = "small_lottery_amin.pag";
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f356981q = true;
        zl2.q4.f473933a.R("FinderLiveLotteryBubbleViewCallback");
        u().setTag(java.lang.Float.valueOf(1.0f));
    }

    public final void A(android.os.Bundle bundle) {
        java.lang.String str;
        android.widget.TextView B = B();
        if (B != null) {
            if (bundle == null || (str = bundle.getString("currentCountDownText")) == null) {
                str = "";
            }
            B.setText(str);
        }
        android.view.View t17 = t(com.tencent.mm.R.id.f484710f84);
        if (t17 != null) {
            t17.setOnClickListener(new pn2.u(this));
        }
    }

    public final android.widget.TextView B() {
        android.view.View t17 = t(com.tencent.mm.R.id.cjn);
        if (t17 instanceof android.widget.TextView) {
            return (android.widget.TextView) t17;
        }
        return null;
    }

    public final android.widget.ImageView C() {
        android.view.View t17 = t(com.tencent.mm.R.id.f486442l75);
        if (t17 instanceof android.widget.ImageView) {
            return (android.widget.ImageView) t17;
        }
        return null;
    }

    public final android.widget.FrameLayout D() {
        android.view.View t17 = t(com.tencent.mm.R.id.f483046v5);
        if (t17 instanceof android.widget.FrameLayout) {
            return (android.widget.FrameLayout) t17;
        }
        return null;
    }

    public final void E() {
        if (this.f356981q) {
            com.tencent.mm.view.MMPAGView mMPAGView = this.f356979o;
            java.lang.String str = this.f356977m;
            if (mMPAGView == null) {
                com.tencent.mars.xlog.Log.i(str, "initSmallAnim create smallAnim!");
                android.content.Context context = u().getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                this.f356979o = new com.tencent.mm.view.MMPAGView(context);
                ym5.l2 l2Var = ym5.l2.f463424a;
                ym5.j2[] j2VarArr = ym5.j2.f463392d;
                com.tencent.mm.view.MMPAGView mMPAGView2 = this.f356979o;
                if (mMPAGView2 != null) {
                    mMPAGView2.o(ae2.in.f3688a.a(ym5.f6.f463302b2));
                }
                pn2.t tVar = new pn2.t(this, this);
                this.f356980p = tVar;
                com.tencent.mm.view.MMPAGView mMPAGView3 = this.f356979o;
                if (mMPAGView3 != null) {
                    mMPAGView3.a(tVar);
                }
            }
            android.widget.FrameLayout D = D();
            if (D != null) {
                D.setVisibility(0);
            }
            android.widget.ImageView C = C();
            if (C != null) {
                C.setVisibility(4);
            }
            com.tencent.mm.view.MMPAGView mMPAGView4 = this.f356979o;
            if (mMPAGView4 != null) {
                mMPAGView4.setTransitionName("pag_anim");
            }
            android.widget.FrameLayout D2 = D();
            if (D2 != null && D2.indexOfChild(this.f356979o) == -1) {
                com.tencent.mars.xlog.Log.i(str, "initSmallAnim add smallAnim!");
                com.tencent.mm.view.MMPAGView mMPAGView5 = this.f356979o;
                android.view.ViewParent parent = mMPAGView5 != null ? mMPAGView5.getParent() : null;
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f356979o);
                }
                android.widget.FrameLayout D3 = D();
                if (D3 != null) {
                    D3.removeAllViews();
                }
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                com.tencent.mm.view.MMPAGView mMPAGView6 = this.f356979o;
                if (mMPAGView6 != null) {
                    mMPAGView6.setLayoutParams(layoutParams);
                }
                com.tencent.mm.view.MMPAGView mMPAGView7 = this.f356979o;
                if (mMPAGView7 != null) {
                    android.content.res.AssetManager assets = this.f356975h.getAssets();
                    kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                    mMPAGView7.k(assets, this.f356978n);
                }
                android.widget.FrameLayout D4 = D();
                if (D4 != null) {
                    D4.addView(this.f356979o);
                }
            }
            if (!x()) {
                u().setTranslationY(-i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv));
            }
            u().setTranslationX(0.0f);
            android.widget.TextView B = B();
            if (B == null) {
                return;
            }
            com.tencent.mm.ui.kk.d(B, 0);
        }
    }

    public void F(boolean z17) {
        if (z17 != this.f356983s) {
            com.tencent.mars.xlog.Log.i(this.f356977m, "needResize :" + z17);
        }
        this.f356983s = z17;
        android.widget.FrameLayout D = D();
        boolean z18 = false;
        if (D != null && D.getVisibility() == 0) {
            z18 = true;
        }
        if (z18) {
            L();
        }
    }

    public void G() {
        com.tencent.mm.view.MMPAGView mMPAGView;
        com.tencent.mars.xlog.Log.i(this.f356977m, "reset");
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f356979o;
        boolean z17 = false;
        if (mMPAGView2 != null && mMPAGView2.f()) {
            z17 = true;
        }
        if (z17 && (mMPAGView = this.f356979o) != null) {
            mMPAGView.n();
        }
        android.animation.Animator animator = this.f356982r;
        if (animator != null) {
            animator.cancel();
        }
        this.f356982r = null;
    }

    public final android.os.Bundle H() {
        android.os.Bundle bundle = new android.os.Bundle();
        android.widget.TextView B = B();
        bundle.putString("currentCountDownText", java.lang.String.valueOf(B != null ? B.getText() : null));
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((pn2.s) r1).i() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I() {
        /*
            r3 = this;
            r0 = 0
            pn2.a r1 = r3.f356976i
            if (r1 == 0) goto Lf
            pn2.s r1 = (pn2.s) r1
            boolean r1 = r1.i()
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            if (r2 == 0) goto L1c
            android.widget.ImageView r1 = r3.C()
            if (r1 == 0) goto L1c
            r3.K()
            goto L33
        L1c:
            r3.E()
            android.widget.FrameLayout r1 = r3.D()
            if (r1 != 0) goto L26
            goto L29
        L26:
            r1.setVisibility(r0)
        L29:
            com.tencent.mm.view.MMPAGView r0 = r3.f356979o
            if (r0 != 0) goto L2e
            goto L33
        L2e:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.setProgress(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.c0.I():void");
    }

    public void J(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showPrepareLottery smallAnim is null:");
        sb6.append(this.f356979o == null);
        sb6.append(",isPagEnable:");
        boolean z17 = this.f356981q;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(this.f356977m, sb6.toString());
        G();
        L();
        pn2.a aVar = this.f356976i;
        if (aVar != null && ((pn2.s) aVar).i()) {
            K();
            return;
        }
        if (!z17) {
            callback.invoke();
            return;
        }
        E();
        android.widget.FrameLayout D = D();
        if (D != null) {
            D.setVisibility(0);
        }
        android.widget.ImageView C = C();
        if (C != null) {
            C.setVisibility(8);
        }
        android.widget.TextView B = B();
        if (B != null) {
            B.setVisibility(8);
        }
        pn2.t tVar = this.f356980p;
        if (tVar != null) {
            tVar.f357028e = callback;
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f356979o;
        if (mMPAGView != null) {
            mMPAGView.setProgress(0.0d);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f356979o;
        if (mMPAGView2 != null) {
            mMPAGView2.d();
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = this.f356979o;
        if (mMPAGView3 != null) {
            mMPAGView3.g();
        }
    }

    public final void K() {
        r45.gz1 gz1Var;
        r45.yd4 yd4Var;
        java.lang.String str = null;
        pn2.a aVar = this.f356976i;
        if (aVar != null) {
            km2.z zVar = ((on2.z2) ((pn2.s) aVar).f357013e.a(on2.z2.class)).f347092m;
            r45.cz1 cz1Var = zVar != null ? zVar.f309232d : null;
            if (cz1Var != null && (gz1Var = (r45.gz1) cz1Var.getCustom(14)) != null && (yd4Var = (r45.yd4) gz1Var.getCustom(1)) != null) {
                str = yd4Var.getString(1);
            }
        }
        android.widget.FrameLayout D = D();
        if (D != null) {
            D.setVisibility(8);
        }
        android.widget.ImageView C = C();
        if (C != null) {
            C.setVisibility(8);
        }
        android.widget.ImageView C2 = C();
        if (C2 != null) {
            C2.setTransitionName("pag_anim");
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        pn2.z zVar2 = new pn2.z(this);
        a17.getClass();
        a17.f447873d = zVar2;
        a17.f();
        u().setTranslationY(0.0f);
        u().setTranslationX(i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479646bl));
        android.widget.TextView B = B();
        if (B == null) {
            return;
        }
        com.tencent.mm.ui.kk.d(B, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479644bj));
    }

    public final void L() {
        float f17 = this.f356983s ? 0.8f : 1.0f;
        android.view.View u17 = u();
        boolean b17 = kotlin.jvm.internal.o.b(u17.getTag(), java.lang.Float.valueOf(f17));
        java.lang.String str = this.f356977m;
        if (b17) {
            com.tencent.mars.xlog.Log.i(str, "updateRootViewSize fail, scale:" + f17 + ",width:" + u17.getLayoutParams().width);
            return;
        }
        u17.setTag(java.lang.Float.valueOf(f17));
        com.tencent.mars.xlog.Log.i(str, "updateRootViewSize scale:" + f17);
        u17.post(new pn2.b0(u17, f17, this));
    }

    @Override // ie2.h
    public android.os.Bundle a() {
        return H();
    }

    @Override // ie2.h
    public boolean g() {
        boolean z17 = false;
        pn2.a aVar = this.f356976i;
        if (aVar != null) {
            km2.z zVar = ((on2.z2) ((pn2.s) aVar).f357013e.a(on2.z2.class)).f347092m;
            if ((zVar != null ? zVar.f309229a : 0) == 4) {
                z17 = true;
            }
        }
        return true ^ z17;
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f356975h;
    }

    @Override // ie2.h
    public void j() {
        J(new pn2.w(this));
    }

    @Override // ie2.h
    public void l(android.os.Bundle bundle) {
        A(bundle);
        android.widget.TextView B = B();
        if (B != null) {
            B.setBackgroundResource(com.tencent.mm.R.drawable.f481738a53);
        }
        I();
    }

    @Override // ie2.h
    public android.os.Bundle o() {
        return H();
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        A(bundle);
    }

    @Override // ie2.a
    public java.lang.String v() {
        return this.f356977m;
    }
}

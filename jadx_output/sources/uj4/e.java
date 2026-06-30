package uj4;

/* loaded from: classes11.dex */
public final class e extends com.tencent.mm.ui.component.UIComponent implements bi4.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f428417d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f428418e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f428419f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f428420g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f428421h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f428422i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f428423m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f428424n;

    /* renamed from: o, reason: collision with root package name */
    public float f428425o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f428426p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Boolean f428427q;

    /* renamed from: r, reason: collision with root package name */
    public bi4.l0 f428428r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.ref.WeakReference f428429s;

    /* renamed from: t, reason: collision with root package name */
    public final uj4.d f428430t;

    /* renamed from: u, reason: collision with root package name */
    public bi4.o0 f428431u;

    /* renamed from: v, reason: collision with root package name */
    public pj4.o0 f428432v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f428417d = "MicroMsg.TextStatusBackPreviewUIC@" + activity.hashCode();
        this.f428430t = new uj4.d(this);
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
    }

    public final void O6(androidx.fragment.app.FragmentManager fragmentManager, android.view.ViewGroup viewGroup, java.lang.String str, java.lang.String scene, boolean z17) {
        kotlin.jvm.internal.o.g(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.o.g(scene, "scene");
        java.lang.String str2 = this.f428417d;
        if (viewGroup != null) {
            if (!(str == null || str.length() == 0)) {
                android.content.Context context = viewGroup.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                this.f428421h = new java.lang.ref.WeakReference(activity != null ? (com.tencent.mm.ui.base.CustomViewPager) activity.findViewById(com.tencent.mm.R.id.kod) : null);
                int i17 = com.tencent.mm.plugin.textstatus.ui.TextStatusProfileCardFeedActivity.f173684t;
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p.clear();
                android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusProfileCardFeedActivity.class);
                intent.putExtra("KEY_USER_NAME", str);
                intent.putExtra("KEY_FROM_SCENE", scene);
                android.content.Intent intent2 = context2 instanceof android.app.Activity ? ((android.app.Activity) context2).getIntent() : null;
                int intExtra = intent2 != null ? intent2.getIntExtra("CONTACT_INFO_UI_SOURCE", 0) : 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "profileReferPath:" + intExtra);
                intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
                com.tencent.mm.ui.vas.VASCommonFragment a17 = lk5.q0.a(com.tencent.mm.plugin.textstatus.ui.TextStatusProfileCardFeedActivity.class, intent, false, false, false, com.tencent.mm.ui.vas.VASCommonFragment.class, 28, null);
                a17.setMenuVisibility(false);
                int[] a18 = bi4.e.a(viewGroup.getContext());
                android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(viewGroup.getContext());
                relativeLayout.setId(com.tencent.mm.R.id.s1e);
                viewGroup.addView(relativeLayout, 0, new android.view.ViewGroup.LayoutParams(a18[0], a18[1]));
                a17.q0(new uj4.a(this));
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = getActivity().findViewById(com.tencent.mm.R.id.s1e);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addStatusFeedVASFragmentToRoot: find vasContainer=");
                sb6.append(h0Var.f310123d != null);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                java.lang.Object obj = h0Var.f310123d;
                if (obj == null) {
                    viewGroup.post(new uj4.b(h0Var, this, fragmentManager, a17));
                } else {
                    T6(fragmentManager, (android.view.ViewGroup) obj, a17);
                }
                this.f428424n = z17;
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "addStatusFeedVASFragmentToRoot: failed");
    }

    public final boolean P6() {
        boolean b17 = kotlin.jvm.internal.o.b(this.f428427q, java.lang.Boolean.TRUE);
        java.lang.String str = this.f428417d;
        if (b17) {
            com.tencent.mars.xlog.Log.i(str, "checkShouldInterceptProfileLifeCycle: reset");
            this.f428427q = null;
            return true;
        }
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = V6();
        boolean z17 = V6 != null ? V6.f173788v : false;
        this.f428427q = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i(str, "checkShouldSkipPauseResume: " + this.f428427q);
        return z17;
    }

    public final void Q6() {
        com.tencent.mars.xlog.Log.i(this.f428417d, "doOnPostClose: ");
        this.f428423m = false;
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = V6();
        if (V6 != null) {
            V6.W6(false);
            com.tencent.mm.plugin.textstatus.ui.n2 U6 = U6();
            if (U6 != null) {
                U6.onPostClose();
            }
            V6.f173785s = true;
        }
    }

    public final void R6() {
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView;
        com.tencent.mars.xlog.Log.i(this.f428417d, "doOnPostOpen: ");
        this.f428423m = true;
        bi4.l0 l0Var = this.f428428r;
        if (l0Var != null) {
            l0Var.K5(false);
        }
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = V6();
        if (V6 != null) {
            V6.f173787u = true;
            V6.f173785s = false;
            V6.f173786t = true;
            com.tencent.mm.plugin.textstatus.ui.n2 U6 = U6();
            if (U6 != null) {
                U6.a();
                com.tencent.mm.plugin.textstatus.ui.n2 U62 = U6();
                if (U62 != null) {
                    U62.onPostOpen(false);
                }
                U6.H();
            }
            if (this.f428426p) {
                this.f428426p = false;
                com.tencent.mm.plugin.textstatus.ui.n2 U63 = U6();
                if (U63 == null || (longTextView = U63.f174198o) == null) {
                    return;
                }
                longTextView.b(true);
            }
        }
    }

    public final void S6() {
        com.tencent.mars.xlog.Log.i(this.f428417d, "doOnPreClose: ");
        bi4.l0 l0Var = this.f428428r;
        if (l0Var != null) {
            l0Var.K5(true);
        }
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = V6();
        if (V6 != null) {
            V6.f173787u = false;
            V6.f173786t = false;
            java.util.Map map = V6.f173778i;
            if (true ^ ((java.util.LinkedHashMap) map).values().isEmpty()) {
                java.lang.Object W = kz5.n0.W(((java.util.LinkedHashMap) map).values());
                kotlin.jvm.internal.o.e(W, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.ui.StatusCardView");
                b7(((com.tencent.mm.plugin.textstatus.ui.q3) W).A);
            }
        }
        com.tencent.mm.plugin.textstatus.ui.n2 U6 = U6();
        if (U6 != null) {
            U6.onPreClose();
        }
    }

    public final void T6(androidx.fragment.app.FragmentManager fragmentManager, android.view.ViewGroup viewGroup, com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment) {
        java.lang.Object m521constructorimpl;
        java.lang.String str = this.f428417d;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e(str, "doReplaceFragmentTransaction: failed");
            return;
        }
        androidx.fragment.app.i2 beginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            beginTransaction.k(com.tencent.mm.R.id.s1e, vASCommonFragment, null);
            beginTransaction.g();
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m528isSuccessimpl(m521constructorimpl)) {
            this.f428420g = new java.lang.ref.WeakReference(viewGroup);
        }
        com.tencent.mars.xlog.Log.i(str, "doReplaceFragmentTransaction: err=" + kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) + ", enablePlayMediaOnProfileClosed=" + this.f428424n);
    }

    public final com.tencent.mm.plugin.textstatus.ui.n2 U6() {
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = V6();
        bi4.n0 P6 = V6 != null ? V6.P6() : null;
        if (P6 instanceof com.tencent.mm.plugin.textstatus.ui.n2) {
            return (com.tencent.mm.plugin.textstatus.ui.n2) P6;
        }
        return null;
    }

    public final com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6() {
        java.lang.ref.WeakReference weakReference = this.f428422i;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (activity instanceof androidx.appcompat.app.AppCompatActivity) {
                return (com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).e(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class);
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mars.xlog.Log.e(this.f428417d, "getBackStatusCardFeedUIC: fail, " + this.f428422i + ", " + activity);
        return null;
    }

    public final void W6(int i17) {
        android.view.ViewGroup viewGroup;
        java.lang.ref.WeakReference weakReference = this.f428420g;
        if (weakReference == null || (viewGroup = (android.view.ViewGroup) weakReference.get()) == null || i17 <= 0 || this.f428423m) {
            return;
        }
        float f17 = -(i17 / 2.0f);
        viewGroup.setTranslationY(f17);
        this.f428425o = f17;
    }

    public final boolean X6() {
        java.lang.ref.WeakReference weakReference = this.f428420g;
        return (weakReference != null ? (android.view.ViewGroup) weakReference.get() : null) != null;
    }

    public final void Y6(float f17, float f18, float f19) {
        java.lang.ref.WeakReference weakReference = this.f428429s;
        android.widget.ImageView imageView = weakReference != null ? (android.widget.ImageView) weakReference.get() : null;
        if (imageView != null) {
            imageView.setAlpha((1 - f17) * 0.3f);
        }
        java.lang.ref.WeakReference weakReference2 = this.f428420g;
        android.view.ViewGroup viewGroup = weakReference2 != null ? (android.view.ViewGroup) weakReference2.get() : null;
        if (viewGroup == null) {
            return;
        }
        if (f19 >= f18) {
            viewGroup.setTranslationY((1 - f17) * this.f428425o);
        } else {
            viewGroup.setTranslationY(f18 - f19);
        }
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = V6();
        bi4.n0 P6 = V6 != null ? V6.P6() : null;
        if (P6 != null) {
            P6.r(f17, f18, f19);
        }
    }

    public final void Z6() {
        java.lang.ref.WeakReference weakReference = this.f428420g;
        java.lang.String str = this.f428417d;
        if (weakReference != null) {
            if ((weakReference != null ? (android.view.ViewGroup) weakReference.get() : null) != null) {
                java.lang.ref.WeakReference weakReference2 = this.f428420g;
                android.view.ViewGroup viewGroup = weakReference2 != null ? (android.view.ViewGroup) weakReference2.get() : null;
                android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeStatusFeedVASFragmentInRoot: parent=");
                sb6.append(viewGroup2 != null);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                if (viewGroup2 != null) {
                    viewGroup2.removeView(viewGroup);
                }
                this.f428420g = null;
                this.f428422i = null;
                this.f428429s = null;
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(str, "removeStatusFeedVASFragmentInRoot: skip");
    }

    public final void a7(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f428417d, "setLauncherUIViewPagerCanSlide: " + z17);
        java.lang.ref.WeakReference weakReference = this.f428421h;
        com.tencent.mm.ui.base.CustomViewPager customViewPager = weakReference != null ? (com.tencent.mm.ui.base.CustomViewPager) weakReference.get() : null;
        if (customViewPager != null) {
            customViewPager.setCanSlide(z17);
        }
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        bi4.l0 l0Var;
        java.util.List q17 = ai4.m0.f5173a.G().q(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("db event notify username=");
        sb6.append(str);
        sb6.append(", newDataSize=");
        sb6.append(q17.size());
        sb6.append(", ");
        java.lang.ref.WeakReference weakReference = this.f428422i;
        sb6.append(weakReference != null ? (android.app.Activity) weakReference.get() : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f428417d;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (q17.isEmpty()) {
            Z6();
            bi4.l0 l0Var2 = this.f428428r;
            if (l0Var2 != null) {
                l0Var2.j1();
                return;
            }
            return;
        }
        if (this.f428422i == null && this.f428420g == null) {
            bi4.l0 l0Var3 = this.f428428r;
            if (l0Var3 != null) {
                l0Var3.a6();
            }
            bi4.l0 l0Var4 = this.f428428r;
            if (l0Var4 != null) {
                l0Var4.M2();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = V6();
        if (V6 != null) {
            com.tencent.mars.xlog.Log.i(str2, "getActivateMultiStatusCardView update data:" + q17);
            com.tencent.mm.plugin.textstatus.ui.w1 O6 = V6.O6();
            if (!(O6 != null ? O6.j(q17) : false) || (l0Var = this.f428428r) == null) {
                return;
            }
            l0Var.M2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7(mj4.h r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L93
            java.lang.ref.WeakReference r0 = r7.f428429s
            if (r0 != 0) goto L16
            r0 = 2131311162(0x7f093a3a, float:1.8240657E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r7.f428429s = r1
        L16:
            java.lang.ref.WeakReference r0 = r7.f428429s
            r1 = 0
            if (r0 == 0) goto L22
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            goto L23
        L22:
            r0 = r1
        L23:
            r2 = 0
            r3 = 1
            pj4.o0 r4 = xe0.j0.a(r8, r2, r3, r1)
            bi4.o0 r5 = r7.f428431u
            if (r5 != 0) goto L2e
            goto L3d
        L2e:
            pj4.o0 r5 = r7.f428432v
            if (r5 == 0) goto L3a
            boolean r5 = com.tencent.mm.plugin.textstatus.ui.c.b(r5, r4)
            if (r5 != r3) goto L3a
            r5 = r3
            goto L3b
        L3a:
            r5 = r2
        L3b:
            if (r5 != 0) goto L3f
        L3d:
            r5 = r2
            goto L40
        L3f:
            r5 = r3
        L40:
            if (r5 != 0) goto L6b
            bi4.o0 r5 = r7.f428431u
            if (r5 == 0) goto L49
            r5.n()
        L49:
            r7.f428431u = r1
            r7.f428432v = r1
            sj4.z0 r1 = sj4.z0.f408908a
            java.lang.String r5 = oi4.k.b(r4)
            bi4.o0 r1 = r1.b(r5)
            r7.f428431u = r1
            if (r1 == 0) goto L69
            r5 = r8
            mj4.k r5 = (mj4.k) r5
            java.lang.String r5 = r5.l()
            pj4.j0 r6 = oi4.k.a(r4)
            r1.m(r5, r6)
        L69:
            r7.f428432v = r4
        L6b:
            bi4.o0 r1 = r7.f428431u
            r4 = r8
            mj4.k r4 = (mj4.k) r4
            java.lang.String r4 = r4.o()
            boolean r1 = com.tencent.mm.plugin.textstatus.ui.c.a(r4, r1, r8)
            r1 = r1 ^ r3
            if (r1 != 0) goto L8b
            mj4.k r8 = (mj4.k) r8
            boolean r8 = r8.v()
            if (r8 == 0) goto L84
            goto L8b
        L84:
            if (r0 != 0) goto L87
            goto L93
        L87:
            r0.setVisibility(r2)
            goto L93
        L8b:
            if (r0 != 0) goto L8e
            goto L93
        L8e:
            r8 = 8
            r0.setVisibility(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uj4.e.b7(mj4.h):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f428417d, "onDestroy: ");
        this.f428422i = null;
        this.f428420g = null;
        this.f428429s = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = V6();
        if (V6 != null) {
            V6.f173785s = false;
            com.tencent.mm.plugin.textstatus.ui.w1 O6 = V6.O6();
            if (O6 != null) {
                O6.c(new uj4.c(V6, this));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
    }
}

package sc2;

/* loaded from: classes2.dex */
public final class h1 extends ad2.h {
    public kotlinx.coroutines.r2 B;
    public boolean D;
    public boolean E;
    public boolean F;
    public android.view.ViewGroup G;
    public android.view.ViewGroup H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f405924J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.ImageView N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public android.view.View R;
    public android.view.View S;
    public android.view.View T;
    public com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar U;
    public android.view.View V;
    public android.view.View W;
    public android.view.View X;
    public com.tencent.mm.plugin.finder.video.FinderVideoLayout Y;
    public com.tencent.mm.plugin.finder.view.s2 Z;

    /* renamed from: l1, reason: collision with root package name */
    public fc2.d f405925l1;

    /* renamed from: p1, reason: collision with root package name */
    public fc2.d f405927p1;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f405929x;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f405930x0;

    /* renamed from: x1, reason: collision with root package name */
    public long f405931x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.animation.AnimatorSet f405933y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f405934y1;

    /* renamed from: z1, reason: collision with root package name */
    public long f405936z1;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f405928w = "Finder.CrossPlatformCardJumperObserver";

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f405932y = jz5.h.b(sc2.h0.f405923d);

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f405935z = jz5.h.b(sc2.g0.f405898d);
    public final jz5.g A = jz5.h.b(sc2.a1.f405742d);
    public long C = 3000;

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.HashMap f405926p0 = new java.util.HashMap();
    public com.tencent.mm.plugin.finder.report.g3 A1 = com.tencent.mm.plugin.finder.report.g3.f125045e;

    public static final void G(sc2.h1 h1Var) {
        android.view.View view = h1Var.S;
        android.view.View view2 = h1Var.T;
        if (view == null || view2 == null) {
            return;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr);
        view2.getLocationInWindow(iArr2);
        boolean z17 = false;
        int width = (iArr[0] - iArr2[0]) - (view2.getWidth() / 2);
        com.tencent.mm.plugin.finder.view.s2 s2Var = h1Var.Z;
        if (s2Var != null && s2Var.isShowing()) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mm.plugin.finder.view.s2 s2Var2 = h1Var.Z;
            if (s2Var2 != null) {
                s2Var2.f133009q = width;
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.view.s2 s2Var3 = h1Var.Z;
        if (s2Var3 != null) {
            s2Var3.f133009q = width;
            android.view.View findViewById = s2Var3.getContentView().findViewById(com.tencent.mm.R.id.a4x);
            android.view.View findViewById2 = s2Var3.getContentView().findViewById(com.tencent.mm.R.id.a4q);
            int measuredWidth = (view2.getMeasuredWidth() - findViewById.getMeasuredWidth()) / 2;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.rightMargin = measuredWidth - width;
            } else {
                marginLayoutParams2 = null;
            }
            findViewById.setLayoutParams(marginLayoutParams2);
            if (findViewById2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.rightMargin = measuredWidth - width;
                    marginLayoutParams = marginLayoutParams3;
                }
                findViewById2.setLayoutParams(marginLayoutParams);
            }
            findViewById.requestLayout();
            if (findViewById2 != null) {
                findViewById2.requestLayout();
            }
        }
    }

    public static final java.util.Map H(sc2.h1 h1Var, in5.s0 s0Var) {
        java.lang.String str;
        r45.vt0 vt0Var;
        java.lang.String string;
        r45.vt0 vt0Var2;
        h1Var.getClass();
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        r45.wt0 wt0Var = (r45.wt0) ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).Z6(h1Var.f3145f).getValue();
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = h1Var.Y;
        zy2.g5 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(h1Var.f3145f));
        lVarArr[1] = new jz5.l("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(h1Var.f3145f, h1Var.f3146g, V6 != null ? V6.getInteger(5) : 0));
        java.lang.String str2 = "";
        if (wt0Var == null || (vt0Var2 = (r45.vt0) wt0Var.getCustom(0)) == null || (str = vt0Var2.getString(2)) == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("report_extra_data", str);
        lVarArr[3] = new jz5.l("videodurations", java.lang.Integer.valueOf(finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getVideoDuration() : 0));
        lVarArr[4] = new jz5.l("ad_play_time", java.lang.Long.valueOf(h1Var.f405936z1));
        lVarArr[5] = new jz5.l("ad_show_playtime", java.lang.Long.valueOf(finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getCurrentPlayMs() : 0L));
        if (wt0Var != null && (vt0Var = (r45.vt0) wt0Var.getCustom(0)) != null && (string = vt0Var.getString(7)) != null) {
            str2 = string;
        }
        lVarArr[6] = new jz5.l("ad_pos_id", str2);
        lVarArr[7] = new jz5.l("video_total_time", java.lang.Long.valueOf(h1Var.f405934y1));
        return kz5.c1.k(lVarArr);
    }

    public static final void I(sc2.h1 h1Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.report.f3 f3Var) {
        h1Var.getClass();
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.plugin.finder.report.k3 L = h1Var.L();
        com.tencent.mm.plugin.finder.report.h3 h3Var = com.tencent.mm.plugin.finder.report.h3.f125062e;
        com.tencent.mm.plugin.finder.report.i3 i3Var = com.tencent.mm.plugin.finder.report.i3.f125073f;
        kotlin.jvm.internal.o.d(o3Var);
        kotlin.jvm.internal.o.d(context);
        com.tencent.mm.plugin.finder.report.o3.Uk(o3Var, context, L, i3Var, h3Var, f3Var, null, 32, null);
    }

    @Override // ad2.h
    public void C(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i(this.f405928w, "onViewRecycled, hideCard");
        xc2.p0 p0Var = this.f3147h;
        P(holder, false, true, p0Var != null ? N(p0Var) : null);
        super.C(holder);
    }

    public final void J(in5.s0 s0Var) {
        kotlinx.coroutines.r2 r2Var = this.B;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        R(s0Var);
        android.view.ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        fc2.d dVar = this.f405927p1;
        if (dVar != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.d(dVar);
            }
            this.f405927p1 = null;
        }
    }

    public final void K(android.view.View view, int i17) {
        float f17 = i17 == 0 ? 0.0f : 1.0f;
        float f18 = i17 == 0 ? 1.0f : 0.0f;
        java.util.HashMap hashMap = this.f405926p0;
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) hashMap.get(java.lang.Integer.valueOf(view.hashCode()));
        if (valueAnimator == null) {
            valueAnimator = new android.animation.ValueAnimator();
            hashMap.put(java.lang.Integer.valueOf(view.hashCode()), valueAnimator);
            com.tencent.mars.xlog.Log.i(this.f405928w, "alphaAnimators size: " + hashMap.size());
        }
        if (view.getVisibility() == i17) {
            return;
        }
        valueAnimator.cancel();
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.setFloatValues(f17, f18);
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setDuration(300L);
        valueAnimator.addUpdateListener(new sc2.t(view));
        valueAnimator.addListener(new sc2.u(view, f18, i17));
        valueAnimator.start();
    }

    public final com.tencent.mm.plugin.finder.report.k3 L() {
        r45.vt0 vt0Var;
        r45.vt0 vt0Var2;
        r45.wt0 wt0Var = (r45.wt0) ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).Z6(this.f3145f).getValue();
        return new com.tencent.mm.plugin.finder.report.k3(this.f3145f, this.f3146g, java.lang.System.currentTimeMillis() - this.f405931x1, 1, this.f405936z1, this.f405934y1, (wt0Var == null || (vt0Var2 = (r45.vt0) wt0Var.getCustom(0)) == null) ? null : vt0Var2.getString(2), (wt0Var == null || (vt0Var = (r45.vt0) wt0Var.getCustom(0)) == null) ? null : vt0Var.getString(3));
    }

    public final so2.b M(in5.s0 s0Var, long j17) {
        so2.j5 j5Var = (so2.j5) s0Var.f293125i;
        if (!(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            return null;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        if (baseFinderFeed.getAdCardState() == null) {
            baseFinderFeed.V0(new so2.b(j17, false, false, null, null, 30, null));
        }
        so2.b adCardState = baseFinderFeed.getAdCardState();
        boolean z17 = false;
        if (adCardState != null && adCardState.f410262a == j17) {
            z17 = true;
        }
        if (!z17) {
            baseFinderFeed.V0(new so2.b(j17, false, false, null, null, 30, null));
        }
        return baseFinderFeed.getAdCardState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final r45.t01 N(xc2.p0 p0Var) {
        r45.wf6 wf6Var;
        r45.wf6 wf6Var2 = this.f3149m;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                }
                wf6Var = it.next();
                r45.wf6 wf6Var3 = (r45.wf6) wf6Var;
                boolean z17 = true;
                if (wf6Var3.getInteger(1) != p0Var.f453256r || wf6Var3.getInteger(2) != 28) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            wf6Var2 = wf6Var;
        }
        if (wf6Var2 != null) {
            return (r45.t01) wf6Var2.getCustom(34);
        }
        return null;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObject O(r45.t01 t01Var) {
        com.tencent.mm.protocal.protobuf.FinderObject create = com.tencent.mm.protocal.protobuf.FinderObject.create();
        com.tencent.mm.protobuf.g byteString = t01Var.getByteString(10);
        if (byteString != null) {
            create.parseFrom(byteString.g());
        }
        kotlin.jvm.internal.o.d(create);
        return create;
    }

    public final void P(in5.s0 s0Var, boolean z17, boolean z18, r45.t01 t01Var) {
        so2.b M;
        if (t01Var != null) {
            so2.b M2 = M(s0Var, O(t01Var).getId());
            if (z17 && M2 != null) {
                M2.f410263b = true;
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f405929x;
            if (finderThumbPlayerProxy != null) {
                long currentPlayMs = finderThumbPlayerProxy.getCurrentPlayMs();
                if (M2 != null) {
                    M2.f410265d = java.lang.Long.valueOf(currentPlayMs);
                }
            }
        }
        fc2.d dVar = this.f405925l1;
        if (dVar != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.d(dVar);
            }
            this.f405925l1 = null;
        }
        J(s0Var);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = this.f405929x;
        if (finderThumbPlayerProxy2 != null) {
            finderThumbPlayerProxy2.d();
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = this.f405929x;
        if (finderThumbPlayerProxy3 != null) {
            finderThumbPlayerProxy3.b();
        }
        this.f405929x = null;
        android.widget.FrameLayout frameLayout = this.I;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((ey2.k1) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(ey2.k1.class)).f257418e.remove(java.lang.Long.valueOf(this.f3145f));
        this.Z = null;
        android.view.ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ym5.a1.f(new sc2.s(this));
        this.E = false;
        this.F = false;
        xc2.p0 p0Var = this.f3147h;
        sc2.q8 q8Var = p0Var != null ? p0Var.f453233J : null;
        if (q8Var != null) {
            q8Var.f406177a = false;
        }
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        if (ptVar != null) {
            ptVar.f135625z = false;
        }
        android.app.Activity activity = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
        if (z18) {
            Q();
            if (t01Var != null && (M = M(s0Var, O(t01Var).getId())) != null) {
                M.f410264c = true;
            }
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.jdk);
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.g1y);
            android.view.View p19 = s0Var.p(com.tencent.mm.R.id.edq);
            com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout) s0Var.p(com.tencent.mm.R.id.f484896qk3);
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout fullSeekBarLayout = finderFeedNewSeekBarLayout != null ? finderFeedNewSeekBarLayout.getFullSeekBarLayout() : null;
            if (fullSeekBarLayout != null) {
                fullSeekBarLayout.setRequestNotSeek(false);
            }
            if (p17 != null) {
                K(p17, 0);
            }
            if (p18 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.Y;
            if (finderVideoLayout != null) {
                finderVideoLayout.setRequestNotPlay(false);
            }
            java.lang.String str = this.f405928w;
            com.tencent.mars.xlog.Log.i(str, "requestNotPlay set false");
            if (z17) {
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = this.Y;
                cw2.da videoView = finderVideoLayout2 != null ? finderVideoLayout2.getVideoView() : null;
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy4 = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
                if (finderThumbPlayerProxy4 != null) {
                    finderThumbPlayerProxy4.setVideoViewFocused(true);
                    zy2.g5.u(finderThumbPlayerProxy4, null, 1, null);
                }
            }
            android.view.View view = s0Var.itemView;
            com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = view instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) view : null;
            if (simpleTouchableLayout != null) {
                simpleTouchableLayout.a(false, str);
            }
            android.view.ViewGroup viewGroup2 = this.G;
            if (viewGroup2 != null) {
                K(viewGroup2, 8);
            }
        }
    }

    public final void Q() {
        com.tencent.mars.xlog.Log.i(this.f405928w, "hideCardAndToastLayout");
        android.view.ViewGroup viewGroup = this.G;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = this.H;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }

    public final void R(in5.s0 s0Var) {
        com.tencent.mars.xlog.Log.i(this.f405928w, "resetShowCardCountdown");
        this.C = 3000L;
        this.D = false;
        this.B = null;
        fc2.d dVar = this.f405927p1;
        if (dVar != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.d(dVar);
            }
            this.f405927p1 = null;
        }
    }

    public final void S(in5.s0 s0Var, android.view.View view, xc2.p0 p0Var) {
        java.lang.String str = this.f405928w;
        com.tencent.mars.xlog.Log.i(str, "showAfterFooterLayoutReady");
        r45.t01 N = N(p0Var);
        if (N == null) {
            com.tencent.mars.xlog.Log.w(str, "showAfterFooterLayoutReady, cardStyle is null");
            return;
        }
        sc2.q8 q8Var = p0Var.f453233J;
        if (q8Var != null) {
            q8Var.f406177a = true;
        }
        pm0.v.X(new sc2.j0(s0Var, this, N));
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mars.xlog.Log.i(this.f405928w, "no need super.onRealShow,CrossPlatformCardJumper show control by self");
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mars.xlog.Log.i(this.f405928w, "no need super.onRealHide, CrossPlatformCardJumper show control by self");
        P(holder, false, true, N(infoEx));
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f405928w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return N(infoEx) != null;
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        char c17;
        int i17;
        int i18;
        android.view.View view;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        this.G = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.t1t);
        this.H = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.tdl);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.f483994t20);
        if (frameLayout == null) {
            return;
        }
        this.I = frameLayout;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.t1q);
        if (viewGroup == null) {
            return;
        }
        this.f405924J = viewGroup;
        this.K = (android.widget.TextView) holder.p(com.tencent.mm.R.id.t1u);
        this.L = (android.widget.TextView) holder.p(com.tencent.mm.R.id.t28);
        this.M = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f483995t21);
        this.N = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.t1r);
        this.P = (android.widget.TextView) holder.p(com.tencent.mm.R.id.t27);
        this.Q = (android.widget.TextView) holder.p(com.tencent.mm.R.id.t1y);
        this.R = holder.p(com.tencent.mm.R.id.f483998t24);
        this.S = holder.p(com.tencent.mm.R.id.f483999t25);
        this.T = holder.p(com.tencent.mm.R.id.t1x);
        this.U = (com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar) holder.p(com.tencent.mm.R.id.f483997t23);
        this.V = holder.p(com.tencent.mm.R.id.t1v);
        this.W = holder.p(com.tencent.mm.R.id.t1s);
        this.X = holder.p(com.tencent.mm.R.id.t1z);
        this.f405930x0 = holder.p(com.tencent.mm.R.id.f483996t22);
        this.Y = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        this.f405931x1 = 0L;
        this.f405934y1 = 0L;
        this.f405936z1 = 0L;
        this.A1 = com.tencent.mm.plugin.finder.report.g3.f125045e;
        sc2.q8 q8Var = infoEx.f453233J;
        if (!(q8Var != null && q8Var.f406177a)) {
            Q();
        }
        r45.t01 N = N(infoEx);
        if (N == null) {
            return;
        }
        so2.b M = M(holder, O(N).getId());
        if (M != null && M.f410263b) {
            return;
        }
        android.view.ViewGroup viewGroup2 = this.f405924J;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        android.content.Context context = holder.f293121e;
        if (layoutParams != null) {
            layoutParams.width = (int) java.lang.Math.min(((java.lang.Number) ((jz5.n) this.f405932y).getValue()).intValue() - context.getResources().getDimension(com.tencent.mm.R.dimen.f479714d7), context.getResources().getDimension(com.tencent.mm.R.dimen.f479712an5));
        }
        android.widget.TextView textView = this.Q;
        if (textView != null) {
            textView.setText(N.getString(3));
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(context.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
            gradientDrawable.setColor(android.graphics.Color.parseColor(N.getString(4)));
            textView.setBackground(gradientDrawable);
            textView.setTextColor(android.graphics.Color.parseColor(N.getString(5)));
            textView.setOnClickListener(new sc2.v(holder, infoEx, this));
        }
        android.view.View view2 = this.V;
        if (view2 != null) {
            view2.setOnClickListener(new sc2.w(holder, infoEx, this));
        }
        android.widget.TextView textView2 = this.L;
        if (textView2 != null) {
            textView2.setText(N.getString(2));
        }
        r45.f1 f1Var = (r45.f1) N.getCustom(8);
        if (f1Var != null) {
            android.widget.TextView textView3 = this.M;
            if (textView3 != null) {
                textView3.setText(f1Var.getString(0));
            }
            android.widget.ImageView imageView = this.N;
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.a().c(new mn2.n(f1Var.getString(1), null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
            }
        }
        r45.wt0 wt0Var = (r45.wt0) ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).Z6(this.f3145f).getValue();
        r45.vt0 vt0Var = wt0Var != null ? (r45.vt0) wt0Var.getCustom(0) : null;
        android.view.View view3 = this.R;
        android.view.View view4 = this.T;
        if (view3 == null || view4 == null) {
            c17 = 2;
            i17 = 8;
            i18 = com.tencent.mm.R.dimen.f479646bl;
        } else {
            i17 = 8;
            c17 = 2;
            i18 = com.tencent.mm.R.dimen.f479646bl;
            view3.setOnClickListener(new sc2.z(holder, this, vt0Var, view4, view3, N));
            hc2.v0.e(view3, "ad_feedback_button", 8, 0, false, false, null, new sc2.a0(this, holder), 60, null);
        }
        android.view.View view5 = this.T;
        if (view5 != null) {
            view5.addOnLayoutChangeListener(new sc2.b0(this));
        }
        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479642bh);
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar = this.U;
        if (finderHorizontalLongVideoPlayerSeekBar != null && (view = finderHorizontalLongVideoPlayerSeekBar.f130570p0) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderHorizontalLongVideoPlayerSeekBar", "hidePoint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/FinderHorizontalLongVideoPlayerSeekBar", "hidePoint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar2 = this.U;
        if (finderHorizontalLongVideoPlayerSeekBar2 != null) {
            android.view.View view6 = finderHorizontalLongVideoPlayerSeekBar2.f162472e;
            android.view.ViewGroup.LayoutParams layoutParams2 = view6 != null ? view6.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = dimension;
            }
            android.view.View view7 = finderHorizontalLongVideoPlayerSeekBar2.f130571x0;
            android.view.ViewGroup.LayoutParams layoutParams3 = view7 != null ? view7.getLayoutParams() : null;
            if (layoutParams3 != null) {
                layoutParams3.height = dimension;
            }
            android.view.View view8 = finderHorizontalLongVideoPlayerSeekBar2.f130572y0;
            android.view.ViewGroup.LayoutParams layoutParams4 = view8 != null ? view8.getLayoutParams() : null;
            if (layoutParams4 != null) {
                layoutParams4.height = dimension;
            }
            android.view.View view9 = finderHorizontalLongVideoPlayerSeekBar2.f130569l1;
            android.view.ViewGroup.LayoutParams layoutParams5 = view9 != null ? view9.getLayoutParams() : null;
            if (layoutParams5 != null) {
                layoutParams5.height = dimension;
            }
        }
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar3 = this.U;
        if (finderHorizontalLongVideoPlayerSeekBar3 != null) {
            android.view.View view10 = finderHorizontalLongVideoPlayerSeekBar3.f130571x0;
            android.view.ViewGroup.LayoutParams layoutParams6 = view10 != null ? view10.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams6 : null;
            if (layoutParams7 != null) {
                layoutParams7.setMargins(0, 0, 0, 0);
            }
            android.view.View view11 = finderHorizontalLongVideoPlayerSeekBar3.f130572y0;
            android.view.ViewGroup.LayoutParams layoutParams8 = view11 != null ? view11.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams9 = layoutParams8 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams8 : null;
            if (layoutParams9 != null) {
                layoutParams9.setMargins(0, 0, 0, 0);
            }
            android.view.View view12 = finderHorizontalLongVideoPlayerSeekBar3.f130569l1;
            android.view.ViewGroup.LayoutParams layoutParams10 = view12 != null ? view12.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams11 = layoutParams10 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams10 : null;
            if (layoutParams11 != null) {
                layoutParams11.setMargins(0, 0, 0, 0);
            }
        }
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        float dimension2 = context.getResources().getDimension(i18);
        float[] fArr = new float[i17];
        fArr[0] = dimension2;
        fArr[1] = dimension2;
        fArr[c17] = dimension2;
        fArr[3] = dimension2;
        fArr[4] = dimension2;
        fArr[5] = dimension2;
        fArr[6] = dimension2;
        fArr[7] = dimension2;
        gradientDrawable2.setCornerRadii(fArr);
        gradientDrawable2.setColor(context.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar4 = this.U;
        android.view.View findViewById = finderHorizontalLongVideoPlayerSeekBar4 != null ? finderHorizontalLongVideoPlayerSeekBar4.findViewById(com.tencent.mm.R.id.kxi) : null;
        if (findViewById != null) {
            findViewById.setBackground(gradientDrawable2);
        }
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar5 = this.U;
        android.view.View findViewById2 = finderHorizontalLongVideoPlayerSeekBar5 != null ? finderHorizontalLongVideoPlayerSeekBar5.findViewById(com.tencent.mm.R.id.kxk) : null;
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setBackground(gradientDrawable2);
    }

    @Override // ad2.h
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.v(holder, jumpView, infoEx);
        r45.t01 N = N(infoEx);
        jz5.f0 f0Var = null;
        if (N == null) {
            com.tencent.mars.xlog.Log.w(this.f405928w, "cardStyle is null, return");
            P(holder, false, true, null);
            return;
        }
        so2.b M = M(holder, O(N).getId());
        if (M != null && M.f410263b) {
            com.tencent.mars.xlog.Log.i(this.f405928w, "isClosed == true");
            P(holder, false, true, null);
            return;
        }
        if (this.E && (finderThumbPlayerProxy = this.f405929x) != null) {
            if (!(finderThumbPlayerProxy != null && finderThumbPlayerProxy.getCurrentPlayState() == 11)) {
                if (!this.F) {
                    com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = this.f405929x;
                    if (finderThumbPlayerProxy2 != null) {
                        finderThumbPlayerProxy2.play();
                    }
                    android.view.View view = this.f405930x0;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "onJumpViewFocus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "onJumpViewFocus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                com.tencent.mars.xlog.Log.i(this.f405928w, "isCurrentCardShown is true, return");
                return;
            }
        }
        this.E = false;
        com.tencent.mars.xlog.Log.i(this.f405928w, "before showCard");
        if (M != null && M.f410264c) {
            Q();
        }
        android.view.ViewGroup viewGroup = this.f405924J;
        if (viewGroup != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(viewGroup, "cardLayout");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(viewGroup, 160, new sc2.c0(viewGroup, this));
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.Y;
        cw2.da videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        java.lang.Long l17 = M != null ? M.f410265d : null;
        if (l17 != null) {
            com.tencent.mars.xlog.Log.i(this.f405928w, "has shown, lastPlayOffset: " + l17);
            if (finderThumbPlayerProxy3 != null) {
                boolean z17 = finderThumbPlayerProxy3.f130665r;
                jz5.f0 f0Var2 = jz5.f0.f302826a;
                if (z17) {
                    S(holder, jumpView, infoEx);
                } else {
                    sc2.d0 d0Var = new sc2.d0(holder, this, jumpView, infoEx);
                    this.f405925l1 = d0Var;
                    android.content.Context context = holder.f293121e;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    java.lang.Object a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
                    if (n17 != null) {
                        n17.a(d0Var);
                    }
                }
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                S(holder, jumpView, infoEx);
                return;
            }
            return;
        }
        Q();
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.S5).getValue()).r()).intValue();
        if (intValue == -1) {
            intValue = N.getInteger(14);
        }
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.T5).getValue()).r()).intValue();
        if (intValue2 == -1) {
            intValue2 = (int) (N.getInteger(17) / 1000);
        }
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        int intValue3 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.U5).getValue()).r()).intValue();
        if (intValue3 == -1) {
            intValue3 = N.getInteger(16);
        }
        int i17 = intValue3;
        android.content.Context context2 = holder.f293121e;
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = activity != null ? (com.tencent.mm.view.RefreshLoadMoreLayout) activity.findViewById(com.tencent.mm.R.id.m6e) : null;
        com.tencent.mars.xlog.Log.i(this.f405928w, "add OnPlayInfoUpdateListener");
        android.content.Context context3 = holder.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ey2.k1 k1Var = (ey2.k1) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(ey2.k1.class);
        long j17 = this.f3145f;
        sc2.f0 f0Var3 = new sc2.f0(this, holder, intValue, intValue2, N, i17, refreshLoadMoreLayout, jumpView, infoEx);
        k1Var.getClass();
        k1Var.f257418e.put(java.lang.Long.valueOf(j17), f0Var3);
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.w(holder, jumpView, infoEx);
        P(holder, false, false, N(infoEx));
    }
}

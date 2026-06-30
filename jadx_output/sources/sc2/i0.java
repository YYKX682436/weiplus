package sc2;

/* loaded from: classes2.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f405962f;

    public i0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        this.f405960d = h1Var;
        this.f405961e = s0Var;
        this.f405962f = t01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pf5.z zVar;
        r45.t01 t01Var;
        kotlinx.coroutines.y0 a17;
        java.lang.Long l17;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        sc2.h1 h1Var = this.f405960d;
        h1Var.getClass();
        in5.s0 s0Var = this.f405961e;
        if (!(s0Var.f293121e.getResources().getConfiguration().orientation == 1) || h1Var.I == null || h1Var.f405924J == null) {
            return;
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = h1Var.f405929x;
        if (finderThumbPlayerProxy2 != null) {
            finderThumbPlayerProxy2.d();
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = h1Var.f405929x;
        if (finderThumbPlayerProxy3 != null) {
            finderThumbPlayerProxy3.b();
        }
        h1Var.f405929x = null;
        android.widget.FrameLayout frameLayout = h1Var.I;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        com.tencent.mm.protocal.protobuf.FinderObject create = com.tencent.mm.protocal.protobuf.FinderObject.create();
        r45.t01 t01Var2 = this.f405962f;
        com.tencent.mm.protobuf.g byteString = t01Var2.getByteString(10);
        if (byteString != null) {
            create.parseFrom(byteString.g());
        }
        com.tencent.mm.plugin.finder.storage.j jVar = com.tencent.mm.plugin.finder.storage.FeedData.Companion;
        com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
        kotlin.jvm.internal.o.d(create);
        com.tencent.mm.plugin.finder.storage.FeedData b17 = jVar.b(h90Var.a(create, 0));
        java.util.LinkedList<r45.mb4> mediaList = b17.getMediaList();
        boolean isEmpty = mediaList.isEmpty();
        java.lang.String str = h1Var.f405928w;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.e(str, "initVideoView but mediaList is empty!");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "showCard");
        h1Var.E = true;
        h1Var.f405934y1 = mediaList.get(0).getLong(24);
        so2.b M = h1Var.M(s0Var, create.getId());
        ds2.h hVar = ds2.h.f242866a;
        long id6 = b17.getId();
        r45.mb4 mb4Var = mediaList.get(0);
        kotlin.jvm.internal.o.f(mb4Var, "get(...)");
        mn2.g4 c17 = hVar.c(id6, mb4Var, false);
        boolean z17 = b17.getId() == 0 && com.tencent.mm.vfs.w6.j(c17.getUrl());
        if (M != null) {
            M.f410264c = false;
        }
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.jdk);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.g1y);
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.edq);
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout) s0Var.p(com.tencent.mm.R.id.f484896qk3);
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar2.a(appCompatActivity).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
        if (finderSpeedControlUIC != null) {
            finderSpeedControlUIC.S6(s0Var);
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout fullSeekBarLayout = finderFeedNewSeekBarLayout != null ? finderFeedNewSeekBarLayout.getFullSeekBarLayout() : null;
        if (fullSeekBarLayout != null) {
            fullSeekBarLayout.setRequestNotSeek(true);
        }
        if (p17 != null) {
            h1Var.K(p17, 4);
        }
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (p19 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = h1Var.Y;
        if (finderVideoLayout != null) {
            finderVideoLayout.setRequestNotPlay(true);
        }
        com.tencent.mars.xlog.Log.i(str, "requestNotPlay set true");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = h1Var.Y;
        cw2.da videoView = finderVideoLayout2 != null ? finderVideoLayout2.getVideoView() : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy4 = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        if (finderThumbPlayerProxy4 != null) {
            finderThumbPlayerProxy4.pause();
            finderThumbPlayerProxy4.setVideoViewFocused(false);
        }
        android.view.View view = s0Var.itemView;
        com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = view instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) view : null;
        if (simpleTouchableLayout != null) {
            simpleTouchableLayout.a(true, str);
        }
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) uVar.b(context).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        if (ptVar != null) {
            ptVar.f135625z = true;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        android.view.ViewGroup viewGroup = h1Var.G;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        jz5.g gVar = h1Var.f405935z;
        if (layoutParams2 != null) {
            int[] iArr = new int[2];
            s0Var.p(com.tencent.mm.R.id.f484485ee2).getLocationInWindow(iArr);
            layoutParams2.bottomMargin = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() - iArr[1];
            android.view.ViewGroup viewGroup2 = h1Var.G;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutParams(layoutParams2);
            }
            android.view.ViewGroup viewGroup3 = h1Var.G;
            if (viewGroup3 != null) {
                viewGroup3.requestLayout();
            }
        }
        android.view.ViewGroup viewGroup4 = h1Var.f405924J;
        if (viewGroup4 != null) {
            com.tencent.mm.ui.kk.f(viewGroup4, com.tencent.mm.ui.bl.h(context) / 2);
        }
        android.widget.FrameLayout frameLayout2 = h1Var.I;
        if (frameLayout2 != null) {
            float f17 = ((int) mediaList.get(0).getFloat(5)) / ((int) mediaList.get(0).getFloat(4));
            if (f17 > 1.0f) {
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy5 = h1Var.f405929x;
                if (finderThumbPlayerProxy5 != null) {
                    finderThumbPlayerProxy5.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                }
            } else {
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy6 = h1Var.f405929x;
                if (finderThumbPlayerProxy6 != null) {
                    finderThumbPlayerProxy6.setScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
                }
            }
            float dimension = context.getResources().getDimension(com.tencent.mm.R.dimen.f479623ay);
            int height = s0Var.p(com.tencent.mm.R.id.f484486ee3).getHeight();
            zVar = zVar2;
            float min = java.lang.Math.min(((java.lang.Number) ((jz5.n) h1Var.f405932y).getValue()).intValue() - context.getResources().getDimension(com.tencent.mm.R.dimen.f479714d7), context.getResources().getDimension(com.tencent.mm.R.dimen.f479712an5));
            float intValue = ((((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() - dimension) - height) - context.getResources().getDimension(com.tencent.mm.R.dimen.ams);
            float f18 = min * f17;
            if (f18 > intValue) {
                min = intValue / f17;
            } else {
                intValue = f18;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).width = (int) min;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).height = (int) intValue;
            }
            frameLayout2.requestLayout();
        } else {
            zVar = zVar2;
        }
        android.view.ViewGroup viewGroup5 = h1Var.G;
        if (viewGroup5 != null) {
            viewGroup5.post(new sc2.t0(h1Var, viewGroup5, s0Var));
        }
        h1Var.f405931x1 = java.lang.System.currentTimeMillis();
        android.view.ViewGroup viewGroup6 = h1Var.f405924J;
        if (viewGroup6 != null) {
            viewGroup6.setOnClickListener(new sc2.u0(h1Var, viewGroup6, s0Var));
        }
        sc2.z0 z0Var = new sc2.z0(h1Var, M);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy7 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy(context2);
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).P6(finderThumbPlayerProxy7);
        h1Var.f405929x = finderThumbPlayerProxy7;
        finderThumbPlayerProxy7.setContextTag(context.hashCode());
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy8 = h1Var.f405929x;
        if (finderThumbPlayerProxy8 != null) {
            finderThumbPlayerProxy8.setId(com.tencent.mm.R.id.tba);
        }
        android.widget.FrameLayout frameLayout3 = h1Var.I;
        if (frameLayout3 != null) {
            frameLayout3.addView(h1Var.f405929x, new android.view.ViewGroup.LayoutParams(-1, -2));
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy9 = h1Var.f405929x;
        if (finderThumbPlayerProxy9 != null) {
            finderThumbPlayerProxy9.n(c17, z17, b17);
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy10 = h1Var.f405929x;
        if (finderThumbPlayerProxy10 != null) {
            finderThumbPlayerProxy10.setIsShouldPlayResume(true);
        }
        zy2.a7 a7Var = (zy2.a7) i95.n0.c(zy2.a7.class);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        ((com.tencent.mm.plugin.finder.service.l2) a7Var).Bi(create, nyVar != null ? nyVar.V6().getInteger(5) : 0, 0);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy11 = h1Var.f405929x;
        if (finderThumbPlayerProxy11 != null) {
            finderThumbPlayerProxy11.setLifecycle(z0Var);
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy12 = h1Var.f405929x;
        if (finderThumbPlayerProxy12 != null) {
            finderThumbPlayerProxy12.setLoop(true);
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy13 = h1Var.f405929x;
        if (finderThumbPlayerProxy13 != null) {
            finderThumbPlayerProxy13.setVideoViewFocused(true);
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy14 = h1Var.f405929x;
        if (finderThumbPlayerProxy14 != null) {
            zy2.g5.u(finderThumbPlayerProxy14, null, 1, null);
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy15 = h1Var.f405929x;
        if (finderThumbPlayerProxy15 != null) {
            finderThumbPlayerProxy15.setOnPlayerStopListener(new sc2.v0(h1Var, M));
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy16 = h1Var.f405929x;
        if (finderThumbPlayerProxy16 != null) {
            t01Var = t01Var2;
            finderThumbPlayerProxy16.setIMMVideoViewCallback(new sc2.y0(h1Var, s0Var, t01Var));
        } else {
            t01Var = t01Var2;
        }
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V5).getValue()).r()).booleanValue() && (finderThumbPlayerProxy = h1Var.f405929x) != null) {
            finderThumbPlayerProxy.setLoop(false);
        }
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R5).getValue()).r()).intValue();
        if (intValue2 == -1) {
            intValue2 = t01Var.getInteger(0);
        }
        long j17 = intValue2 * 1000;
        if (M != null && (l17 = M.f410266e) != null) {
            j17 = l17.longValue();
        }
        if (j17 > 0) {
            android.widget.TextView textView = h1Var.K;
            if (textView != null) {
                textView.setTextColor(context.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            }
            android.widget.TextView textView2 = h1Var.K;
            if (textView2 != null && (a17 = v65.m.a(textView2)) != null) {
                android.widget.TextView textView3 = h1Var.K;
                if (textView3 != null) {
                    textView3.setOnClickListener(sc2.k0.f406007d);
                }
                kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.g0(new kotlinx.coroutines.flow.y1(kotlinx.coroutines.flow.l.n(new kotlinx.coroutines.flow.m2(new sc2.l0(j17, null)), kotlinx.coroutines.q1.f310568a), new sc2.m0(h1Var, s0Var, M, null)), new sc2.o0(M, h1Var, s0Var, t01Var, null)), a17);
            }
        } else {
            android.widget.TextView textView4 = h1Var.K;
            if (textView4 != null) {
                textView4.setOnClickListener(new sc2.p0(h1Var, s0Var, t01Var));
            }
            android.widget.TextView textView5 = h1Var.K;
            if (textView5 != null) {
                textView5.setText(context.getString(com.tencent.mm.R.string.nhz));
            }
            android.widget.TextView textView6 = h1Var.K;
            if (textView6 != null) {
                textView6.setTextColor(context.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            }
        }
        android.widget.TextView textView7 = h1Var.K;
        if (textView7 != null) {
            hc2.v0.e(textView7, "close_ad", 8, 0, false, false, null, new sc2.q0(h1Var, s0Var), 60, null);
        }
        java.lang.String string = t01Var.getString(13);
        if (string == null || string.length() == 0) {
            android.widget.TextView textView8 = h1Var.P;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
        } else {
            android.widget.TextView textView9 = h1Var.P;
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
            android.widget.TextView textView10 = h1Var.P;
            if (textView10 != null) {
                textView10.setText(t01Var.getString(13));
            }
        }
        android.view.View view2 = h1Var.f405930x0;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showCard", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderCrossPlatformCardStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver", "showCard", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderCrossPlatformCardStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

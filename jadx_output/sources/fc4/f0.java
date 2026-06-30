package fc4;

/* loaded from: classes4.dex */
public final class f0 extends com.tencent.mm.ui.component.UIComponent implements z35.d0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f261137d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView f261138e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView f261139f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f261140g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f261141h;

    /* renamed from: i, reason: collision with root package name */
    public int f261142i;

    /* renamed from: m, reason: collision with root package name */
    public long f261143m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f261141h = jz5.h.b(new fc4.e0(this));
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView O6(fc4.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFlexibleVideoView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = f0Var.f261137d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFlexibleVideoView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        return flexibleVideoView;
    }

    @Override // z35.d0
    public void D0(android.widget.SeekBar seekBar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStopTrackingTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261137d;
        if (flexibleVideoView != null) {
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f261139f;
            kotlin.jvm.internal.o.d(heroSeekBarView);
            flexibleVideoView.u((int) heroSeekBarView.c(i17), true);
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((fc4.p) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(fc4.p.class)).O6(true);
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f261138e;
        if (expandableHeroSeekBarView != null) {
            expandableHeroSeekBarView.setBarVisibleExcludeControlArea(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStopTrackingTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    public final void P6() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        pc4.d dVar = pc4.d.f353410a;
        android.view.View view = dVar.w() ? this.f261138e : this.f261139f;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261137d;
        if (flexibleVideoView != null) {
            com.tencent.mm.ui.kk.d(flexibleVideoView, 0);
        }
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView2 = this.f261137d;
        if (flexibleVideoView2 != null) {
            com.tencent.mm.ui.kk.f(flexibleVideoView2, 0);
        }
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView3 = this.f261137d;
        if (flexibleVideoView3 != null) {
            flexibleVideoView3.requestLayout();
        }
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.ajf);
        view.setPadding(h17, view.getPaddingTop(), (!dVar.w() || (i17 = je4.f.f299319a.a(getActivity()).right) <= 0) ? h17 : i17 + h17, dVar.w() ? 0 : i65.a.h(getContext(), com.tencent.mm.R.dimen.ajw));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    public final void Q6() {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f261140g;
        if (snsInfo == null || (timeLine = snsInfo.getTimeLine()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        if (timeLine.ContentObj.f369840h.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) timeLine.ContentObj.f369840h.get(0);
        r45.lj4 lj4Var = jj4Var.f377865p;
        if (lj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        if (lj4Var.f379520d <= 0.0f || lj4Var.f379521e <= 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        pc4.d dVar = pc4.d.f353410a;
        android.view.View view = dVar.w() ? this.f261138e : this.f261139f;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        if (windowManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        if (i18 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        int i19 = this.f261142i;
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.aii);
        view.setPadding(h17, view.getPaddingTop(), h17, dVar.w() ? je4.f.f299319a.a(getActivity()).bottom == 0 ? i65.a.h(getActivity(), com.tencent.mm.R.dimen.ail) : i65.a.h(getContext(), com.tencent.mm.R.dimen.aii) : view.getPaddingBottom());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekBarBgImg", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        android.view.View view2 = (android.view.View) ((jz5.n) this.f261141h).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekBarBgImg", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = i65.a.b(getContext(), 170) + i19;
            view2.setLayoutParams(layoutParams);
        }
        int p17 = com.tencent.mm.ui.bk.p(getContext());
        r45.lj4 lj4Var2 = jj4Var.f377865p;
        float f17 = lj4Var2.f379520d;
        float f18 = lj4Var2.f379521e;
        int i27 = f17 / f18 > ((float) (i17 / i18)) ? (int) ((f18 * i17) / f17) : i18;
        int i28 = i18 - i27;
        int i29 = i28 / 2;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        fc4.p pVar = (fc4.p) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(fc4.p.class);
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        boolean z17 = pVar.f261198m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        n34.n3 n3Var = n34.v3.f334748l;
        int a17 = n3Var.a(getContext(), z17, true);
        int i37 = a17 + i19;
        if (i29 > i37) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        if (((i28 - a17) - p17) - i19 >= 0) {
            int i38 = i37 - i29;
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261137d;
            if (flexibleVideoView == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            } else {
                R6(flexibleVideoView, i38);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            }
        }
        int a18 = n3Var.a(getContext(), false, false);
        if (z17 && ((i28 - i19) - p17) - a18 >= 0) {
            int i39 = (a18 + i19) - i29;
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView2 = this.f261137d;
            if (flexibleVideoView2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            } else {
                R6(flexibleVideoView2, i39);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            }
        }
        int h18 = i65.a.h(getContext(), com.tencent.mm.R.dimen.ajw);
        int i47 = (i18 - p17) - i27;
        if ((i47 - h18) - i19 > 0) {
            int i48 = (i19 + h18) - i29;
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView3 = this.f261137d;
            if (flexibleVideoView3 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            } else {
                R6(flexibleVideoView3, i48);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            }
        }
        if (i47 > 0) {
            int i49 = i47 - i29;
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView4 = this.f261137d;
            if (flexibleVideoView4 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            } else {
                R6(flexibleVideoView4, i49);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView5 = this.f261137d;
        if (flexibleVideoView5 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("alignVideoViewToBottom", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
            int i57 = 0;
            while (true) {
                android.widget.RelativeLayout relativeLayout = flexibleVideoView5.videoContainer;
                if (!(i57 < relativeLayout.getChildCount())) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("alignVideoViewToBottom", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
                    break;
                }
                int i58 = i57 + 1;
                android.view.View childAt = relativeLayout.getChildAt(i57);
                if (childAt == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams2;
                layoutParams3.addRule(12);
                childAt.setLayoutParams(layoutParams3);
                i57 = i58;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    public final void R6(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (i17 > 0) {
            com.tencent.mm.ui.kk.d(view, i17 * 2);
            view.requestLayout();
        } else {
            com.tencent.mm.ui.kk.f(view, (-i17) * 2);
            view.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // z35.d0
    public void g6(android.widget.SeekBar seekBar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261137d;
        if (flexibleVideoView != null) {
            flexibleVideoView.k(false);
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((fc4.p) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(fc4.p.class)).O6(false);
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f261138e;
        if (expandableHeroSeekBarView != null) {
            expandableHeroSeekBarView.setBarVisibleExcludeControlArea(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i17 = newConfig.orientation;
        if (i17 == 2) {
            P6();
        } else if (i17 == 1) {
            Q6();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        boolean z17;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (this.f261140g == null) {
            java.lang.String stringExtra = getIntent().getStringExtra("intent_localid");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f261140g = com.tencent.mm.plugin.sns.model.l4.Fj().k1(stringExtra);
        }
        boolean z18 = false;
        getIntent().getIntExtra("intent_bottom_height", 0);
        this.f261137d = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) findViewById(com.tencent.mm.R.id.rpo);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f261140g;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            return;
        }
        kotlin.jvm.internal.o.d((r45.jj4) snsInfo.getTimeLine().ContentObj.f369840h.get(0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gzz);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleSeekbarUIC", "initSeekBar", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleSeekbarUIC", "initSeekBar", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.v9a);
        if (viewStub != null) {
            if (pc4.d.f353410a.w()) {
                viewStub.setLayoutResource(com.tencent.mm.R.layout.epj);
            } else {
                viewStub.setLayoutResource(com.tencent.mm.R.layout.epl);
            }
            viewStub.inflate();
        }
        pc4.d dVar = pc4.d.f353410a;
        if (dVar.w()) {
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView) findViewById(com.tencent.mm.R.id.ncv);
            this.f261138e = expandableHeroSeekBarView;
            this.f261139f = expandableHeroSeekBarView != null ? expandableHeroSeekBarView.getMediaControlBar() : null;
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView2 = this.f261138e;
            com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView mediaControlBar = expandableHeroSeekBarView2 != null ? expandableHeroSeekBarView2.getMediaControlBar() : null;
            if (mediaControlBar != null) {
                mediaControlBar.setVideoPlayStatusListener(new fc4.w(this));
            }
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView3 = this.f261138e;
            com.tencent.mm.ui.blur.mask.BlurMaskView blurMaskView = expandableHeroSeekBarView3 != null ? (com.tencent.mm.ui.blur.mask.BlurMaskView) expandableHeroSeekBarView3.findViewById(com.tencent.mm.R.id.vlx) : null;
            if (blurMaskView != null) {
                blurMaskView.setBlurEnabled(false);
            }
            android.graphics.drawable.Drawable i17 = i65.a.i(getContext(), com.tencent.mm.R.drawable.d0_);
            if (blurMaskView != null) {
                blurMaskView.setBackground(i17);
            }
            if (getResources().getConfiguration().orientation == 2) {
                P6();
            } else {
                Q6();
            }
        } else {
            this.f261139f = (com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView) findViewById(com.tencent.mm.R.id.ncv);
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.u2b);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.u2c);
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f261139f;
        if (heroSeekBarView != null) {
            heroSeekBarView.setIndCurrentTimeTv(textView);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView2 = this.f261139f;
        if (heroSeekBarView2 != null) {
            heroSeekBarView2.setIndTotalTimeTv(textView2);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView3 = this.f261139f;
        if (heroSeekBarView3 != null) {
            heroSeekBarView3.setVisibility(0);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView4 = this.f261139f;
        if (heroSeekBarView4 != null) {
            heroSeekBarView4.setTotalTimeMs(r3.R * 1000);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView5 = this.f261139f;
        if (heroSeekBarView5 != null) {
            heroSeekBarView5.setHeroSeekBarChangeListener(this);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView6 = this.f261139f;
        if (heroSeekBarView6 != null) {
            heroSeekBarView6.setVideoPlayDurationProvider(new fc4.x(this));
        }
        if (dVar.w()) {
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView4 = this.f261138e;
            if (expandableHeroSeekBarView4 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDefaultExpandSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                if (ca4.z0.g0()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDefaultExpandSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f261140g;
                    if (snsInfo2 == null || (timeLine2 = snsInfo2.getTimeLine()) == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDefaultExpandSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                        z17 = false;
                    } else {
                        int b17 = a06.d.b(((r45.jj4) timeLine2.ContentObj.f369840h.get(0)).R * 1000);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
                        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_expand_seekbar_duration, 15000);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoExpandSeekBarDurationMs: " + Ni);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
                        z17 = b17 >= Ni;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDefaultExpandSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                    }
                }
                expandableHeroSeekBarView4.d(z17, false);
            }
        } else {
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView7 = this.f261139f;
            if (heroSeekBarView7 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                if (ca4.z0.g0()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                } else {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = this.f261140g;
                    if (snsInfo3 == null || (timeLine = snsInfo3.getTimeLine()) == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                    } else {
                        int round = java.lang.Math.round(((r45.jj4) timeLine.ContentObj.f369840h.get(0)).R * 1000);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoShowSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
                        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_show_seekbar_duration, 16000);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoShowSeekBarDurationMs: " + Ni2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoShowSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
                        if (round < Ni2) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDefaultShowSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
                        }
                    }
                    heroSeekBarView7.setInitVisible(z18);
                }
                z18 = true;
                heroSeekBarView7.setInitVisible(z18);
            }
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView8 = this.f261139f;
        if (heroSeekBarView8 != null) {
            heroSeekBarView8.f();
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView9 = this.f261139f;
        if (heroSeekBarView9 != null) {
            heroSeekBarView9.setEnableDrag(true);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView10 = this.f261139f;
        if (heroSeekBarView10 != null) {
            heroSeekBarView10.setVideoSpeedChangeListener(new fc4.y(this));
        }
        if (dVar.w()) {
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView5 = this.f261138e;
            com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView mediaControlBar2 = expandableHeroSeekBarView5 != null ? expandableHeroSeekBarView5.getMediaControlBar() : null;
            if (mediaControlBar2 != null) {
                mediaControlBar2.setVisibleChangeListener(new fc4.z());
            }
        } else {
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView11 = this.f261139f;
            if (heroSeekBarView11 != null) {
                heroSeekBarView11.setVisibleChangeListener(new fc4.a0(this));
            }
        }
        com.tencent.mm.ui.widget.InsectLinearLayout insectLinearLayout = (com.tencent.mm.ui.widget.InsectLinearLayout) findViewById(com.tencent.mm.R.id.u4v);
        if (insectLinearLayout != null) {
            insectLinearLayout.setInsectCallback(new fc4.b0(this));
        }
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261137d;
        if (flexibleVideoView != null) {
            flexibleVideoView.setOnFirstFrameAvailable(new fc4.d0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSeekBar", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f261139f;
        if (heroSeekBarView != null) {
            heroSeekBarView.isSeekBarActive = false;
            wu5.c cVar = heroSeekBarView.hideTask;
            if (cVar != null) {
                cVar.cancel(false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }

    @Override // z35.d0
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f261143m >= 10) {
                this.f261143m = currentTimeMillis;
                com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f261139f;
                kotlin.jvm.internal.o.d(heroSeekBarView);
                int c17 = (int) heroSeekBarView.c(i17);
                com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261137d;
                if (flexibleVideoView != null) {
                    flexibleVideoView.u(c17, false);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
    }
}

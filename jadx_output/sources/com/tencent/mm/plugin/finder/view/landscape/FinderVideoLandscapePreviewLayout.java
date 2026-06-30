package com.tencent.mm.plugin.finder.view.landscape;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout;", "Lcom/tencent/mm/plugin/finder/view/landscape/FinderLandscapePreviewLayout;", "Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;", "videoView", "Ljz5/f0;", "setupSpeedGestureDetectorCallbacks", "Landroid/graphics/Rect;", "getSpeedLockAreaRect", "Lpx2/v0;", "Q", "Lpx2/v0;", "getCallback", "()Lpx2/v0;", "setCallback", "(Lpx2/v0;)V", "callback", "Landroid/view/View;", "R", "Landroid/view/View;", "getBulletStubView", "()Landroid/view/View;", "bulletStubView", "", "getEnableVerticalDistanceLock", "()Z", "enableVerticalDistanceLock", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderVideoLandscapePreviewLayout extends com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout {
    public static final /* synthetic */ int C1 = 0;
    public long A1;
    public long B1;

    /* renamed from: Q, reason: from kotlin metadata */
    public px2.v0 callback;

    /* renamed from: R, reason: from kotlin metadata */
    public final android.view.View bulletStubView;
    public final android.view.View S;
    public final android.view.View T;
    public final android.view.View U;
    public final android.widget.TextView V;
    public final ow2.h W;

    /* renamed from: l1, reason: collision with root package name */
    public final android.view.View f132581l1;

    /* renamed from: p0, reason: collision with root package name */
    public ow2.a f132582p0;

    /* renamed from: p1, reason: collision with root package name */
    public float f132583p1;

    /* renamed from: x0, reason: collision with root package name */
    public float f132584x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f132585x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f132586y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f132587y1;

    /* renamed from: z1, reason: collision with root package name */
    public long f132588z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoLandscapePreviewLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132584x0 = 2.0f;
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.topMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        layoutParams.setMarginStart((int) getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        layoutParams.gravity = 8388611;
        getIconLayout().setLayoutParams(layoutParams);
        getIconLayout().setOnClickListener(new px2.k0(this));
        getIconLayout();
        float f17 = dimension / 2.0f;
        getIconLayout().setPivotX(f17);
        getIconLayout().setPivotY(f17);
        android.view.View view = new android.view.View(getContext());
        this.bulletStubView = view;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, 1);
        layoutParams2.topMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        addView(view, layoutParams2);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b9m, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.S = inflate;
        addView(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.g3_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById);
        android.view.View inflate2 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eed, (android.view.ViewGroup) null);
        this.T = inflate2;
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        addView(inflate2, layoutParams3);
        if (inflate2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate2, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View inflate3 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e7u, (android.view.ViewGroup) null);
        this.U = inflate3;
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        addView(inflate3, layoutParams4);
        if (inflate3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(inflate3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(inflate3, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.V = inflate3 != null ? (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.tfs) : null;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kotlin.jvm.internal.o.d(inflate2);
        this.W = new ow2.h(context2, inflate2, new px2.l0(this));
        getIconLayout().bringToFront();
        android.view.View inflate4 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e7h, (android.view.ViewGroup) null);
        this.f132581l1 = inflate4;
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 81;
        addView(inflate4, layoutParams5);
        this.f132583p1 = 1.0f;
    }

    private final boolean getEnableVerticalDistanceLock() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L3).getValue()).r()).booleanValue();
    }

    private final android.graphics.Rect getSpeedLockAreaRect() {
        return new android.graphics.Rect(0, (getHeight() * 3) / 4, getWidth(), getHeight());
    }

    private final void setupSpeedGestureDetectorCallbacks(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        ow2.a aVar;
        if (!(this.f132584x0 == 1.0f) && (aVar = this.f132582p0) != null) {
            aVar.f349370g = new px2.q0(this, finderThumbPlayerProxy);
        }
        ow2.a aVar2 = this.f132582p0;
        if (aVar2 != null) {
            aVar2.f349371h = new px2.r0(this);
        }
        if (aVar2 != null) {
            aVar2.f349372i = new px2.s0(this);
        }
        if (aVar2 == null) {
            return;
        }
        aVar2.f349373j = new px2.t0(this, finderThumbPlayerProxy);
    }

    public final android.view.View getBulletStubView() {
        return this.bulletStubView;
    }

    public final px2.v0 getCallback() {
        return this.callback;
    }

    @Override // com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout
    public void k(boolean z17) {
        if (!z17) {
            z(false, 2.0f, com.tencent.mm.plugin.finder.view.al.f131653e);
            return;
        }
        px2.v0 v0Var = this.callback;
        android.view.KeyEvent.Callback callback = v0Var != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.at) v0Var).f133803b.f135613n : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = callback instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) callback : null;
        float playSpeedRatio = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getPlaySpeedRatio() : 1.0f;
        if (playSpeedRatio == 1.0f) {
            return;
        }
        px2.v0 v0Var2 = this.callback;
        if (v0Var2 != null && ((com.tencent.mm.plugin.finder.viewmodel.component.at) v0Var2).f133803b.f135616q != null) {
            z(true, playSpeedRatio, com.tencent.mm.plugin.finder.view.al.f131653e);
        }
        this.f132584x0 = playSpeedRatio;
    }

    @Override // com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout
    public void l() {
        android.content.Context context;
        px2.v0 v0Var = this.callback;
        android.view.KeyEvent.Callback callback = v0Var != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.at) v0Var).f133803b.f135613n : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = callback instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) callback : null;
        if (finderThumbPlayerProxy != null) {
            if (v0Var == null || (context = ((com.tencent.mm.plugin.finder.viewmodel.component.at) v0Var).f133802a) == null) {
                context = getContext();
            }
            kotlin.jvm.internal.o.d(context);
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class)).R6(finderThumbPlayerProxy);
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout
    public boolean m(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ow2.a aVar = this.f132582p0;
        if (aVar != null) {
            aVar.a(event);
        }
        return this.f132562r;
    }

    @Override // com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        x();
        super.onDetachedFromWindow();
    }

    @Override // com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout
    public void q(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        px2.v0 v0Var = this.callback;
        android.view.View view = v0Var != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.at) v0Var).f133803b.f135613n : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = view instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) view : null;
        if (finderThumbPlayerProxy != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(getLongVideoSeekBarLayout());
            arrayList.add(getIconLayout());
            android.view.View playIconLayout = getPlayIconLayout();
            kotlin.jvm.internal.o.f(playIconLayout, "<get-playIconLayout>(...)");
            arrayList.add(playIconLayout);
            arrayList.add(getTopMask());
            arrayList.add(getBottomMask());
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class)).Z6(holder, arrayList, finderThumbPlayerProxy, com.tencent.mm.plugin.finder.viewmodel.component.k60.f134925e, new px2.u0(this, finderThumbPlayerProxy), this.W);
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            cw2.wa f130756y = finderThumbPlayerProxy.getF130756y();
            if (f130756y != null) {
                jSONObject.put("feedid", pm0.v.u(f130756y.f224099f.getFeedId()));
            }
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "accelerate_play", 1, jSONObject, false, null, 48, null);
        }
    }

    public final void setCallback(px2.v0 v0Var) {
        this.callback = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(boolean r33, android.view.MotionEvent r34) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout.u(boolean, android.view.MotionEvent):boolean");
    }

    public final java.util.HashMap w(r45.qt2 qt2Var, long j17, float f17, long j18, long j19, long j27, long j28, int i17, boolean z17, boolean z18, boolean z19) {
        java.lang.String str;
        java.lang.String string;
        jz5.l lVar = z19 ? new jz5.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.A1), java.lang.Long.valueOf(this.B1)) : new jz5.l(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j27));
        long longValue = ((java.lang.Number) lVar.f302833d).longValue();
        long longValue2 = ((java.lang.Number) lVar.f302834e).longValue();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = "";
        if (qt2Var == null || (str = qt2Var.getString(2)) == null) {
            str = "";
        }
        hashMap.put("finder_tab_context_id", str);
        if (qt2Var != null && (string = qt2Var.getString(1)) != null) {
            str2 = string;
        }
        hashMap.put("finder_context_id", str2);
        hashMap.put("comment_scene", java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0));
        hashMap.put("feed_id", pm0.v.u(j17));
        hashMap.put("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, null, qt2Var != null ? qt2Var.getInteger(5) : 0));
        hashMap.put("accelerate_type", java.lang.Float.valueOf(f17));
        hashMap.put("screen_type", 1);
        hashMap.put("accelerate_duration", java.lang.Long.valueOf(longValue));
        hashMap.put("video_duration_time", java.lang.Long.valueOf(j19));
        hashMap.put("time_point_before_lpa", java.lang.Long.valueOf(longValue2));
        hashMap.put("time_point_after_lpa", java.lang.Long.valueOf(j28));
        hashMap.put("lpa_play_times", java.lang.Integer.valueOf(i17));
        if (z17) {
            hashMap.put("accelerate_leave_type", java.lang.Integer.valueOf(z18 ? 1 : 2));
        }
        return hashMap;
    }

    public final void x() {
        ow2.h hVar = this.W;
        if (hVar != null) {
            com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e17 = hVar.e();
            com.tencent.mm.plugin.finder.view.FinderLandscapeSpeedIndicatorView finderLandscapeSpeedIndicatorView = e17 instanceof com.tencent.mm.plugin.finder.view.FinderLandscapeSpeedIndicatorView ? (com.tencent.mm.plugin.finder.view.FinderLandscapeSpeedIndicatorView) e17 : null;
            if (finderLandscapeSpeedIndicatorView != null) {
                finderLandscapeSpeedIndicatorView.i();
            }
        }
    }

    public final void y() {
        com.tencent.mars.xlog.Log.i("HorizontalVideoPreviewLayout", "hideLockSpeedArea");
        android.view.View view = this.U;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "hideLockSpeedArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "hideLockSpeedArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void z(boolean z17, float f17, com.tencent.mm.plugin.finder.view.al alVar) {
        in5.s0 s0Var;
        px2.v0 v0Var = this.callback;
        if (v0Var == null || (s0Var = ((com.tencent.mm.plugin.finder.viewmodel.component.at) v0Var).f133803b.f135616q) == null) {
            return;
        }
        android.view.View view = this.T;
        ow2.h hVar = this.W;
        if (z17) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "showSpeedIndicatorWithAnim", "(ZFLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "showSpeedIndicatorWithAnim", "(ZFLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (hVar != null) {
                hVar.j(s0Var, f17, alVar, true);
                return;
            }
            return;
        }
        if (hVar != null) {
            hVar.f(s0Var, true);
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "showSpeedIndicatorWithAnim", "(ZFLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "showSpeedIndicatorWithAnim", "(ZFLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoLandscapePreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132584x0 = 2.0f;
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.topMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        layoutParams.setMarginStart((int) getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        layoutParams.gravity = 8388611;
        getIconLayout().setLayoutParams(layoutParams);
        getIconLayout().setOnClickListener(new px2.k0(this));
        getIconLayout();
        float f17 = dimension / 2.0f;
        getIconLayout().setPivotX(f17);
        getIconLayout().setPivotY(f17);
        android.view.View view = new android.view.View(getContext());
        this.bulletStubView = view;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, 1);
        layoutParams2.topMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        addView(view, layoutParams2);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b9m, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.S = inflate;
        addView(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.g3_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById);
        android.view.View inflate2 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eed, (android.view.ViewGroup) null);
        this.T = inflate2;
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        addView(inflate2, layoutParams3);
        if (inflate2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate2, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View inflate3 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e7u, (android.view.ViewGroup) null);
        this.U = inflate3;
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        addView(inflate3, layoutParams4);
        if (inflate3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(inflate3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(inflate3, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.V = inflate3 != null ? (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.tfs) : null;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kotlin.jvm.internal.o.d(inflate2);
        this.W = new ow2.h(context2, inflate2, new px2.l0(this));
        getIconLayout().bringToFront();
        android.view.View inflate4 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e7h, (android.view.ViewGroup) null);
        this.f132581l1 = inflate4;
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 81;
        addView(inflate4, layoutParams5);
        this.f132583p1 = 1.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoLandscapePreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132584x0 = 2.0f;
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.topMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        layoutParams.setMarginStart((int) getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        layoutParams.gravity = 8388611;
        getIconLayout().setLayoutParams(layoutParams);
        getIconLayout().setOnClickListener(new px2.k0(this));
        getIconLayout();
        float f17 = dimension / 2.0f;
        getIconLayout().setPivotX(f17);
        getIconLayout().setPivotY(f17);
        android.view.View view = new android.view.View(getContext());
        this.bulletStubView = view;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, 1);
        layoutParams2.topMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        addView(view, layoutParams2);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b9m, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.S = inflate;
        addView(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.g3_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById);
        android.view.View inflate2 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eed, (android.view.ViewGroup) null);
        this.T = inflate2;
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        addView(inflate2, layoutParams3);
        if (inflate2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate2, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View inflate3 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e7u, (android.view.ViewGroup) null);
        this.U = inflate3;
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        addView(inflate3, layoutParams4);
        if (inflate3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(inflate3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(inflate3, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.V = inflate3 != null ? (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.tfs) : null;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kotlin.jvm.internal.o.d(inflate2);
        this.W = new ow2.h(context2, inflate2, new px2.l0(this));
        getIconLayout().bringToFront();
        android.view.View inflate4 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e7h, (android.view.ViewGroup) null);
        this.f132581l1 = inflate4;
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 81;
        addView(inflate4, layoutParams5);
        this.f132583p1 = 1.0f;
    }
}

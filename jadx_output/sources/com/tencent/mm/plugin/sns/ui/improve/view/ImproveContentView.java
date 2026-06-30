package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u0004\u0018\u00010\tR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView;", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout;", "Lbd4/a;", "Landroid/view/View;", "getContentView", "Lbd4/m;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setStateChangeListener", "", "getContent", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "<set-?>", "t", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "getContentTv", "()Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "contentTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveContentView extends com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout implements bd4.a {
    public static int E;
    public int A;
    public bd4.f2 B;
    public final uc4.x C;
    public final java.lang.Runnable D;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f169123o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f169124p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f169125q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f169126r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView f169127s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView contentTv;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView f169129u;

    /* renamed from: v, reason: collision with root package name */
    public bd4.m f169130v;

    /* renamed from: w, reason: collision with root package name */
    public xc4.p f169131w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.CharSequence f169132x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.CharSequence f169133y;

    /* renamed from: z, reason: collision with root package name */
    public int f169134z;

    public ImproveContentView(android.content.Context context) {
        super(context);
        this.f169123o = pc4.d.f353410a.D();
        this.f169124p = "MicroMsg.Improve.ContentView[" + hashCode() + ']';
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.j_3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f169125q = string;
        java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.j_2);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        this.f169126r = string2;
        this.f169134z = -1;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.C = new uc4.x(context2);
        s();
        this.D = new bd4.b0(this);
    }

    public static final /* synthetic */ java.lang.CharSequence m(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        java.lang.CharSequence charSequence = improveContentView.f169132x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        return charSequence;
    }

    public static final /* synthetic */ bd4.f2 n(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSelectableTextHelper$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        bd4.f2 f2Var = improveContentView.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSelectableTextHelper$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        return f2Var;
    }

    public static final /* synthetic */ xc4.p o(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsInfo$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        xc4.p pVar = improveContentView.f169131w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsInfo$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        return pVar;
    }

    public static final void p(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setContentLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        improveContentView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new bd4.v(improveContentView, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setContentLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    public final java.lang.CharSequence getContent() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        java.lang.CharSequence charSequence = this.f169132x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        return charSequence;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView getContentTv() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = this.contentTv;
        if (improveTextView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            return improveTextView;
        }
        kotlin.jvm.internal.o.o("contentTv");
        throw null;
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout
    public android.view.View getContentView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        if (i28 > 0) {
            E = i28;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    public final void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeContentState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = this.f169129u;
        if (improveTextView == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(improveTextView.getTag(), 2)) {
            v(new bd4.n(this));
        } else {
            bd4.m mVar = this.f169130v;
            if (mVar == null) {
                u(new bd4.o(this));
            } else if (mVar != null) {
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView view = getContentTv();
                int i17 = this.A;
                java.lang.Runnable extraActionRunnable = this.D;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$buildContentTextView$1");
                kotlin.jvm.internal.o.g(view, "view");
                kotlin.jvm.internal.o.g(extraActionRunnable, "extraActionRunnable");
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i18 = iArr[1];
                ad4.g.f3183a.b(view, i17 + i18, i18 + view.getHeight(), 0, extraActionRunnable);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$buildContentTextView$1");
            }
        }
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView2 = this.f169129u;
        if (improveTextView2 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        java.util.Objects.toString(improveTextView2.getTag());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeContentState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    public final int r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("currentShrinkShowLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        int i17 = !this.f169123o ? 5 : this.f169134z == 0 ? 6 : 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("currentShrinkShowLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        return i17;
    }

    public final void s() {
        int i17;
        java.lang.String str;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inflateXml", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        setPadding(0, -3, 0, 0);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView(getContext());
        this.f169127s = improveTextView;
        improveTextView.setId(com.tencent.mm.R.id.cuu);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        int b17 = i65.a.b(getContext(), 1);
        layoutParams.topMargin = b17;
        layoutParams.gravity = 16;
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView2 = this.f169127s;
        if (improveTextView2 == null) {
            kotlin.jvm.internal.o.o("singleTv");
            throw null;
        }
        improveTextView2.setTextSize(0, i65.a.p(getContext(), com.tencent.mm.R.dimen.f479897ia));
        pc4.d dVar = pc4.d.f353410a;
        if (dVar.x()) {
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView3 = this.f169127s;
            if (improveTextView3 == null) {
                kotlin.jvm.internal.o.o("singleTv");
                throw null;
            }
            int i19 = b17 * 8;
            int i27 = b17 * 6;
            improveTextView3.setPadding(i19, i27, i19, i27);
        } else {
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView4 = this.f169127s;
            if (improveTextView4 == null) {
                kotlin.jvm.internal.o.o("singleTv");
                throw null;
            }
            int i28 = b17 * 2;
            int i29 = b17 * 5;
            improveTextView4.setPadding(i28, i29, i28, i29);
        }
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView5 = this.f169127s;
        if (improveTextView5 == null) {
            kotlin.jvm.internal.o.o("singleTv");
            throw null;
        }
        improveTextView5.setMaxLines(1);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView6 = this.f169127s;
        if (improveTextView6 == null) {
            kotlin.jvm.internal.o.o("singleTv");
            throw null;
        }
        improveTextView6.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.a0c));
        if (dVar.x()) {
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView7 = this.f169127s;
            if (improveTextView7 == null) {
                kotlin.jvm.internal.o.o("singleTv");
                throw null;
            }
            improveTextView7.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.f482117d92));
        } else {
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView8 = this.f169127s;
            if (improveTextView8 == null) {
                kotlin.jvm.internal.o.o("singleTv");
                throw null;
            }
            improveTextView8.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.f482127b26));
        }
        android.view.View view = this.f169127s;
        if (view == null) {
            kotlin.jvm.internal.o.o("singleTv");
            throw null;
        }
        addView(view, layoutParams);
        this.contentTv = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView(getContext());
        getContentTv().setId(com.tencent.mm.R.id.cut);
        getContentTv().setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.a0c));
        getContentTv().setTextSize(0, i65.a.p(getContext(), com.tencent.mm.R.dimen.f479897ia));
        getContentTv().setLineSpacing(i65.a.a(getContext(), 4.75f), 1.0f);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = b17;
        layoutParams2.gravity = 16;
        addView(getContentTv(), layoutParams2);
        if (dVar.b(false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            android.content.Context context = getContext();
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView contentTv = getContentTv();
            uc4.x xVar = this.C;
            xVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick");
            uc4.w wVar = xVar.f426462f;
            com.tencent.mm.plugin.sns.ui.listener.c e17 = xVar.e();
            kotlin.jvm.internal.o.d(context);
            i17 = b17;
            str = "inflateXml";
            i18 = -2;
            bd4.f2 f2Var = new bd4.f2(context, contentTv, null, wVar, e17, this, null, 0, new bd4.s(this), 196, null);
            f2Var.j();
            this.B = f2Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        } else {
            i17 = b17;
            str = "inflateXml";
            i18 = -2;
            getContentTv().setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.b2i));
            com.tencent.mm.pluginsdk.ui.span.y0 y0Var = new com.tencent.mm.pluginsdk.ui.span.y0(getContext());
            y0Var.f191311q = new bd4.p(this);
            getContentTv().setOnTouchListener(y0Var);
        }
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView9 = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView(getContext());
        this.f169129u = improveTextView9;
        improveTextView9.setId(com.tencent.mm.R.id.cup);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView10 = this.f169129u;
        if (improveTextView10 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView10.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.b1h));
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView11 = this.f169129u;
        if (improveTextView11 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView11.setGravity(17);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView12 = this.f169129u;
        if (improveTextView12 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView12.setMaxLines(1);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView13 = this.f169129u;
        if (improveTextView13 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView13.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.f479308vo));
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView14 = this.f169129u;
        if (improveTextView14 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView14.setTextSize(0, i65.a.p(getContext(), com.tencent.mm.R.dimen.f479897ia));
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView15 = this.f169127s;
        if (improveTextView15 == null) {
            kotlin.jvm.internal.o.o("singleTv");
            throw null;
        }
        improveTextView15.setTextSize(0, i65.a.p(getContext(), com.tencent.mm.R.dimen.f479897ia));
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(i18, i18);
        layoutParams3.topMargin = i17 * 4;
        android.view.View view2 = this.f169129u;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        addView(view2, layoutParams3);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView16 = this.f169127s;
        if (improveTextView16 == null) {
            kotlin.jvm.internal.o.o("singleTv");
            throw null;
        }
        improveTextView16.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView17 = this.f169129u;
        if (improveTextView17 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView17.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView18 = this.f169129u;
        if (improveTextView18 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView18.setOnClickListener(new bd4.q(this));
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView19 = this.f169127s;
        if (improveTextView19 == null) {
            kotlin.jvm.internal.o.o("singleTv");
            throw null;
        }
        improveTextView19.setOnClickListener(new bd4.r(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    public final void setStateChangeListener(bd4.m listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStateChangeListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f169130v = listener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStateChangeListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    public final int t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeCollapsedOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        android.text.Layout layout = getContentTv().getLayout();
        int i17 = -1;
        if (layout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeCollapsedOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            return -1;
        }
        int lineCount = layout.getLineCount();
        if (lineCount <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeCollapsedOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            return -1;
        }
        int r17 = r();
        if (lineCount <= r17) {
            int length = wl5.y.o(getContentTv()).length();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeCollapsedOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            return length;
        }
        try {
            i17 = wl5.y.h(getContentTv(), r17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f169124p, "safeCollapsedOffset getLineStart fail lineCount=" + lineCount + ": " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeCollapsedOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        return i17;
    }

    public final void u(yz5.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        int r17 = r();
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = this.f169129u;
        if (improveTextView == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView.setTag(2);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView2 = this.f169129u;
        if (improveTextView2 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView2.setText(this.f169125q);
        getContentTv().setMaxLines(r17);
        getContentTv().post(new bd4.c0(this, aVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    public final void v(yz5.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("spreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = this.f169129u;
        if (improveTextView == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView.setTag(1);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView2 = this.f169129u;
        if (improveTextView2 == null) {
            kotlin.jvm.internal.o.o("opTv");
            throw null;
        }
        improveTextView2.setText(this.f169126r);
        getContentTv().setMaxLines(Integer.MAX_VALUE);
        getContentTv().post(new bd4.d0(aVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    public ImproveContentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f169123o = pc4.d.f353410a.D();
        this.f169124p = "MicroMsg.Improve.ContentView[" + hashCode() + ']';
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.j_3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f169125q = string;
        java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.j_2);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        this.f169126r = string2;
        this.f169134z = -1;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.C = new uc4.x(context2);
        s();
        this.D = new bd4.b0(this);
    }

    public ImproveContentView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f169123o = pc4.d.f353410a.D();
        this.f169124p = "MicroMsg.Improve.ContentView[" + hashCode() + ']';
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.j_3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f169125q = string;
        java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.j_2);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        this.f169126r = string2;
        this.f169134z = -1;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.C = new uc4.x(context2);
        s();
        this.D = new bd4.b0(this);
    }
}

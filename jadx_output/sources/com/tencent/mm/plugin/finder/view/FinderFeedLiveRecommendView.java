package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/feed/ui/zn;", "Landroid/view/View;", "getEntryBgView", "Lcom/tencent/mm/view/MMPAGView;", "getClickPAG", "Landroid/content/Context;", "d", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedLiveRecommendView extends android.widget.FrameLayout implements com.tencent.mm.plugin.finder.feed.ui.zn {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.content.Context mContext;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f131095e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f131096f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f131097g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f131098h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f131099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedLiveRecommendView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131099i = new java.util.HashMap();
        a(context);
    }

    public final void a(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("FinderFeedLiveRecommendView", "[init]");
        setMContext(context);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.ahz, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131095e = inflate;
        setClipChildren(false);
        android.view.View view = this.f131095e;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.rjr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById;
        this.f131098h = mMPAGView;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463306e2));
        android.view.View view2 = this.f131095e;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.efp);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f131097g = findViewById2;
        android.view.View view3 = this.f131095e;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view3.findViewById(com.tencent.mm.R.id.exc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f131096f = (android.widget.TextView) findViewById3;
        android.view.View view4 = this.f131097g;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("entryBg");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.widget.TextView textView = this.f131096f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("entryTextView");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.TextView textView2 = this.f131096f;
        if (textView2 != null) {
            com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        } else {
            kotlin.jvm.internal.o.o("entryTextView");
            throw null;
        }
    }

    public final void b(r45.nw1 nw1Var, int i17) {
        com.tencent.mars.xlog.Log.i("FinderFeedLiveRecommendView", "update liveStatus=" + i17);
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).qk(nw1Var)) {
            boolean a17 = nw1Var != null ? cm2.a.f43328a.a(nw1Var, "") : false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update live is charge live:");
            sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
            sb6.append(",chargeLiveCanPlay:");
            sb6.append(a17);
            com.tencent.mars.xlog.Log.i("FinderFeedLiveRecommendView", sb6.toString());
            if (a17) {
                android.widget.TextView textView = this.f131096f;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("entryTextView");
                    throw null;
                }
                textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dcn));
            } else {
                android.widget.TextView textView2 = this.f131096f;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("entryTextView");
                    throw null;
                }
                textView2.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dco));
            }
        } else if (i17 == 1) {
            android.widget.TextView textView3 = this.f131096f;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("entryTextView");
                throw null;
            }
            textView3.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dcm));
        } else {
            android.widget.TextView textView4 = this.f131096f;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("entryTextView");
                throw null;
            }
            textView4.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dcj));
        }
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R7).getValue()).r()).intValue();
        com.tencent.mars.xlog.Log.i("FinderFeedLiveRecommendView", "updateStyle style=" + intValue);
        if (intValue == 1) {
            android.widget.TextView textView5 = this.f131096f;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("entryTextView");
                throw null;
            }
            textView5.setTextSize(17.0f);
            textView5.setTextColor(textView5.getResources().getColor(com.tencent.mm.R.color.adh));
            textView5.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            android.view.View view = this.f131097g;
            if (view == null) {
                kotlin.jvm.internal.o.o("entryBg");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = pm0.v.S(48);
            layoutParams.width = pm0.v.S(184);
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(com.tencent.mm.R.drawable.d1e);
            return;
        }
        if (intValue == 2) {
            android.widget.TextView textView6 = this.f131096f;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("entryTextView");
                throw null;
            }
            textView6.setTextSize(17.0f);
            textView6.setTextColor(textView6.getResources().getColor(com.tencent.mm.R.color.f478553an));
            textView6.setShadowLayer(0.25f, 0.0f, 0.0f, android.graphics.Color.parseColor("#80000000"));
            android.view.View view2 = this.f131097g;
            if (view2 != null) {
                view2.setBackground(view2.getContext().getDrawable(com.tencent.mm.R.drawable.b7w));
                return;
            } else {
                kotlin.jvm.internal.o.o("entryBg");
                throw null;
            }
        }
        android.view.View view3 = this.f131097g;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("entryBg");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        layoutParams2.height = pm0.v.S(56);
        layoutParams2.width = pm0.v.S(188);
        view3.setLayoutParams(layoutParams2);
        view3.setBackground(view3.getContext().getDrawable(com.tencent.mm.R.drawable.f481623ya));
        android.widget.TextView textView7 = this.f131096f;
        if (textView7 == null) {
            kotlin.jvm.internal.o.o("entryTextView");
            throw null;
        }
        textView7.setTextSize(20.0f);
        textView7.setTextColor(textView7.getResources().getColor(com.tencent.mm.R.color.f478553an));
        textView7.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.zn
    public com.tencent.mm.view.MMPAGView getClickPAG() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f131098h;
        if (mMPAGView != null) {
            return mMPAGView;
        }
        kotlin.jvm.internal.o.o("clickPagView");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.zn
    public android.view.View getEntryBgView() {
        android.view.View view = this.f131097g;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("entryBg");
        throw null;
    }

    public final android.content.Context getMContext() {
        android.content.Context context = this.mContext;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("mContext");
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final void setMContext(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<set-?>");
        this.mContext = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedLiveRecommendView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f131099i = new java.util.HashMap();
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedLiveRecommendView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f131099i = new java.util.HashMap();
        a(context);
    }
}

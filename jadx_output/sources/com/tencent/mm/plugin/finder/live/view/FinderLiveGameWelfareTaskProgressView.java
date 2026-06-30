package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGameWelfareTaskProgressView;", "Landroid/widget/RelativeLayout;", "Lr45/s73;", "getShowingTask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveGameWelfareTaskProgressView extends android.widget.RelativeLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f115921r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f115922d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f115923e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f115924f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.RelativeLayout f115925g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f115926h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f115927i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f115928m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f115929n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f115930o;

    /* renamed from: p, reason: collision with root package name */
    public r45.s73 f115931p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView f115932q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveGameWelfareTaskProgressView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f115922d = kotlinx.coroutines.z0.b();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ard, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f115926h = viewGroup;
        addView(viewGroup);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.nyt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f115925g = (android.widget.RelativeLayout) findViewById;
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.arb, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate2;
        this.f115927i = viewGroup2;
        viewGroup2.setVisibility(8);
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.S1));
        mMPAGView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        mMPAGView.setScaleMode(1);
        android.content.res.AssetManager assets = context.getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        mMPAGView.k(assets, "small_lottery_amin.pag");
        mMPAGView.setRepeatCount(1);
        this.f115928m = mMPAGView;
        android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.ezg);
        this.f115929n = textView;
        if (textView != null) {
            textView.setTextSize(10.0f);
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) viewGroup2.findViewById(com.tencent.mm.R.id.gpp);
        viewGroup3.setVisibility(0);
        viewGroup3.addView(mMPAGView);
        viewGroup2.setTranslationY(-i65.a.b(context, 16));
        addView(viewGroup2);
        this.f115930o = new java.util.ArrayList();
    }

    public final void a() {
        android.view.ViewGroup viewGroup = this.f115927i;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("bubbleRoot");
            throw null;
        }
        viewGroup.setVisibility(8);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f115928m;
        if (mMPAGView != null) {
            mMPAGView.n();
        }
        android.view.ViewGroup viewGroup2 = this.f115926h;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("contentRoot");
            throw null;
        }
    }

    /* renamed from: getShowingTask, reason: from getter */
    public final r45.s73 getF115931p() {
        return this.f115931p;
    }
}

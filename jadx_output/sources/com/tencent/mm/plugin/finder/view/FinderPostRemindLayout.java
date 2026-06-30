package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderPostRemindLayout;", "Landroid/widget/FrameLayout;", "", "margin", "Ljz5/f0;", "setTipsLayoutMargin", "textResId", "setTitle", "rootWidth", "setCapsuleSize", "progress", "setProgress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/finder/view/kh", "com/tencent/mm/plugin/finder/view/lh", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderPostRemindLayout extends android.widget.FrameLayout {
    public com.tencent.mm.plugin.finder.view.lh A;
    public com.tencent.mm.plugin.finder.view.kh B;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f131396d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f131397e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.view.RingProgressView f131398f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f131399g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f131400h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f131401i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f131402m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f131403n;

    /* renamed from: o, reason: collision with root package name */
    public final int f131404o;

    /* renamed from: p, reason: collision with root package name */
    public final int f131405p;

    /* renamed from: q, reason: collision with root package name */
    public final int f131406q;

    /* renamed from: r, reason: collision with root package name */
    public final int f131407r;

    /* renamed from: s, reason: collision with root package name */
    public final int f131408s;

    /* renamed from: t, reason: collision with root package name */
    public final int f131409t;

    /* renamed from: u, reason: collision with root package name */
    public final int f131410u;

    /* renamed from: v, reason: collision with root package name */
    public final int f131411v;

    /* renamed from: w, reason: collision with root package name */
    public final int f131412w;

    /* renamed from: x, reason: collision with root package name */
    public final int f131413x;

    /* renamed from: y, reason: collision with root package name */
    public final int f131414y;

    /* renamed from: z, reason: collision with root package name */
    public final int f131415z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPostRemindLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(getContext());
        this.f131404o = a17.f197135a - getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        this.f131405p = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ami);
        this.f131406q = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
        this.f131407r = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
        this.f131408s = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        this.f131409t = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
        this.f131410u = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        this.f131411v = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        this.f131412w = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        this.f131413x = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479644bj);
        this.f131414y = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        this.f131415z = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.amd);
        this.A = com.tencent.mm.plugin.finder.view.lh.f132601d;
        this.B = com.tencent.mm.plugin.finder.view.kh.f132501d;
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e5a, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484985tw4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f131396d = viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 1;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484984tw3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f131397e = (android.widget.FrameLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f484986tw5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f131398f = (com.tencent.mm.view.RingProgressView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.tw7);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f131399g = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.tw8);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f131400h = textView;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.tw6);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f131401i = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f484982tw1);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f131402m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.f484983tw2);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f131403n = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById8;
        com.tencent.mm.ui.fk.b(textView);
    }

    private final void setCapsuleSize(int i17) {
        if (this.A != com.tencent.mm.plugin.finder.view.lh.f132601d) {
            return;
        }
        this.A = com.tencent.mm.plugin.finder.view.lh.f132603f;
        d(i17, this.f131407r);
        android.widget.FrameLayout frameLayout = this.f131397e;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        int i18 = this.f131409t;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = i18;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = i18;
        int i19 = this.f131413x;
        layoutParams2.setMarginStart(i19);
        frameLayout.setLayoutParams(layoutParams2);
        this.f131398f.setStrokeWidth(this.f131415z);
        int i27 = this.f131412w;
        setTipsLayoutMargin(i27);
        this.f131400h.setTextSize(1, 14.0f);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f131402m;
        android.view.ViewGroup.LayoutParams layoutParams3 = weImageView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).width = i27;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).height = this.f131411v;
        layoutParams4.setMarginEnd(i19);
        weImageView.setLayoutParams(layoutParams4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTipsLayoutMargin(int i17) {
        android.widget.LinearLayout linearLayout = this.f131399g;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(i17);
        linearLayout.setLayoutParams(layoutParams2);
    }

    private final void setTitle(int i17) {
        android.widget.TextView textView = this.f131400h;
        if (i17 > 0) {
            textView.setText(getContext().getResources().getString(i17));
        }
        com.tencent.mm.ui.fk.c(textView);
    }

    public final void b() {
        this.B = com.tencent.mm.plugin.finder.view.kh.f132503f;
        this.f131398f.setVisibility(8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f131403n;
        weImageView.setVisibility(0);
        weImageView.setImageResource(com.tencent.mm.R.raw.exclamation_mark_circle_filled);
        weImageView.setIconColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.Red_100));
        setTitle(com.tencent.mm.R.string.nzu);
        this.f131401i.setVisibility(this.A != com.tencent.mm.plugin.finder.view.lh.f132603f ? 0 : 8);
        d(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479664c2), this.f131407r);
        setTipsLayoutMargin(this.f131413x);
    }

    public final void c() {
        setTitle(com.tencent.mm.R.string.nzt);
        this.f131401i.setVisibility(this.A == com.tencent.mm.plugin.finder.view.lh.f132603f ? 8 : 0);
        setTipsLayoutMargin(this.f131412w);
    }

    public final void d(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f131396d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.f(layoutParams, "getLayoutParams(...)");
        layoutParams.width = i17;
        layoutParams.height = i18;
        viewGroup.setLayoutParams(layoutParams);
    }

    public final void e() {
        this.B = com.tencent.mm.plugin.finder.view.kh.f132502e;
        this.f131398f.setVisibility(8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f131403n;
        weImageView.setVisibility(0);
        weImageView.setImageResource(com.tencent.mm.R.raw.checkmark_circle_filled);
        weImageView.setIconColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.Brand_100));
        setTitle(com.tencent.mm.R.string.nzv);
        this.f131401i.setVisibility(this.A != com.tencent.mm.plugin.finder.view.lh.f132603f ? 0 : 8);
        setTipsLayoutMargin(this.f131413x);
    }

    public final void f(boolean z17) {
        if (this.A != com.tencent.mm.plugin.finder.view.lh.f132601d) {
            return;
        }
        if (!z17) {
            setCapsuleSize(this.f131405p);
            c();
        } else {
            this.A = com.tencent.mm.plugin.finder.view.lh.f132602e;
            sr2.t tVar = sr2.t.f411718d;
            com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
            pm0.v.V(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.K).getValue()).r()).longValue() * 1000, new com.tencent.mm.plugin.finder.view.oh(this));
        }
    }

    public final void g() {
        setCapsuleSize(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479664c2));
        b();
    }

    public final void h() {
        setCapsuleSize(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.amh));
        e();
    }

    public final void setProgress(int i17) {
        com.tencent.mm.view.RingProgressView ringProgressView = this.f131398f;
        if (ringProgressView.getProgress() != i17) {
            ringProgressView.a(i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPostRemindLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(getContext());
        this.f131404o = a17.f197135a - getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        this.f131405p = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ami);
        this.f131406q = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
        this.f131407r = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
        this.f131408s = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        this.f131409t = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
        this.f131410u = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        this.f131411v = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        this.f131412w = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        this.f131413x = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479644bj);
        this.f131414y = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        this.f131415z = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.amd);
        this.A = com.tencent.mm.plugin.finder.view.lh.f132601d;
        this.B = com.tencent.mm.plugin.finder.view.kh.f132501d;
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e5a, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484985tw4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f131396d = viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 1;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484984tw3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f131397e = (android.widget.FrameLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f484986tw5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f131398f = (com.tencent.mm.view.RingProgressView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.tw7);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f131399g = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.tw8);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f131400h = textView;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.tw6);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f131401i = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f484982tw1);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f131402m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.f484983tw2);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f131403n = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById8;
        com.tencent.mm.ui.fk.b(textView);
    }
}

package com.tencent.mm.plugin.finder.shopping.view.subsidy;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView;", "Lcom/tencent/mm/ui/widget/RoundCornerFrameLayout;", "Lcom/tencent/mm/sdk/platformtools/b4;", "y", "Ljz5/g;", "getSubWordTickerHandler", "()Lcom/tencent/mm/sdk/platformtools/b4;", "subWordTickerHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "yt2/i", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveShoppingSubsidyOverlayView extends com.tencent.mm.ui.widget.RoundCornerFrameLayout {
    public static final /* synthetic */ int F = 0;
    public yz5.a A;
    public yz5.a B;
    public yz5.a C;
    public boolean D;
    public yz5.a E;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f126348f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f126349g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f126350h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f126351i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f126352m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f126353n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f126354o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f126355p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f126356q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f126357r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.AnimatorSet f126358s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f126359t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.AnimatorSet f126360u;

    /* renamed from: v, reason: collision with root package name */
    public long f126361v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f126362w;

    /* renamed from: x, reason: collision with root package name */
    public final yt2.q f126363x;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final jz5.g subWordTickerHandler;

    /* renamed from: z, reason: collision with root package name */
    public yt2.i f126365z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingSubsidyOverlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final com.tencent.mm.sdk.platformtools.b4 getSubWordTickerHandler() {
        return (com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.subWordTickerHandler).getValue();
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("Finder.SubsidyOverlay", "cancelAll");
        android.animation.AnimatorSet animatorSet = this.f126358s;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f126358s = null;
        android.animation.AnimatorSet animatorSet2 = this.f126360u;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f126360u = null;
        java.lang.Runnable runnable = this.f126359t;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f126359t = null;
        getSubWordTickerHandler().d();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.D = false;
        setClickable(false);
        setVisibility(8);
    }

    public final void e(r45.z64 data, java.lang.String str, float f17, float f18, float f19, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play subsidy anim, wording=");
        boolean z17 = true;
        sb6.append(data.getString(1));
        sb6.append(", descTarget=(");
        sb6.append(f17);
        sb6.append(", centerY=");
        sb6.append(f18);
        sb6.append(", h=");
        sb6.append(f19);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("Finder.SubsidyOverlay", sb6.toString());
        d();
        java.lang.Float dpSize = java.lang.Float.valueOf(17.0f);
        android.widget.TextView textView = this.f126356q;
        kotlin.jvm.internal.o.g(textView, "<this>");
        kotlin.jvm.internal.o.g(dpSize, "dpSize");
        textView.setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        java.lang.String string = data.getString(1);
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        getSubWordTickerHandler().d();
        this.f126361v = data.getLong(4);
        java.lang.String string2 = data.getString(2);
        java.lang.String str2 = string2 != null ? string2 : "";
        this.f126362w = str2;
        if (this.f126361v <= 0) {
            this.f126357r.setText(str2);
        } else {
            f();
            getSubWordTickerHandler().c(1000L, 1000L);
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        android.widget.ImageView imageView = this.f126350h;
        if (z17) {
            imageView.setImageDrawable(null);
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.f().c(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329967u));
        }
        this.E = aVar;
        this.A = aVar2;
        this.B = aVar3;
        this.C = aVar4;
        this.f126365z = new yt2.i(f17, f18, f19);
        int width = getWidth() > 0 ? getWidth() : getResources().getDisplayMetrics().widthPixels;
        android.view.View view = this.f126348f;
        view.setTranslationX(width);
        view.setTranslationY(0.0f);
        android.view.View view2 = this.f126348f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        android.view.View view3 = this.f126349g;
        view3.setTranslationX(0.0f);
        android.view.View view4 = this.f126349g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setScaleX(1.0f);
        view3.setScaleY(1.0f);
        android.view.View view5 = this.f126349g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView2 = this.f126352m;
        imageView2.setScaleX(0.3f);
        imageView2.setScaleY(0.3f);
        imageView2.setAlpha(0.0f);
        android.widget.ImageView imageView3 = this.f126353n;
        imageView3.setScaleX(0.0f);
        imageView3.setScaleY(0.0f);
        imageView3.setAlpha(0.0f);
        android.widget.ImageView imageView4 = this.f126354o;
        imageView4.setScaleX(0.0f);
        imageView4.setScaleY(0.0f);
        imageView4.setAlpha(0.0f);
        this.f126355p.setAlpha(0.0f);
        setVisibility(0);
        setClickable(false);
        this.D = false;
        post(new yt2.m(this));
    }

    public final boolean f() {
        int max = (int) java.lang.Math.max(0L, this.f126361v - (c01.id.c() / 1000));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        no0.l lVar = no0.m.f338730a;
        sb6.append(max < 3600 ? no0.l.a(lVar, max, ":", false, false, false, 24, null) : no0.l.a(lVar, max, ":", false, false, false, 28, null));
        sb6.append(this.f126362w);
        this.f126357r.setText(sb6.toString());
        return max > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    public /* synthetic */ FinderLiveShoppingSubsidyOverlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingSubsidyOverlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f126362w = "";
        this.f126363x = new yt2.q(this);
        this.subWordTickerHandler = jz5.h.b(new yt2.r(this));
        this.f126365z = new yt2.i(0.0f, 0.0f, 0.0f);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ebu, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.vat);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126348f = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.vas);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.vaz);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f126349g = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.vay);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f126350h = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.vau);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f126351i = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.var);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f126352m = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.vav);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f126353n = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.vaw);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f126354o = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.f487168vb1);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f126355p = (android.widget.LinearLayout) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.vax);
        android.widget.TextView textView = (android.widget.TextView) findViewById10;
        d92.f fVar = d92.f.f227470a;
        kotlin.jvm.internal.o.d(textView);
        fVar.h(textView, java.lang.Float.valueOf(17.0f));
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        textView.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(context, 4));
        kotlin.jvm.internal.o.f(findViewById10, "apply(...)");
        this.f126356q = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.f487167vb0);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById11;
        kotlin.jvm.internal.o.d(textView2);
        fVar.h(textView2, java.lang.Float.valueOf(14.0f));
        kotlin.jvm.internal.o.f(findViewById11, "apply(...)");
        this.f126357r = (android.widget.TextView) findViewById11;
        setRadius(getResources().getDimension(com.tencent.mm.R.dimen.f479671c8));
        setVisibility(8);
        float dimension = getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setCornerRadius(dimension);
        paintDrawable.setShaderFactory(new yt2.j(new int[]{-25734, -38318, -42166, -33967}, new float[]{0.0f, 0.43f, 0.59f, 1.0f}));
        findViewById.setBackground(paintDrawable);
        setOnClickListener(new yt2.h(this));
    }
}

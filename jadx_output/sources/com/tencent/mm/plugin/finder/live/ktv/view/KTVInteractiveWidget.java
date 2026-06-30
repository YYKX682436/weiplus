package com.tencent.mm.plugin.finder.live.ktv.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class KTVInteractiveWidget extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f111662p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f111663d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f111664e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f111665f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f111666g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f111667h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f111668i;

    /* renamed from: m, reason: collision with root package name */
    public lj2.v0 f111669m;

    /* renamed from: n, reason: collision with root package name */
    public ah2.f f111670n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f111671o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KTVInteractiveWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void a(com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget, mh2.o oVar) {
        kTVInteractiveWidget.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", oVar.f326431d);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f473950a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328375r2, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.W2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }

    public final void b(r45.yx1 yx1Var) {
        lj2.v0 v0Var = this.f111669m;
        zi2.w wVar = v0Var instanceof zi2.w ? (zi2.w) v0Var : null;
        if (wVar == null) {
            return;
        }
        boolean z17 = yx1Var.f391465n;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f111667h;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("pauseResumeBtn");
            throw null;
        }
        weImageView.setImageResource(z17 ? com.tencent.mm.R.raw.play_filled : com.tencent.mm.R.raw.pause_filled);
        android.widget.FrameLayout frameLayout = this.f111666g;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new mh2.u(this, wVar, yx1Var));
        } else {
            kotlin.jvm.internal.o.o("pauseResumeBtnContainer");
            throw null;
        }
    }

    public final void c() {
        lj2.v0 v0Var = this.f111669m;
        zi2.w wVar = v0Var instanceof zi2.w ? (zi2.w) v0Var : null;
        if (wVar == null) {
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((om2.e) wVar.P0(om2.e.class)).f346290f).getValue()).booleanValue();
        android.widget.ImageView imageView = this.f111665f;
        if (imageView != null) {
            imageView.setImageResource(booleanValue ? com.tencent.mm.R.raw.finder_live_lyrics_on : com.tencent.mm.R.raw.finder_live_lyrics_off);
        } else {
            kotlin.jvm.internal.o.o("originalToggleBtn");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f111669m = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTVInteractiveWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e_y, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487405vh0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewParent parent = ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById).getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f111663d = (android.widget.FrameLayout) parent;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.unp);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f111665f = imageView;
        android.view.ViewParent parent2 = imageView.getParent();
        kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f111664e = (android.widget.FrameLayout) parent2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.upb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        this.f111667h = weImageView;
        android.view.ViewParent parent3 = weImageView.getParent();
        kotlin.jvm.internal.o.e(parent3, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f111666g = (android.widget.FrameLayout) parent3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.twj);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.ViewParent parent4 = ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4).getParent();
        kotlin.jvm.internal.o.e(parent4, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f111668i = (android.widget.FrameLayout) parent4;
    }
}

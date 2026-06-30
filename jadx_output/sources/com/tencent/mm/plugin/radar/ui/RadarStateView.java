package com.tencent.mm.plugin.radar.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarStateView;", "Landroid/widget/RelativeLayout;", "Lps3/e;", "d", "Lps3/e;", "getState", "()Lps3/e;", "setState", "(Lps3/e;)V", "state", "Landroid/view/animation/Animation;", "g", "Ljz5/g;", "getSlideOutAnim", "()Landroid/view/animation/Animation;", "slideOutAnim", "h", "getSlideInAnim", "slideInAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class RadarStateView extends android.widget.RelativeLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f155011m = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ps3.e state;

    /* renamed from: e, reason: collision with root package name */
    public boolean f155013e;

    /* renamed from: f, reason: collision with root package name */
    public final qs3.f0 f155014f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g slideOutAnim;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g slideInAnim;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f155017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarStateView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.state = ps3.e.f358076d;
        this.f155013e = true;
        this.f155014f = new qs3.f0(this);
        this.slideOutAnim = jz5.h.b(new qs3.e0(this));
        this.slideInAnim = jz5.h.b(new qs3.c0(this));
    }

    private final android.view.animation.Animation getSlideInAnim() {
        java.lang.Object value = this.slideInAnim.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.animation.Animation) value;
    }

    private final android.view.animation.Animation getSlideOutAnim() {
        java.lang.Object value = this.slideOutAnim.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.animation.Animation) value;
    }

    public final void a() {
        if (this.f155017i == null) {
            this.f155017i = new android.widget.ImageView(getContext());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.setMargins(0, 0, i65.a.b(getContext(), 5), i65.a.b(getContext(), 2));
            android.widget.ImageView imageView = this.f155017i;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            addView(this.f155017i);
        }
    }

    public final void b() {
        if (this.f155013e) {
            a();
            d();
            startAnimation(getSlideInAnim());
        }
    }

    public final void c() {
        if (this.f155013e) {
            a();
            d();
            startAnimation(getSlideOutAnim());
        }
    }

    public final void d() {
        java.util.Objects.toString(this.state);
        if (!this.f155013e) {
            setVisibility(8);
            return;
        }
        int ordinal = this.state.ordinal();
        if (ordinal == 0) {
            setVisibility(8);
            return;
        }
        if (ordinal == 1) {
            setBackgroundResource(com.tencent.mm.R.raw.radar_search_blue_bg);
            android.widget.ImageView imageView = this.f155017i;
            kotlin.jvm.internal.o.d(imageView);
            imageView.setImageResource(com.tencent.mm.R.raw.radar_search_waiting);
            setVisibility(0);
            return;
        }
        if (ordinal == 2) {
            setBackgroundResource(com.tencent.mm.R.raw.radar_search_green_bg);
            android.widget.ImageView imageView2 = this.f155017i;
            kotlin.jvm.internal.o.d(imageView2);
            imageView2.setImageResource(com.tencent.mm.R.raw.radar_search_ok);
            setVisibility(0);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        setBackgroundResource(com.tencent.mm.R.raw.radar_search_green_bg);
        android.widget.ImageView imageView3 = this.f155017i;
        kotlin.jvm.internal.o.d(imageView3);
        imageView3.setImageResource(com.tencent.mm.R.raw.radar_search_hi);
        setVisibility(0);
    }

    public final ps3.e getState() {
        return this.state;
    }

    public final void setState(ps3.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.state = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarStateView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.state = ps3.e.f358076d;
        this.f155013e = true;
        this.f155014f = new qs3.f0(this);
        this.slideOutAnim = jz5.h.b(new qs3.e0(this));
        this.slideInAnim = jz5.h.b(new qs3.c0(this));
    }
}

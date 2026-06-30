package com.tencent.mm.plugin.radar.ui;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%B!\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;", "Landroid/widget/RelativeLayout;", "", "noMember", "Ljz5/f0;", "setNoMember", "show", "setPressingDown", "Landroid/view/animation/Animation;", "e", "Ljz5/g;", "getTipsFadeIn", "()Landroid/view/animation/Animation;", "tipsFadeIn", "f", "getTipsFadeOut", "tipsFadeOut", "Landroid/widget/TextView;", "g", "getTvTextTips", "()Landroid/widget/TextView;", "tvTextTips", "Landroid/view/View;", "h", "getTextTipsContainer", "()Landroid/view/View;", "textTipsContainer", "Landroid/widget/LinearLayout;", "i", "getNoviceEducationTips", "()Landroid/widget/LinearLayout;", "noviceEducationTips", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class RadarTipsView extends android.widget.RelativeLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f155018v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final qs3.g0 f155019d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g tipsFadeIn;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g tipsFadeOut;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g tvTextTips;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g textTipsContainer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g noviceEducationTips;

    /* renamed from: m, reason: collision with root package name */
    public final int f155025m;

    /* renamed from: n, reason: collision with root package name */
    public final int f155026n;

    /* renamed from: o, reason: collision with root package name */
    public final int f155027o;

    /* renamed from: p, reason: collision with root package name */
    public final int f155028p;

    /* renamed from: q, reason: collision with root package name */
    public final qs3.l0 f155029q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f155030r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f155031s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f155032t;

    /* renamed from: u, reason: collision with root package name */
    public long f155033u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarTipsView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f155019d = new qs3.g0(this);
        this.tipsFadeIn = jz5.h.b(new qs3.i0(this));
        this.tipsFadeOut = jz5.h.b(new qs3.k0(this));
        this.tvTextTips = qs3.e1.a(this, com.tencent.mm.R.id.lhp);
        this.textTipsContainer = qs3.e1.a(this, com.tencent.mm.R.id.lhn);
        this.noviceEducationTips = qs3.e1.a(this, com.tencent.mm.R.id.lhq);
        this.f155025m = 1;
        this.f155026n = 2;
        this.f155027o = 3;
        this.f155028p = 3;
        this.f155029q = new qs3.l0(this, android.os.Looper.getMainLooper());
        this.f155031s = true;
    }

    private final android.widget.LinearLayout getNoviceEducationTips() {
        return (android.widget.LinearLayout) this.noviceEducationTips.getValue();
    }

    private final android.view.View getTextTipsContainer() {
        return (android.view.View) this.textTipsContainer.getValue();
    }

    private final android.view.animation.Animation getTipsFadeIn() {
        java.lang.Object value = this.tipsFadeIn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.animation.Animation) value;
    }

    private final android.view.animation.Animation getTipsFadeOut() {
        java.lang.Object value = this.tipsFadeOut.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.animation.Animation) value;
    }

    private final android.widget.TextView getTvTextTips() {
        return (android.widget.TextView) this.tvTextTips.getValue();
    }

    public final void a() {
        this.f155030r = false;
        this.f155029q.removeMessages(this.f155027o);
        if (getVisibility() == 0 && getNoviceEducationTips().getVisibility() == 0) {
            getNoviceEducationTips().clearAnimation();
            if (getTextTipsContainer().getAnimation() == getTipsFadeOut()) {
                getTextTipsContainer().clearAnimation();
            }
            getNoviceEducationTips().startAnimation(getTipsFadeOut());
        }
    }

    public final void b() {
        if (getVisibility() == 0 && getTextTipsContainer().getVisibility() == 0) {
            if (getNoviceEducationTips().getAnimation() == getTipsFadeOut()) {
                getNoviceEducationTips().clearAnimation();
            }
            getTextTipsContainer().clearAnimation();
            this.f155030r = false;
            getTextTipsContainer().startAnimation(getTipsFadeOut());
        }
    }

    public final void c() {
        getNoviceEducationTips().setOnClickListener(new qs3.h0(this));
    }

    public final void d(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        f(msg, 5000);
    }

    public final void e() {
        this.f155030r = true;
        android.view.View textTipsContainer = getTextTipsContainer();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textTipsContainer, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarTipsView", "showNoviceEducation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textTipsContainer.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textTipsContainer, "com/tencent/mm/plugin/radar/ui/RadarTipsView", "showNoviceEducation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getTextTipsContainer().clearAnimation();
        setVisibility(0);
        getNoviceEducationTips().setVisibility(0);
        getNoviceEducationTips().startAnimation(getTipsFadeIn());
        getNoviceEducationTips().requestFocus();
    }

    public final void f(java.lang.String msg, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f155030r = true;
        getNoviceEducationTips().setVisibility(8);
        getNoviceEducationTips().clearAnimation();
        getTvTextTips().setText(msg);
        setVisibility(0);
        android.view.View textTipsContainer = getTextTipsContainer();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textTipsContainer, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarTipsView", "showRadarTips", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textTipsContainer.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textTipsContainer, "com/tencent/mm/plugin/radar/ui/RadarTipsView", "showRadarTips", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getTextTipsContainer().startAnimation(getTipsFadeIn());
        qs3.l0 l0Var = this.f155029q;
        l0Var.removeMessages(0);
        l0Var.removeMessages(this.f155026n);
        if (i17 > 0) {
            l0Var.sendEmptyMessageDelayed(0, i17);
        }
    }

    public final void setNoMember(boolean z17) {
        this.f155031s = z17;
        if (z17) {
            return;
        }
        b();
        this.f155030r = false;
        qs3.l0 l0Var = this.f155029q;
        l0Var.removeMessages(this.f155025m);
        l0Var.removeMessages(this.f155026n);
        l0Var.removeMessages(this.f155027o);
        a();
    }

    public final void setPressingDown(boolean z17) {
        if (this.f155033u != 0) {
            this.f155030r = false;
            qs3.l0 l0Var = this.f155029q;
            l0Var.removeMessages(this.f155025m);
            l0Var.removeMessages(this.f155026n);
            l0Var.removeMessages(this.f155027o);
            b();
            android.view.View textTipsContainer = getTextTipsContainer();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textTipsContainer, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarTipsView", "hideAll", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textTipsContainer.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textTipsContainer, "com/tencent/mm/plugin/radar/ui/RadarTipsView", "hideAll", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getNoviceEducationTips().setVisibility(8);
            setVisibility(8);
        }
        this.f155032t = true;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f155033u = android.os.SystemClock.elapsedRealtime();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarTipsView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f155019d = new qs3.g0(this);
        this.tipsFadeIn = jz5.h.b(new qs3.i0(this));
        this.tipsFadeOut = jz5.h.b(new qs3.k0(this));
        this.tvTextTips = qs3.e1.a(this, com.tencent.mm.R.id.lhp);
        this.textTipsContainer = qs3.e1.a(this, com.tencent.mm.R.id.lhn);
        this.noviceEducationTips = qs3.e1.a(this, com.tencent.mm.R.id.lhq);
        this.f155025m = 1;
        this.f155026n = 2;
        this.f155027o = 3;
        this.f155028p = 3;
        this.f155029q = new qs3.l0(this, android.os.Looper.getMainLooper());
        this.f155031s = true;
    }
}

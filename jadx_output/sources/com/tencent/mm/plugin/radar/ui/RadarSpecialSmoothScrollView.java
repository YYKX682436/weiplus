package com.tencent.mm.plugin.radar.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "qs3/w", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class RadarSpecialSmoothScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout f155000d;

    /* renamed from: e, reason: collision with root package name */
    public float f155001e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f155002f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.TranslateAnimation f155003g;

    /* renamed from: h, reason: collision with root package name */
    public final qs3.w f155004h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarSpecialSmoothScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f155002f = new android.graphics.Rect();
        this.f155004h = new qs3.w();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            this.f155000d = childAt instanceof com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout ? (com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout) childAt : null;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (this.f155000d == null) {
            return super.onTouchEvent(ev6);
        }
        int action = ev6.getAction();
        if (action != 0) {
            android.graphics.Rect rect = this.f155002f;
            if (action == 1) {
                this.f155001e = 0.0f;
                if (!rect.isEmpty()) {
                    kotlin.jvm.internal.o.d(this.f155000d);
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, r4.getTop() - rect.top, 0.0f);
                    this.f155003g = translateAnimation;
                    translateAnimation.setInterpolator(this.f155004h);
                    android.view.animation.TranslateAnimation translateAnimation2 = this.f155003g;
                    kotlin.jvm.internal.o.d(translateAnimation2);
                    kotlin.jvm.internal.o.d(this.f155000d);
                    translateAnimation2.setDuration(java.lang.Math.abs(r2.getTop() - rect.top));
                    com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout = this.f155000d;
                    kotlin.jvm.internal.o.d(radarSpecialTableLayout);
                    radarSpecialTableLayout.startAnimation(this.f155003g);
                    com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout2 = this.f155000d;
                    kotlin.jvm.internal.o.d(radarSpecialTableLayout2);
                    int i17 = rect.left;
                    int i18 = rect.top;
                    int i19 = rect.right;
                    int i27 = rect.bottom;
                    radarSpecialTableLayout2.f155005d = true;
                    radarSpecialTableLayout2.layout(i17, i18, i19, i27);
                    rect.setEmpty();
                }
            } else if (action == 2) {
                float y17 = ev6.getY();
                if (this.f155001e == 0.0f) {
                    this.f155001e = y17;
                }
                com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout3 = this.f155000d;
                kotlin.jvm.internal.o.d(radarSpecialTableLayout3);
                int measuredHeight = radarSpecialTableLayout3.getMeasuredHeight() - getHeight();
                int scrollY = getScrollY();
                if (scrollY == 0 || scrollY == measuredHeight) {
                    int i28 = (int) (this.f155001e - y17);
                    scrollBy(0, i28);
                    if (rect.isEmpty()) {
                        com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout4 = this.f155000d;
                        kotlin.jvm.internal.o.d(radarSpecialTableLayout4);
                        int left = radarSpecialTableLayout4.getLeft();
                        com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout5 = this.f155000d;
                        kotlin.jvm.internal.o.d(radarSpecialTableLayout5);
                        int top = radarSpecialTableLayout5.getTop();
                        com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout6 = this.f155000d;
                        kotlin.jvm.internal.o.d(radarSpecialTableLayout6);
                        int right = radarSpecialTableLayout6.getRight();
                        com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout7 = this.f155000d;
                        kotlin.jvm.internal.o.d(radarSpecialTableLayout7);
                        rect.set(left, top, right, radarSpecialTableLayout7.getBottom());
                    }
                    com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout8 = this.f155000d;
                    kotlin.jvm.internal.o.d(radarSpecialTableLayout8);
                    com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout9 = this.f155000d;
                    kotlin.jvm.internal.o.d(radarSpecialTableLayout9);
                    int left2 = radarSpecialTableLayout9.getLeft();
                    com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout10 = this.f155000d;
                    kotlin.jvm.internal.o.d(radarSpecialTableLayout10);
                    int i29 = i28 / 2;
                    int top2 = radarSpecialTableLayout10.getTop() - i29;
                    com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout11 = this.f155000d;
                    kotlin.jvm.internal.o.d(radarSpecialTableLayout11);
                    int right2 = radarSpecialTableLayout11.getRight();
                    com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout12 = this.f155000d;
                    kotlin.jvm.internal.o.d(radarSpecialTableLayout12);
                    int bottom = radarSpecialTableLayout12.getBottom() - i29;
                    radarSpecialTableLayout8.f155005d = true;
                    radarSpecialTableLayout8.layout(left2, top2, right2, bottom);
                } else {
                    scrollBy(0, ((int) (this.f155001e - y17)) / 2);
                }
                this.f155001e = y17;
            }
        } else {
            this.f155001e = ev6.getY();
        }
        return super.onTouchEvent(ev6);
    }
}

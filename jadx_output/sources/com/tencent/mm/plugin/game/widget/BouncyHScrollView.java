package com.tencent.mm.plugin.game.widget;

/* loaded from: classes5.dex */
public class BouncyHScrollView extends android.widget.HorizontalScrollView implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141931d;

    /* renamed from: e, reason: collision with root package name */
    public int f141932e;

    public BouncyHScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f141931d = context;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f141932e = (int) (this.f141931d.getResources().getDisplayMetrics().density * 300.0f);
        setOverScrollMode(0);
        setSmoothScrollingEnabled(true);
        setHorizontalFadingEdgeEnabled(false);
    }

    @Override // android.view.View
    public boolean overScrollBy(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        return super.overScrollBy(i17, i18, i19, i27, i28, i29, this.f141932e, i38, z17);
    }

    public BouncyHScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f141931d = context;
    }
}

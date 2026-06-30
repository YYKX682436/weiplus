package com.tencent.mm.plugin.finder.view;

/* loaded from: classes4.dex */
public final class qs extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final float f132912d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SpringBackLayout f132913e;

    public qs(com.tencent.mm.plugin.finder.view.SpringBackLayout springBackLayout) {
        this.f132913e = springBackLayout;
        springBackLayout.f131599h = true;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        float f18 = 0.0f + ((this.f132912d - 0.0f) * f17);
        com.tencent.mm.plugin.finder.view.SpringBackLayout springBackLayout = this.f132913e;
        springBackLayout.scrollBy((int) ((springBackLayout.getMaxWidth() - springBackLayout.getScrollX()) * f18), 0);
        if (f18 == 1.0f) {
            springBackLayout.f131599h = false;
        }
    }

    @Override // android.view.animation.Animation
    public void initialize(int i17, int i18, int i19, int i27) {
        super.initialize(i17, i18, i19, i27);
        setDuration(260L);
        setInterpolator(new android.view.animation.AccelerateInterpolator());
    }
}

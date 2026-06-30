package com.tencent.mm.plugin.music.ui;

/* loaded from: classes12.dex */
public class s extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final int f150776d;

    /* renamed from: e, reason: collision with root package name */
    public final int f150777e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f150778f;

    public s(com.tencent.mm.plugin.music.ui.t tVar, android.view.View view, int i17) {
        this.f150778f = view;
        this.f150777e = i17;
        this.f150776d = view.getHeight();
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17 = (int) (this.f150776d + ((this.f150777e - r4) * f17));
        android.view.View view = this.f150778f;
        view.getLayoutParams().height = i17;
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public void initialize(int i17, int i18, int i19, int i27) {
        super.initialize(i17, i18, i19, i27);
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}

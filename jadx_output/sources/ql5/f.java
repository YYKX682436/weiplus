package ql5;

/* loaded from: classes15.dex */
public class f extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final int f364602d;

    /* renamed from: e, reason: collision with root package name */
    public final int f364603e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f364604f;

    /* renamed from: g, reason: collision with root package name */
    public final ql5.g f364605g;

    public f(android.view.View view, int i17, int i18, ql5.g gVar, ql5.a aVar) {
        this.f364602d = i17;
        this.f364603e = i18 - i17;
        this.f364604f = view;
        this.f364605g = gVar;
        view.getLayoutParams().height = i17;
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        super.applyTransformation(f17, transformation);
        ql5.g gVar = this.f364605g;
        int i17 = this.f364603e;
        int i18 = this.f364602d;
        android.view.View view = this.f364604f;
        if (f17 < 1.0f) {
            int i19 = i18 + ((int) (i17 * f17));
            view.getLayoutParams().height = i19;
            gVar.f364609d = i19;
            view.requestLayout();
            return;
        }
        int i27 = i18 + i17;
        view.getLayoutParams().height = i27;
        gVar.f364609d = i27;
        view.requestLayout();
    }
}

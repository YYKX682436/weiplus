package ym5;

/* loaded from: classes3.dex */
public class g implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f463336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.AnimationLayout f463337e;

    public g(com.tencent.mm.view.AnimationLayout animationLayout, java.lang.Runnable runnable) {
        this.f463337e = animationLayout;
        this.f463336d = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f463337e.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f463336d.run();
        return true;
    }
}

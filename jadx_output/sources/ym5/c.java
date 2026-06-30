package ym5;

/* loaded from: classes3.dex */
public class c implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f463226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.AnimationLayout f463227e;

    public c(com.tencent.mm.view.AnimationLayout animationLayout, java.lang.Runnable runnable) {
        this.f463227e = animationLayout;
        this.f463226d = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f463227e.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f463226d.run();
        return true;
    }
}

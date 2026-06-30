package ym5;

/* loaded from: classes2.dex */
public final class w3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f463562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463563e;

    public w3(yz5.l lVar, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f463562d = lVar;
        this.f463563e = refreshLoadMoreLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f463562d.invoke(java.lang.Float.valueOf(this.f463563e.getTranslationY()));
    }
}

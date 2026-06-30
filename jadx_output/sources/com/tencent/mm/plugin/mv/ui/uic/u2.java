package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        super(0);
        this.f151472d = musicMvMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        java.lang.Object obj = this.f151472d.f150983p;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
            alpha.start();
        }
        return jz5.f0.f302826a;
    }
}

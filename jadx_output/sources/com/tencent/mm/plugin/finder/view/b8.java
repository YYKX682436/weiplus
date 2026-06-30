package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class b8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderDrawerLayout f131700d;

    public b8(com.tencent.mm.plugin.finder.view.FinderDrawerLayout finderDrawerLayout) {
        this.f131700d = finderDrawerLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.view.FinderDrawerLayout finderDrawerLayout = this.f131700d;
        android.view.View view = finderDrawerLayout.f130989h;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        float translationY = (1.0f * view.getTranslationY()) / finderDrawerLayout.f130992n;
        java.util.Iterator it6 = finderDrawerLayout.f130999u.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it6.next()).a(translationY);
        }
        yz5.l translationCallback = finderDrawerLayout.getTranslationCallback();
        if (translationCallback != null) {
            translationCallback.invoke(java.lang.Float.valueOf(translationY));
        }
    }
}

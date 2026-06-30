package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class a8 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderDrawerLayout f131622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f131623e;

    public a8(com.tencent.mm.plugin.finder.view.FinderDrawerLayout finderDrawerLayout, int i17) {
        this.f131622d = finderDrawerLayout;
        this.f131623e = i17;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f131622d.f130993o = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.FinderDrawerLayout finderDrawerLayout = this.f131622d;
        finderDrawerLayout.f130993o = false;
        finderDrawerLayout.getClass();
        if (this.f131623e == (-finderDrawerLayout.f130995q)) {
            finderDrawerLayout.setOpen(true);
            yz5.a openCallback = finderDrawerLayout.getOpenCallback();
            if (openCallback != null) {
                openCallback.invoke();
            }
            java.util.Iterator it = finderDrawerLayout.f130999u.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(true, false, 0);
            }
            return;
        }
        finderDrawerLayout.setOpen(false);
        yz5.a closeCallback = finderDrawerLayout.getCloseCallback();
        if (closeCallback != null) {
            closeCallback.invoke();
        }
        java.util.Iterator it6 = finderDrawerLayout.f130999u.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it6.next()).c(false, false, 0);
        }
    }
}

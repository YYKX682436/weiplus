package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bb extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gb f111996d;

    public bb(com.tencent.mm.plugin.finder.live.plugin.gb gbVar) {
        this.f111996d = gbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.e("FinderLiveBottomTipsLazyPlugin", "hideTips!");
        com.tencent.mm.plugin.finder.live.plugin.gb gbVar = this.f111996d;
        gbVar.f365323d.animate().setListener(null);
        zl2.r4.f473950a.Q2((android.widget.TextView) ((jz5.n) gbVar.f112672q).getValue());
        gbVar.f365323d.setAlpha(1.0f);
    }
}

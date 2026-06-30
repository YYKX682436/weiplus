package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ko implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f113298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f113299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f113301g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f113302h;

    public ko(com.tencent.mm.plugin.finder.live.plugin.ap apVar, android.view.ViewGroup viewGroup, android.animation.ValueAnimator valueAnimator, boolean z17) {
        this.f113299e = apVar;
        this.f113300f = viewGroup;
        this.f113301g = valueAnimator;
        this.f113302h = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f113298d = true;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "BulletInAnimator onAnimationCancel: isCancel=" + this.f113298d + ", bulletShowInfo:" + this.f113299e.A.get(this.f113300f));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        sj2.m mVar;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "BulletInAnimator onAnimationEnd: isCancel=" + this.f113298d + ", bulletShowInfo: " + this.f113299e.A.get(this.f113300f));
        boolean z17 = false;
        if (this.f113298d) {
            this.f113298d = false;
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.f113299e.A.get(this.f113300f);
        if (tnVar != null) {
            tnVar.f114438e = true;
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar2 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.f113299e.A.get(this.f113300f);
        if (tnVar2 != null && (atomicBoolean = tnVar2.f114439f) != null && true == atomicBoolean.get()) {
            z17 = true;
        }
        if (!z17) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f113299e.C).get(this.f113300f);
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
        android.animation.ValueAnimator valueAnimator2 = this.f113301g;
        if (valueAnimator2 != null) {
            com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f113299e;
            long duration = valueAnimator2.getDuration();
            int i17 = com.tencent.mm.plugin.finder.live.plugin.ap.N;
            if (duration != i17 + 500) {
                valueAnimator2.setDuration(i17 + 500);
                valueAnimator2.setEvaluator(new cn2.m(500, i17, new com.tencent.mm.plugin.finder.live.plugin.io(apVar)));
            }
        }
        if (!this.f113299e.G.containsKey(this.f113300f) || (mVar = (sj2.m) this.f113299e.G.get(this.f113300f)) == null) {
            return;
        }
        mVar.d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        sj2.m mVar;
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BulletInAnimator onAnimationStart: ");
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f113299e;
        java.util.Map map = apVar.A;
        android.view.ViewGroup viewGroup = this.f113300f;
        sb6.append(map.get(viewGroup));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.jo(this.f113302h, viewGroup));
        if (!apVar.G.containsKey(viewGroup) || (mVar = (sj2.m) apVar.G.get(viewGroup)) == null) {
            return;
        }
        mVar.a();
    }
}

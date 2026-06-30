package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mo implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f113543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f113544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113545f;

    public mo(com.tencent.mm.plugin.finder.live.plugin.ap apVar, android.view.ViewGroup viewGroup) {
        this.f113544e = apVar;
        this.f113545f = viewGroup;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f113543d = true;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "BulletOutAnimator onAnimationCancel: isCancel=" + this.f113543d + ", bulletShowInfo:" + this.f113544e.A.get(this.f113545f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if (true == r4.get()) goto L14;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAnimationEnd(android.animation.Animator r4) {
        /*
            r3 = this;
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "BulletOutAnimator onAnimationEnd: isCancel="
            r4.<init>(r0)
            boolean r0 = r3.f113543d
            r4.append(r0)
            java.lang.String r0 = ", bulletShowInfo: "
            r4.append(r0)
            com.tencent.mm.plugin.finder.live.plugin.ap r0 = r3.f113544e
            java.util.Map r0 = r0.A
            android.view.ViewGroup r1 = r3.f113545f
            java.lang.Object r0 = r0.get(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "Finder.FinderLiveGiftQueuePlugin"
            com.tencent.mars.xlog.Log.i(r0, r4)
            boolean r4 = r3.f113543d
            r0 = 0
            if (r4 == 0) goto L34
            r3.f113543d = r0
            return
        L34:
            com.tencent.mm.plugin.finder.live.plugin.lo r4 = new com.tencent.mm.plugin.finder.live.plugin.lo
            android.view.ViewGroup r1 = r3.f113545f
            com.tencent.mm.plugin.finder.live.plugin.ap r2 = r3.f113544e
            r4.<init>(r1, r2)
            pm0.v.X(r4)
            com.tencent.mm.plugin.finder.live.plugin.ap r4 = r3.f113544e
            java.util.Map r4 = r4.A
            android.view.ViewGroup r1 = r3.f113545f
            java.lang.Object r4 = r4.get(r1)
            com.tencent.mm.plugin.finder.live.plugin.tn r4 = (com.tencent.mm.plugin.finder.live.plugin.tn) r4
            if (r4 == 0) goto L5a
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f114439f
            if (r4 == 0) goto L5a
            boolean r4 = r4.get()
            r1 = 1
            if (r1 != r4) goto L5a
            goto L5b
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto L61
            com.tencent.mm.plugin.finder.live.plugin.ap r4 = r3.f113544e
            r4.f111914J = r0
        L61:
            com.tencent.mm.plugin.finder.live.plugin.ap r4 = r3.f113544e
            java.util.Map r4 = r4.A
            android.view.ViewGroup r0 = r3.f113545f
            java.lang.Object r4 = r4.get(r0)
            com.tencent.mm.plugin.finder.live.plugin.tn r4 = (com.tencent.mm.plugin.finder.live.plugin.tn) r4
            if (r4 == 0) goto L72
            r4.a()
        L72:
            com.tencent.mm.plugin.finder.live.plugin.ap r4 = r3.f113544e
            r4.I1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.mo.onAnimationEnd(android.animation.Animator):void");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "BulletOutAnimator onAnimationStart: " + this.f113544e.A.get(this.f113545f));
    }
}

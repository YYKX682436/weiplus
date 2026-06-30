package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f113773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f113774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.l1 f113776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo(com.tencent.mm.plugin.finder.live.plugin.ap apVar, kotlin.jvm.internal.h0 h0Var, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.util.l1 l1Var) {
        super(0);
        this.f113773d = apVar;
        this.f113774e = h0Var;
        this.f113775f = viewGroup;
        this.f113776g = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "replaceBullet ui thread: target BulletShowingInfo=" + this.f113773d.A.get(this.f113774e.f310123d) + ", origin BulletShowingInfo=" + this.f113773d.A.get(this.f113775f) + ", giftShowInfo=" + this.f113776g);
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f113773d.B).get(this.f113774e.f310123d);
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f113773d.C).get(this.f113774e.f310123d);
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            valueAnimator2.cancel();
        }
        this.f113773d.I.removeCallbacksAndMessages(this.f113774e.f310123d);
        boolean z17 = false;
        this.f113773d.f111914J = false;
        if (!kotlin.jvm.internal.o.b(this.f113774e.f310123d, this.f113775f)) {
            com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.f113773d.A.get(this.f113775f);
            if (tnVar != null && (atomicBoolean = tnVar.f114437d) != null && atomicBoolean.get()) {
                z17 = true;
            }
            if (!z17) {
                android.animation.ValueAnimator valueAnimator3 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f113773d.B).get(this.f113775f);
                if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                    valueAnimator3.cancel();
                }
                android.animation.ValueAnimator valueAnimator4 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f113773d.C).get(this.f113775f);
                if (valueAnimator4 != null && !valueAnimator4.isRunning()) {
                    valueAnimator4.start();
                }
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f113773d;
        com.tencent.mm.plugin.finder.live.plugin.ap.V1(apVar, (com.tencent.mm.plugin.finder.live.plugin.tn) apVar.A.get(this.f113774e.f310123d), this.f113776g, false, 4, null);
        android.animation.ValueAnimator valueAnimator5 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f113773d.B).get(this.f113774e.f310123d);
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar2 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.f113773d.A.get(this.f113774e.f310123d);
        if (tnVar2 != null) {
            tnVar2.f114451r = c01.id.c();
        }
        this.f113773d.w1(null);
        return jz5.f0.f302826a;
    }
}

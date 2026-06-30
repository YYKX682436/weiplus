package com.tencent.mm.plugin.finder.live.plugin;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.do, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cdo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f112312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.l1 f112313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.ap apVar, com.tencent.mm.plugin.finder.live.util.l1 l1Var) {
        super(0);
        this.f112311d = viewGroup;
        this.f112312e = apVar;
        this.f112313f = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup;
        if (com.tencent.mm.plugin.finder.live.plugin.ap.V && (viewGroup = this.f112311d) != null) {
            viewGroup.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "launchBulletInAnimation, BulletShowingInfo=" + this.f112312e.A.get(this.f112311d) + ", giftShowInfo=" + this.f112313f);
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f112312e;
        com.tencent.mm.plugin.finder.live.plugin.ap.V1(apVar, (com.tencent.mm.plugin.finder.live.plugin.tn) apVar.A.get(this.f112311d), this.f112313f, false, 4, null);
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f112312e.B).get(this.f112311d);
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.f112312e.A.get(this.f112311d);
        if (tnVar != null) {
            tnVar.f114451r = c01.id.c();
        }
        this.f112312e.w1(null);
        return jz5.f0.f302826a;
    }
}

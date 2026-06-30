package com.tencent.mm.plugin.finder.nearby.video;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyVideoPresenter$onRefresh$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyVideoPresenter$onRefresh$1(com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter) {
        super(0);
        this.this$0 = nearbyVideoPresenter;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m124invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m124invoke() {
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = ((com.tencent.mm.plugin.finder.nearby.video.d0) this.this$0.getViewCallback()).f();
        final com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = this.this$0;
        f17.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$onRefresh$1.1
            @Override // java.lang.Runnable
            public final void run() {
                ym5.s3 s3Var = new ym5.s3(0);
                s3Var.f463517b = -2;
                ((com.tencent.mm.plugin.finder.nearby.video.d0) com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter.this.getViewCallback()).f().Q(s3Var);
            }
        }, 200L);
    }
}

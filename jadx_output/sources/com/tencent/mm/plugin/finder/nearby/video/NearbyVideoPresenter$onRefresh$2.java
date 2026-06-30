package com.tencent.mm.plugin.finder.nearby.video;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyVideoPresenter$onRefresh$2 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter this$0;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$onRefresh$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.a {
        final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter this$0;

        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$onRefresh$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C00511 extends kotlin.jvm.internal.q implements yz5.a {
            final /* synthetic */ boolean $succ;
            final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00511(boolean z17, com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter) {
                super(0);
                this.$succ = z17;
                this.this$0 = nearbyVideoPresenter;
            }

            @Override // yz5.a
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m127invoke();
                return jz5.f0.f302826a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m127invoke() {
                if (this.$succ) {
                    this.this$0.requestRefresh();
                } else {
                    this.this$0.requestRefreshNoPermission();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter) {
            super(0);
            this.this$0 = nearbyVideoPresenter;
        }

        @Override // yz5.a
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m126invoke();
            return jz5.f0.f302826a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m126invoke() {
            boolean d17 = com.tencent.mm.plugin.finder.assist.n3.f102399a.d();
            this.this$0.setRequestingLbs(false);
            pm0.v.X(new com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$onRefresh$2.AnonymousClass1.C00511(d17, this.this$0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyVideoPresenter$onRefresh$2(com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter) {
        super(0);
        this.this$0 = nearbyVideoPresenter;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m125invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m125invoke() {
        if (this.this$0.getIsRequestingLbs()) {
            return;
        }
        this.this$0.setRequestingLbs(true);
        pm0.v.L("LbsPresenter_requestLbs", true, new com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$onRefresh$2.AnonymousClass1(this.this$0));
    }
}

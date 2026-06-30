package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes10.dex */
public final class l extends com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout {
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.a A;

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f178242t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.a f178243u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.p f178244v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.p f178245w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f178246x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f178247y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f178248z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f178244v = new com.tencent.mm.plugin.wallet.balance.ui.lqt.k(this);
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void d(java.lang.String str) {
        yz5.a aVar = this.f178248z;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void e() {
        yz5.a aVar = this.f178246x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final long getCurrentPos() {
        return getPlayer().getCurrentPositionMs();
    }

    public final com.tencent.mm.plugin.wallet.balance.ui.lqt.a getDelegate() {
        return this.A;
    }

    public final yz5.a getOnFirstFrameRendered() {
        return this.f178243u;
    }

    public final yz5.p getOnProgressChange() {
        return this.f178244v;
    }

    public final yz5.p getOnStateChange() {
        return this.f178245w;
    }

    public final yz5.a getOnVideoBufferingStart() {
        return this.f178248z;
    }

    public final yz5.a getOnVideoComplete() {
        return this.f178246x;
    }

    public final yz5.a getOnVideoError() {
        return this.f178247y;
    }

    public final yz5.p getOnVideoSizeChange() {
        return this.f178242t;
    }

    public final int getPlayerState() {
        return getPlayer().getState();
    }

    public final long getTotalLength() {
        return getPlayer().getDurationMs();
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void i(rh3.o mp6, int i17, int i18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        super.i(mp6, i17, i18);
        yz5.a aVar = this.f178247y;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void j(java.lang.String invokeSource, int i17) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        super.j(invokeSource, i17);
        yz5.a aVar = this.f178243u;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void l(rh3.o mp6, long j17, long j18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        yz5.p pVar = this.f178244v;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void n(int i17, int i18) {
        yz5.p pVar = this.f178242t;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    public final void setDelegate(com.tencent.mm.plugin.wallet.balance.ui.lqt.a aVar) {
        this.A = aVar;
    }

    public final void setOnFirstFrameRendered(yz5.a aVar) {
        this.f178243u = aVar;
    }

    public final void setOnProgressChange(yz5.p pVar) {
        this.f178244v = pVar;
    }

    public final void setOnStateChange(yz5.p pVar) {
        this.f178245w = pVar;
    }

    public final void setOnVideoBufferingStart(yz5.a aVar) {
        this.f178248z = aVar;
    }

    public final void setOnVideoComplete(yz5.a aVar) {
        this.f178246x = aVar;
    }

    public final void setOnVideoError(yz5.a aVar) {
        this.f178247y = aVar;
    }

    public final void setOnVideoSizeChange(yz5.p pVar) {
        this.f178242t = pVar;
    }
}

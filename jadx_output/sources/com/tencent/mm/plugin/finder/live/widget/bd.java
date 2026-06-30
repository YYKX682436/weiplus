package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView f117862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView) {
        super(0);
        this.f117862d = finderLiveConfettiView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.widget.ad(this.f117862d), true);
        b4Var.setLogging(false);
        return b4Var;
    }
}

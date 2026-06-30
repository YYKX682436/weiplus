package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, int i17) {
        super(1);
        this.f151267d = musicMvMainUIC;
        this.f151268e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151267d;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "requestSnapshot finished");
        java.util.ArrayList arrayList = musicMvMainUIC.f150977g;
        int i17 = this.f151268e;
        ((lm3.e) arrayList.get(i17)).f319482d.getClass();
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.mv.ui.uic.k2(musicMvMainUIC, i17, null), 2, null);
        musicMvMainUIC.T6().notifyItemChanged(i17, com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.f150973J);
        return jz5.f0.f302826a;
    }
}

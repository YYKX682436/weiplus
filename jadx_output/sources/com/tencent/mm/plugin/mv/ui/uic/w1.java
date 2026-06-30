package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        super(0);
        this.f151510d = musicMvMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f151510d.T6().notifyItemChanged(0, "finderPostListener_onPostEnd");
        return jz5.f0.f302826a;
    }
}

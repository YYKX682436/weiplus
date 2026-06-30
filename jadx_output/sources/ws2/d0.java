package ws2;

/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout f449023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
        super(1);
        this.f449023d = finderLiveReplayPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        jz5.l pair = (jz5.l) obj;
        kotlin.jvm.internal.o.g(pair, "pair");
        com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
        pm0.v.M(str, false, new ws2.c0(this.f449023d, pair), 2, null);
        return jz5.f0.f302826a;
    }
}

package ws2;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout f449017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f449018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout, jz5.l lVar) {
        super(0);
        this.f449017d = finderLiveReplayPluginLayout;
        this.f449018e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ws2.b0 b0Var = (ws2.b0) this.f449017d.business(ws2.b0.class);
        jz5.l lVar = this.f449018e;
        b0Var.O6((java.util.LinkedList) lVar.f302833d, (java.util.LinkedList) lVar.f302834e);
        no0.h.f338720a.b();
        return jz5.f0.f302826a;
    }
}

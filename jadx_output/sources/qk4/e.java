package qk4;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk4.a f364441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qk4.f f364442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qk4.a aVar, qk4.f fVar) {
        super(0);
        this.f364441d = aVar;
        this.f364442e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk4.a aVar = this.f364441d;
        com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout mMRecyclerVideoLayout = (com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout) aVar;
        kk4.v player = mMRecyclerVideoLayout.getPlayer();
        if (player != null) {
            player.f308584i = new qk4.d(this.f364442e, aVar);
        }
        kk4.v player2 = mMRecyclerVideoLayout.getPlayer();
        if (player2 != null) {
            player2.stop();
        }
        return jz5.f0.f302826a;
    }
}

package pk4;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout f356486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout) {
        super(0);
        this.f356486d = mMMvVideoLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout = this.f356486d;
        java.lang.String str = mMMvVideoLayout.f174512d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initEffector finished, currentPlayer:");
        kk4.v currentPlayer = mMMvVideoLayout.getCurrentPlayer();
        sb6.append(currentPlayer != null ? currentPlayer.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return jz5.f0.f302826a;
    }
}

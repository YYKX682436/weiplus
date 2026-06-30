package pk4;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout f356516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout) {
        super(0);
        this.f356516d = mMTPVideoLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout = this.f356516d;
        java.lang.String str = mMTPVideoLayout.f174543d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init effector finished, player:");
        kk4.b player = mMTPVideoLayout.getPlayer();
        sb6.append(player != null ? player.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return jz5.f0.f302826a;
    }
}

package pk4;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout f356521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout) {
        super(1);
        this.f356521d = mMTPVideoLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk4.a aVar;
        dk4.a aVar2;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout mMTPVideoLayout = this.f356521d;
        java.lang.String str = mMTPVideoLayout.f174543d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreatePlayerSurface createVideoTexture finished surface:");
        sb6.append(surfaceTexture != null ? surfaceTexture.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        mMTPVideoLayout.f174549m = surfaceTexture;
        mMTPVideoLayout.f174550n = new android.view.Surface(mMTPVideoLayout.f174549m);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recreatePlayerSurface create playerSurface finished surface:");
        android.view.Surface surface = mMTPVideoLayout.f174550n;
        sb7.append(surface != null ? surface.hashCode() : 0);
        java.lang.String sb8 = sb7.toString();
        java.lang.String str2 = mMTPVideoLayout.f174543d;
        com.tencent.mars.xlog.Log.i(str2, sb8);
        kk4.b player = mMTPVideoLayout.getPlayer();
        int i17 = (player == null || (aVar2 = ((kk4.v) player).f308578c) == null) ? 0 : aVar2.f234485v;
        kk4.b player2 = mMTPVideoLayout.getPlayer();
        int i18 = (player2 == null || (aVar = ((kk4.v) player2).f308578c) == null) ? 0 : aVar.f234486w;
        android.graphics.SurfaceTexture surfaceTexture2 = mMTPVideoLayout.f174549m;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setDefaultBufferSize(i17, i18);
        }
        com.tencent.mars.xlog.Log.i(str2, "recreatePlayerSurface defaultBufferSize:[" + i17 + ',' + i18 + ']');
        kk4.b player3 = mMTPVideoLayout.getPlayer();
        if (player3 != null) {
            kk4.b.h(player3, mMTPVideoLayout.f174550n, false, 2, null);
        }
        return jz5.f0.f302826a;
    }
}

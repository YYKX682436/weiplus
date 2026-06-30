package du2;

/* loaded from: classes2.dex */
public final class m extends android.support.v4.media.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ du2.n f243483c;

    public m(du2.n nVar) {
        this.f243483c = nVar;
    }

    @Override // android.support.v4.media.d
    public void a() {
        android.support.v4.media.session.MediaSessionCompat$Token b17;
        du2.n nVar = this.f243483c;
        nVar.f243486f = false;
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[onConnected] MediaBrowser connected successfully");
        android.support.v4.media.m mVar = nVar.f243488h;
        if (mVar == null || (b17 = mVar.b()) == null) {
            return;
        }
        nVar.f243487g = new android.support.v4.media.session.r(com.tencent.mm.sdk.platformtools.x2.f193071a, b17);
        nVar.Ri();
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[onConnected] MediaController created");
    }

    @Override // android.support.v4.media.d
    public void b() {
        du2.n nVar = this.f243483c;
        nVar.f243486f = false;
        nVar.f243487g = null;
        nVar.f243488h = null;
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "onConnectionFailed");
    }

    @Override // android.support.v4.media.d
    public void c() {
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "onConnectionSuspended");
    }
}

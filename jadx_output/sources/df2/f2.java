package df2;

/* loaded from: classes11.dex */
public final class f2 extends android.support.v4.media.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f230101c;

    public f2(df2.k2 k2Var) {
        this.f230101c = k2Var;
    }

    @Override // android.support.v4.media.d
    public void a() {
        android.support.v4.media.session.MediaSessionCompat$Token b17;
        df2.k2 k2Var = this.f230101c;
        k2Var.f230546o = false;
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onConnected - MediaBrowser connected successfully");
        android.support.v4.media.m mVar = k2Var.f230544m;
        if (mVar != null && (b17 = mVar.b()) != null) {
            k2Var.f230545n = new android.support.v4.media.session.r(com.tencent.mm.sdk.platformtools.x2.f193071a, b17);
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onConnected - MediaController created");
        }
        k2Var.e7();
    }

    @Override // android.support.v4.media.d
    public void b() {
        df2.k2 k2Var = this.f230101c;
        k2Var.f230546o = false;
        k2Var.f230544m = null;
        k2Var.f230545n = null;
        com.tencent.mars.xlog.Log.e("FinderLiveMediaBrowserController", "onConnectionFailed - Connection failed");
    }

    @Override // android.support.v4.media.d
    public void c() {
        com.tencent.mars.xlog.Log.w("FinderLiveMediaBrowserController", "onConnectionSuspended - Connection suspended");
    }
}

package tl4;

/* loaded from: classes11.dex */
public final class m extends android.media.browse.MediaBrowser.ConnectionCallback {
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnected() {
        android.media.session.MediaSession.Token sessionToken;
        tl4.p.f420328c = false;
        android.media.browse.MediaBrowser mediaBrowser = tl4.p.f420326a;
        if (mediaBrowser == null || (sessionToken = mediaBrowser.getSessionToken()) == null) {
            return;
        }
        tl4.p.f420327b = new android.media.session.MediaController(com.tencent.mm.sdk.platformtools.x2.f193071a, sessionToken);
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionFailed() {
        tl4.p.f420328c = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppSessionController", "onConnectionFailed");
        d75.b.g(tl4.n.f420324d);
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionSuspended() {
        super.onConnectionSuspended();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppSessionController", "onConnectionSuspended");
    }
}

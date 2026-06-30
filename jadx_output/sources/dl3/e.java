package dl3;

/* loaded from: classes13.dex */
public class e extends ql.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection f235304a;

    /* renamed from: b, reason: collision with root package name */
    public final n01.b f235305b;

    public e(com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection iMediaHTTPConnection, n01.b bVar) {
        this.f235304a = iMediaHTTPConnection;
        this.f235305b = bVar;
    }

    @Override // ql.c
    public void a() {
        java.net.URL url;
        com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection iMediaHTTPConnection = this.f235304a;
        if (iMediaHTTPConnection != null) {
            try {
                url = new java.net.URL(this.f235305b.f333837b);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.AudioHttpDownloadSource", e17, "connect", new java.lang.Object[0]);
                url = null;
            }
            iMediaHTTPConnection.connect(url, new java.util.HashMap());
        }
    }

    @Override // ql.c
    public n01.b b() {
        return this.f235305b;
    }

    @Override // ql.c
    public java.lang.String c() {
        com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection iMediaHTTPConnection = this.f235304a;
        if (iMediaHTTPConnection != null) {
            return iMediaHTTPConnection.getMIMEType();
        }
        return null;
    }

    @Override // ql.c
    public void disconnect() {
        com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection iMediaHTTPConnection = this.f235304a;
        if (iMediaHTTPConnection != null) {
            iMediaHTTPConnection.disconnect();
        }
    }

    @Override // ql.c
    public long getSize() {
        com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection iMediaHTTPConnection = this.f235304a;
        if (iMediaHTTPConnection != null) {
            return iMediaHTTPConnection.getSize();
        }
        return -1L;
    }

    @Override // ql.c
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection iMediaHTTPConnection = this.f235304a;
        if (iMediaHTTPConnection != null) {
            return iMediaHTTPConnection.readAt(j17, bArr, i17, i18);
        }
        return -1;
    }
}

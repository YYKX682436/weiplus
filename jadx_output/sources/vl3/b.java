package vl3;

/* loaded from: classes13.dex */
public class b implements com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f437882a = new java.util.concurrent.ConcurrentHashMap();

    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.qqmusic.mediaplayer.util.Logger.d("MicroMsg.MMMediaHTTPService", "setReferrer, originUrl: " + str + ", referrer: " + str2);
        if (str2 == null) {
            str2 = "";
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f437882a).put(str, str2);
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService
    public com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection makeHTTPConnection() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i("MicroMsg.MMMediaHTTPService", "makeHTTPConnection");
        return new vl3.a(java.util.Collections.unmodifiableMap(this.f437882a));
    }
}

package ll;

/* loaded from: classes13.dex */
public class k extends android.media.MediaDataSource {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.qqmusic.mediaplayer.upstream.IDataSource f319108d;

    public k(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        this.f319108d = iDataSource;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource = this.f319108d;
        if (iDataSource != null) {
            iDataSource.close();
            this.f319108d = null;
        }
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource = this.f319108d;
        if (iDataSource != null) {
            return iDataSource.getSize();
        }
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource = this.f319108d;
        if (iDataSource != null) {
            return iDataSource.readAt(j17, bArr, i17, i18);
        }
        return -1;
    }
}

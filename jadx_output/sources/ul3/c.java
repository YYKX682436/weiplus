package ul3;

/* loaded from: classes7.dex */
public class c implements com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory {

    /* renamed from: a, reason: collision with root package name */
    public final n01.f f428600a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f428601b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f428602c;

    public c(n01.f fVar) {
        this.f428600a = fVar;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory
    public com.tencent.qqmusic.mediaplayer.upstream.IDataSource createDataSource() {
        java.nio.ByteBuffer byteBuffer = this.f428601b;
        return byteBuffer != null ? new ul3.a(byteBuffer, this.f428602c) : new ul3.b(this.f428600a);
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory
    public com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource createNativeDataSource() {
        return null;
    }

    public c(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        this.f428601b = byteBuffer;
        this.f428602c = str;
    }
}

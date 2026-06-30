package ul3;

/* loaded from: classes7.dex */
public class a implements com.tencent.qqmusic.mediaplayer.upstream.IDataSource {

    /* renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f428595d;

    /* renamed from: e, reason: collision with root package name */
    public long f428596e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f428597f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f428598g;

    public a(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        this.f428595d = byteBuffer;
        this.f428598g = str;
    }

    public boolean a() {
        n01.e eVar = dl3.i.s().V;
        return ((java.util.HashSet) ((dl3.j) eVar).f235334a.f235322o).contains(this.f428598g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f428597f) {
            this.f428595d = null;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        return this.f428595d == null ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT : com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector.getAudioFormat((com.tencent.qqmusic.mediaplayer.upstream.IDataSource) this, false);
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public long getSize() {
        synchronized (this.f428597f) {
            synchronized (dl3.i.s().U) {
                if (this.f428595d == null || !a()) {
                    return -1L;
                }
                return this.f428595d.limit();
            }
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public void open() {
        synchronized (this.f428597f) {
            synchronized (dl3.i.s().U) {
                java.nio.ByteBuffer byteBuffer = this.f428595d;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                }
            }
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        if (this.f428595d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "buffer is null");
            return -1;
        }
        if (getSize() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "getSize <= 0");
            return -1;
        }
        if (bArr == null || bArr.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "bytes is null");
            return -1;
        }
        if (j17 < 0 || i17 < 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "position:%d, offset:%d, size:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return -1;
        }
        if (i17 + i18 > bArr.length) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "offset:%d, size:%d, bytes.length:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bArr.length));
            return -1;
        }
        if (i18 + j17 > getSize()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "position:%d, size:%d, getSize():%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(getSize()));
        }
        if (this.f428596e == 0) {
            this.f428596e = getSize();
        }
        long j18 = this.f428596e;
        if (j18 > 0 && j17 > j18 && i18 > 0) {
            return -1;
        }
        synchronized (this.f428597f) {
            synchronized (dl3.i.s().U) {
                if (this.f428595d == null || !a()) {
                    return -1;
                }
                this.f428595d.position((int) j17);
                if (!this.f428595d.hasRemaining()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "no remaining");
                    return -1;
                }
                int min = java.lang.Math.min(i18, this.f428595d.remaining());
                if (a()) {
                    this.f428595d.get(bArr, i17, min);
                }
                return min;
            }
        }
    }
}

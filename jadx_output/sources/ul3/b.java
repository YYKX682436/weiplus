package ul3;

/* loaded from: classes7.dex */
public class b implements com.tencent.qqmusic.mediaplayer.upstream.IDataSource {

    /* renamed from: d, reason: collision with root package name */
    public final n01.f f428599d;

    public b(n01.f fVar) {
        this.f428599d = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i("MicroMsg.Audio.InputStreamDataSource", "close");
        n01.f fVar = this.f428599d;
        if (fVar != null) {
            fVar.close();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        n01.f fVar = this.f428599d;
        if (fVar == null) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
            return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.i("MicroMsg.Audio.InputStreamDataSource", "getAudioType:" + ((jh1.c) fVar).a());
        int a17 = ((jh1.c) fVar).a();
        if (a17 == 0) {
            return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
        }
        if (a17 == 1) {
            return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.AAC;
        }
        if (a17 == 2) {
            return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.MP3;
        }
        if (a17 == 3) {
            return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.WAV;
        }
        if (a17 == 4) {
            return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.OGG;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
        return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public long getSize() {
        n01.f fVar = this.f428599d;
        if (fVar != null) {
            return fVar.getSize();
        }
        return 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public void open() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i("MicroMsg.Audio.InputStreamDataSource", "open");
        n01.f fVar = this.f428599d;
        if (fVar != null) {
            jh1.c cVar = (jh1.c) fVar;
            cVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAudioDataSource", "open");
            if (cVar.f299801f == null) {
                cVar.f299801f = cVar.b(cVar.f299799d, cVar.f299800e);
            }
            cVar.f299802g = 0L;
            nf.a aVar = cVar.f299801f;
            if (aVar != null) {
                aVar.b(0);
            }
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        n01.f fVar = this.f428599d;
        if (fVar != null) {
            return fVar.readAt(j17, bArr, i17, i18);
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e("MicroMsg.Audio.InputStreamDataSource", "[readAt]audioDataSource is null");
        return -1;
    }
}

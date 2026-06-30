package kh1;

/* loaded from: classes13.dex */
public class g extends kh1.c {
    @Override // kh1.c, kh1.e
    public void a(kh1.d dVar) {
    }

    @Override // kh1.c, kh1.e
    public void b(double d17) {
    }

    @Override // kh1.c, kh1.e
    public void c(int i17) {
    }

    @Override // kh1.e
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.OpusAudioEncoder", "close");
    }

    @Override // kh1.e
    public boolean d(boolean z17, byte[] bArr, int i17) {
        return false;
    }

    @Override // kh1.e
    public void flush() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.OpusAudioEncoder", "flush");
    }

    @Override // kh1.e
    public boolean init(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.OpusAudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d, mOpusEncoder:%b", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), false);
        return false;
    }
}

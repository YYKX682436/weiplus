package ll;

/* loaded from: classes13.dex */
public class f extends ll.d {
    @Override // ll.p
    public void b() {
        kl.k kVar = this.f319084e;
        if (kVar != null) {
            kVar.release();
            this.f319084e = null;
        }
    }

    @Override // ll.d
    public void l() {
        hl.d f17 = f();
        f17.h();
        this.f319084e = new kl.f(f17, 44100, 2, 2, this.f319085f);
        if (com.tencent.mm.audio.mix.jni.AudioFFmpegDecodeJni.decode(44100, 2, 2, this.f319085f, new ll.e(this)) != 0) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "decode fail", null);
            return;
        }
        this.f319084e.b();
        f17.a();
        if (i()) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "flushCache", null);
            this.f319084e.b();
        } else if (!h()) {
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "writeCacheAndPlay", null);
            A(f17);
        } else {
            int i27 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "flushCache and readCacheAndPlay", null);
            this.f319084e.b();
            u();
        }
    }
}

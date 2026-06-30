package v22;

/* loaded from: classes10.dex */
public final class b extends wu3.v1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String videoPath, zv3.b emojiFrameRetriever, int i17) {
        super(videoPath, emojiFrameRetriever);
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(emojiFrameRetriever, "emojiFrameRetriever");
        int i18 = i17 * 20;
        this.f449820k = i18;
        if (i18 > 30) {
            this.f449820k = 30;
        }
        float f17 = this.f449821l / i17;
        this.f449821l = f17;
        float f18 = 1000.0f / this.f449820k;
        this.f449822m = f18;
        if (f18 < f17) {
            this.f449822m = f17;
        }
        this.f449818i = (int) ((this.f449814e / i17) / this.f449822m);
        this.f449819j = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMixFrameSyncMgr", "init MixFrameSyncMgr,videoPath:" + videoPath + ", videoPlayRate:" + i17 + ", fps:" + this.f449813d + ", duration:" + this.f449814e + ", frameCount:" + this.f449812c + ", frameDuration:" + this.f449821l + ", targetFrameRate:" + this.f449820k + ", targetFrameCount:" + this.f449818i + ", targetFrameDuration:" + this.f449822m);
    }
}

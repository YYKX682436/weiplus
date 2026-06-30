package mp4;

/* loaded from: classes10.dex */
public final class c implements com.tencent.mm.xeffect.effect.IStickerDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final wq.d f330468a;

    public c(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        new com.tencent.mm.storage.emotion.EmojiInfo();
        this.f330468a = new wq.b();
        try {
            com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(new org.json.JSONObject(value).optString("emoji_md5"));
            kotlin.jvm.internal.o.f(N, "getEmojiInfoFromMD5(...)");
            this.f330468a = com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.getDecoder(N);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public void destroy() {
        this.f330468a.destroy();
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public long duration() {
        return 1073741824L;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public android.graphics.Bitmap getFrame() {
        wq.d dVar = this.f330468a;
        dVar.c();
        return dVar.getFrame();
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public void seekTo(long j17) {
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public android.util.Size size() {
        wq.d dVar = this.f330468a;
        return new android.util.Size(dVar.e(), dVar.b());
    }
}

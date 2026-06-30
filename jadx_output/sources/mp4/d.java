package mp4;

/* loaded from: classes10.dex */
public final class d implements com.tencent.mm.xeffect.effect.IStickerDecoderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f330469a;

    public d() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f330469a = context;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoderFactory
    public com.tencent.mm.xeffect.effect.IStickerDecoder getDecoder(byte[] bytes) {
        kotlin.jvm.internal.o.g(bytes, "bytes");
        return new mp4.c("test");
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoderFactory
    public com.tencent.mm.xeffect.effect.IStickerDecoder getDecoder(java.lang.String path) {
        java.lang.String optString;
        kotlin.jvm.internal.o.g(path, "path");
        try {
            optString = new org.json.JSONObject(path).optString("scheme");
        } catch (java.lang.Exception unused) {
        }
        if (kotlin.jvm.internal.o.b(optString, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
            return new mp4.b(this.f330469a, path);
        }
        if (kotlin.jvm.internal.o.b(optString, "emoji")) {
            return new mp4.c(path);
        }
        return new mp4.a();
    }
}

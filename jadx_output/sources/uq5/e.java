package uq5;

/* loaded from: classes10.dex */
public final class e implements com.tencent.mm.xeffect.effect.IStickerDecoderFactory {
    @Override // com.tencent.mm.xeffect.effect.IStickerDecoderFactory
    public com.tencent.mm.xeffect.effect.IStickerDecoder getDecoder(java.lang.String path) {
        kotlin.jvm.internal.o.h(path, "path");
        return new uq5.v(path);
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoderFactory
    public com.tencent.mm.xeffect.effect.IStickerDecoder getDecoder(byte[] bytes) {
        kotlin.jvm.internal.o.h(bytes, "bytes");
        return new uq5.v(bytes);
    }
}

package com.tencent.mm.xeffect.effect;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/tencent/mm/xeffect/effect/StickerDecoderFactoryWrapper;", "Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "factory", "(Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;)V", "getFactory", "()Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "getDecoder", "Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "bytes", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "", "renderlib_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes10.dex */
public final class StickerDecoderFactoryWrapper implements com.tencent.mm.xeffect.effect.IStickerDecoderFactory {
    private final com.tencent.mm.xeffect.effect.IStickerDecoderFactory factory;

    public StickerDecoderFactoryWrapper(com.tencent.mm.xeffect.effect.IStickerDecoderFactory factory) {
        kotlin.jvm.internal.o.h(factory, "factory");
        this.factory = factory;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoderFactory
    public com.tencent.mm.xeffect.effect.IStickerDecoder getDecoder(java.lang.String path) {
        kotlin.jvm.internal.o.h(path, "path");
        return new com.tencent.mm.xeffect.effect.StickerDecoderWrapper(this.factory.getDecoder(path));
    }

    public final com.tencent.mm.xeffect.effect.IStickerDecoderFactory getFactory() {
        return this.factory;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoderFactory
    public com.tencent.mm.xeffect.effect.IStickerDecoder getDecoder(byte[] bytes) {
        kotlin.jvm.internal.o.h(bytes, "bytes");
        return new com.tencent.mm.xeffect.effect.StickerDecoderWrapper(this.factory.getDecoder(bytes));
    }
}

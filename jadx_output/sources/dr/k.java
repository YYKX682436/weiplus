package dr;

/* loaded from: classes12.dex */
public final class k extends dr.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.api.IEmojiInfo emojiInfo, dr.q qVar) {
        super(emojiInfo, qVar);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
    }

    @Override // dr.s
    public er.f b() {
        ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).getClass();
        com.tencent.mm.api.IEmojiInfo emojiInfo = this.f242400a;
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        zq.h hVar = zq.h.f474972a;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = (com.tencent.mm.storage.emotion.EmojiInfo) emojiInfo;
        er.f dVar = ((km0.c) gm0.j1.p().a()).a() ? new er.d(emojiInfo2) : new er.j(emojiInfo2);
        dVar.f255936o = er.k.f255941e;
        return dVar;
    }
}

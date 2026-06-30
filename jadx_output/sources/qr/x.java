package qr;

/* loaded from: classes12.dex */
public final class x extends qr.l {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f366051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, qr.i iVar) {
        super(emojiInfo, false, iVar);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f366051g = "MicroMsg.EmojiUploadCheck";
        if (cr.m.b(emojiInfo) || cr.m.a(emojiInfo)) {
            a(0);
            return;
        }
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(emojiInfo.getMd5());
        if (!cr.m.b(u17) && !cr.m.a(u17)) {
            e(new qr.t(this));
        } else {
            n22.m.s(u17, emojiInfo);
            a(0);
        }
    }

    public final void e(yz5.l lVar) {
        new hr.a(1, 0, kz5.b0.c(this.f366019a.getMd5()), null, null, 24, null).l().K(new qr.u(this, lVar));
    }
}

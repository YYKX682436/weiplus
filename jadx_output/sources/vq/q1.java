package vq;

/* loaded from: classes10.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439213d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String obj = com.tencent.mm.sdk.platformtools.b0.a().toString();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo.field_md5 = obj;
        com.tencent.mm.storage.n5.f().c().J0(emojiInfo);
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).U(this.f439213d, emojiInfo, 0, "");
        return jz5.f0.f302826a;
    }
}

package vq;

/* loaded from: classes12.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f439207c;

    public p(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, java.lang.String str, yz5.l lVar) {
        this.f439205a = emojiDebugUI;
        this.f439206b = str;
        this.f439207c = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439205a;
        com.tencent.mars.xlog.Log.i(emojiDebugUI.d, "addEmoji: " + i17 + ", " + i18);
        yz5.l lVar = this.f439207c;
        if (i17 == 0 && i18 == 0) {
            z85.l c17 = com.tencent.mm.storage.n5.f().c();
            java.lang.String str = this.f439206b;
            com.tencent.mm.storage.emotion.EmojiInfo u17 = c17.u1(str);
            int i19 = u17.field_catalog;
            l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
            if (i19 != 81) {
                u17.field_catalog = 81;
                u17.field_reserved3 = com.tencent.mm.storage.n5.f().c().z1() + 1;
                com.tencent.mm.storage.n5.f().c().G2(u17);
                com.tencent.mm.storage.n5.f().c().y2(0, kz5.b0.c(str));
            }
            lVar.invoke(java.lang.Boolean.TRUE);
        } else {
            lVar.invoke(java.lang.Boolean.FALSE);
            pm0.v.X(new vq.o(emojiDebugUI, i17, i18));
        }
        return jz5.f0.f302826a;
    }
}

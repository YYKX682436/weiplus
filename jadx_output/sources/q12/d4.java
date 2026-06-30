package q12;

/* loaded from: classes9.dex */
public class d4 extends com.tencent.mm.sdk.event.n {
    public d4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        android.database.Cursor cursor;
        com.tencent.mm.storage.f9 f9Var = ((com.tencent.mm.autogen.events.UploadEmojiMsgEvent) iEvent).f54930g.f6991a;
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(f9Var.z0());
        if (u17 != null) {
            if (u17.field_type == 1) {
                if (com.tencent.mm.storage.emotion.EmojiInfo.y0(u17.field_catalog)) {
                    ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                    cursor = com.tencent.mm.storage.n5.f().c().S1(u17.field_catalog);
                } else if (u17.field_catalog == 17 && u17.j().length() > 0 && com.tencent.mm.storage.emotion.EmojiInfo.y0(com.tencent.mm.sdk.platformtools.t8.P(u17.j(), 0))) {
                    ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                    cursor = com.tencent.mm.storage.n5.f().c().S1(com.tencent.mm.sdk.platformtools.t8.P(u17.j(), 0));
                } else {
                    cursor = null;
                }
                if (cursor != null) {
                    int R = com.tencent.mm.sdk.platformtools.t8.R(cursor.getCount() - 1, 0);
                    com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                    cursor.moveToPosition(R);
                    emojiInfo.convertFrom(cursor);
                    cursor.close();
                    u17 = emojiInfo;
                }
                ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).fj(f9Var, u17.getMd5());
                f9Var.l1(0);
                com.tencent.mm.storage.y4 y4Var = new com.tencent.mm.storage.y4(f9Var.j());
                y4Var.f196355c = false;
                f9Var.r1(1);
                f9Var.d1(y4Var.d());
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true);
            }
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = u17;
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().Y(f9Var.Q0(), emojiInfo2, f9Var, null, emojiInfo2.K2.ordinal());
        }
        return false;
    }
}

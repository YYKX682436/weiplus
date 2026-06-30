package z12;

/* loaded from: classes12.dex */
public class d implements com.tencent.mm.sdk.platformtools.a4 {
    public d() {
        z12.e.f469282g = 0;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        if (z12.e.f469282g < 100) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().a("17", 6, z12.e.f469282g, "");
            z12.e.f469282g += 2;
            return true;
        }
        z12.e.f469282g = 0;
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        z85.d b17 = com.tencent.mm.storage.n5.f().b();
        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
        emojiGroupInfo.field_productID = "17";
        emojiGroupInfo.field_packName = "emoji_custom_all";
        emojiGroupInfo.field_type = 1;
        emojiGroupInfo.field_sort = 1;
        emojiGroupInfo.field_idx = 0;
        emojiGroupInfo.field_packType = 4;
        emojiGroupInfo.field_packFlag = 1;
        emojiGroupInfo.field_lastUseTime = java.lang.System.currentTimeMillis();
        b17.insert(emojiGroupInfo);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().a("17", 7, z12.e.f469282g, "");
        z12.e.g();
        return false;
    }
}

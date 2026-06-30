package ir;

/* loaded from: classes12.dex */
public abstract class v0 {
    public static final ir.r a() {
        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
        emojiGroupInfo.field_productID = "capture";
        emojiGroupInfo.field_packName = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bwy);
        return new ir.t(1, emojiGroupInfo);
    }

    public static final ir.r b() {
        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
        emojiGroupInfo.field_productID = "custom";
        emojiGroupInfo.field_packName = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bwz);
        return new ir.t(1, emojiGroupInfo);
    }
}

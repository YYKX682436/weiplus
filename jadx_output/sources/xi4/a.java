package xi4;

/* loaded from: classes11.dex */
public abstract class a {
    public static final com.tencent.mm.api.IEmojiInfo a(pj4.z zVar) {
        kotlin.jvm.internal.o.g(zVar, "<this>");
        ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo.field_md5 = b(zVar.f355345d, emojiInfo.getMd5());
        emojiInfo.field_cdnUrl = b(zVar.f355346e, emojiInfo.field_cdnUrl);
        emojiInfo.field_thumbUrl = b(zVar.f355347f, emojiInfo.field_thumbUrl);
        emojiInfo.field_designerID = b(zVar.f355348g, emojiInfo.field_designerID);
        emojiInfo.field_encrypturl = b(zVar.f355349h, emojiInfo.field_encrypturl);
        emojiInfo.field_aeskey = b(zVar.f355350i, emojiInfo.field_aeskey);
        emojiInfo.field_groupId = b(zVar.f355351m, emojiInfo.field_groupId);
        emojiInfo.field_externUrl = b(zVar.f355352n, emojiInfo.field_externUrl);
        emojiInfo.field_externMd5 = b(zVar.f355353o, emojiInfo.field_externMd5);
        emojiInfo.field_activityid = b(zVar.f355354p, emojiInfo.field_activityid);
        emojiInfo.field_attachedText = b(zVar.f355355q, emojiInfo.field_attachedText);
        emojiInfo.field_attachTextColor = b(zVar.f355356r, emojiInfo.field_attachTextColor);
        emojiInfo.field_lensId = b(zVar.f355357s, emojiInfo.field_lensId);
        return emojiInfo;
    }

    public static final java.lang.String b(java.lang.String str, java.lang.String str2) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? str2 == null ? "" : str2 : str;
    }
}

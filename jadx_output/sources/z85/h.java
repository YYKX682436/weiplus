package z85;

/* loaded from: classes7.dex */
public final class h extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f470799f = {l75.n0.getCreateSQLs(com.tencent.mm.storage.emotion.EmojiIPSetInfo.f193892w, "EmojiIPSetInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470800d;

    /* renamed from: e, reason: collision with root package name */
    public final jt0.j f470801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l75.k0 db6) {
        super(db6, com.tencent.mm.storage.emotion.EmojiIPSetInfo.f193892w, "EmojiIPSetInfo", null);
        kotlin.jvm.internal.o.g(db6, "db");
        z85.g gVar = com.tencent.mm.storage.emotion.EmojiIPSetInfo.f193891v;
        this.f470800d = db6;
        this.f470801e = new jt0.j(100);
    }

    public final com.tencent.mm.storage.emotion.EmojiIPSetInfo y0(java.lang.String str) {
        if (str == null) {
            return null;
        }
        jt0.j jVar = this.f470801e;
        com.tencent.mm.storage.emotion.EmojiIPSetInfo emojiIPSetInfo = (com.tencent.mm.storage.emotion.EmojiIPSetInfo) jVar.get(str);
        if (emojiIPSetInfo != null) {
            return emojiIPSetInfo;
        }
        com.tencent.mm.storage.emotion.EmojiIPSetInfo emojiIPSetInfo2 = new com.tencent.mm.storage.emotion.EmojiIPSetInfo();
        emojiIPSetInfo2.field_key = str;
        super.get(emojiIPSetInfo2, getPrimaryKey());
        java.lang.String str2 = emojiIPSetInfo2.field_title;
        com.tencent.mm.storage.emotion.EmojiIPSetInfo emojiIPSetInfo3 = str2 == null || str2.length() == 0 ? null : emojiIPSetInfo2;
        if (emojiIPSetInfo3 != null) {
            jVar.put(emojiIPSetInfo3.field_key, emojiIPSetInfo3);
        }
        return emojiIPSetInfo3;
    }

    public final void z0(com.tencent.mm.storage.emotion.EmojiIPSetInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f470801e.put(info.field_key, info);
        super.replace(info);
    }
}

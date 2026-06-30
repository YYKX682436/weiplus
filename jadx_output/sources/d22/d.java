package d22;

/* loaded from: classes9.dex */
public final class d extends qk.a7 implements d22.v {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f225830n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f225831o;

    /* renamed from: p, reason: collision with root package name */
    public final long f225832p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener f225833q;

    public d(java.lang.String md52, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(md52, "md5");
        this.f225830n = md52;
        this.f225831o = emojiInfo;
        this.f225832p = java.lang.System.currentTimeMillis();
        if (emojiInfo == null) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            this.f225831o = com.tencent.mm.storage.n5.f().c().u1(md52);
        }
        this.f364155a = 40;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = this.f225831o;
        if (emojiInfo2 == null || emojiInfo2.A0()) {
            return;
        }
        emojiInfo2.field_groupId = "";
    }

    @Override // d22.v
    public boolean a() {
        return false;
    }

    @Override // d22.v
    public d22.p b() {
        return new d22.e();
    }

    @Override // d22.v
    public boolean isValid() {
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo;
        java.lang.String str = this.f225830n;
        if ((str.length() == 0) || (emojiInfo = this.f225831o) == null) {
            return false;
        }
        return kotlin.jvm.internal.o.b(str, emojiInfo != null ? emojiInfo.getMd5() : null);
    }
}

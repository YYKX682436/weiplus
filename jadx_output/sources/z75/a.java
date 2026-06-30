package z75;

/* loaded from: classes15.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f470618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f470619e;

    public a(long j17, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f470618d = j17;
        this.f470619e = emojiInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct relatedEmoticonActionStruct = new com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct();
        relatedEmoticonActionStruct.f59953d = z75.c.f470622a;
        relatedEmoticonActionStruct.f59954e = 4L;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = z75.c.f470623b;
        relatedEmoticonActionStruct.r(emojiInfo != null ? emojiInfo.field_groupId : null);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = z75.c.f470623b;
        relatedEmoticonActionStruct.q(emojiInfo2 != null ? emojiInfo2.getMd5() : null);
        relatedEmoticonActionStruct.f59959j = this.f470618d;
        relatedEmoticonActionStruct.f59960k = 4L;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = this.f470619e;
        relatedEmoticonActionStruct.f59957h = relatedEmoticonActionStruct.b("Pid", emojiInfo3.field_groupId, true);
        relatedEmoticonActionStruct.f59958i = relatedEmoticonActionStruct.b("Md5", emojiInfo3.getMd5(), true);
        relatedEmoticonActionStruct.f59961l = relatedEmoticonActionStruct.b("IsFree2", java.lang.String.valueOf(emojiInfo3.G2), true);
        relatedEmoticonActionStruct.f59963n = relatedEmoticonActionStruct.b("IsLocal2", gr.t.g().j(emojiInfo3) ? "2" : "1", true);
        if (n22.m.p(emojiInfo3)) {
            relatedEmoticonActionStruct.f59962m = relatedEmoticonActionStruct.b("Type2", "1", true);
        } else {
            relatedEmoticonActionStruct.f59962m = relatedEmoticonActionStruct.b("Type2", "2", true);
        }
        relatedEmoticonActionStruct.p(z75.c.f470624c);
        relatedEmoticonActionStruct.k();
    }
}

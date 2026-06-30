package z75;

/* loaded from: classes15.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f470620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f470621e;

    public b(long j17, java.util.ArrayList arrayList) {
        this.f470620d = j17;
        this.f470621e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct relatedEmoticonActionStruct = new com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct();
        relatedEmoticonActionStruct.f59953d = z75.c.f470622a;
        relatedEmoticonActionStruct.f59954e = 3L;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = z75.c.f470623b;
        relatedEmoticonActionStruct.r(emojiInfo != null ? emojiInfo.field_groupId : null);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = z75.c.f470623b;
        relatedEmoticonActionStruct.q(emojiInfo2 != null ? emojiInfo2.getMd5() : null);
        relatedEmoticonActionStruct.f59959j = this.f470620d;
        relatedEmoticonActionStruct.f59960k = 4L;
        relatedEmoticonActionStruct.f59957h = relatedEmoticonActionStruct.b("Pid", "", true);
        relatedEmoticonActionStruct.f59958i = relatedEmoticonActionStruct.b("Md5", "", true);
        relatedEmoticonActionStruct.f59961l = relatedEmoticonActionStruct.b("IsFree2", "", true);
        relatedEmoticonActionStruct.f59962m = relatedEmoticonActionStruct.b("Type2", "", true);
        relatedEmoticonActionStruct.f59963n = relatedEmoticonActionStruct.b("IsLocal2", "", true);
        for (com.tencent.mm.api.IEmojiInfo iEmojiInfo : this.f470621e) {
            relatedEmoticonActionStruct.f59957h = relatedEmoticonActionStruct.b("Pid", relatedEmoticonActionStruct.f59957h + iEmojiInfo.getGroupId() + '#', true);
            relatedEmoticonActionStruct.f59958i = relatedEmoticonActionStruct.b("Md5", relatedEmoticonActionStruct.f59958i + iEmojiInfo.getMd5() + '#', true);
            relatedEmoticonActionStruct.f59961l = relatedEmoticonActionStruct.b("IsFree2", relatedEmoticonActionStruct.f59961l + iEmojiInfo.x1() + '#', true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(relatedEmoticonActionStruct.f59963n);
            sb6.append(gr.t.g().j(iEmojiInfo) ? "2" : "1");
            sb6.append('#');
            relatedEmoticonActionStruct.f59963n = relatedEmoticonActionStruct.b("IsLocal2", sb6.toString(), true);
            if (n22.m.p(iEmojiInfo)) {
                relatedEmoticonActionStruct.f59962m = relatedEmoticonActionStruct.b("Type2", relatedEmoticonActionStruct.f59962m + "1#", true);
            } else {
                relatedEmoticonActionStruct.f59962m = relatedEmoticonActionStruct.b("Type2", relatedEmoticonActionStruct.f59962m + "2#", true);
            }
        }
        relatedEmoticonActionStruct.p(z75.c.f470624c);
        relatedEmoticonActionStruct.k();
    }
}

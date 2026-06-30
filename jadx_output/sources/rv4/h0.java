package rv4;

/* loaded from: classes12.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    public final rv4.i0 a(java.lang.String word, java.lang.String query, java.lang.String tagTitle, java.lang.String docInfo, int i17, java.lang.String firstImgUrl, java.lang.String secondImgUrl, int i18, java.lang.String mixerCommonContext, java.util.List friendNicknames, java.util.List friendHeadImgUrls) {
        kotlin.jvm.internal.o.g(word, "word");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(tagTitle, "tagTitle");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        kotlin.jvm.internal.o.g(firstImgUrl, "firstImgUrl");
        kotlin.jvm.internal.o.g(secondImgUrl, "secondImgUrl");
        kotlin.jvm.internal.o.g(mixerCommonContext, "mixerCommonContext");
        kotlin.jvm.internal.o.g(friendNicknames, "friendNicknames");
        kotlin.jvm.internal.o.g(friendHeadImgUrls, "friendHeadImgUrls");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kotlin.jvm.internal.o.d(uuid);
        return new rv4.i0(word, query, tagTitle, null, null, uuid, 0, mixerCommonContext, 0, 0, null, i17, 0, currentTimeMillis, 0, null, docInfo, firstImgUrl, secondImgUrl, i18, friendNicknames, friendHeadImgUrls, 55128, null);
    }
}

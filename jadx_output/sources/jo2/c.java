package jo2;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.plugin.finder.model.BaseFinderFeed {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String finderAuthorUsername, java.lang.String memberTitle, com.tencent.mm.plugin.finder.storage.FinderItem feedObject, int i17) {
        super(feedObject);
        kotlin.jvm.internal.o.g(finderAuthorUsername, "finderAuthorUsername");
        kotlin.jvm.internal.o.g(memberTitle, "memberTitle");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.c
    public int h() {
        return -18;
    }
}

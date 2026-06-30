package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class li implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ri f123961a;

    public li(com.tencent.mm.plugin.finder.profile.uic.ri riVar) {
        this.f123961a = riVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader = this.f123961a.f124196o;
        if (finderProfileTingSongListLoader != null) {
            return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(finderProfileTingSongListLoader, false, 1, null);
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }
}

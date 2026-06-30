package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ec extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ic f123666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(com.tencent.mm.plugin.finder.profile.uic.ic icVar) {
        super(1);
        this.f123666d = icVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List incrementList = it.getIncrementList();
        int size = incrementList != null ? incrementList.size() : 0;
        com.tencent.mm.plugin.finder.profile.uic.ic icVar = this.f123666d;
        if (size > 0) {
            com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(icVar, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADED, null, 2, null);
        } else {
            com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(icVar, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.EMPTY, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}

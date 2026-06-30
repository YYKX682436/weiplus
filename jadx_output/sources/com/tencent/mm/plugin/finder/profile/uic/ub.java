package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ub extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.yb f124263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(com.tencent.mm.plugin.finder.profile.uic.yb ybVar) {
        super(1);
        this.f124263d = ybVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.profile.uic.yb ybVar = this.f124263d;
        if (ybVar.O6().getDataList().isEmpty()) {
            com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(ybVar, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.EMPTY, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}

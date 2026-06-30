package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ji extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ri f123864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(com.tencent.mm.plugin.finder.profile.uic.ri riVar) {
        super(0);
        this.f123864d = riVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.ri riVar = this.f123864d;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) riVar.f124194m).getValue();
        kotlin.jvm.internal.o.f(finderRefreshLayout, "access$getRlLayout(...)");
        return new com.tencent.mm.plugin.finder.profile.uic.ii(riVar, finderRefreshLayout);
    }
}

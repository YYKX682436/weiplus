package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Void;", "it", "Ljz5/f0;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFollowListContract$FollowListPresent$handleGetFollowListResp$1$1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent f122611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f122612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListPresent$handleGetFollowListResp$1$1(com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent, java.util.LinkedList linkedList) {
        super(1);
        this.f122611d = followListPresent;
        this.f122612e = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent = this.f122611d;
        followListPresent.f122604h.a();
        followListPresent.f122604h.c(this.f122612e);
        return jz5.f0.f302826a;
    }
}

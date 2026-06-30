package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr45/k61;", "request", "Lr45/l61;", "resp", "Ljz5/f0;", "invoke", "(Lr45/k61;Lr45/l61;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFollowListContract$FollowListPresent$doGetFollowScene$1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent f122609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListPresent$doGetFollowScene$1(com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent) {
        super(2);
        this.f122609d = followListPresent;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.k61 request = (r45.k61) obj;
        r45.l61 resp = (r45.l61) obj2;
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent = this.f122609d;
        com.tencent.mm.protobuf.g byteString = request.getByteString(1);
        com.tencent.mm.protobuf.g byteString2 = resp.getByteString(2);
        java.util.LinkedList list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getContactList(...)");
        followListPresent.f(true, byteString, byteString2, list, resp.getInteger(3) != 0);
        return jz5.f0.f302826a;
    }
}

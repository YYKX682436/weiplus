package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/FinderContact;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinderFollowListContract$FollowListPresent$loadStart$2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent f122618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListPresent$loadStart$2(com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent) {
        super(1);
        this.f122618d = followListPresent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListPresent followListPresent = this.f122618d;
        com.tencent.mm.protobuf.g gVar = followListPresent.f122602f;
        if (gVar != null) {
            return gVar;
        }
        if (linkedList == null) {
            return null;
        }
        java.util.ArrayList arrayList = followListPresent.f122603g;
        if (arrayList.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new so2.v1(ya2.d.h((com.tencent.mm.protocal.protobuf.FinderContact) it.next(), null, false, 3, null)));
            }
            arrayList.addAll(arrayList2);
            com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = followListPresent.f122601e;
            if (followListViewCallback == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            followListViewCallback.o(false, 0, arrayList.size());
        }
        return jz5.f0.f302826a;
    }
}

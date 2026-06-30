package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr45/x41;", "it", "Ljz5/f0;", "invoke", "(Lr45/x41;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderBlockListContract$BlockListPresenter$doScene$1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter f122569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBlockListContract$BlockListPresenter$doScene$1(com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter) {
        super(1);
        this.f122569d = blockListPresenter;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.x41 it = (r45.x41) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> list = it.getList(1);
        if (list != null) {
            for (com.tencent.mm.protocal.protobuf.FinderContact finderContact : list) {
                kotlin.jvm.internal.o.d(finderContact);
                arrayList.add(new so2.i0(finderContact));
            }
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter = this.f122569d;
        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback = blockListPresenter.f122566e;
        if (blockListViewCallback != null) {
            blockListViewCallback.l(arrayList, blockListPresenter.f122568g == null);
        }
        blockListPresenter.f122568g = it.getByteString(2);
        return jz5.f0.f302826a;
    }
}

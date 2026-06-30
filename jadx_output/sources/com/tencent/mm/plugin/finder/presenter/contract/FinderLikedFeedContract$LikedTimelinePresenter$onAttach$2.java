package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "firstItemPos", "lastItemPos", "Ljava/util/LinkedList;", "Lso2/j5;", "invoke", "(II)Ljava/util/LinkedList;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLikedFeedContract$LikedTimelinePresenter$onAttach$2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter f122700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLikedFeedContract$LikedTimelinePresenter$onAttach$2(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter) {
        super(2);
        this.f122700d = likedTimelinePresenter;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        return ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Vi(this.f122700d.f122646g, intValue, intValue2);
    }
}

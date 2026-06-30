package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BaseFinderLotteryContract$ViewCallback$initView$2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback f122562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFinderLotteryContract$ViewCallback$initView$2(com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback) {
        super(0);
        this.f122562d = viewCallback;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f122562d.f122557e.f122551d.requestRefresh();
        return jz5.f0.f302826a;
    }
}

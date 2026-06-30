package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class FinderFollowListContract$FollowListPresent$handleGetFollowListResp$3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f122616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListPresent$handleGetFollowListResp$3(kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f122616d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f122616d.f310123d;
        if (runnable != null) {
            runnable.run();
        }
        return jz5.f0.f302826a;
    }
}

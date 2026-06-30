package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@qz5.f(c = "com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$5", f = "FinderFollowListContract.kt", l = {}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "count", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFollowListContract$FollowListViewCallback$initView$5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f122635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback f122636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListViewCallback$initView$5(com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f122636e = followListViewCallback;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$5 finderFollowListContract$FollowListViewCallback$initView$5 = new com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$5(this.f122636e, continuation);
        finderFollowListContract$FollowListViewCallback$initView$5.f122635d = ((java.lang.Number) obj).intValue();
        return finderFollowListContract$FollowListViewCallback$initView$5;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$5 finderFollowListContract$FollowListViewCallback$initView$5 = (com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$5) create(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()), (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        finderFollowListContract$FollowListViewCallback$initView$5.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f122635d;
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = this.f122636e;
        java.lang.String string = followListViewCallback.getResources().getString(com.tencent.mm.R.string.m8z, java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.MMActivity mMActivity = followListViewCallback.f122620d;
        mMActivity.setMMTitle(string);
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            mMActivity.setMMSubTitle(followListViewCallback.getResources().getString(com.tencent.mm.R.string.f6s));
        }
        if (i17 == 0) {
            android.widget.TextView textView = followListViewCallback.f122624h;
            if (textView == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = followListViewCallback.f122624h;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView2.setText(mMActivity.getString(com.tencent.mm.R.string.cxi));
        } else {
            android.widget.TextView textView3 = followListViewCallback.f122624h;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView3.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}

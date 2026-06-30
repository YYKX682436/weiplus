package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/modelbase/f;", "Lr45/n81;", "cgiBack", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/modelbase/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMsgContract$MsgPresenter$doScene$2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter f122839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f122840e;

    @qz5.f(c = "com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2$1", f = "FinderMsgContract.kt", l = {}, m = "invokeSuspend")
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass1 extends qz5.l implements yz5.p {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter f122841d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.f122841d = msgPresenter;
        }

        @Override // qz5.a
        public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2.AnonymousClass1(this.f122841d, continuation);
        }

        @Override // yz5.p
        public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2.AnonymousClass1 anonymousClass1 = (com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2.AnonymousClass1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
            jz5.f0 f0Var = jz5.f0.f302826a;
            anonymousClass1.invokeSuspend(f0Var);
            return f0Var;
        }

        @Override // qz5.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            pz5.a aVar = pz5.a.f359186d;
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f122841d;
            final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = msgPresenter.f122827h;
            if (msgViewCallback != null) {
                final boolean isEmpty = msgPresenter.f122828i.isEmpty();
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2$1$1$runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z17 = isEmpty;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback2 = msgViewCallback;
                        if (z17) {
                            pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$showRefreshTip$1(msgViewCallback2.getResources().getString(com.tencent.mm.R.string.f491897el4), msgViewCallback2, true, msgViewCallback2.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
                        }
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = msgViewCallback2.f122863m;
                        if (refreshLoadMoreLayout != null) {
                            refreshLoadMoreLayout.P(0);
                        } else {
                            kotlin.jvm.internal.o.o("rlLayout");
                            throw null;
                        }
                    }
                };
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.getClass();
                long j17 = uptimeMillis - com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122821b;
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (j17 >= ((java.lang.Number) t70Var.F2().r()).longValue()) {
                    runnable.run();
                } else {
                    long longValue = ((java.lang.Number) t70Var.F2().r()).longValue() - j17;
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(runnable, longValue);
                }
            }
            return jz5.f0.f302826a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgPresenter$doScene$2(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter, kotlinx.coroutines.y0 y0Var) {
        super(1);
        this.f122839d = msgPresenter;
        this.f122840e = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f122839d;
        java.lang.String str = msgPresenter.f122826g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(", errCode ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(" errMsg ");
        sb6.append(fVar != null ? fVar.f70617c : null);
        sb6.append(" requestScene ");
        sb6.append(msgPresenter.f122824e);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlinx.coroutines.y0 y0Var = this.f122840e;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$2.AnonymousClass1(msgPresenter, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/modelbase/f;", "Lr45/n81;", "cgiBack", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/modelbase/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderNotifyContract$NotifyPresenter$doScene$2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f123031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f123032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f123033g;

    @qz5.f(c = "com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$2$1", f = "FinderNotifyContract.kt", l = {}, m = "invokeSuspend")
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$2$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass1 extends qz5.l implements yz5.p {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123034d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f123035e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f123036f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter, int i17, int i18, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.f123034d = notifyPresenter;
            this.f123035e = i17;
            this.f123036f = i18;
        }

        @Override // qz5.a
        public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$2.AnonymousClass1(this.f123034d, this.f123035e, this.f123036f, continuation);
        }

        @Override // yz5.p
        public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$2.AnonymousClass1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        }

        @Override // qz5.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final int i17;
            pz5.a aVar = pz5.a.f359186d;
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = this.f123035e;
            final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123034d;
            if (i18 != 1) {
                int[] iArr = notifyPresenter.f123005e;
                int length = iArr.length;
                int i19 = 0;
                int i27 = 0;
                while (true) {
                    if (i27 >= length) {
                        i17 = -1;
                        break;
                    }
                    int i28 = i19 + 1;
                    if (i18 == iArr[i27]) {
                        i17 = i19;
                        break;
                    }
                    i27++;
                    i19 = i28;
                }
            } else {
                notifyPresenter.getClass();
                i17 = this.f123036f;
            }
            jz5.f0 f0Var = jz5.f0.f302826a;
            java.lang.String str = notifyPresenter.f123007g;
            if (i17 < 0) {
                com.tencent.mars.xlog.Log.w(str, "not my scene or type, ignore");
                return f0Var;
            }
            final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback g17 = notifyPresenter.g(i17);
            if (g17 != null) {
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$refreshEmpty$runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter.this.f(i17).isEmpty()) {
                            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = g17;
                            pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$showRefreshTip$1(notifyViewCallback.getResources().getString(com.tencent.mm.R.string.f491897el4), notifyViewCallback, true, notifyViewCallback.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
                        }
                    }
                };
                long uptimeMillis = android.os.SystemClock.uptimeMillis() - com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.f123002a.a(i17);
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (uptimeMillis >= ((java.lang.Number) t70Var.F2().r()).longValue()) {
                    runnable.run();
                } else {
                    long longValue = ((java.lang.Number) t70Var.F2().r()).longValue() - uptimeMillis;
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(runnable, longValue);
                }
            } else {
                com.tencent.mars.xlog.Log.w(str, "viewCallback is null, index:" + i17 + " viewCallbacks.size:" + notifyPresenter.f123012o.size());
            }
            return f0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyPresenter$doScene$2(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter, int i17, kotlinx.coroutines.y0 y0Var, int i18) {
        super(1);
        this.f123030d = notifyPresenter;
        this.f123031e = i17;
        this.f123032f = y0Var;
        this.f123033g = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123030d;
        java.lang.String str = notifyPresenter.f123007g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(", errCode ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(" errMsg ");
        sb6.append(fVar != null ? fVar.f70617c : null);
        sb6.append(" requestScene ");
        int i17 = this.f123031e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlinx.coroutines.y0 y0Var = this.f123032f;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$2.AnonymousClass1(notifyPresenter, i17, this.f123033g, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

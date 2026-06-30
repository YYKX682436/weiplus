package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderNotifyContract$NotifyPresenter$newLoadDataAndRefresh$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f123062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f123064g;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$newLoadDataAndRefresh$1$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123065d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f123066e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ java.util.ArrayList f123067f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f123068g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter, int i17, java.util.ArrayList arrayList, boolean z17) {
            super(0);
            this.f123065d = notifyPresenter;
            this.f123066e = i17;
            this.f123067f = arrayList;
            this.f123068g = z17;
        }

        @Override // yz5.a
        public java.lang.Object invoke() {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123065d;
            int i17 = this.f123066e;
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback g17 = notifyPresenter.g(i17);
            if (g17 != null) {
                g17.t(this.f123067f, this.f123068g, false, i17);
            }
            return jz5.f0.f302826a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyPresenter$newLoadDataAndRefresh$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter, java.util.ArrayList arrayList, int i17, boolean z17) {
        super(0);
        this.f123061d = notifyPresenter;
        this.f123062e = arrayList;
        this.f123063f = i17;
        this.f123064g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123061d;
        java.lang.String str = notifyPresenter.f123007g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tobe mergeData from db data from DB:");
        java.util.ArrayList arrayList = this.f123062e;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract finderNotifyContract = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.f123002a;
        int i17 = this.f123063f;
        long a17 = uptimeMillis - finderNotifyContract.a(i17);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        pm0.v.V(a17 >= ((java.lang.Number) t70Var.F2().r()).longValue() ? 0L : ((java.lang.Number) t70Var.F2().r()).longValue() - a17, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$newLoadDataAndRefresh$1.AnonymousClass1(notifyPresenter, i17, arrayList, this.f123064g));
        return jz5.f0.f302826a;
    }
}

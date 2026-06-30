package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f123045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f123047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f123048h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f123049i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f123050m;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123051d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f123052e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ java.util.ArrayList f123053f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f123054g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f123055h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter, int i17, java.util.ArrayList arrayList, boolean z17, boolean z18) {
            super(0);
            this.f123051d = notifyPresenter;
            this.f123052e = i17;
            this.f123053f = arrayList;
            this.f123054g = z17;
            this.f123055h = z18;
        }

        @Override // yz5.a
        public java.lang.Object invoke() {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123051d;
            int i17 = this.f123052e;
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback g17 = notifyPresenter.g(i17);
            if (g17 != null) {
                g17.t(this.f123053f, this.f123054g, this.f123055h, i17);
            }
            return jz5.f0.f302826a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter, long j17, int i17, int i18, boolean z17, boolean z18, boolean z19) {
        super(0);
        this.f123044d = notifyPresenter;
        this.f123045e = j17;
        this.f123046f = i17;
        this.f123047g = i18;
        this.f123048h = z17;
        this.f123049i = z18;
        this.f123050m = z19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List b17;
        long j17;
        long j18 = this.f123045e;
        int i17 = this.f123047g;
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f123044d;
        notifyPresenter.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        cu2.a0 a0Var = cu2.b0.f222371a;
        int i18 = this.f123046f;
        java.util.ArrayList arrayList2 = notifyPresenter.f123006f;
        int[] iArr = (i18 >= 0 && i18 < arrayList2.size() ? arrayList2 : null) != null ? (int[]) arrayList2.get(i18) : null;
        b17 = a0Var.b(j18, i17, (r18 & 4) != 0 ? new int[0] : iArr == null ? new int[0] : iArr, notifyPresenter.f123004d, (java.lang.String) ((jz5.n) notifyPresenter.f123016s).getValue(), (r18 & 32) != 0 ? 0 : 0);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            so2.i j19 = a0Var.j((dm.pd) it.next());
            if (j19 != null) {
                arrayList3.add(j19);
            }
        }
        java.lang.String str = "loadMoreData mentionId:" + j18 + " limit:" + i17 + " list:" + arrayList3.size();
        java.lang.String str2 = notifyPresenter.f123007g;
        com.tencent.mars.xlog.Log.i(str2, str);
        arrayList.addAll(arrayList3);
        com.tencent.mars.xlog.Log.i(str2, "tobe mergeData from db data from DB:" + arrayList.size());
        if (this.f123048h) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.f123002a.a(i18);
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (uptimeMillis < ((java.lang.Number) t70Var.F2().r()).longValue()) {
                j17 = ((java.lang.Number) t70Var.F2().r()).longValue() - uptimeMillis;
                pm0.v.V(j17, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1.AnonymousClass1(this.f123044d, this.f123046f, arrayList, this.f123049i, this.f123050m));
                return jz5.f0.f302826a;
            }
        }
        j17 = 0;
        pm0.v.V(j17, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1.AnonymousClass1(this.f123044d, this.f123046f, arrayList, this.f123049i, this.f123050m));
        return jz5.f0.f302826a;
    }
}

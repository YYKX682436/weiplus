package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lr45/n81;", "<anonymous parameter 0>", "Ljava/util/LinkedList;", "Ldm/pd;", "newMenList", "Lr45/qk4;", "lastReadInfo", "Ljz5/f0;", "invoke", "(Lr45/n81;Ljava/util/LinkedList;Lr45/qk4;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderNotifyContract$NotifyPresenter$doScene$1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f123021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f123024g;

    @qz5.f(c = "com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$1$1", f = "FinderNotifyContract.kt", l = {}, m = "invokeSuspend")
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$1$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass1 extends qz5.l implements yz5.p {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f123025d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f123026e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f123027f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ java.util.LinkedList f123028g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ r45.qk4 f123029h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter, int i17, int i18, java.util.LinkedList linkedList, r45.qk4 qk4Var, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.f123025d = notifyPresenter;
            this.f123026e = i17;
            this.f123027f = i18;
            this.f123028g = linkedList;
            this.f123029h = qk4Var;
        }

        @Override // qz5.a
        public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$1.AnonymousClass1(this.f123025d, this.f123026e, this.f123027f, this.f123028g, this.f123029h, continuation);
        }

        @Override // yz5.p
        public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$1.AnonymousClass1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01a9  */
        @Override // qz5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyPresenter$doScene$1(kotlinx.coroutines.y0 y0Var, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter, int i17, int i18) {
        super(3);
        this.f123021d = y0Var;
        this.f123022e = notifyPresenter;
        this.f123023f = i17;
        this.f123024g = i18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.LinkedList newMenList = (java.util.LinkedList) obj2;
        r45.qk4 qk4Var = (r45.qk4) obj3;
        kotlin.jvm.internal.o.g((r45.n81) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(newMenList, "newMenList");
        kotlinx.coroutines.y0 y0Var = this.f123021d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$doScene$1.AnonymousClass1(this.f123022e, this.f123023f, this.f123024g, newMenList, qk4Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

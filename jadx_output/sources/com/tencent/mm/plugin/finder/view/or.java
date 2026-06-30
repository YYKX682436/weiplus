package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class or extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f132802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f132803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f132804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f132805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, yz5.p pVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f132803e = loadingSwitchBtn;
        this.f132804f = pVar;
        this.f132805g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.or(this.f132803e, this.f132804f, this.f132805g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.or) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f132802d;
        boolean z17 = this.f132805g;
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn = this.f132803e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i(loadingSwitchBtn.R, "startLoading");
            az2.f loadingComponent = loadingSwitchBtn.getLoadingComponent();
            if (loadingComponent != null) {
                loadingComponent.a();
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            this.f132802d = 1;
            obj = this.f132804f.invoke(valueOf, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        az2.f loadingComponent2 = loadingSwitchBtn.getLoadingComponent();
        if (loadingComponent2 != null) {
            loadingComponent2.b();
        }
        com.tencent.mars.xlog.Log.i(loadingSwitchBtn.R, "endLoading");
        loadingSwitchBtn.setEnabled(true);
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.i(loadingSwitchBtn.R, "reset state");
            loadingSwitchBtn.setCheck(!z17);
        }
        return jz5.f0.f302826a;
    }
}

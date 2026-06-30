package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ta0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ya0 f136006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f136007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f136008f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(com.tencent.mm.plugin.finder.viewmodel.component.ya0 ya0Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136006d = ya0Var;
        this.f136007e = i17;
        this.f136008f = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.ta0(this.f136006d, this.f136007e, this.f136008f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.ta0 ta0Var = (com.tencent.mm.plugin.finder.viewmodel.component.ta0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ta0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f136006d.O6();
        com.tencent.mars.xlog.Log.i("FinderWifiHintUIC", "[onSIMCardChange] simType:" + this.f136007e + " reason:" + this.f136008f + "  " + java.lang.Thread.currentThread().getName());
        return jz5.f0.f302826a;
    }
}

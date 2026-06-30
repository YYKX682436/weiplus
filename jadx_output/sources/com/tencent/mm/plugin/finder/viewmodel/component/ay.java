package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class ay extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.tx f133809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f133810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f133811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f133812g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(com.tencent.mm.plugin.finder.viewmodel.component.tx txVar, android.content.Context context, int i17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f133809d = txVar;
        this.f133810e = context;
        this.f133811f = i17;
        this.f133812g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.ay(this.f133809d, this.f133810e, this.f133811f, this.f133812g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.ay ayVar = (com.tencent.mm.plugin.finder.viewmodel.component.ay) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ayVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.tx txVar = this.f133809d;
        if (txVar.f136065c) {
            com.tencent.mm.plugin.finder.viewmodel.component.dy dyVar = com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a;
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.zx(txVar, this.f133810e, this.f133811f));
        } else {
            this.f133812g.invoke();
        }
        return jz5.f0.f302826a;
    }
}

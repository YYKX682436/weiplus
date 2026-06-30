package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.a2 f150200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f150201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f150202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f150203g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f150204h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.plugin.multitalk.model.a2 a2Var, byte[] bArr, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f150200d = a2Var;
        this.f150201e = bArr;
        this.f150202f = i17;
        this.f150203g = i18;
        this.f150204h = i19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.multitalk.model.x1(this.f150200d, this.f150201e, this.f150202f, this.f150203g, this.f150204h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.multitalk.model.x1 x1Var = (com.tencent.mm.plugin.multitalk.model.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cj3.n nVar = this.f150200d.f149876b;
        if (nVar != null) {
            byte[] buffer = this.f150201e;
            kotlin.jvm.internal.o.g(buffer, "buffer");
            ((cj3.a) ((jz5.n) nVar.f41901e).getValue()).getClass();
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.D(buffer, this.f150202f, this.f150203g, md1.s.CTRL_INDEX);
        }
        return jz5.f0.f302826a;
    }
}

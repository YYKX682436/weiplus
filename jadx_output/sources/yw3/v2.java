package yw3;

/* loaded from: classes9.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f466908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g75.z f466909e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI, g75.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466908d = repairerImageLoaderDemoUI;
        this.f466909e = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.v2(this.f466908d, this.f466909e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw3.v2 v2Var = (yw3.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gk0.j.b((gk0.j) ((jz5.n) this.f466908d.g).getValue(), this.f466909e, null, 2, null);
        return jz5.f0.f302826a;
    }
}

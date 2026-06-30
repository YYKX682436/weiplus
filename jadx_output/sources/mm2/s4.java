package mm2;

/* loaded from: classes3.dex */
public final class s4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f329413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.v4 f329414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(xg2.h hVar, kotlin.coroutines.Continuation continuation, mm2.v4 v4Var) {
        super(2, continuation);
        this.f329413d = hVar;
        this.f329414e = v4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.s4(this.f329413d, continuation, this.f329414e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mm2.s4 s4Var = (mm2.s4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f329413d).f454381b;
        com.tencent.mars.xlog.Log.i(this.f329414e.f329476f, "getLotteryInfo " + aVar2);
        return jz5.f0.f302826a;
    }
}

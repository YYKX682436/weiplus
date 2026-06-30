package rk4;

/* loaded from: classes10.dex */
public final class f5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingFlutterActivity f396650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396650e = tingFlutterActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.f5(this.f396650e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.f5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396649d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.ting.TingFlutterActivity activity = this.f396650e;
            com.tencent.mars.xlog.Log.i(activity.getB(), "exitWithAnimation from pop");
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.ting.uic.e0 e0Var = (com.tencent.mm.plugin.ting.uic.e0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ting.uic.e0.class);
            this.f396649d = 1;
            if (e0Var.d(true, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}

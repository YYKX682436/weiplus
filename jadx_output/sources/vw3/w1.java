package vw3;

/* loaded from: classes.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI f441166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441166e = repairerLoginAndRegUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw3.w1(this.f441166e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw3.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f441165d;
        com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI = this.f441166e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            js.e1 e1Var = (js.e1) i95.n0.c(js.e1.class);
            androidx.appcompat.app.AppCompatActivity context = repairerLoginAndRegUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            js.d1 d1Var = js.d1.f301424e;
            this.f441165d = 1;
            obj = ((u61.u) e1Var).wi(context, d1Var, "SecurityVerify", this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i(repairerLoginAndRegUI.d, "goToGateWayMobilePure SimAuthService mobile:" + ((java.util.Map) obj));
        return jz5.f0.f302826a;
    }
}

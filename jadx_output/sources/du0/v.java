package du0;

/* loaded from: classes.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.i0 f243451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(du0.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243451e = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.v(this.f243451e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243450d;
        du0.i0 i0Var = this.f243451e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            du0.u uVar = new du0.u(i0Var, null);
            this.f243450d = 1;
            obj = kotlinx.coroutines.a4.c(5000L, uVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("LocationUIC", "onPermissionsGranted: delay isRequestPermission " + i0Var.f243362d);
        ((du0.q) i0Var.f243365g).invoke((r45.ze2) obj);
        return jz5.f0.f302826a;
    }
}

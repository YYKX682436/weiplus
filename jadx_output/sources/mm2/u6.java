package mm2;

/* loaded from: classes3.dex */
public final class u6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f329465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.o6 f329466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(mm2.o6 o6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329466e = o6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.u6(this.f329466e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.u6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f329465d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f329465d = 1;
            if (kotlinx.coroutines.k1.b(30000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("job cancel timeout await, state = ");
        mm2.o6 o6Var = this.f329466e;
        sb6.append(o6Var.f329337a);
        com.tencent.mars.xlog.Log.i("LiveToastManagerSlice", sb6.toString());
        kotlinx.coroutines.f1 f1Var = o6Var.f329340d;
        if (f1Var != null) {
            kotlinx.coroutines.p2.a(f1Var, null, 1, null);
        }
        o6Var.f329339c.invoke();
        return jz5.f0.f302826a;
    }
}

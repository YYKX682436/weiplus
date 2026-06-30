package pk2;

/* loaded from: classes3.dex */
public final class x4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f356357d;

    /* renamed from: e, reason: collision with root package name */
    public int f356358e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f356359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356360g = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.x4 x4Var = new pk2.x4(this.f356360g, continuation);
        x4Var.f356359f = ((java.lang.Boolean) obj).booleanValue();
        return x4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.x4) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f356358e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f356359f;
            pk2.o9 o9Var = this.f356360g;
            com.tencent.mars.xlog.Log.i(o9Var.f356072a, "check: " + z17);
            this.f356357d = o9Var;
            this.f356359f = z17;
            this.f356358e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62, z17, true, new pk2.w4(o9Var, z17, new v65.n(rVar)));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

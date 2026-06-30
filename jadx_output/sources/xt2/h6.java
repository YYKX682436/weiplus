package xt2;

/* loaded from: classes.dex */
public final class h6 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f456780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.k6 f456781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f456782f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(xt2.k6 k6Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f456781e = k6Var;
        this.f456782f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new xt2.h6(this.f456781e, this.f456782f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((xt2.h6) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456780d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f456780d = 1;
            obj = xt2.k6.e(this.f456781e, this.f456782f, false, this);
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

package kl2;

/* loaded from: classes.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f308784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f308785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f308786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f308787g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j17, yz5.a aVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308785e = j17;
        this.f308786f = aVar;
        this.f308787g = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kl2.j(this.f308785e, this.f308786f, this.f308787g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kl2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f308784d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f308784d = 1;
            if (kotlinx.coroutines.k1.b(this.f308785e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f308786f.invoke();
        this.f308787g.dismiss();
        return jz5.f0.f302826a;
    }
}

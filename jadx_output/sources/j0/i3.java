package j0;

/* loaded from: classes14.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f296345d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f296346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f296347f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(j0.j3 j3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296347f = j3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        j0.i3 i3Var = new j0.i3(this.f296347f, continuation);
        i3Var.f296346e = obj;
        return i3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.i3) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296345d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f296346e;
            j0.l3 l3Var = this.f296347f.f296383e;
            if (l3Var == null) {
                kotlin.jvm.internal.o.o("longPressDragObserver");
                throw null;
            }
            this.f296345d = 1;
            if (j0.x2.a(a0Var, l3Var, this) == aVar) {
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

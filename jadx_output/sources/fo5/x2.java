package fo5;

/* loaded from: classes14.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265151d = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.x2(this.f265151d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.x2 x2Var = (fo5.x2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fo5.a aVar2 = fo5.f3.f264986c;
        if (aVar2 != null) {
            ro5.b bVar = ((fo5.r0) aVar2).f265097p;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("renderController");
                throw null;
            }
            bVar.D(this.f265151d);
        }
        return jz5.f0.f302826a;
    }
}

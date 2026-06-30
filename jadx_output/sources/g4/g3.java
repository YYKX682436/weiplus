package g4;

/* loaded from: classes4.dex */
public final class g3 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f268319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f268319d = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.g3(this.f268319d, completion);
    }

    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        return ((g4.g3) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return this.f268319d.invoke();
    }
}

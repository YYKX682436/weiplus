package ir2;

/* loaded from: classes2.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.c0 f294166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f294167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f294168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(androidx.recyclerview.widget.c0 c0Var, ir2.p1 p1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294166d = c0Var;
        this.f294167e = p1Var;
        this.f294168f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.k1(this.f294166d, this.f294167e, this.f294168f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ir2.k1 k1Var = (ir2.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f294166d.a(new ir2.j1(this.f294167e, this.f294168f));
        return jz5.f0.f302826a;
    }
}

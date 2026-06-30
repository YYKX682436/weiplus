package k50;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f304194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f304196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f304197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304198h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.util.List list, com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f304195e = list;
        this.f304196f = f9Var;
        this.f304197g = v2Var;
        this.f304198h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k50.c1(this.f304195e, this.f304196f, this.f304197g, this.f304198h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((k50.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f304194d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            k50.b1 b1Var = new k50.b1(this.f304195e, this.f304196f, this.f304197g, this.f304198h, null);
            this.f304194d = 1;
            if (kotlinx.coroutines.l.g(p0Var, b1Var, this) == aVar) {
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

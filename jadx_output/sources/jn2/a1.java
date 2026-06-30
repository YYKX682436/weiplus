package jn2;

/* loaded from: classes10.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.c1 f300548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.x f300549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(jn2.c1 c1Var, sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300548d = c1Var;
        this.f300549e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jn2.a1(this.f300548d, this.f300549e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jn2.a1 a1Var = (jn2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        gn2.a aVar;
        pz5.a aVar2 = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = ((mm2.m6) this.f300548d.f300569f.a(mm2.m6.class)).f329249q.f234085a;
        boolean z17 = !arrayList.isEmpty();
        sf2.x xVar = this.f300549e;
        if (z17 && (aVar = xVar.f407347p) != null) {
            aVar.e();
        }
        gn2.a aVar3 = xVar.f407347p;
        if (aVar3 != null) {
            aVar3.b(true);
        }
        gn2.a aVar4 = xVar.f407347p;
        if (aVar4 != null) {
            aVar4.k(arrayList.size());
        }
        return jz5.f0.f302826a;
    }
}

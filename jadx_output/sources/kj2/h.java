package kj2;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.o f308401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.x71 f308402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kj2.o oVar, r45.x71 x71Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308401d = oVar;
        this.f308402e = x71Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kj2.h(this.f308401d, this.f308402e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kj2.h hVar = (kj2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kj2.o oVar = this.f308401d;
        oVar.f308427f.clear();
        java.util.ArrayList arrayList = oVar.f308427f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        r45.x71 x71Var = this.f308402e;
        arrayList2.addAll(x71Var.getList(1));
        arrayList.addAll(arrayList2);
        kj2.o.a(oVar, oVar.f308427f, x71Var);
        return jz5.f0.f302826a;
    }
}

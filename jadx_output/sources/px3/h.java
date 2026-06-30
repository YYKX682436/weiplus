package px3;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ px3.j f358945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f358946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(px3.j jVar, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358945d = jVar;
        this.f358946e = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new px3.h(this.f358945d, this.f358946e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        px3.h hVar = (px3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (vx3.a aVar2 : mx3.i0.g()) {
            java.lang.String str = aVar2.f441262e;
            java.util.ArrayList arrayList2 = this.f358946e;
            if (!kz5.n0.O(arrayList2, str) || arrayList2.isEmpty()) {
                java.lang.String str2 = aVar2.f441262e;
                if (str2 != null) {
                    t45.i iVar = new t45.i();
                    iVar.f415588d = str2;
                    arrayList.add(new ox3.a(iVar));
                    mx3.i0.k(str2, null);
                    mx3.i0.m(str2, null, 0L, 4, null);
                }
            }
        }
        ((kotlinx.coroutines.flow.h3) this.f358945d.f358951f).k(new px3.a(arrayList, 4));
        return jz5.f0.f302826a;
    }
}

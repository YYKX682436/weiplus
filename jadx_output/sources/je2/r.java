package je2;

/* loaded from: classes3.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f299255d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.pq1 f299257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ je2.t f299258g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(r45.pq1 pq1Var, je2.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299257f = pq1Var;
        this.f299258g = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        je2.r rVar = new je2.r(this.f299257f, this.f299258g, continuation);
        rVar.f299256e = obj;
        return rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((je2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f299255d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f299256e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList linkedList = this.f299257f.f383304f;
            if (linkedList != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    arrayList.add(kotlinx.coroutines.l.b(y0Var, null, null, new je2.q((r45.kv1) it6.next(), null), 3, null));
                }
            }
            it = arrayList.iterator();
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f299256e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            kotlinx.coroutines.f1 f1Var = (kotlinx.coroutines.f1) it.next();
            this.f299256e = it;
            this.f299255d = 1;
            if (f1Var.k(this) == aVar) {
                return aVar;
            }
        }
        this.f299258g.Q6();
        return jz5.f0.f302826a;
    }
}

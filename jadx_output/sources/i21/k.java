package i21;

/* loaded from: classes10.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f287901d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f287902e;

    /* renamed from: f, reason: collision with root package name */
    public int f287903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f287904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f287904g = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new i21.k(this.f287904g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((i21.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        java.util.Iterator it;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f287903f;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i17 = 0;
            it = this.f287904g.iterator();
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f287901d;
            it = (java.util.Iterator) this.f287902e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            i21.n nVar = i21.p.f287911a;
            this.f287902e = it;
            this.f287901d = i19;
            this.f287903f = 1;
            if (i21.n.a(nVar, (java.lang.String) next, i17, this) == aVar) {
                return aVar;
            }
            i17 = i19;
        }
        return jz5.f0.f302826a;
    }
}

package f40;

/* loaded from: classes12.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f259457d;

    /* renamed from: e, reason: collision with root package name */
    public int f259458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f259459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.Collection collection, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f259459f = collection;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f40.s(this.f259459f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f40.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        java.lang.Object obj2;
        java.lang.Object obj3 = pz5.a.f359186d;
        int i17 = this.f259458e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            it = this.f259459f.iterator();
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f259457d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        do {
            boolean hasNext = it.hasNext();
            obj2 = jz5.f0.f302826a;
            if (!hasNext) {
                return obj2;
            }
            java.lang.String str = (java.lang.String) it.next();
            w65.n nVar = (w65.n) i95.n0.c(w65.n.class);
            this.f259457d = it;
            this.f259458e = 1;
            ((lm.r) nVar).getClass();
            java.lang.Object T6 = hm.u.f282177h.a().T6(f40.x.class, str, this);
            if (T6 == pz5.a.f359186d) {
                obj2 = T6;
            }
        } while (obj2 != obj3);
        return obj3;
    }
}

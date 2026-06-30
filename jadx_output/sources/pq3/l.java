package pq3;

/* loaded from: classes12.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357652d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357653e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357654f;

    /* renamed from: g, reason: collision with root package name */
    public int f357655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pq3.q f357656h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357657i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pq3.q qVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357656h = qVar;
        this.f357657i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pq3.l(this.f357656h, this.f357657i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pq3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pq3.q qVar;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357655g;
        pq3.q qVar2 = this.f357656h;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.sync.d dVar = qVar2.f357676b;
                this.f357652d = dVar;
                this.f357653e = qVar2;
                str = this.f357657i;
                this.f357654f = str;
                this.f357655g = 1;
                kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar;
                if (kVar.b(null, this) == aVar) {
                    return aVar;
                }
                qVar = qVar2;
                obj2 = kVar;
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return jz5.f0.f302826a;
                }
                str = (java.lang.String) this.f357654f;
                qVar = (pq3.q) this.f357653e;
                java.lang.Object obj3 = (kotlinx.coroutines.sync.d) this.f357652d;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj3;
            }
            qq3.i iVar = qVar.f357677c;
            if (iVar != null && kotlin.jvm.internal.o.b(iVar.f365960e.A0(), str)) {
                qVar.f357677c = null;
            }
            for (qq3.i iVar2 : qVar.c()) {
                if (kotlin.jvm.internal.o.b(iVar2.f365960e.A0(), str)) {
                    qVar.c().remove(iVar2);
                }
            }
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            this.f357652d = null;
            this.f357653e = null;
            this.f357654f = null;
            this.f357655g = 2;
            if (qVar2.e(this) == aVar) {
                return aVar;
            }
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            throw th6;
        }
    }
}

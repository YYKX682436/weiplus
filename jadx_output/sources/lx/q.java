package lx;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f321909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.u f321910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f321911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f321912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f321913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(lx.u uVar, int i17, long j17, java.util.List list, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321910e = uVar;
        this.f321911f = i17;
        this.f321912g = j17;
        this.f321913h = list;
        this.f321914i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lx.q(this.f321910e, this.f321911f, this.f321912g, this.f321913h, this.f321914i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f321909d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = (int) this.f321912g;
            lx.u uVar = this.f321910e;
            android.database.Cursor b17 = lx.u.b(uVar, 0, this.f321911f, i18);
            while (true) {
                try {
                    boolean moveToNext = b17.moveToNext();
                    list = this.f321913h;
                    if (!moveToNext) {
                        break;
                    }
                    list.add(lx.u.a(uVar, b17));
                } finally {
                }
            }
            vz5.b.a(b17, null);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            lx.p pVar = new lx.p(this.f321914i, list, null);
            this.f321909d = 1;
            if (kotlinx.coroutines.l.g(g3Var, pVar, this) == aVar) {
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

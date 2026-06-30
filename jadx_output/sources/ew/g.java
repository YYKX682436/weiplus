package ew;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f256971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ew.m f256972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f256974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f256975h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f256976i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ew.m mVar, int i17, long j17, java.util.List list, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f256972e = mVar;
        this.f256973f = i17;
        this.f256974g = j17;
        this.f256975h = list;
        this.f256976i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ew.g(this.f256972e, this.f256973f, this.f256974g, this.f256975h, this.f256976i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ew.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f256971d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = (int) this.f256974g;
            ew.m mVar = this.f256972e;
            android.database.Cursor b17 = ew.m.b(mVar, 1, this.f256973f, i18);
            while (true) {
                try {
                    boolean moveToNext = b17.moveToNext();
                    list = this.f256975h;
                    if (!moveToNext) {
                        break;
                    }
                    list.add(ew.m.a(mVar, b17));
                } finally {
                }
            }
            vz5.b.a(b17, null);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ew.f fVar = new ew.f(this.f256976i, list, null);
            this.f256971d = 1;
            if (kotlinx.coroutines.l.g(g3Var, fVar, this) == aVar) {
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

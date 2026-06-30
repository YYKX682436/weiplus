package ew;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f256979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ew.m f256980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f256982g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f256983h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f256984i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ew.m mVar, int i17, long j17, java.util.List list, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f256980e = mVar;
        this.f256981f = i17;
        this.f256982g = j17;
        this.f256983h = list;
        this.f256984i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ew.i(this.f256980e, this.f256981f, this.f256982g, this.f256983h, this.f256984i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ew.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f256979d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = (int) this.f256982g;
            ew.m mVar = this.f256980e;
            android.database.Cursor b17 = ew.m.b(mVar, 0, this.f256981f, i18);
            while (true) {
                try {
                    boolean moveToNext = b17.moveToNext();
                    list = this.f256983h;
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
            ew.h hVar = new ew.h(this.f256984i, list, null);
            this.f256979d = 1;
            if (kotlinx.coroutines.l.g(g3Var, hVar, this) == aVar) {
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

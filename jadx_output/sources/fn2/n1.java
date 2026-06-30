package fn2;

/* loaded from: classes10.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f264339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(fn2.q1 q1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264339e = q1Var;
        this.f264340f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn2.n1(this.f264339e, this.f264340f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264338d;
        fn2.q1 q1Var = this.f264339e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sf2.d3 d3Var = q1Var.f264358a;
            java.lang.String str = this.f264340f;
            this.f264338d = 1;
            obj = sf2.d3.i7(d3Var, null, false, str, null, this, 11, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.kx1 kx1Var = (r45.kx1) obj;
        if (this.f264340f != null) {
            if (!(kx1Var != null && kx1Var.f379022o)) {
                com.tencent.mars.xlog.Log.i("FinderLiveRequestedSongPlayListTabViewDataSource", "Target song not in sung list, not caching has sung response");
                if (kx1Var != null && kx1Var.f379017g != null) {
                    q1Var.getClass();
                }
                return obj;
            }
        }
        q1Var.f264360c = kx1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Cached has sung list response, target song in sung list: ");
        sb6.append(kx1Var != null ? java.lang.Boolean.valueOf(kx1Var.f379022o) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestedSongPlayListTabViewDataSource", sb6.toString());
        if (kx1Var != null) {
            q1Var.getClass();
        }
        return obj;
    }
}

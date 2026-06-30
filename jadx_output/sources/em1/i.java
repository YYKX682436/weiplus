package em1;

/* loaded from: classes7.dex */
public class i implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.j3 f255048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f255049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ em1.d f255050c;

    public i(em1.d dVar, cl.j3 j3Var, long j17) {
        this.f255050c = dVar;
        this.f255048a = j3Var;
        this.f255049b = j17;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        em1.d dVar = this.f255050c;
        cl.j3 j3Var = this.f255048a;
        long j17 = this.f255049b;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        dVar.n(j3Var, j17, java.lang.System.currentTimeMillis(), k1Var);
    }
}

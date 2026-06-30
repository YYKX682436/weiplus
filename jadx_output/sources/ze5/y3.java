package ze5;

/* loaded from: classes9.dex */
public final class y3 implements g75.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z01.m f472314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472315b;

    public y3(z01.m mVar, com.tencent.mm.storage.f9 f9Var) {
        this.f472314a = mVar;
        this.f472315b = f9Var;
    }

    @Override // g75.s
    public void a(g75.x result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (result.f269404a != 0 || this.f472314a.f469108v) {
            return;
        }
        ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).hj(this.f472315b, true);
    }
}

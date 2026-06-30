package yf2;

/* loaded from: classes3.dex */
public final class w1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f461805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f461806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461807f;

    public w1(yf2.i2 i2Var, mm2.n0 n0Var, java.lang.String str) {
        this.f461805d = i2Var;
        this.f461806e = n0Var;
        this.f461807f = str;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f461805d.Z6(this.f461806e.Q6(this.f461807f));
        return jz5.f0.f302826a;
    }
}

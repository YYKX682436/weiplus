package t00;

/* loaded from: classes9.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t00.o0 f414346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t00.o0 o0Var, c00.n3 n3Var) {
        super(1);
        this.f414346d = o0Var;
        this.f414347e = n3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.e6[] preloadResp = (bw5.e6[]) obj;
        kotlin.jvm.internal.o.g(preloadResp, "preloadResp");
        this.f414346d.h(preloadResp, this.f414347e);
        return jz5.f0.f302826a;
    }
}

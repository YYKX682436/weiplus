package wj2;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.j0 f446686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2.a f446687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(wj2.j0 j0Var, xh2.a aVar) {
        super(0);
        this.f446686d = j0Var;
        this.f446687e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qf2.t3 a76;
        qf2.q3 q3Var = (qf2.q3) this.f446686d.f446690b.o(qf2.q3.class);
        if (q3Var != null && (a76 = q3Var.a7()) != null) {
            java.lang.String b17 = this.f446687e.b();
            com.tencent.mars.xlog.Log.i(a76.f362591b, "keepPayMic sdkId: ".concat(b17));
            qf2.s3 s3Var = (qf2.s3) a76.f362592c.get(b17);
            if (s3Var != null) {
                s3Var.f362579e = true;
            }
        }
        return jz5.f0.f302826a;
    }
}

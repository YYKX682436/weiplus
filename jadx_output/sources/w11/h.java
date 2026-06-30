package w11;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final w11.h f442037d = new w11.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.jl0 jl0Var = new r45.jl0();
        try {
            w11.k kVar = w11.k.f442068a;
            java.lang.Object value = ((jz5.n) w11.k.f442069b).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            byte[] j17 = ((com.tencent.mm.sdk.platformtools.o4) value).j(gm0.j1.b().j());
            if (j17 != null) {
                jl0Var.parseFrom(j17);
                w11.k.a(kVar, jl0Var);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DoCmdErrorHandler", th6, "ErrorCmdRecord decodeBytes error", new java.lang.Object[0]);
        }
        return jl0Var;
    }
}

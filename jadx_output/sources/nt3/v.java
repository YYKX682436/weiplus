package nt3;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f339811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es0.d f339812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(nt3.a0 a0Var, es0.d dVar) {
        super(2);
        this.f339811d = a0Var;
        this.f339812e = dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nt3.k $receiver = (nt3.k) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxGLInitFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 18L, 1L);
        }
        nt3.a0 a0Var = this.f339811d;
        nt3.t tVar = new nt3.t(a0Var);
        nt3.u uVar = new nt3.u(a0Var);
        $receiver.f266238h = tVar;
        $receiver.f266239i = uVar;
        $receiver.f266249s = true;
        $receiver.H = a0Var.A;
        $receiver.I = new nt3.s(a0Var, this.f339812e);
        a0Var.f339734y = true;
        if (a0Var.f339735z) {
            a0Var.b();
        }
        return jz5.f0.f302826a;
    }
}

package fn5;

/* loaded from: classes14.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(fn5.n0 n0Var) {
        super(0);
        this.f264639d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyPersonReq on completion to ui thread update: " + java.lang.Thread.currentThread().getName());
        aq.b bVar = aq.b.f12836e;
        fn5.n0 n0Var = this.f264639d;
        n0Var.A = bVar;
        n0Var.f264723f.setValue(fn5.o0.f264745f);
        int size = n0Var.f264731q.size();
        fn5.p0 p0Var = (fn5.p0) n0Var.f264729o.getValue();
        int size2 = kotlin.jvm.internal.o.b(p0Var != null ? p0Var.name() : null, "PERSON") ? n0Var.f264732r.size() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchIfDone >> " + size + ", " + aq.o.f12920a + ", " + size2);
        if (!aq.o.f12920a) {
            f65.o.f259919h = size;
            f65.o oVar = f65.o.f259912a;
            oVar.d(size2);
            oVar.c(size > 0 ? 56 : 57);
        }
        return jz5.f0.f302826a;
    }
}

package dk5;

/* loaded from: classes12.dex */
public final class t implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public static final dk5.t f234892d = new dk5.t();

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qi3.e0 e0Var = (qi3.e0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.FileSendLogic", "sendFile event:" + e0Var);
        int ordinal = e0Var.f363691a.ordinal();
        qi3.b0 b0Var = e0Var.f363692b;
        if (ordinal == 2) {
            com.tencent.mm.ui.report.b.f209619a.b(e0Var.f363697g, 1, b0Var.id());
        } else if (ordinal == 4) {
            com.tencent.mm.ui.report.b.f209619a.b(e0Var.f363697g, 2, b0Var.id());
        } else if (ordinal == 7) {
            com.tencent.mm.ui.report.b.f209619a.b(e0Var.f363697g, 3, b0Var.id());
        }
        return jz5.f0.f302826a;
    }
}

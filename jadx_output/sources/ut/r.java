package ut;

/* loaded from: classes12.dex */
public final class r implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430715d;

    public r(ut.q0 q0Var) {
        this.f430715d = q0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendFileTask", this.f430715d.id() + " cancelDownloadFlow:" + ((com.tencent.mm.modelcdntran.n1) obj));
        return jz5.f0.f302826a;
    }
}

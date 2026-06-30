package dr0;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldr0/d1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class d1 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean data = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        boolean z17 = data.f68400d;
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.ProcLifeTasks", "ipc CheckAliveTask, checkAlive=" + z17);
        if (z17) {
            dr0.t0 t0Var = dr0.t0.f242540k;
            t0Var.getClass();
            if (com.tencent.mm.sdk.platformtools.x2.p()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "#postCheckAlive");
                t0Var.f242542b = 0;
                dr0.q3.j(dr0.q3.f242513t, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, null, 2, null);
            }
        }
        dr0.p1 a17 = dr0.p1.f242489d.a();
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        boolean j17 = a17.j(PROCESS_MAIN);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.ProcLifeTasks", "ipc CheckAliveTask done, isMainProcAlive=" + j17);
        if (j17) {
            try {
                callback.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.proc.ProcLifeTasks", "ipc onCallback err: " + e17.getMessage());
            }
        }
    }
}

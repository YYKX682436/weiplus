package dr0;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldr0/y0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class y0 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCVoid data = (com.tencent.mm.ipcinvoker.type.IPCVoid) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.ProcLifeTasks", "ipc FlushStatsTask");
        dr0.t0.f242540k.h();
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(true);
    }
}

package dr0;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldr0/e;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCLong;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class e implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.ipcinvoker.type.IPCLong data = (com.tencent.mm.ipcinvoker.type.IPCLong) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccStats", "ipc ReportTask done, deltaMs=" + data.f68405d);
        ((dr0.m) ((lh.k) i95.n0.c(lh.k.class))).Di(data.f68405d);
    }
}

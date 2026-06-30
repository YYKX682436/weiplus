package dr0;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldr0/b1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class b1 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.ipcinvoker.type.IPCString data = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!android.text.TextUtils.isEmpty(data.f68406d)) {
            dr0.p1 a17 = dr0.p1.f242489d.a();
            java.lang.String value = data.f68406d;
            kotlin.jvm.internal.o.f(value, "value");
            a17.a(value);
        }
        dr0.p1 a18 = dr0.p1.f242489d.a();
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.ProcLifeTasks", "ipc IpcDisconnectTask done, isMainProcAlive=" + a18.j(PROCESS_MAIN));
    }
}

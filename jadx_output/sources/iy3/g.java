package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/g;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes13.dex */
public final class g implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke init service from ");
        sb6.append(iPCInteger != null ? java.lang.Integer.valueOf(iPCInteger.f68404d) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_InitService", sb6.toString());
        my3.c0.f332784k.a().b();
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
    }
}

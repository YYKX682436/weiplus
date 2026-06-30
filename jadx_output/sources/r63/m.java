package r63;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr63/m;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-generic-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class m implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        byte[] byteArray;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null && (byteArray = bundle.getByteArray("finderReportAppProcessEvent")) != null) {
            r45.v8 v8Var = new r45.v8();
            v8Var.parseFrom(byteArray);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "CallMainProcess " + v8Var.f387979g + " infoList = " + v8Var.f387980h.size());
            if (v8Var.f387979g) {
                r63.n nVar = r63.n.f393042a;
                r45.f83 activityRecord = v8Var.f387977e;
                kotlin.jvm.internal.o.f(activityRecord, "activityRecord");
                nVar.i(activityRecord, v8Var.f387978f);
            } else {
                r63.n nVar2 = r63.n.f393042a;
                r45.f83 activityRecord2 = v8Var.f387977e;
                kotlin.jvm.internal.o.f(activityRecord2, "activityRecord");
                long j17 = v8Var.f387978f;
                java.lang.String processName = v8Var.f387976d;
                kotlin.jvm.internal.o.f(processName, "processName");
                nVar2.k(activityRecord2, j17, processName);
            }
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}

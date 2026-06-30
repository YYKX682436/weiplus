package oy1;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loy1/o;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-data-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class o implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        int i17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (i17 = bundle.getInt("other_process_add_msg_id")) <= 0) {
            return;
        }
        boolean z17 = bundle.getBoolean("other_process_add_msg_is_collect", false);
        java.io.Serializable serializable = bundle.getSerializable("other_process_add_msg");
        java.util.ArrayList arrayList = serializable instanceof java.util.ArrayList ? (java.util.ArrayList) serializable : null;
        if (arrayList != null) {
            oy1.p.f349911a.c(i17, arrayList, z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", "report other process " + i17);
        }
    }
}

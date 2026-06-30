package com.tencent.mm.plugin.multitask;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/multitask/j2;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class j2 implements com.tencent.mm.ipcinvoker.j {
    public j2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.ReportTaskInfoTask", "create report task info");
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            int i17 = bundle.getInt("reporttype");
            byte[] byteArray = bundle.getByteArray("reportdata");
            r45.kr4 kr4Var = new r45.kr4();
            if (byteArray != null) {
                try {
                    kr4Var.parseFrom(byteArray);
                } catch (java.lang.Exception unused) {
                }
            }
            ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).getClass();
            if (i17 != 2) {
                if (i17 != 3) {
                    return;
                }
                nk3.f.f338041a.e(kr4Var);
            } else {
                nk3.f fVar = nk3.f.f338041a;
                fVar.f(kr4Var);
                fVar.g(kr4Var.getInteger(3), (r45.jr4) kr4Var.getCustom(8));
            }
        }
    }
}

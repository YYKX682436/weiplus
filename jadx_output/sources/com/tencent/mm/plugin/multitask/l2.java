package com.tencent.mm.plugin.multitask;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/multitask/l2;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class l2 implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150469d = "MicroMsg.MultiTask.UpdateTaskInfoTask";

    public l2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.UpdateTaskInfoTask", "create update task info");
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            java.lang.String string = bundle.getString(dm.i4.COL_ID);
            int i17 = bundle.getInt("type");
            byte[] byteArray = bundle.getByteArray("showData");
            if (string == null || byteArray == null) {
                return;
            }
            r45.lr4 lr4Var = new r45.lr4();
            try {
                lr4Var.parseFrom(byteArray);
            } catch (java.lang.Exception unused) {
            }
            java.lang.String string2 = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String b17 = com.tencent.mm.plugin.multitask.u0.f150506a.b(string);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2) || !com.tencent.mm.vfs.w6.j(string2)) {
                lr4Var.set(7, java.lang.Boolean.valueOf(!com.tencent.mm.vfs.w6.j(b17)));
            } else {
                if (com.tencent.mm.vfs.w6.j(b17)) {
                    com.tencent.mm.vfs.w6.h(b17);
                }
                com.tencent.mm.vfs.w6.w(string2, b17);
                if (!lr4Var.getBoolean(7)) {
                    java.lang.String a17 = com.tencent.mm.plugin.multitask.s0.f150501a.a(b17, com.tencent.mm.plugin.multitask.u0.f150507b);
                    n11.a.b().p(a17);
                    com.tencent.mars.xlog.Log.i(this.f150469d, "move tempPath:" + string2 + " to path:" + b17 + " imageCacheKey:" + a17);
                }
            }
            ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).rj(string, i17, lr4Var, bundle.getByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
        }
    }
}

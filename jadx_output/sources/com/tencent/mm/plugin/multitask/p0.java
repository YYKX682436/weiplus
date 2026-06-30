package com.tencent.mm.plugin.multitask;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/multitask/p0;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p0 implements com.tencent.mm.ipcinvoker.j {
    public p0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.HideMultiTaskUIC", "create add task info");
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle != null ? bundle.getString(dm.i4.COL_ID) : null;
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("type")) : null;
        java.lang.Integer valueOf2 = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("event_type")) : null;
        if (string == null || valueOf == null || valueOf2 == null) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.multitask.o0(valueOf.intValue(), string, valueOf2.intValue()));
    }
}

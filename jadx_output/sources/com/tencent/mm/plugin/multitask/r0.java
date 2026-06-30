package com.tencent.mm.plugin.multitask;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/multitask/r0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class r0 implements com.tencent.mm.ipcinvoker.k0 {
    public r0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.getMultiTaskItemPosition", "create multiTaskItemPosition");
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (str = bundle.getString(dm.i4.COL_ID)) == null) {
            str = "";
        }
        return new com.tencent.mm.ipcinvoker.type.IPCString(((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Ri(str, bundle != null ? bundle.getInt("type") : -1, bundle != null ? bundle.getInt("curPos") : -1, bundle != null ? bundle.getInt("way") : -1));
    }
}

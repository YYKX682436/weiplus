package com.tencent.mm.plugin.wenote.multitask;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/wenote/multitask/g;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class g implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("isFromMultiTask");
            java.lang.String string = bundle.getString("eventData");
            java.lang.String str = string == null ? "" : string;
            java.lang.String string2 = bundle.getString("multiTaskId");
            int i17 = bundle.getInt("eventType");
            r45.w60 w60Var = new r45.w60();
            try {
                byte[] byteArray = bundle.getByteArray("commonMultiTaskData");
                if (byteArray != null) {
                    w60Var.parseFrom(byteArray);
                }
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.plugin.wenote.multitask.i.f188136d.a(string2 == null ? "" : string2, w60Var, z17, i17, str);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}

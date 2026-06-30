package com.tencent.mm.plugin.ting.uic;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/ting/uic/l0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class l0 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        rk4.k5.e("onMultiTaskItemClick TingHandleClickTask...", "TingMultiTaskRegisterUIC");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) data.getParcelable("tingTaskInfo");
        if (multiTaskInfo == null) {
            multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        }
        data.remove("tingTaskInfo");
        com.tencent.mm.plugin.ting.uic.k0.a(com.tencent.mm.plugin.ting.uic.m0.f174779d, multiTaskInfo, null);
        return null;
    }
}

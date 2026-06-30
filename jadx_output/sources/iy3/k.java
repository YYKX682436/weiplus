package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Liy3/k;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes13.dex */
public final class k implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_RtosLogin", "invoke login");
        java.lang.String string = bundle != null ? bundle.getString(dm.i4.COL_USERNAME) : null;
        java.lang.String string2 = bundle != null ? bundle.getString("ticket") : null;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new android.os.Bundle();
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.IPCASyncInvokeTask_RtosLogin", "ticket is empty");
            if (rVar != null) {
                rVar.a(h0Var.f310123d);
                return;
            }
            return;
        }
        my3.c0 a17 = my3.c0.f332784k.a();
        iy3.j jVar = new iy3.j(h0Var, rVar);
        a17.getClass();
        if (!a17.f332789d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosWatchService", "inited but not init");
            return;
        }
        a17.f332793h = jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onGetOAuthTicket " + string + "  " + string2);
        com.tencent.wechat.rtos.WeChatApi weChatApi = a17.f332787b;
        if (weChatApi != null) {
            weChatApi.onGetOAuthTicket(0, 0, string, string2 != null ? r26.i0.m(string2) : null);
        }
    }
}

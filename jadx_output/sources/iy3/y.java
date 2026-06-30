package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Liy3/y;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class y implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCSyncInvokeTask_CancelLogin", "invoke CancelLogin");
        my3.q qVar = (my3.q) ((fy3.e) i95.n0.c(fy3.e.class));
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onWatchCancelLogin");
        fy3.f fVar = qVar.f332833s;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onWatchCancelLogin");
            com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = ((oy3.t) fVar).f350044a;
            rtosWatchLoginUI.D.sendEmptyMessage(1008);
            rtosWatchLoginUI.D.postUI(new oy3.y(rtosWatchLoginUI));
        }
        qVar.aj(0);
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}

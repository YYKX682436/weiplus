package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Liy3/t;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class t implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCSyncInvokeTask_HangupVoIP", "invoke HangupVoIP");
        ((kg0.p) ((lg0.m) i95.n0.c(lg0.m.class))).getClass();
        nq4.f fVar = nq4.f.f339014a;
        nq4.f.f339019f = true;
        com.tencent.mm.autogen.events.ShortcutVoipControllerEvent shortcutVoipControllerEvent = new com.tencent.mm.autogen.events.ShortcutVoipControllerEvent();
        shortcutVoipControllerEvent.f54778g.f7366a = 2;
        shortcutVoipControllerEvent.e();
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}

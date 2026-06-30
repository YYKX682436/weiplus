package m32;

/* loaded from: classes13.dex */
public class c0 extends com.tencent.mm.sdk.event.n {
    public c0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExDeviceUploadXlogEvent exDeviceUploadXlogEvent = (com.tencent.mm.autogen.events.ExDeviceUploadXlogEvent) iEvent;
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("RtosOnXlogUploadEvent", "account not ready");
            return false;
        }
        fy3.e eVar = (fy3.e) i95.n0.c(fy3.e.class);
        exDeviceUploadXlogEvent.f54186g.getClass();
        my3.q qVar = (my3.q) eVar;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onXlogUpload");
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f332822e) || com.tencent.mm.sdk.platformtools.t8.K0(qVar.f332821d)) {
            return false;
        }
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193057e, new com.tencent.mm.ipcinvoker.type.IPCString(null), iy3.n.class);
        return false;
    }
}

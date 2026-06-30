package dt;

/* loaded from: classes12.dex */
public class w3 extends com.tencent.mm.sdk.event.n {
    public w3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.rf rfVar;
        com.tencent.mm.autogen.events.GetDisasterInfoEvent getDisasterInfoEvent = (com.tencent.mm.autogen.events.GetDisasterInfoEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        if (getDisasterInfoEvent == null || (rfVar = getDisasterInfoEvent.f54390g) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WorkerProfile", "summerdiz GetDisasterInfoEvent event null ret false");
            return false;
        }
        int i17 = rfVar.f7808a;
        boolean z17 = rfVar.f7809b;
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "summerdiz GetDisasterInfoEvent callback event noticeid[%d], manualauthSucc[%b]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        gm0.j1.e().j(new com.tencent.mm.app.q7(i17, z17));
        return false;
    }
}

package g61;

/* loaded from: classes9.dex */
public class b0 extends com.tencent.mm.sdk.event.n {
    public b0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.rp rpVar = ((com.tencent.mm.autogen.events.ReceiveAAMsgEvent) iEvent).f54650g;
        long j17 = rpVar.f7831a;
        java.lang.String str = rpVar.f7832b;
        java.lang.String str2 = rpVar.f7833c;
        com.tencent.mars.xlog.Log.i("ReceiveAAMsgEventListener", "ReceiveAAMsgEvent, localMsgId: %s, msgContent: %s", java.lang.Long.valueOf(j17), com.tencent.mm.sdk.platformtools.t8.G1(str));
        h61.o.s(str2, j17, str);
        return false;
    }
}

package dk5;

/* loaded from: classes9.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f235015d;

    public z1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI) {
        this.f235015d = msgRetransmitUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f235015d.finish();
    }
}

package dk5;

/* loaded from: classes9.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234615d;

    public f1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI) {
        this.f234615d = msgRetransmitUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f234615d.finish();
    }
}

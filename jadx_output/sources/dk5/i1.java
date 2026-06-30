package dk5;

/* loaded from: classes9.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234668d;

    public i1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI) {
        this.f234668d = msgRetransmitUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f234668d.finish();
    }
}

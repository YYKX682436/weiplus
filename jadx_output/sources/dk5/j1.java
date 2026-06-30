package dk5;

/* loaded from: classes9.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234686d;

    public j1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI) {
        this.f234686d = msgRetransmitUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.p3 Zi = t21.o2.Zi();
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234686d;
        java.lang.String str = msgRetransmitUI.f210954g;
        Zi.c(str, 3, new dk5.d2(msgRetransmitUI.f210955h, str, msgRetransmitUI.f210970w, msgRetransmitUI.f210960o, msgRetransmitUI.f210952e, msgRetransmitUI.f210966s, msgRetransmitUI.f210953f, msgRetransmitUI.f210951J, msgRetransmitUI.R));
    }
}

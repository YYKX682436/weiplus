package dk5;

/* loaded from: classes9.dex */
public class y1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f235001d;

    public y1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI) {
        this.f235001d = msgRetransmitUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f235001d.finish();
    }
}

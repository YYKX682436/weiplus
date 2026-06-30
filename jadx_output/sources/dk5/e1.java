package dk5;

/* loaded from: classes9.dex */
public class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234599d;

    public e1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI) {
        this.f234599d = msgRetransmitUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f234599d.finish();
    }
}

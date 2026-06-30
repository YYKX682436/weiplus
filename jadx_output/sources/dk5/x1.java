package dk5;

/* loaded from: classes9.dex */
public class x1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234986e;

    public x1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI, java.lang.String str) {
        this.f234986e = msgRetransmitUI;
        this.f234985d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234986e;
        android.content.Intent intent = msgRetransmitUI.getIntent();
        int i18 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
        msgRetransmitUI.g7(intent, this.f234985d);
    }
}

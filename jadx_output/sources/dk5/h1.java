package dk5;

/* loaded from: classes9.dex */
public class h1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.c3 f234647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234648e;

    public h1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI, com.tencent.mm.pluginsdk.model.c3 c3Var) {
        this.f234648e = msgRetransmitUI;
        this.f234647d = c3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.pluginsdk.model.c3 c3Var = this.f234647d;
        c3Var.f189266t = true;
        c3Var.interrupt();
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234648e;
        msgRetransmitUI.C1 = true;
        msgRetransmitUI.finish();
    }
}

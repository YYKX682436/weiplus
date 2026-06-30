package dk5;

/* loaded from: classes9.dex */
public class g1 implements com.tencent.mm.pluginsdk.model.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234633a;

    public g1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI) {
        this.f234633a = msgRetransmitUI;
    }

    @Override // com.tencent.mm.pluginsdk.model.a3
    public void a(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234633a;
        android.app.ProgressDialog progressDialog = msgRetransmitUI.f210967t;
        if (progressDialog != null) {
            progressDialog.dismiss();
            msgRetransmitUI.f210967t = null;
        }
        if (msgRetransmitUI.f210971x == 1) {
            dp.a.makeText(msgRetransmitUI, msgRetransmitUI.getString(com.tencent.mm.R.string.f490560yi), 0).show();
        }
        msgRetransmitUI.finish();
    }
}

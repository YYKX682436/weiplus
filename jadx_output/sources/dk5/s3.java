package dk5;

/* loaded from: classes9.dex */
public class s3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234877b;

    public s3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, ot0.q qVar) {
        this.f234877b = selectConversationUI;
        this.f234876a = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "go to RecordMsgDetailUI");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234877b;
        intent.putExtra("message_id", selectConversationUI.M1);
        intent.putExtra("message_talker", selectConversationUI.N1);
        intent.putExtra("Retr_Security_Msg_Id", selectConversationUI.M1);
        intent.putExtra("Retr_Security_Msg_Talker", selectConversationUI.N1);
        intent.putExtra("record_xml", this.f234876a.f348663h0);
        intent.putExtra("record_show_share", false);
        j45.l.j(selectConversationUI.getContext(), "record", ".ui.RecordMsgDetailUI", intent, null);
    }
}

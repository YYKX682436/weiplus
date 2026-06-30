package dk5;

/* loaded from: classes9.dex */
public class x3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234990a;

    public x3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234990a = selectConversationUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "go to RecordMsgDetailUI");
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234990a;
        com.tencent.mm.autogen.events.RecordOperationEvent f17 = com.tencent.mm.ui.chatting.x3.f(selectConversationUI.getContext());
        am.fq fqVar = f17.f54664h;
        q45.c cVar = fqVar.f6697f;
        java.lang.String h17 = bt3.g2.h(cVar.f360129d, cVar.f360130e, fqVar.f6696e.f54090g.f6315a, f17.f54663g.f6597o, selectConversationUI.M1, selectConversationUI.N1);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ot0.q v17 = ot0.q.v(h17);
        if (v17 == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", selectConversationUI.M1);
        intent.putExtra("message_talker", selectConversationUI.S1.Q0());
        intent.putExtra("record_xml", v17.f348663h0);
        intent.putExtra("record_show_share", false);
        j45.l.j(selectConversationUI.getContext(), "record", ".ui.RecordMsgDetailUI", intent, null);
    }
}

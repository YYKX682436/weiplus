package dk5;

/* loaded from: classes9.dex */
public class r3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234849b;

    public r3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, ot0.q qVar) {
        this.f234849b = selectConversationUI;
        this.f234848a = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
        am.sn snVar = openNoteFromSessionEvent.f54599g;
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234849b;
        snVar.f7906c = selectConversationUI.getContext();
        am.sn snVar2 = openNoteFromSessionEvent.f54599g;
        snVar2.f7904a = selectConversationUI.M1;
        snVar2.f7909f = selectConversationUI.N1;
        snVar2.f7905b = this.f234848a.f348663h0;
        snVar2.f7907d = false;
        snVar2.f7910g = 7;
        openNoteFromSessionEvent.e();
    }
}

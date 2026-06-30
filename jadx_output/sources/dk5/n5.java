package dk5;

/* loaded from: classes9.dex */
public class n5 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234765b;

    public n5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, ot0.q qVar) {
        this.f234765b = sendAppMessageWrapperUI;
        this.f234764a = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("record_xml", this.f234764a.f348663h0);
        intent.putExtra("record_show_share", false);
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234765b;
        intent.putExtra("record_app_id", sendAppMessageWrapperUI.f211019e.field_appId);
        j45.l.j(sendAppMessageWrapperUI.getContext(), "record", ".ui.RecordMsgDetailUI", intent, null);
    }
}

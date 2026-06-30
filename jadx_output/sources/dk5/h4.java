package dk5;

/* loaded from: classes9.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234657d;

    public h4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234657d = selectConversationUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finish_by_forward_to_wework", true);
        int i17 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234657d;
        selectConversationUI.a8(0, intent);
        selectConversationUI.finish();
    }
}

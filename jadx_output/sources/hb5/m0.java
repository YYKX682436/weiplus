package hb5;

/* loaded from: classes.dex */
public class m0 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f280234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatSelectConversationUI f280235c;

    public m0(com.tencent.mm.ui.bizchat.BizChatSelectConversationUI bizChatSelectConversationUI, java.lang.String str, long j17) {
        this.f280235c = bizChatSelectConversationUI;
        this.f280233a = str;
        this.f280234b = j17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enterprise_biz_name", this.f280233a);
            intent.putExtra("key_biz_chat_id", this.f280234b);
            intent.putExtra("key_is_biz_chat", true);
            com.tencent.mm.ui.bizchat.BizChatSelectConversationUI bizChatSelectConversationUI = this.f280235c;
            bizChatSelectConversationUI.setResult(-1, intent);
            bizChatSelectConversationUI.finish();
        }
    }
}

package hb5;

/* loaded from: classes.dex */
public class o0 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f280246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatSelectConversationUI f280247c;

    public o0(com.tencent.mm.ui.bizchat.BizChatSelectConversationUI bizChatSelectConversationUI, java.lang.String str, long j17) {
        this.f280247c = bizChatSelectConversationUI;
        this.f280245a = str;
        this.f280246b = j17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enterprise_biz_name", this.f280245a);
            intent.putExtra("key_biz_chat_id", this.f280246b);
            intent.putExtra("key_is_biz_chat", true);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                intent.putExtra("enterprise_share_append_text", str);
            }
            com.tencent.mm.ui.bizchat.BizChatSelectConversationUI bizChatSelectConversationUI = this.f280247c;
            bizChatSelectConversationUI.setResult(-1, intent);
            bizChatSelectConversationUI.finish();
        }
    }
}

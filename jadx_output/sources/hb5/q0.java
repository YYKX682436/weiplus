package hb5;

/* loaded from: classes11.dex */
public class q0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatSelectConversationUI f280252d;

    public q0(com.tencent.mm.ui.bizchat.BizChatSelectConversationUI bizChatSelectConversationUI) {
        this.f280252d = bizChatSelectConversationUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f280252d.finish();
    }
}

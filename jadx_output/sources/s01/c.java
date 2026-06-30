package s01;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f401854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s01.g f401855e;

    public c(s01.g gVar, l75.k0 k0Var) {
        this.f401855e = gVar;
        this.f401854d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        l75.k0 k0Var = this.f401854d;
        k0Var.A("BizChatConversation", "CREATE INDEX IF NOT EXISTS BizChatConv_bizChatIdIndex ON BizChatConversation ( bizChatId )");
        k0Var.A("BizChatConversation", "CREATE INDEX IF NOT EXISTS BizChatConv_brandUserNameIndex ON BizChatConversation ( brandUserName )");
        k0Var.A("BizChatConversation", "CREATE INDEX IF NOT EXISTS unreadCountIndex ON BizChatConversation ( unReadCount )");
    }
}

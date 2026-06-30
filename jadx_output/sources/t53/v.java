package t53;

/* loaded from: classes8.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu5.c f415831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f415832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f415835h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(wu5.c cVar, kotlin.jvm.internal.h0 h0Var, java.lang.String str, java.lang.String str2, android.content.Context context) {
        super(1);
        this.f415831d = cVar;
        this.f415832e = h0Var;
        this.f415833f = str;
        this.f415834g = str2;
        this.f415835h = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        this.f415831d.cancel(false);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f415832e.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (!(str == null || str.length() == 0)) {
            com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "[startChattingUI] sessionId=" + str);
            com.tencent.mm.game.report.e.f68194a.d(this.f415833f);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_Self", this.f415834g);
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            j45.l.u(this.f415835h, ".ui.chatting.ChattingUI", intent, null);
        }
        return jz5.f0.f302826a;
    }
}

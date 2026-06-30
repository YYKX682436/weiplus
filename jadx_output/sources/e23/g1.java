package e23;

/* loaded from: classes12.dex */
public class g1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.h1 f246858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(e23.h1 h1Var) {
        super(h1Var);
        this.f246858b = h1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.h1 h1Var = (e23.h1) gVar;
        e23.f1 f1Var = (e23.f1) eVar;
        android.view.View view = f1Var.f246850d;
        e23.h1 h1Var2 = this.f246858b;
        com.tencent.mm.plugin.fts.ui.n3.j(view, h1Var2.f423761d);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(f1Var.f246847a, h1Var.f246863r);
        android.widget.TextView textView = f1Var.f246848b;
        p13.i b17 = p13.i.b(h1Var.f246864s, h1Var2.f423762e);
        b17.f351100h = textView.getPaint();
        com.tencent.mm.plugin.fts.ui.n3.a(o13.q.e(b17).f351105a, f1Var.f246848b);
        com.tencent.mm.plugin.fts.ui.n3.b(context.getString(com.tencent.mm.R.string.idv, java.lang.Integer.valueOf(h1Var.f246865t)), f1Var.f246849c);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489126bd5, viewGroup, false);
        e23.f1 f1Var = this.f246858b.f246867v;
        f1Var.f246847a = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        f1Var.f246848b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
        f1Var.f246849c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485992jt4);
        f1Var.f246850d = inflate.findViewById(com.tencent.mm.R.id.jt6);
        inflate.setTag(f1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        android.content.Intent intent = new android.content.Intent();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        intent.putExtra("Chat_User", "notifymessage");
        intent.putExtra("key_notify_message_real_username", ((e23.h1) gVar).f246863r);
        intent.putExtra("finish_direct", true);
        intent.putExtra("chat_from_scene", 6);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        return true;
    }
}

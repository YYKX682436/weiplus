package e23;

/* loaded from: classes11.dex */
public class r1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.s1 f246954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(e23.s1 s1Var) {
        super(s1Var);
        this.f246954b = s1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.q1 q1Var = (e23.q1) eVar;
        e23.s1 s1Var = (e23.s1) gVar;
        com.tencent.mm.plugin.fts.ui.n3.j(q1Var.f246944a, this.f246954b.f423761d);
        java.lang.String str = s1Var.f246960s;
        if (str == null || str.length() <= 0) {
            q1Var.f246945b.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(q1Var.f246945b, s1Var.f246960s, null);
        }
        if (c01.e2.R(s1Var.f246960s)) {
            com.tencent.mm.plugin.fts.ui.n3.a(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).aj(context, s1Var.f246961t), q1Var.f246946c);
        } else {
            com.tencent.mm.plugin.fts.ui.n3.a(s1Var.f246961t, q1Var.f246946c);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(s1Var.f246963v, q1Var.f246947d);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bbw, viewGroup, false);
        e23.q1 q1Var = this.f246954b.f246965x;
        q1Var.f246945b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        q1Var.f246946c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        q1Var.f246947d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        q1Var.f246944a = inflate.findViewById(com.tencent.mm.R.id.d0v);
        inflate.setTag(q1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.s1 s1Var = (e23.s1) gVar;
        a(this.f246954b.i(), s1Var.f246958q);
        java.lang.String str = s1Var.f246960s;
        java.lang.Object obj = s13.b.f402134a;
        if (str != null && str.length() != 0 && !s13.b.f402137d) {
            ((ku5.t0) ku5.t0.f312615d).g(new s13.a(str));
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", s1Var.f246960s).putExtra("finish_direct", true);
        putExtra.putExtra("chat_from_scene", 5);
        if ((com.tencent.mm.storage.z3.m4(s1Var.f246960s) || com.tencent.mm.storage.z3.n4(s1Var.f246960s)) && !com.tencent.mm.sdk.platformtools.f9.ContactWeCom.k(view.getContext(), null)) {
            return true;
        }
        if (com.tencent.mm.storage.z3.q4(s1Var.f246960s)) {
            com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct openIMChatRoomLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct();
            openIMChatRoomLogStruct.p(s1Var.f246960s);
            openIMChatRoomLogStruct.f59786e = 3L;
            openIMChatRoomLogStruct.k();
        }
        j45.l.u(context, ".ui.chatting.ChattingUI", putExtra, null);
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(s1Var.f246960s, 2);
        return true;
    }
}

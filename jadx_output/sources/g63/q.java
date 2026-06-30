package g63;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.s f269159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f269160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g63.b f269162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f269163h;

    public q(g63.s sVar, z53.i iVar, int i17, g63.b bVar, android.view.View view) {
        this.f269159d = sVar;
        this.f269160e = iVar;
        this.f269161f = i17;
        this.f269162g = bVar;
        this.f269163h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f269161f;
        g63.s sVar = this.f269159d;
        g63.s.a(sVar, this.f269160e, 2L, i17);
        z53.i iVar = (z53.i) this.f269162g.f293125i;
        g63.c cVar = sVar.f269172b;
        if (cVar != null) {
            kotlin.jvm.internal.o.d(iVar);
            android.view.View view2 = this.f269163h;
            kotlin.jvm.internal.o.g(view2, "view");
            ((d63.e) ((u53.b0) i95.n0.c(u53.b0.class))).wi();
            g63.t0 t0Var = ((g63.d0) cVar).f269098a.f269106a;
            if (t0Var != null) {
                java.lang.String field_sessionId = iVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                java.lang.String field_selfUserName = iVar.field_selfUserName;
                kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
                java.lang.String field_talker = iVar.field_talker;
                kotlin.jvm.internal.o.f(field_talker, "field_talker");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_Self", field_selfUserName);
                intent.putExtra("Chat_User", field_sessionId);
                intent.putExtra("finish_direct", true);
                j45.l.u(((com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI) t0Var).getContext(), ".ui.chatting.ChattingUI", intent, null);
                ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).wi(field_talker);
                ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).wi(field_selfUserName);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

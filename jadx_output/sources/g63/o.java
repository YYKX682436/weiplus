package g63;

/* loaded from: classes8.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z53.i f269148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g63.s f269149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f269151g;

    public o(z53.i iVar, g63.s sVar, int i17, android.view.View view) {
        this.f269148d = iVar;
        this.f269149e = sVar;
        this.f269150f = i17;
        this.f269151g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        m53.h3 h3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$bindHistoryConversation$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z53.i iVar = this.f269148d;
        if (iVar.field_unReadCount != Integer.MAX_VALUE) {
            iVar.field_unReadCount = Integer.MAX_VALUE;
            ((t53.m0) i95.n0.c(t53.m0.class)).Ui().update(iVar.systemRowid, iVar, false);
            ((t53.m0) i95.n0.c(t53.m0.class)).Ui().doNotify("single", 4, iVar);
        }
        g63.s.a(this.f269149e, iVar, 7L, this.f269150f);
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        android.content.Context context = this.f269151g.getContext();
        ((com.tencent.mm.plugin.game.p0) l1Var).getClass();
        m53.l1 i17 = com.tencent.mm.plugin.game.commlib.i.i();
        if (i17 != null && (h3Var = i17.f323860e) != null && !com.tencent.mm.sdk.platformtools.t8.K0(h3Var.f323750d)) {
            r53.f.u(context, i17.f323860e.f323750d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$bindHistoryConversation$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w33.c f138864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.v f138865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.s f138866f;

    public u(w33.c cVar, com.tencent.mm.plugin.game.chatroom.ui.v vVar, com.tencent.mm.plugin.game.chatroom.ui.s sVar) {
        this.f138864d = cVar;
        this.f138865e = vVar;
        this.f138866f = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/MentionUserViewHolder$setData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        w33.c cVar = this.f138864d;
        long j17 = cVar.f442712d;
        com.tencent.mm.plugin.game.chatroom.ui.v vVar = this.f138865e;
        fVar.e(j17, 2L, vVar.f138869f, vVar.f138870g, cVar.f442710b.f442715a);
        com.tencent.mm.plugin.game.chatroom.ui.s sVar = this.f138866f;
        if (sVar != null) {
            w33.e eVar = cVar.f442710b;
            java.lang.String str = eVar.f442715a;
            java.lang.String str2 = eVar.f442716b;
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = ((com.tencent.mm.plugin.game.chatroom.view.g2) sVar).f139130a;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = gameChatCommentFooter.L;
            if (z2Var != null) {
                z2Var.B();
            }
            gameChatCommentFooter.h(str, str2, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/ui/MentionUserViewHolder$setData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

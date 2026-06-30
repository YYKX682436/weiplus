package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.a0 f141327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f141328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.y f141329f;

    public x(com.tencent.mm.plugin.game.ui.chat_tab.y yVar, com.tencent.mm.plugin.game.ui.chat_tab.a0 a0Var, int i17) {
        this.f141329f = yVar;
        this.f141327d = a0Var;
        this.f141328e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$GameHotMsgAdapter$HotMsgViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        u53.a0 a0Var = (u53.a0) i95.n0.c(u53.a0.class);
        com.tencent.mm.plugin.game.ui.chat_tab.y yVar = this.f141329f;
        android.content.Context context = yVar.f141338m.f141344f.f141123f2;
        com.tencent.mm.plugin.game.ui.chat_tab.a0 a0Var2 = this.f141327d;
        z53.i conversation = a0Var2.f141233e;
        ((z53.q) a0Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(conversation, "conversation");
        ((d63.e) ((u53.b0) i95.n0.c(u53.b0.class))).wi();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_Self", conversation.field_selfUserName);
        intent.putExtra("Chat_User", conversation.field_sessionId);
        intent.putExtra("finish_direct", true);
        com.tencent.mm.game.report.d dVar = com.tencent.mm.game.report.e.f68194a;
        dVar.d(null);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).wi(conversation.field_talker);
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).wi(conversation.field_selfUserName);
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(a0Var2.f141233e.field_selfUserName);
        z53.i iVar = a0Var2.f141233e;
        y53.m mVar = iVar.F;
        if (mVar != null && Di != null) {
            int i17 = this.f141328e + 1;
            int i18 = yVar.f141338m.f141342d;
            java.lang.String str = iVar.field_sessionId;
            long j17 = Di.field_accountType;
            java.lang.String str2 = iVar.field_selfUserName;
            long j18 = mVar.field_accountType;
            java.lang.String str3 = iVar.field_talker;
            long t07 = iVar.t0();
            com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView gameHotMsgView = yVar.f141338m.f141344f;
            long j19 = gameHotMsgView.f141124g2;
            if (j19 <= 0) {
                j19 = gameHotMsgView.f141125h2;
            }
            dVar.f(i17, 2L, i18, str, j17, str2, j18, str3, t07, (int) j19, null, java.lang.Integer.valueOf(a0Var2.f141233e.field_unReadCount));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$GameHotMsgAdapter$HotMsgViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.ui.conversation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceChattingUI;", "Lcom/tencent/mm/ui/chatting/ChattingUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class OpenImKefuServiceChattingUI extends com.tencent.mm.ui.chatting.ChattingUI {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f207390u = jz5.h.b(new com.tencent.mm.ui.conversation.q8(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f207391v = jz5.h.b(new com.tencent.mm.ui.conversation.p8(this));

    @Override // com.tencent.mm.ui.chatting.ChattingUI
    public com.tencent.mm.ui.chatting.ChattingUIFragment c7() {
        return new com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment(true);
    }

    public final com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest g7() {
        return (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) ((jz5.n) this.f207390u).getValue();
    }

    @Override // com.tencent.mm.ui.chatting.ChattingUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.s4 s4Var;
        r45.s4 s4Var2;
        super.onCreate(bundle);
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest g76 = g7();
        kotlin.jvm.internal.o.d(g76);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(g76.f72274f);
        jz5.g gVar = this.f207391v;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceChattingUI", "enterKefuChattingUI getContactScene: %s, isConfirmPageShown: %s", valueOf, java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()));
        int i17 = ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() ? 24 : 23;
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest g77 = g7();
        java.lang.String str = null;
        java.lang.String str2 = (g77 == null || (s4Var2 = g77.f72277i) == null) ? null : s4Var2.f385490h;
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest g78 = g7();
        kotlin.jvm.internal.o.d(g78);
        q41.f.a(str2, i17, g78.f72274f);
        c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest g79 = g7();
        kotlin.jvm.internal.o.d(g79);
        int i18 = g79.f72274f;
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest g710 = g7();
        if (g710 != null && (s4Var = g710.f72277i) != null) {
            str = s4Var.f385490h;
        }
        ((b00.a0) u3Var).hj(i18, str);
    }
}

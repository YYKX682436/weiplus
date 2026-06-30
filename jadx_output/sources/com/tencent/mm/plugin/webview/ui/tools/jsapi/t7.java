package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes11.dex */
public class t7 implements r01.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185421e;

    public t7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185421e = c1Var;
        this.f185420d = y2Var;
    }

    @Override // r01.w2
    public void K1(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gi5 gi5Var;
        com.tencent.mm.protobuf.f fVar;
        java.lang.String str = "enterEnterpriseChat:fail";
        nw4.y2 y2Var = this.f185420d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185421e;
        if (i17 != 0) {
            c1Var.i5(y2Var, "enterEnterpriseChat:fail", null);
            return;
        }
        s01.f0 f0Var = (s01.f0) m1Var;
        com.tencent.mm.modelbase.o oVar = f0Var.f401867e;
        r45.h90 h90Var = (oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.h90) fVar;
        if (i17 < 0) {
            if (h90Var != null && (gi5Var = h90Var.f375950d) != null && com.tencent.mm.sdk.platformtools.t8.K0(gi5Var.f375289e)) {
                str = "enterEnterpriseChat:fail_" + h90Var.f375950d.f375289e;
            }
            c1Var.i5(y2Var, str, null);
            return;
        }
        java.lang.String str2 = h90Var.f375951e;
        java.lang.String str3 = f0Var.f401868f;
        if (str3 == null) {
            c1Var.i5(y2Var, "enterEnterpriseChat:fail", null);
            return;
        }
        s01.h D0 = r01.q3.Ui().D0(str3);
        if (D0 == null || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            c1Var.i5(y2Var, "enterEnterpriseChat:fail", null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str2);
        intent.putExtra("key_biz_chat_id", D0.field_bizChatLocalId);
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_need_send_video", false);
        intent.putExtra("key_is_biz_chat", true);
        j45.l.u(c1Var.f184975d, ".ui.chatting.ChattingUI", intent, null);
        c1Var.i5(y2Var, "enterEnterpriseChat:ok", null);
    }
}

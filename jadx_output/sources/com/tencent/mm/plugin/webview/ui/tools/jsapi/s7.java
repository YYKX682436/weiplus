package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes11.dex */
public class s7 implements r01.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185406f;

    public s7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, java.lang.String str) {
        this.f185406f = c1Var;
        this.f185404d = y2Var;
        this.f185405e = str;
    }

    @Override // r01.w2
    public void K1(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gi5 gi5Var;
        com.tencent.mm.protobuf.f fVar;
        nw4.y2 y2Var = this.f185404d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185406f;
        if (i17 != 0) {
            c1Var.i5(y2Var, "openEnterpriseChat:fail", null);
            return;
        }
        s01.m0 m0Var = (s01.m0) m1Var;
        com.tencent.mm.modelbase.o oVar = m0Var.f401903e;
        r45.uz3 uz3Var = (oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.uz3) fVar;
        if (uz3Var == null || (gi5Var = uz3Var.f387749d) == null || gi5Var.f375288d != 0) {
            if (uz3Var == null || uz3Var.f387749d == null) {
                c1Var.i5(y2Var, "openEnterpriseChat:fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_code", java.lang.Integer.valueOf(uz3Var.f387749d.f375288d));
            java.lang.String str = uz3Var.f387749d.f375289e;
            c1Var.i5(y2Var, str != null ? str : "openEnterpriseChat:fail", hashMap);
            return;
        }
        java.lang.String str2 = uz3Var.f387750e;
        java.lang.String str3 = m0Var.f401904f;
        if (str3 == null) {
            c1Var.i5(y2Var, "openEnterpriseChat:fail", null);
            return;
        }
        s01.h D0 = r01.q3.Ui().D0(str3);
        if (D0 == null || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            c1Var.i5(y2Var, "openEnterpriseChat:fail", null);
            return;
        }
        java.lang.String str4 = this.f185405e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4) || !str4.equals("long")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str2);
            intent.putExtra("key_biz_chat_id", D0.field_bizChatLocalId);
            intent.putExtra("finish_direct", true);
            intent.putExtra("key_need_send_video", false);
            intent.putExtra("key_is_biz_chat", true);
            j45.l.u(c1Var.f184975d, ".ui.chatting.ChattingUI", intent, null);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            intent2.putExtra("biz_chat_need_to_jump_to_chatting_ui", true);
            intent2.putExtra("Main_User", str2);
            intent2.putExtra("biz_chat_chat_id", D0.field_bizChatLocalId);
            intent2.putExtra("biz_chat_from_scene", 8);
            j45.l.u(c1Var.f184975d, ".ui.LauncherUI", intent2, null);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(uz3Var.f387754i) && !com.tencent.mm.sdk.platformtools.t8.K0(uz3Var.f387755m)) {
            hashMap2.put("chat_type", uz3Var.f387754i);
            hashMap2.put("chat_id", uz3Var.f387755m);
        }
        c1Var.i5(y2Var, "openEnterpriseChat:ok", hashMap2);
    }
}

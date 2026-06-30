package vd0;

@j95.b
/* loaded from: classes5.dex */
public final class g2 extends i95.w implements wd0.n1 {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_CHATTING_SEND_BUTTON_LIKE_IOS_REPORT_NEW_INT;
        if (kotlin.jvm.internal.o.b(c17.m(u3Var, 0), 0)) {
            boolean n17 = gm0.j1.u().c().n(66832, false);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, java.lang.Boolean.valueOf(n17));
            hashMap.put("init_report", 1);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("independent_send_msg_setting_btn", "view_clk", hashMap, 30529);
            gm0.j1.u().c().x(u3Var, 1);
        }
    }

    public void wi(java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Integer num3) {
        com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct voiceToTextChatInterfaceStruct = new com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct();
        voiceToTextChatInterfaceStruct.f61699d = num != null ? num.intValue() : 0L;
        if (str == null) {
            str = "";
        }
        voiceToTextChatInterfaceStruct.p(str);
        voiceToTextChatInterfaceStruct.f61701f = num2 != null ? num2.intValue() : 0L;
        voiceToTextChatInterfaceStruct.f61702g = num3 != null ? num3.intValue() : 0L;
        voiceToTextChatInterfaceStruct.k();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(voiceToTextChatInterfaceStruct.g());
        java.lang.String n17 = voiceToTextChatInterfaceStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportFeatureService", "report%s %s", valueOf, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}

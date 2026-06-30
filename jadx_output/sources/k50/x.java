package k50;

/* loaded from: classes.dex */
public final class x implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k50.z f304267a;

    public x(k50.z zVar) {
        this.f304267a = zVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        int i17;
        int i18;
        j75.f stateCenter;
        wi5.n0 n0Var;
        co.a aVar;
        int i19 = 3;
        if (com.tencent.mm.sdk.platformtools.o4.M("message_fold_config2").o("fold_button_status_int_sync", 65536) != 65536) {
            i17 = com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072 ? 2 : 3;
        } else {
            i17 = 1;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b);
        hashMap.put("forward_version", 20250731);
        hashMap.put("forwarding_lists_state", java.lang.Integer.valueOf(i17));
        k50.z zVar = this.f304267a;
        boolean booleanExtra = zVar.getIntent().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK", false);
        boolean booleanExtra2 = zVar.getIntent().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TO_YUANBAO", false);
        boolean booleanExtra3 = zVar.getIntent().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TYPE_WXWORK_LOCAL", false);
        java.util.List i27 = kz5.c0.i(java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(booleanExtra3), java.lang.Boolean.valueOf(zVar.getIntent().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT", false)));
        if (i27.isEmpty()) {
            i18 = 0;
        } else {
            java.util.Iterator it = i27.iterator();
            i18 = 0;
            while (it.hasNext()) {
                if (((java.lang.Boolean) it.next()).booleanValue() && (i18 = i18 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        if (i18 > 1) {
            i19 = 4;
        } else if (booleanExtra) {
            i19 = 1;
        } else if (booleanExtra3) {
            i19 = 2;
        } else if (!booleanExtra2) {
            i19 = 0;
        }
        hashMap.put("forward_lists_other_app", java.lang.Integer.valueOf(i19));
        int intExtra = zVar.getIntent().getIntExtra("ForwardParams_ReportFromScene", 0);
        hashMap.put("forward_from_scene", java.lang.Integer.valueOf(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.k(intExtra)));
        if (kotlin.jvm.internal.o.b(str, "page_in")) {
            hashMap.put("forward_init_time_ms", java.lang.Long.valueOf(zVar.f304277e));
        } else if (kotlin.jvm.internal.o.b(str, "page_out")) {
            hashMap.put("forward_page_out_type", java.lang.Integer.valueOf(zVar.f304279g));
            hashMap.put("forward_finish_time_ms", java.lang.Long.valueOf(c01.id.c() - zVar.T6()));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = zVar.P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null && (aVar = n0Var.f446324t) != null) {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e eVar = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a;
            int g17 = eVar.g(aVar);
            java.lang.String h17 = eVar.h(aVar);
            hashMap.put("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(g17));
            hashMap.put("selected_msg_list", h17);
            int i28 = aVar.f43702d;
            hashMap.put("chat_username", aVar.getString(i28 + 1));
            hashMap.put("forward_msgtype", java.lang.Integer.valueOf(eVar.c(aVar, zVar.getIntent().getIntExtra("ForwardParams_ForwardMsgType", 0))));
            hashMap.put("forward_source_scene", java.lang.Integer.valueOf(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.d(intExtra, aVar.getString(i28 + 1))));
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportUIC", "reportMsgCount: " + g17 + ", reportForwardMsgStr: " + h17 + ", talker: " + aVar.getString(i28 + 1));
        }
        return hashMap;
    }
}

package xe5;

/* loaded from: classes10.dex */
public final class g extends xe5.g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f454024i = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f454025h = "FinderLiveGameTeamUpNotifyTmpl";

    @Override // xe5.g0, xe5.i0
    public void a(com.tencent.mm.ui.chatting.viewitems.fl flVar, java.util.Map values, com.tencent.mm.storage.f9 f9Var, yb5.d ui6) {
        int i17;
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(ui6, "ui");
        xe5.i iVar = flVar != null ? (xe5.i) flVar.a("TipsTempl_GamePurchaseRefund_Success") : null;
        java.lang.String str = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        long Z = pm0.v.Z(str);
        java.lang.String str2 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
        if (str2 == null) {
            str2 = "";
        }
        long Z2 = pm0.v.Z(str2);
        java.lang.String str3 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id");
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_id");
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
        java.lang.String str10 = str9 == null ? "" : str9;
        java.lang.String str11 = (java.lang.String) values.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type");
        java.lang.String str12 = str11 != null ? str11 : "";
        com.tencent.mars.xlog.Log.i(this.f454025h, "msgType: " + str12 + ", " + com.tencent.mm.sdk.platformtools.t8.D1(str12, 0));
        xe5.i iVar2 = iVar;
        f(values, ".msg.appmsg.extinfo.notifymsg", iVar, false, "", str8, ui6, Z, Z2, str4, f9Var, str10, str6, com.tencent.mm.sdk.platformtools.t8.D1(str12, 0));
        android.view.View view = iVar2.f454044e;
        if (view == null) {
            i17 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i17 = 0;
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = iVar2.f454040a;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        android.view.View view3 = iVar2.f454049j;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(i17)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = iVar2.f454047h;
        if (view4 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // xe5.g0
    public java.lang.String d() {
        return this.f454025h;
    }

    @Override // xe5.g0
    public void e(java.lang.String str, long j17, long j18, dm.r4 info, long j19, java.lang.String tipsId, java.lang.String noticeId, xe5.i iVar, java.lang.String str2, int i17, java.lang.String str3) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(tipsId, "tipsId");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
    }
}

package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208116d;

    public d(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI) {
        this.f208116d = unreadConversationFmUI;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.ui.conversation.unreadmode.g0 reporter;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = this.f208116d;
        unreadConversationFmUI.loadData();
        androidx.fragment.app.FragmentActivity activity = unreadConversationFmUI.getActivity();
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity unreadConversationActivity = activity instanceof com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity ? (com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity) activity : null;
        if (unreadConversationActivity != null) {
            int i17 = com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.f208107h;
            unreadConversationActivity.addPrepareChattingFragmentIdleHandler();
        }
        reporter = unreadConversationFmUI.getReporter();
        if (reporter != null) {
            mvvmList = unreadConversationFmUI.mvvmList;
            if (mvvmList == null) {
                kotlin.jvm.internal.o.o("mvvmList");
                throw null;
            }
            java.util.ArrayList unreadList = mvvmList.f152065o;
            kotlin.jvm.internal.o.g(unreadList, "unreadList");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            boolean z17 = true;
            java.util.HashMap f17 = c01.h2.f(1);
            java.util.ArrayList arrayList = new java.util.ArrayList(f17.size());
            java.util.Iterator it = f17.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((com.tencent.mm.storage.l4) ((java.util.Map.Entry) it.next()).getValue()).d1()));
            }
            int I0 = kz5.n0.I0(arrayList);
            com.tencent.mm.ui.conversation.v3 a17 = com.tencent.mm.ui.conversation.w3.f208214g.a(reporter.f208140b);
            jz5.l[] lVarArr = new jz5.l[10];
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int size = unreadList.size();
            int i18 = 0;
            while (i18 < size) {
                com.tencent.mm.storage.l4 l4Var = ((yf5.x) unreadList.get(i18)).f461995d;
                if (l4Var != null && l4Var.d1() > 0) {
                    if (sb6.length() > 0 ? z17 : false) {
                        sb6.append("#");
                    }
                    sb6.append("{username:");
                    sb6.append(l4Var.h1());
                    sb6.append(", unread_num:");
                    sb6.append(l4Var.d1());
                    sb6.append(", LatestMsgTimestamp:");
                    sb6.append(java.lang.Math.max(l4Var.w0(), 0L));
                    sb6.append("}");
                }
                i18++;
                z17 = true;
            }
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            lVarArr[0] = new jz5.l("top100_unread_chat_list", sb7);
            lVarArr[1] = new jz5.l("unread_chat_count", java.lang.Integer.valueOf(f17.size()));
            lVarArr[2] = new jz5.l("unread_num", java.lang.Integer.valueOf(I0));
            lVarArr[3] = new jz5.l("unread_group_event_ms", java.lang.Long.valueOf(reporter.f208139a));
            lVarArr[4] = new jz5.l("user_grey_type", 3L);
            lVarArr[5] = new jz5.l("log_version", 20260429L);
            lVarArr[6] = new jz5.l("in24h_ingroup_unread_chat_cnt", java.lang.Integer.valueOf(a17.f208183a));
            lVarArr[7] = new jz5.l("out24h_ingroup_unread_chat_cnt", java.lang.Integer.valueOf(a17.f208184b));
            lVarArr[8] = new jz5.l("in24h_ingroup_unread_msg_cnt", java.lang.Integer.valueOf(a17.f208185c));
            lVarArr[9] = new jz5.l("out24h_ingroup_unread_msg_cnt", java.lang.Integer.valueOf(a17.f208186d));
            java.util.Map l17 = kz5.c1.l(lVarArr);
            ((cy1.a) rVar).Cj("unread_group_in", null, l17, 35186);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("reportUnreadGroupIn, unreadChatCount=");
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) l17;
            sb8.append(linkedHashMap.get("unread_chat_count"));
            sb8.append(", unreadNum=");
            sb8.append(linkedHashMap.get("unread_num"));
            com.tencent.mars.xlog.Log.i("MicroMsg.UnreadModeReporter", sb8.toString());
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

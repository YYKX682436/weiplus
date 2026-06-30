package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class fd implements cn0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f203958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.g0 f203959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203960c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203961d;

    public fd(com.tencent.mm.ui.chatting.viewitems.hd hdVar, long j17, com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, java.lang.String str) {
        this.f203958a = j17;
        this.f203959b = g0Var;
        this.f203960c = dVar;
        this.f203961d = str;
    }

    @Override // cn0.a
    public void a(long j17, int i17) {
        if (this.f203958a == j17) {
            yb5.d dVar = this.f203960c;
            com.tencent.mm.ui.chatting.viewitems.g0 g0Var = this.f203959b;
            if (i17 == 1) {
                com.tencent.mm.ui.chatting.viewitems.kd kdVar = (com.tencent.mm.ui.chatting.viewitems.kd) g0Var;
                kdVar.f204325c.setText(dVar.g().getResources().getString(com.tencent.mm.R.string.f492883i43));
                android.view.View view = kdVar.f204326d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = kdVar.f204327e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.tencent.mm.ui.report.m0 m0Var = com.tencent.mm.ui.report.m0.f209698a;
            java.lang.String chatName = this.f203961d;
            kotlin.jvm.internal.o.g(chatName, "chatName");
            java.util.HashSet hashSet = com.tencent.mm.ui.report.m0.f209699b;
            if (!hashSet.contains(java.lang.Long.valueOf(j17))) {
                hashSet.add(java.lang.Long.valueOf(j17));
                com.tencent.mm.autogen.mmdata.rpt.GroupLiveShareCardStruct groupLiveShareCardStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupLiveShareCardStruct();
                groupLiveShareCardStruct.f58378d = groupLiveShareCardStruct.b("ChatName", chatName, true);
                groupLiveShareCardStruct.f58380f = 1L;
                groupLiveShareCardStruct.f58381g = java.lang.System.currentTimeMillis();
                groupLiveShareCardStruct.f58382h = groupLiveShareCardStruct.b("LiveIDList", java.lang.String.valueOf(j17), true);
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_card_flashing, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveExptConfig", "ChatRoomCardFlashingSwitch: " + fj6);
                groupLiveShareCardStruct.f58379e = fj6 ? 1L : 2L;
                groupLiveShareCardStruct.k();
            }
            com.tencent.mm.ui.chatting.viewitems.kd kdVar2 = (com.tencent.mm.ui.chatting.viewitems.kd) g0Var;
            kdVar2.f204325c.setText(dVar.g().getResources().getString(com.tencent.mm.R.string.f492884i44));
            boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_card_flashing, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveExptConfig", "ChatRoomCardFlashingSwitch: " + fj7);
            if (fj7) {
                android.view.View view3 = kdVar2.f204326d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = kdVar2.f204327e;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view5 = kdVar2.f204326d;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = kdVar2.f204327e;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

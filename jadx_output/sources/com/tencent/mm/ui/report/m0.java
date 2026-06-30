package com.tencent.mm.ui.report;

/* loaded from: classes11.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.m0 f209698a = new com.tencent.mm.ui.report.m0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f209699b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f209700c = new java.util.HashSet();

    public final void a(com.tencent.mm.storage.l4 con, int i17) {
        no0.o oVar;
        kotlin.jvm.internal.o.g(con, "con");
        java.lang.String j17 = con.j();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ot0.q v17 = ot0.q.v(j17);
        if (v17 != null && v17.f348666i == 60 && con.Q0() == 0 && (oVar = (no0.o) v17.y(no0.o.class)) != null) {
            long parseLong = java.lang.Long.parseLong(oVar.f338731b);
            java.lang.String h17 = con.h1();
            kotlin.jvm.internal.o.d(h17);
            f209700c.add(java.lang.Long.valueOf(parseLong));
            com.tencent.mm.autogen.mmdata.rpt.GroupLiveSessionExposeStruct groupLiveSessionExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupLiveSessionExposeStruct();
            groupLiveSessionExposeStruct.f58372d = groupLiveSessionExposeStruct.b("ChatName", h17, true);
            groupLiveSessionExposeStruct.f58375g = java.lang.System.currentTimeMillis();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_list_show_live, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveExptConfig", "ChatListShowFlashingSwitch: " + fj6);
            groupLiveSessionExposeStruct.f58373e = fj6 ? 3L : 2L;
            groupLiveSessionExposeStruct.f58374f = 1L;
            groupLiveSessionExposeStruct.f58376h = groupLiveSessionExposeStruct.b("LiveIDList", java.lang.String.valueOf(parseLong), true);
            groupLiveSessionExposeStruct.f58377i = i17;
            groupLiveSessionExposeStruct.k();
        }
    }

    public final void b(java.lang.String chatName, long j17, java.lang.String actionToLiveId, long j18, long j19) {
        kotlin.jvm.internal.o.g(chatName, "chatName");
        kotlin.jvm.internal.o.g(actionToLiveId, "actionToLiveId");
        com.tencent.mm.autogen.mmdata.rpt.GroupLiveTipsBarUserActionStruct groupLiveTipsBarUserActionStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupLiveTipsBarUserActionStruct();
        groupLiveTipsBarUserActionStruct.f58383d = groupLiveTipsBarUserActionStruct.b("ChatName", chatName, true);
        groupLiveTipsBarUserActionStruct.f58384e = j17;
        groupLiveTipsBarUserActionStruct.f58385f = groupLiveTipsBarUserActionStruct.b("ActionToLiveId", actionToLiveId, true);
        groupLiveTipsBarUserActionStruct.f58386g = j18;
        groupLiveTipsBarUserActionStruct.f58387h = j19;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_bar_flashing, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + fj6);
        groupLiveTipsBarUserActionStruct.f58388i = fj6 ? 1 : 2;
        groupLiveTipsBarUserActionStruct.k();
    }
}

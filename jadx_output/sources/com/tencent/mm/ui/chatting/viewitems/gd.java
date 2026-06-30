package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class gd implements cn0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204032a;

    public gd(yb5.d dVar) {
        this.f204032a = dVar;
    }

    @Override // cn0.a
    public void a(long j17, int i17) {
        if (j17 == j17 && i17 == 0) {
            com.tencent.mm.ui.report.m0 m0Var = com.tencent.mm.ui.report.m0.f209698a;
            java.lang.String x17 = this.f204032a.x();
            com.tencent.mm.autogen.mmdata.rpt.GroupLiveShareCardStruct groupLiveShareCardStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupLiveShareCardStruct();
            groupLiveShareCardStruct.f58378d = groupLiveShareCardStruct.b("ChatName", x17, true);
            groupLiveShareCardStruct.f58380f = 2L;
            groupLiveShareCardStruct.f58381g = java.lang.System.currentTimeMillis();
            groupLiveShareCardStruct.f58382h = groupLiveShareCardStruct.b("LiveIDList", java.lang.String.valueOf(j17), true);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_card_flashing, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveExptConfig", "ChatRoomCardFlashingSwitch: " + fj6);
            groupLiveShareCardStruct.f58379e = fj6 ? 1L : 2L;
            groupLiveShareCardStruct.k();
        }
    }
}

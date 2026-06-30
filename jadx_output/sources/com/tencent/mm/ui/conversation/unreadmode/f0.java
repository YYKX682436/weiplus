package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.g0 f208132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f208134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f208135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f208136h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dy1.r f208137i;

    public f0(com.tencent.mm.ui.conversation.unreadmode.g0 g0Var, java.lang.String str, int i17, int i18, long j17, dy1.r rVar) {
        this.f208132d = g0Var;
        this.f208133e = str;
        this.f208134f = i17;
        this.f208135g = i18;
        this.f208136h = j17;
        this.f208137i = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.ui.conversation.unreadmode.g0 g0Var = this.f208132d;
        g0Var.getClass();
        java.lang.String str = this.f208133e;
        if (com.tencent.mm.storage.z3.q4(str) || c01.e2.E(str)) {
            i17 = 4;
        } else {
            if (!com.tencent.mm.storage.z3.m4(str)) {
                if (com.tencent.mm.storage.z3.R4(str)) {
                    i17 = 2;
                } else if (com.tencent.mm.storage.z3.O4(str)) {
                    i17 = 1;
                }
            }
            i17 = 3;
        }
        boolean contains = g0Var.f208140b.contains(str);
        com.tencent.mm.ui.conversation.v3 a17 = com.tencent.mm.ui.conversation.w3.f208214g.a(null);
        jz5.l lVar = new jz5.l("unread_num", java.lang.Integer.valueOf(this.f208134f));
        jz5.l lVar2 = new jz5.l("unread_group_event_ms", java.lang.Long.valueOf(g0Var.f208139a));
        jz5.l lVar3 = new jz5.l("chat_type", java.lang.Integer.valueOf(i17));
        int i18 = this.f208135g;
        ((cy1.a) this.f208137i).Cj("view_unread_chat_slide", null, kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("slide_action", java.lang.Integer.valueOf(i18)), new jz5.l("chat_username", str), new jz5.l("latest_msg_ts", java.lang.Long.valueOf(this.f208136h)), new jz5.l("in_unread_group", java.lang.Integer.valueOf(contains ? 1 : 0)), new jz5.l("log_version", 20260429L), new jz5.l("in24h_unread_msg_cnt", java.lang.Integer.valueOf(a17.f208185c)), new jz5.l("out24h_unread_msg_cnt", java.lang.Integer.valueOf(a17.f208186d))), 35186);
        com.tencent.mars.xlog.Log.i("MicroMsg.UnreadModeReporter", "reportSlideChat, username=" + str + ", chatType=" + i17 + ", slideAction=" + i18 + ", inUnreadGroup=" + (contains ? 1 : 0));
    }
}

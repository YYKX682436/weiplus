package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class t4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f202698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f202699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f202700g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f202701h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.s4 f202702i;

    public t4(com.tencent.mm.ui.chatting.s4 s4Var, java.util.Map map, com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, int i17, int i18, boolean z17) {
        this.f202702i = s4Var;
        this.f202697d = map;
        this.f202698e = chatFooter;
        this.f202699f = i17;
        this.f202700g = i18;
        this.f202701h = z17;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 2;
        g4Var.b(2, com.tencent.mm.R.string.f490425um, com.tencent.mm.R.raw.icons_filled_video_call);
        java.util.Map map = this.f202697d;
        map.put("has_reddot", 0);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f202698e;
        map.put("attachment_exp_sessionid", chatFooter.getAppPanel().f189929e);
        com.tencent.mm.ui.chatting.s4 s4Var = this.f202702i;
        map.put("chat_name", s4Var.f202659b.f201645j.x());
        com.tencent.mm.ui.chatting.h4 h4Var = s4Var.f202659b;
        java.lang.String x17 = h4Var.f201645j.x();
        h4Var.getClass();
        if (com.tencent.mm.storage.z3.m4(x17)) {
            i17 = 3;
        } else if (!com.tencent.mm.storage.z3.N4(x17)) {
            i17 = 1;
        }
        if (c01.e2.R(x17)) {
            i17 = 4;
        }
        map.put("chat_type", java.lang.Integer.valueOf(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = this.f202699f;
        sb6.append(i18 + 1);
        sb6.append("#");
        int i19 = chatFooter.getAppPanel().f189930f;
        int i27 = this.f202700g;
        sb6.append((i27 / i19) + 1);
        sb6.append("#");
        sb6.append((i27 % chatFooter.getAppPanel().f189930f) + 1);
        sb6.append("#1");
        map.put("attachment_item_index", sb6.toString());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voip_chat_actionsheet_video", "view_exp", map, 36465);
        if (this.f202701h) {
            return;
        }
        map.put("attachment_item_index", (i18 + 1) + "#" + ((i27 / chatFooter.getAppPanel().f189930f) + 1) + "#" + ((i27 % chatFooter.getAppPanel().f189930f) + 1) + "#2");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voip_chat_actionsheet_voice", "view_exp", map, 36465);
        g4Var.b(1, com.tencent.mm.R.string.f490427uo, com.tencent.mm.R.raw.icons_filled_call);
    }
}

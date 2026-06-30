package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class u4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f202732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f202733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.s4 f202734h;

    public u4(com.tencent.mm.ui.chatting.s4 s4Var, java.util.Map map, int i17, int i18, com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f202734h = s4Var;
        this.f202730d = map;
        this.f202731e = i17;
        this.f202732f = i18;
        this.f202733g = chatFooter;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.s4 s4Var = this.f202734h;
        int i18 = this.f202731e;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f202733g;
        int i19 = this.f202732f;
        java.util.Map map = this.f202730d;
        if (itemId == 1) {
            map.put("attachment_item_index", (i18 + 1) + "#" + ((i19 / chatFooter.getAppPanel().f189930f) + 1) + "#" + ((i19 % chatFooter.getAppPanel().f189930f) + 1) + "#2");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voip_chat_actionsheet_voice", "view_clk", map, 36465);
            s4Var.f202659b.F();
            return;
        }
        if (itemId != 2) {
            return;
        }
        map.put("attachment_item_index", (i18 + 1) + "#" + ((i19 / chatFooter.getAppPanel().f189930f) + 1) + "#" + ((i19 % chatFooter.getAppPanel().f189930f) + 1) + "#1");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voip_chat_actionsheet_video", "view_clk", map, 36465);
        s4Var.f202659b.G();
    }
}

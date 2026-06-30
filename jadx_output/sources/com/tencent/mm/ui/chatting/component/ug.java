package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class ug implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f200068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f200070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f200071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.yg f200072h;

    public ug(com.tencent.mm.ui.chatting.component.yg ygVar, int i17, int i18, boolean z17, boolean z18) {
        this.f200072h = ygVar;
        this.f200068d = i17;
        this.f200069e = i18;
        this.f200070f = z17;
        this.f200071g = z18;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.chatting.component.yg ygVar = this.f200072h;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) ygVar.f198580d.f460708c.a(sb5.s0.class))).f199263e;
        java.util.Map n07 = ygVar.n0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f200068d;
        sb6.append(i17 + 1);
        sb6.append("#");
        int i18 = chatFooter.getAppPanel().f189930f;
        int i19 = this.f200069e;
        sb6.append((i19 / i18) + 1);
        sb6.append("#");
        sb6.append((i19 % chatFooter.getAppPanel().f189930f) + 1);
        sb6.append("#1");
        java.util.HashMap hashMap = (java.util.HashMap) n07;
        hashMap.put("attachment_item_index", sb6.toString());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_actionsheet_send_poi", "view_exp", n07, 36465);
        if (this.f200070f) {
            g4Var.f(1, ygVar.f198580d.s().getString(com.tencent.mm.R.string.ggx));
            g4Var.f(2, ygVar.f198580d.s().getString(com.tencent.mm.R.string.ggy));
            hashMap.put("attachment_item_index", (i17 + 1) + "#" + ((i19 / chatFooter.getAppPanel().f189930f) + 1) + "#" + ((i19 % chatFooter.getAppPanel().f189930f) + 1) + "#2");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_actionsheet_share_poi", "view_exp", n07, 36465);
            return;
        }
        if (!((ygVar.f198580d.u().k2() || com.tencent.mm.storage.z3.y4(ygVar.f198580d.x()) || com.tencent.mm.storage.z3.G4(ygVar.f198580d.x()) || com.tencent.mm.storage.z3.s4(ygVar.f198580d.x()) || com.tencent.mm.storage.z3.H3(ygVar.f198580d.x()) || ygVar.f198580d.x().equals(c01.z1.r())) ? false : true) || this.f200071g) {
            g4Var.f(1, ygVar.f198580d.s().getString(com.tencent.mm.R.string.ggx));
            return;
        }
        g4Var.f(1, ygVar.f198580d.s().getString(com.tencent.mm.R.string.ggx));
        hashMap.put("attachment_item_index", (i17 + 1) + "#" + ((i19 / chatFooter.getAppPanel().f189930f) + 1) + "#" + ((i19 % chatFooter.getAppPanel().f189930f) + 1) + "#2");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_actionsheet_share_poi", "view_exp", n07, 36465);
        g4Var.f(2, ygVar.f198580d.s().getString(com.tencent.mm.R.string.ggy));
    }
}

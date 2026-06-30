package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q0 f207951d;

    public p0(com.tencent.mm.ui.conversation.q0 q0Var) {
        this.f207951d = q0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        android.widget.ListView listView;
        com.tencent.mm.storage.l4 l4Var;
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.conversation.q0 q0Var = this.f207951d;
        if (itemId == 1) {
            com.tencent.mm.storage.l8 r17 = c01.d9.b().r();
            str = q0Var.f207991d.talker;
            ((com.tencent.mm.storage.m4) r17).T(str);
            v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = q0Var.f207991d;
            str2 = convBoxServiceConversationFmUI.talker;
            ((u90.a) vVar).Bi(true, str2, true);
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            str3 = convBoxServiceConversationFmUI.talker;
            ((ce0.e) jVar).getClass();
            com.tencent.mm.modelsimple.g1.J(str3, 13);
            return;
        }
        if (itemId != 2) {
            if (itemId == 3) {
                com.tencent.mm.ui.o3.b(q0Var.f207991d.thisActivity(), new com.tencent.mm.ui.conversation.o0(this));
                return;
            }
            if (itemId != 4) {
                return;
            }
            str10 = q0Var.f207991d.talker;
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI2 = q0Var.f207991d;
            listView = convBoxServiceConversationFmUI2.appbrandMessageLV;
            android.content.Context context = listView.getContext();
            l4Var = convBoxServiceConversationFmUI2.conversation;
            com.tencent.mm.ui.conversation.t1.c(str10, context, l4Var, true, null, null, true, false);
            return;
        }
        com.tencent.mm.storage.l8 r18 = c01.d9.b().r();
        str4 = q0Var.f207991d.talker;
        ((com.tencent.mm.storage.m4) r18).b0(str4);
        com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI3 = q0Var.f207991d;
        str5 = convBoxServiceConversationFmUI3.talker;
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).h(str5);
        de0.j jVar2 = (de0.j) i95.n0.c(de0.j.class);
        str6 = convBoxServiceConversationFmUI3.talker;
        ((ce0.e) jVar2).getClass();
        com.tencent.mm.modelsimple.g1.J(str6, 1);
        v90.v vVar2 = (v90.v) i95.n0.c(v90.v.class);
        str7 = convBoxServiceConversationFmUI3.talker;
        ((u90.a) vVar2).Bi(true, str7, false);
        com.tencent.mm.modelgetchatroommsg.f d17 = com.tencent.mm.modelgetchatroommsg.f.d();
        str8 = convBoxServiceConversationFmUI3.talker;
        d17.b(str8);
        c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
        str9 = convBoxServiceConversationFmUI3.talker;
        ((j00.k1) e3Var).Vi(str9);
    }
}

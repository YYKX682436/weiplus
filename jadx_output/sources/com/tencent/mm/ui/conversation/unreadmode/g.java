package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class g implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208138d;

    public g(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI) {
        this.f208138d = unreadConversationFmUI;
    }

    @Override // l75.z0
    public final void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mm.ui.conversation.unreadmode.s sVar;
        yf5.x d17;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        if ((obj instanceof java.lang.String) && (a1Var instanceof com.tencent.mm.storage.l8)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UnreadConversationFmUI", "ConversationStorageEvent event=" + i17 + ", username=" + obj);
            sVar = this.f208138d.dataSource;
            if (sVar == null) {
                kotlin.jvm.internal.o.o("dataSource");
                throw null;
            }
            java.lang.String username = (java.lang.String) obj;
            kotlin.jvm.internal.o.g(username, "username");
            if (i17 != 2 && i17 != 3 && i17 != 4) {
                if (i17 == 5 && (mvvmList = sVar.f208158e) != null) {
                    mvvmList.s(username);
                    return;
                }
                return;
            }
            p75.m a17 = g95.x.f269827a.a(dm.i2.L.j(username).c(dm.i2.W.m()));
            p75.i0 i18 = dm.i2.K.i();
            i18.f352657d = a17;
            com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) i18.a().o(((jm0.l) ((jz5.n) sVar.f208159f).getValue()).Q4(), com.tencent.mm.storage.l4.class);
            if (l4Var != null) {
                int d18 = l4Var.d1();
                java.util.Set set = sVar.f208160g;
                if ((d18 > 0 || set.contains(l4Var.h1())) && (d17 = sVar.f208157d.d(l4Var, null)) != null) {
                    if (d17.f462014z == 2 || set.contains(l4Var.h1())) {
                        java.lang.String h17 = l4Var.h1();
                        kotlin.jvm.internal.o.f(h17, "getUsername(...)");
                        set.add(h17);
                        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2 = sVar.f208158e;
                        if (mvvmList2 != null) {
                            mvvmList2.y(d17, true);
                        }
                    }
                }
            }
        }
    }
}

package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f207961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.x6 f207962e;

    public p6(com.tencent.mm.ui.conversation.x6 x6Var, boolean z17) {
        this.f207962e = x6Var;
        this.f207961d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.ui.LauncherUI launcherUI;
        com.tencent.mm.ui.HomeUI homeUI;
        com.tencent.mm.ui.MainTabUI mainTabUI;
        com.tencent.mm.ui.conversation.x6 x6Var = this.f207962e;
        if ((x6Var.f208233d.getContext() instanceof com.tencent.mm.ui.LauncherUI) && (launcherUI = (com.tencent.mm.ui.LauncherUI) x6Var.f208233d.getContext()) != null && (homeUI = launcherUI.getHomeUI()) != null && (mainTabUI = homeUI.getMainTabUI()) != null) {
            com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d.getClass();
            com.tencent.mm.ui.conversation.ConvExposeHelper.f207304r.set(mainTabUI.g() == x6Var.f208233d);
        }
        com.tencent.mm.ui.conversation.ConvExposeHelper convExposeHelper = com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d;
        com.tencent.mm.ui.conversation.MainUI mainUI = x6Var.f208233d;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = mainUI.f207372o;
        yf5.j0 j0Var = mainUI.f207379v;
        boolean z18 = this.f207961d;
        convExposeHelper.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvExposeHelper", "isAppStateChangeAffectingVisibility isAppForegroundForLastCheckOfficialAccount=" + com.tencent.mm.ui.conversation.ConvExposeHelper.f207307u + " isAppForeground=" + com.tencent.mm.ui.conversation.ConvExposeHelper.f207306t);
        boolean z19 = com.tencent.mm.ui.conversation.ConvExposeHelper.f207307u;
        boolean z27 = com.tencent.mm.ui.conversation.ConvExposeHelper.f207306t;
        if (z19 != z27) {
            com.tencent.mm.ui.conversation.ConvExposeHelper.f207307u = z27;
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvExposeHelper", "isAppStateChangeAffectingVisibility set isAppForegroundForLastCheckOfficialAccount=" + com.tencent.mm.ui.conversation.ConvExposeHelper.f207307u);
            z17 = true;
        } else {
            z17 = false;
        }
        convExposeHelper.m(conversationListView, j0Var, z18, false, z17);
    }
}

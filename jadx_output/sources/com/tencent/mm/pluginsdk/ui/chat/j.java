package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.k f190427d;

    public j(com.tencent.mm.pluginsdk.ui.chat.k kVar) {
        this.f190427d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.k kVar = this.f190427d;
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = kVar.f190438d;
        int curScreen = appPanel.B == -1 ? appPanel.f189940r.getCurScreen() : -1;
        com.tencent.mm.pluginsdk.ui.chat.AppPanel.n(kVar.f190438d);
        if (curScreen != -1) {
            kVar.f190438d.f189940r.setToScreen(curScreen);
            kVar.f190438d.f189941s.setSelectedDot(curScreen);
        }
    }
}

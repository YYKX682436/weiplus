package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138118d;

    public n(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI) {
        this.f138118d = fTSAddFriendUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI = this.f138118d;
        fTSAddFriendUI.f137907h.getFtsEditText().m();
        fTSAddFriendUI.f137907h.getFtsEditText().t();
    }
}

package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138112d;

    public m(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI) {
        this.f138112d = fTSAddFriendUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI = this.f138112d;
        android.app.Dialog dialog = fTSAddFriendUI.f137882x0;
        if (dialog != null) {
            dialog.dismiss();
            fTSAddFriendUI.f137882x0 = null;
        }
    }
}

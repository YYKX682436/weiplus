package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class k implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg3.r1 f138089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138090e;

    public k(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI, tg3.r1 r1Var) {
        this.f138090e = fTSAddFriendUI;
        this.f138089d = r1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f138089d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI = this.f138090e;
        d17.q(106, fTSAddFriendUI.f137873p0);
        fTSAddFriendUI.f137882x0 = null;
    }
}

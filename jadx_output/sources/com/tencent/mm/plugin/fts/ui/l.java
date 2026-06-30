package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.BizPreSearchEvent f138097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f138098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138099f;

    public l(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI, com.tencent.mm.autogen.events.BizPreSearchEvent bizPreSearchEvent, int i17) {
        this.f138099f = fTSAddFriendUI;
        this.f138097d = bizPreSearchEvent;
        this.f138098e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.f137869p1;
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI = this.f138099f;
        fTSAddFriendUI.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fts.ui.m(fTSAddFriendUI));
        if (this.f138097d.f54006h.f8244a) {
            fTSAddFriendUI.X = 1;
        } else {
            fTSAddFriendUI.X = -1;
        }
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.f7(fTSAddFriendUI, this.f138098e);
    }
}

package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddWw f138377d;

    public y(com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw) {
        this.f138377d = fTSAddWw;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct();
        com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw = this.f138377d;
        openIMSearchFriendtLogStruct.p(fTSAddWw.G);
        openIMSearchFriendtLogStruct.f59792e = 2L;
        openIMSearchFriendtLogStruct.k();
        fTSAddWw.finish();
        return true;
    }
}

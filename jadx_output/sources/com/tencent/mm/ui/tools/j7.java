package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class j7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MultiStageCitySelectUI f210515d;

    public j7(com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI) {
        this.f210515d = multiStageCitySelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.List list = com.tencent.mm.ui.tools.MultiStageCitySelectUI.F;
        com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI = this.f210515d;
        int i17 = multiStageCitySelectUI.f210101o;
        if (i17 == 0) {
            multiStageCitySelectUI.f210094e = null;
        } else if (i17 == 1) {
            multiStageCitySelectUI.f210095f = null;
        } else if (i17 == 2) {
            multiStageCitySelectUI.f210096g = null;
        }
        multiStageCitySelectUI.finish();
        return true;
    }
}

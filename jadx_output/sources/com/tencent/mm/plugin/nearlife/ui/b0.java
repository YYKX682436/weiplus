package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes.dex */
public class b0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI f152315d;

    public b0(com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI selectPoiCategoryUI) {
        this.f152315d = selectPoiCategoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI selectPoiCategoryUI = this.f152315d;
        selectPoiCategoryUI.setResult(0, null);
        selectPoiCategoryUI.finish();
        return true;
    }
}

package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class v1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg f161627d;

    public v1(com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg previewLastHdHeadImg) {
        this.f161627d = previewLastHdHeadImg;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f161627d.finish();
        return true;
    }
}

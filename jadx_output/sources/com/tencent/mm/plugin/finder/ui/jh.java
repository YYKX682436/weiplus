package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class jh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI f129400d;

    public jh(com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI finderSettingMsgUI) {
        this.f129400d = finderSettingMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI.f128733h;
        com.tencent.mm.plugin.finder.ui.FinderSettingMsgUI finderSettingMsgUI = this.f129400d;
        if (finderSettingMsgUI.isFinishing()) {
            return true;
        }
        finderSettingMsgUI.finish();
        return true;
    }
}

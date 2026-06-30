package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class fh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingMsgSayHiUI f129240d;

    public fh(com.tencent.mm.plugin.finder.ui.FinderSettingMsgSayHiUI finderSettingMsgSayHiUI) {
        this.f129240d = finderSettingMsgSayHiUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSettingMsgSayHiUI.f128731e;
        com.tencent.mm.plugin.finder.ui.FinderSettingMsgSayHiUI finderSettingMsgSayHiUI = this.f129240d;
        if (finderSettingMsgSayHiUI.isFinishing()) {
            return true;
        }
        finderSettingMsgSayHiUI.finish();
        return true;
    }
}

package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class zh implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI f130106d;

    public zh(com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI finderSettingProtectUI) {
        this.f130106d = finderSettingProtectUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI finderSettingProtectUI = this.f130106d;
        g4Var.i(1, finderSettingProtectUI.getString(com.tencent.mm.R.string.nzx), finderSettingProtectUI.getResources().getColor(com.tencent.mm.R.color.a2y, null), 0, 0);
    }
}

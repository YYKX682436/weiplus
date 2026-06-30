package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class r7 implements vl1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f161497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161498b;

    public r7(android.widget.ProgressBar progressBar, com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f161497a = progressBar;
        this.f161498b = settingsAuthUI;
    }

    @Override // vl1.j
    public final void a(com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView, androidx.recyclerview.widget.f2 f2Var) {
        if (this.f161497a.getVisibility() == 0) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.T6(this.f161498b);
        }
    }
}

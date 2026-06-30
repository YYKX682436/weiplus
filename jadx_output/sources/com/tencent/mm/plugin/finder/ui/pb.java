package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class pb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderNewSettingPrivacyPreference f129631d;

    public pb(com.tencent.mm.plugin.finder.ui.FinderNewSettingPrivacyPreference finderNewSettingPrivacyPreference) {
        this.f129631d = finderNewSettingPrivacyPreference;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        androidx.fragment.app.FragmentActivity activity = this.f129631d.getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }
}

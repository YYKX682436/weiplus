package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class yf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectSexUI f130063d;

    public yf(com.tencent.mm.plugin.finder.ui.FinderSelectSexUI finderSelectSexUI) {
        this.f130063d = finderSelectSexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectSexUI.f128696h;
        com.tencent.mm.plugin.finder.ui.FinderSelectSexUI finderSelectSexUI = this.f130063d;
        finderSelectSexUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.base.preference.SelectPreference selectPreference = finderSelectSexUI.f128698e;
        if (selectPreference == null) {
            kotlin.jvm.internal.o.o("selectMale");
            throw null;
        }
        if (selectPreference.P) {
            str = "male";
        } else {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = finderSelectSexUI.f128699f;
            if (selectPreference2 == null) {
                kotlin.jvm.internal.o.o("selectFeMale");
                throw null;
            }
            if (selectPreference2.P) {
                str = "female";
            } else {
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = finderSelectSexUI.f128700g;
                if (selectPreference3 == null) {
                    kotlin.jvm.internal.o.o("selectUnshow");
                    throw null;
                }
                if (!selectPreference3.P) {
                    return true;
                }
                str = "unshow";
            }
        }
        ot5.g.c(finderSelectSexUI.f128697d, "outputSex = ".concat(str));
        intent.putExtra("key_output_sex", str);
        finderSelectSexUI.setResult(-1, intent);
        finderSelectSexUI.finish();
        return true;
    }
}

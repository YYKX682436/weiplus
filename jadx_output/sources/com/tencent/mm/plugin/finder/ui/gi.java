package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class gi implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.SettingFragment f129302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingsUI f129303e;

    public gi(com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI) {
        this.f129303e = finderSettingsUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String searchText) {
        kotlin.jvm.internal.o.g(searchText, "searchText");
        com.tencent.mm.plugin.finder.ui.SettingFragment settingFragment = this.f129302d;
        if (settingFragment == null) {
            return;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(settingFragment).a(com.tencent.mm.plugin.finder.ui.ViewBindUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.ui.ViewBindUIC viewBindUIC = (com.tencent.mm.plugin.finder.ui.ViewBindUIC) a17;
        java.util.ArrayList arrayList = settingFragment.f128821t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (r26.n0.B(((lb2.j) obj).f317749d, searchText, true)) {
                arrayList2.add(obj);
            }
        }
        viewBindUIC.O6(arrayList2);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI = this.f129303e;
        this.f129302d = (com.tencent.mm.plugin.finder.ui.SettingFragment) finderSettingsUI.f.get(finderSettingsUI.e);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mm.plugin.finder.ui.SettingFragment settingFragment = this.f129302d;
        if (settingFragment == null) {
            return;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(settingFragment).a(com.tencent.mm.plugin.finder.ui.ViewBindUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.plugin.finder.ui.ViewBindUIC) a17).O6(settingFragment.f128821t);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}

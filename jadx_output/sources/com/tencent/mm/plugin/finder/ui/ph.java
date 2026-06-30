package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class ph extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f129646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI f129647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI finderSettingPersonalizedUI) {
        super(0);
        this.f129646d = checkBoxPreference;
        this.f129647e = finderSettingPersonalizedUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f129646d.O(true);
        ((com.tencent.mm.ui.base.preference.h0) this.f129647e.getPreferenceScreen()).notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}

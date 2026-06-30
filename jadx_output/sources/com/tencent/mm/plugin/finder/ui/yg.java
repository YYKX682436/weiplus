package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class yg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f130064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f130065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI f130066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, boolean z17, com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI) {
        super(0);
        this.f130064d = checkBoxPreference;
        this.f130065e = z17;
        this.f130066f = finderSettingInfoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f130064d.O(!this.f130065e);
        com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI = this.f130066f;
        db5.t7.makeText(finderSettingInfoUI, finderSettingInfoUI.getString(com.tencent.mm.R.string.f0r), 0).show();
        ((com.tencent.mm.ui.base.preference.h0) finderSettingInfoUI.getPreferenceScreen()).notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}

package ir1;

/* loaded from: classes9.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f294050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI) {
        super(0);
        this.f294050d = bizFansSettingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = this.f294050d.getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("biz_fans_msg_hide_disturb_pref");
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        return (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17;
    }
}

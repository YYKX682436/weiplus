package h05;

/* loaded from: classes4.dex */
public class c implements h05.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f277928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI f277929b;

    public c(com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI, com.tencent.mm.ui.base.preference.Preference preference) {
        this.f277929b = wxGamePushSettingUI;
        this.f277928a = preference;
    }

    @Override // h05.i
    public void a(boolean z17) {
        com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI = this.f277929b;
        com.tencent.mm.sdk.platformtools.u3.h(new h05.h(wxGamePushSettingUI, z17, this.f277928a, false, wxGamePushSettingUI.f188557d));
    }
}

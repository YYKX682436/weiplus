package h05;

/* loaded from: classes4.dex */
public class b implements h05.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f277926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI f277927b;

    public b(com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI, com.tencent.mm.ui.base.preference.Preference preference) {
        this.f277927b = wxGamePushSettingUI;
        this.f277926a = preference;
    }

    @Override // h05.i
    public void a(boolean z17) {
        com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI = this.f277927b;
        com.tencent.mm.sdk.platformtools.u3.h(new h05.h(wxGamePushSettingUI, z17, this.f277926a, true, wxGamePushSettingUI.f188557d));
    }
}

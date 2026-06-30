package h05;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f277936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f277937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f277938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f277939g;

    public h(com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI, boolean z17, com.tencent.mm.ui.base.preference.Preference preference, boolean z18, com.tencent.mm.ui.base.preference.r rVar) {
        this.f277936d = z17;
        this.f277937e = preference;
        this.f277938f = z18;
        this.f277939g = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f277936d;
        com.tencent.mm.ui.base.preference.r rVar = this.f277939g;
        boolean z18 = this.f277938f;
        com.tencent.mm.ui.base.preference.Preference preference = this.f277937e;
        if (z17) {
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).O(z18);
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        } else {
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).O(!z18);
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
    }
}

package h05;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h05.e f277930d;

    public d(h05.e eVar) {
        this.f277930d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI = this.f277930d.f277931d;
        r45.ki6 ki6Var = wxGamePushSettingUI.f188558e;
        wxGamePushSettingUI.getClass();
        java.util.Iterator it = ki6Var.f378725d.iterator();
        while (it.hasNext()) {
            r45.ji6 ji6Var = (r45.ji6) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ji6Var.f377843e) && ji6Var.f377844f.size() > 0) {
                com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(wxGamePushSettingUI.getContext(), null);
                preferenceTitleCategory.L(ji6Var.f377843e);
                ((com.tencent.mm.ui.base.preference.h0) wxGamePushSettingUI.f188557d).d(preferenceTitleCategory, -1);
                android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(ji6Var.f377842d), ji6Var.f377843e);
                java.util.Iterator it6 = ji6Var.f377844f.iterator();
                while (it6.hasNext()) {
                    r45.oi6 oi6Var = (r45.oi6) it6.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(oi6Var.f382289d) && !com.tencent.mm.sdk.platformtools.t8.K0(oi6Var.f382291f)) {
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = new com.tencent.mm.ui.base.preference.CheckBoxPreference(wxGamePushSettingUI.getContext());
                        checkBoxPreference.C(oi6Var.f382289d);
                        checkBoxPreference.f197785v = false;
                        checkBoxPreference.L = oi6Var.f382290e;
                        checkBoxPreference.L(oi6Var.f382291f);
                        ((com.tencent.mm.ui.base.preference.h0) wxGamePushSettingUI.f188557d).d(checkBoxPreference, -1);
                        wxGamePushSettingUI.f188559f.add(oi6Var);
                        wxGamePushSettingUI.f188560g.put(oi6Var, pair);
                    }
                }
            }
        }
    }
}

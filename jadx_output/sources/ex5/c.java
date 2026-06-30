package ex5;

/* loaded from: classes7.dex */
public class c implements android.preference.Preference.OnPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.weui.base.preference.WeUIPreference f257247a;

    public c(com.tencent.weui.base.preference.WeUIPreference weUIPreference) {
        this.f257247a = weUIPreference;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object obj) {
        boolean z17;
        com.tencent.weui.base.preference.WeUIPreference weUIPreference = this.f257247a;
        if (!weUIPreference.C && preference.isEnabled() && preference.isSelectable()) {
            weUIPreference.C = true;
            if (preference instanceof com.tencent.weui.base.preference.CheckBoxPreference) {
                com.tencent.weui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.weui.base.preference.CheckBoxPreference) preference;
                checkBoxPreference.f220100d = checkBoxPreference.h();
                if (checkBoxPreference.isPersistent()) {
                    weUIPreference.B.edit().putBoolean(preference.getKey(), checkBoxPreference.h()).commit();
                }
                weUIPreference.getClass();
                z17 = true;
            } else {
                z17 = false;
            }
            if (preference.getKey() != null) {
                weUIPreference.T6(weUIPreference.f220127z, preference);
            }
            if (z17) {
                weUIPreference.f220127z.notifyDataSetChanged();
            }
            weUIPreference.C = false;
            if (z17) {
                return true;
            }
        }
        return false;
    }
}

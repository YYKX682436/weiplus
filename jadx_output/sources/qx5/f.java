package qx5;

/* loaded from: classes13.dex */
public class f {
    public boolean a(android.content.Context context, qx5.l lVar, boolean z17) {
        if (lVar != null) {
            lVar.e(context, z17 ? qx5.a.b() : qx5.a.a());
        }
        return z17;
    }

    public void b(androidx.preference.Preference preference, androidx.preference.o oVar) {
        if ((preference instanceof androidx.preference.EditTextPreference) || (preference instanceof androidx.preference.ListPreference)) {
            preference.f11751h = oVar;
            return;
        }
        if (preference instanceof androidx.preference.PreferenceGroup) {
            androidx.preference.PreferenceGroup preferenceGroup = (androidx.preference.PreferenceGroup) preference;
            for (int i17 = 0; i17 < preferenceGroup.O(); i17++) {
                b(preferenceGroup.N(i17), oVar);
            }
        }
    }
}

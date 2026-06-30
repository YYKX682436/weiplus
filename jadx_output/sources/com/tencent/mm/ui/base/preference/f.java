package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class f implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.ChoicePreference f197799a;

    public f(com.tencent.mm.ui.base.preference.ChoicePreference choicePreference) {
        this.f197799a = choicePreference;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        com.tencent.mm.ui.base.preference.ChoicePreference choicePreference = this.f197799a;
        if (choicePreference.S != null) {
            if (i17 != -1) {
                choicePreference.N = "" + ((java.lang.Object) choicePreference.R[i17 - 1048576]);
            } else {
                choicePreference.N = null;
            }
            choicePreference.P = i17;
            choicePreference.S.a(choicePreference, choicePreference.N);
        }
    }
}

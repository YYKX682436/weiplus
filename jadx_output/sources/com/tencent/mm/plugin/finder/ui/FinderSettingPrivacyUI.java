package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingPrivacyUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderSettingPrivacyUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.m2 f128748d;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494889aq;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128748d;
        if (m2Var != null) {
            m2Var.d(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny.l7(nyVar, 141, 0, null, 6, null);
        }
        setMMTitle(com.tencent.mm.R.string.mra);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.vh(this));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        kotlin.jvm.internal.o.f(preferenceScreen, "getPreferenceScreen(...)");
        com.tencent.mm.plugin.finder.ui.m2 m2Var = new com.tencent.mm.plugin.finder.ui.m2(this, preferenceScreen);
        this.f128748d = m2Var;
        m2Var.c();
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderSettingPrivacyUI);
        aVar.Rj(this, iy1.a.Finder);
        dy1.r ik6 = aVar.ik(this, 12, 27010);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        lVarArr[2] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        ((cy1.a) ik6).gk(this, kz5.c1.k(lVarArr));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        az2.f fVar;
        super.onDestroy();
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128748d;
        if (m2Var == null || (fVar = m2Var.f129498e) == null) {
            return;
        }
        fVar.b();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128748d;
        if (m2Var == null) {
            return true;
        }
        m2Var.e(rVar, preference);
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128748d;
        if (m2Var != null) {
            m2Var.h();
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(android.R.id.text2);
        if (textView == null) {
            return;
        }
        if (!hc2.s.g()) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(getContext().getString(com.tencent.mm.R.string.nzz, java.lang.Boolean.FALSE));
        textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.t_));
        textView.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.ra.class)));
    }
}

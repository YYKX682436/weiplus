package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingMsgUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderSettingMsgUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f128733h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f128734d;

    /* renamed from: e, reason: collision with root package name */
    public zy2.gc f128735e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f128736f = jz5.h.b(new com.tencent.mm.plugin.finder.ui.gh(this));

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.m2 f128737g;

    public final void V6(long j17, int i17) {
        jz5.f0 f0Var;
        if (j17 == 128 || j17 == 256) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.j9.a(ya2.r.f460525a, i17 == 0, j17 == 128 ? 3 : 4, null, 4, null);
            return;
        }
        android.app.Dialog dialog = this.f128734d;
        if (dialog != null) {
            dialog.show();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f128734d = db5.e1.Q(getContext(), getContext().getString(com.tencent.mm.R.string.f490573yv), getContext().getString(com.tencent.mm.R.string.f490604zq), true, false, com.tencent.mm.plugin.finder.ui.hh.f129329d);
        }
        this.f128735e = new com.tencent.mm.plugin.finder.ui.ih(this);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String username = xy2.c.e(context);
        zy2.gc gcVar = this.f128735e;
        kotlin.jvm.internal.o.g(username, "username");
        hb2.j jVar = hb2.j.f280059e;
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderModMessageRedDot", "modifyMessageRedDotSetting username:".concat(username));
        r45.yh2 yh2Var = new r45.yh2();
        yh2Var.set(0, java.lang.Long.valueOf(j17));
        yh2Var.set(1, java.lang.Integer.valueOf(i17));
        hb2.w0.a(jVar, username, yh2Var, gcVar, false, false, null, 56, null);
    }

    public final void W6(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderSettingMsgUI", "[updatePreference] key=" + str + " isEnable=" + z17);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h(str);
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17;
        checkBoxPreference.O(z17);
        checkBoxPreference.f197785v = false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494887ao;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128737g;
        if (m2Var != null) {
            m2Var.d(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        android.app.Dialog dialog = this.f128734d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.enf);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        kotlin.jvm.internal.o.f(preferenceScreen, "getPreferenceScreen(...)");
        com.tencent.mm.plugin.finder.ui.m2 m2Var = new com.tencent.mm.plugin.finder.ui.m2(context, preferenceScreen);
        this.f128737g = m2Var;
        m2Var.c();
        setBackBtn(new com.tencent.mm.plugin.finder.ui.jh(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        az2.f fVar;
        super.onDestroy();
        android.app.Dialog dialog = this.f128734d;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f128735e = null;
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128737g;
        if (m2Var == null || (fVar = m2Var.f129498e) == null) {
            return;
        }
        fVar.b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128737g;
        if (m2Var != null) {
            m2Var.e(rVar, preference);
        }
        kotlin.jvm.internal.o.d(preference);
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("Finder.FinderSettingMsgUI", "click " + str);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h(str);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
        int i17 = 0;
        if (checkBoxPreference != null && checkBoxPreference.N()) {
            i17 = 1;
        }
        int i18 = i17 ^ 1;
        if (str != null) {
            switch (str.hashCode()) {
                case -1253701633:
                    if (str.equals("checkbox_preference_like")) {
                        V6(1L, i18);
                        break;
                    }
                    break;
                case -802775703:
                    if (str.equals("checkbox_preference_wx_comment")) {
                        V6(256L, i18);
                        break;
                    }
                    break;
                case 786619639:
                    if (str.equals("checkbox_preference_comment")) {
                        V6(2L, i18);
                        break;
                    }
                    break;
                case 1601531085:
                    if (str.equals("checkbox_preference_wx_like")) {
                        V6(128L, i18);
                        break;
                    }
                    break;
                case 1912347161:
                    if (str.equals("checkbox_preference_follow")) {
                        V6(4L, i18);
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (((java.lang.Boolean) ((jz5.n) this.f128736f).getValue()).booleanValue()) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("checkbox_preference_like", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("checkbox_preference_comment", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("checkbox_preference_follow", true);
            g92.b bVar = g92.b.f269769e;
            r45.e33 e33Var = (r45.e33) bVar.k2().d().getCustom(17);
            W6("checkbox_preference_wx_like", e33Var != null ? e33Var.getBoolean(2) : true);
            r45.e33 e33Var2 = (r45.e33) bVar.k2().d().getCustom(17);
            W6("checkbox_preference_wx_comment", e33Var2 != null ? e33Var2.getBoolean(3) : true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("checkbox_preference_wx_like", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("checkbox_preference_wx_comment", true);
            ya2.g gVar = ya2.h.f460484a;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ya2.b2 b17 = gVar.b(xy2.c.e(context));
            if (b17 != null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderSettingMsgUI", "[updateView] username=" + b17.D0() + " messageStatus=" + b17.field_messageStatus);
                W6("checkbox_preference_like", (b17.field_messageStatus & 1) != 1);
                W6("checkbox_preference_comment", (b17.field_messageStatus & 2) != 2);
                W6("checkbox_preference_follow", (b17.field_messageStatus & 4) != 4);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f128737g;
        if (m2Var != null) {
            m2Var.h();
        }
    }
}

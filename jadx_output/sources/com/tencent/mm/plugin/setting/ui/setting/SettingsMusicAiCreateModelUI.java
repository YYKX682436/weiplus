package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsMusicAiCreateModelUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SettingsMusicAiCreateModelUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f160572h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160573d;

    /* renamed from: e, reason: collision with root package name */
    public int f160574e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.lc0 f160575f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f160576g;

    public SettingsMusicAiCreateModelUI() {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f160576g = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public final void V6() {
        java.util.LinkedList linkedList;
        com.tencent.mm.ui.base.preference.r rVar = this.f160573d;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).t();
        }
        bw5.lc0 lc0Var = this.f160575f;
        if (lc0Var == null || (linkedList = lc0Var.f29747q) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bw5.kc0 kc0Var = (bw5.kc0) it.next();
            com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(this);
            preference.C(kc0Var.b());
            preference.L(kc0Var.b());
            preference.H(this.f160574e == kc0Var.f29345d ? "✓" : "");
            preference.f197788y = getResources().getColor(com.tencent.mm.R.color.Brand_100, null);
            preference.E(8);
            com.tencent.mm.ui.base.preference.r rVar2 = this.f160573d;
            if (rVar2 != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar2).d(preference, -1);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        this.f160573d = getPreferenceScreen();
        setMMTitle(com.tencent.mm.R.string.phu);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.setting.ui.setting.yi(this), null, com.tencent.mm.ui.fb.GREEN);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.zi(this));
        kotlinx.coroutines.l.d(this.f160576g, null, null, new com.tencent.mm.plugin.setting.ui.setting.aj(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        kotlinx.coroutines.z0.e(this.f160576g, null, 1, null);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.util.LinkedList linkedList;
        if (preference == null) {
            return false;
        }
        java.lang.String str = preference.f197780q;
        bw5.lc0 lc0Var = this.f160575f;
        if (lc0Var != null && (linkedList = lc0Var.f29747q) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                bw5.kc0 kc0Var = (bw5.kc0) it.next();
                if (kotlin.jvm.internal.o.b(kc0Var.b(), str)) {
                    this.f160574e = kc0Var.f29345d;
                }
            }
        }
        V6();
        return true;
    }
}

package com.tencent.mm.plugin.repairer.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/BasePreferenceRepairerUI;", "Lcom/tencent/weui/base/preference/WeUIPreference;", "<init>", "()V", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class BasePreferenceRepairerUI extends com.tencent.weui.base.preference.WeUIPreference {
    @Override // com.tencent.weui.base.preference.WeUIPreference, com.tencent.mm.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            return;
        }
        finish();
    }
}

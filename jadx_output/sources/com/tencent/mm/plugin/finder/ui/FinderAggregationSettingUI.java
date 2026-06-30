package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/e0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderAggregationSettingUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.e0 f128503t = new com.tencent.mm.plugin.finder.ui.e0(null);

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ee_;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.nxd);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.f0(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.raw);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.v2z);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = findViewById != null ? (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById.findViewById(com.tencent.mm.R.id.rav) : null;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(booleanValue);
        }
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.finder.ui.i0(this, findViewById2, mMSwitchBtn));
        }
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.m0(this));
    }
}

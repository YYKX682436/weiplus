package com.tencent.mm.plugin.sns.ui.flexible;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/flexible/SnsFlexibleVideoActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "fc4/l0", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public final class SnsFlexibleVideoActivity extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final fc4.l0 f168350d = new fc4.l0(null);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        return com.tencent.mm.R.layout.dwx;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        java.util.Set D0 = kz5.z.D0(new java.lang.Class[]{fc4.k0.class, fc4.f0.class, fc4.p.class, fc4.j0.class, fc4.g.class, fc4.j.class, fc4.h.class, fc4.v.class});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        return D0;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWindowStyle", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        try {
            hideTitleView();
            getWindow().setFlags(201327616, 201327616);
            getWindow().addFlags(128);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsFlexibleVideoActivity", e17, "initWindowStyle error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWindowStyle", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFlexibleVideoActivity", "[" + hashCode() + "]onCreate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFlexibleVideoActivity", "[" + hashCode() + "]onDestroy");
        try {
            getWindow().clearFlags(128);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsFlexibleVideoActivity", e17, "clearFlags error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFlexibleVideoActivity", "[" + hashCode() + "]onPause");
        qp1.h0.b();
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().r0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFlexibleVideoActivity", "[" + hashCode() + "]onResume");
        qp1.h0.a(true, true, true);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().k0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity");
    }
}

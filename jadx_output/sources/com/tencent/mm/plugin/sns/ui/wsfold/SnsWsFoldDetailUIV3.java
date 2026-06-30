package com.tencent.mm.plugin.sns.ui.wsfold;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/wsfold/SnsWsFoldDetailUIV3;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes4.dex */
public final class SnsWsFoldDetailUIV3 extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f171336e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f171337d;

    public SnsWsFoldDetailUIV3() {
        jz5.h.b(new com.tencent.mm.plugin.sns.ui.wsfold.x(this));
        this.f171337d = jz5.h.b(com.tencent.mm.plugin.sns.ui.wsfold.a0.f171338d);
    }

    public static final com.tencent.mm.sdk.coroutines.LifecycleScope U6(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getScope", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        snsWsFoldDetailUIV3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScope", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) snsWsFoldDetailUIV3.f171337d).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScope", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getScope", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        return lifecycleScope;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(9:5|6|(1:(3:12|13|14)(2:9|10))(4:32|(10:34|(2:36|(1:(1:39)(1:40))(1:68))(1:69)|41|(1:43)|44|(2:45|(2:47|(4:50|51|(1:65)(1:55)|56)(1:49))(2:66|67))|57|58|59|(1:61))(1:70)|22|23)|15|16|17|(1:24)(1:21)|22|23))|71|6|(0)(0)|15|16|17|(1:19)|24|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0212, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0213, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V6(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 r21, int r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3.V6(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        return com.tencent.mm.R.layout.epo;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        java.util.Set D0 = kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.sns.ui.wsfold.w.class, com.tencent.mm.plugin.sns.ui.wsfold.f1.class, com.tencent.mm.plugin.sns.ui.improve.component.m.class, com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC.class, com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.class, com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.class, f94.a.class});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        return D0;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        setMMTitle(com.tencent.mm.R.string.jhz);
        setActionbarColor(i65.a.d(getContext(), com.tencent.mm.R.color.a07));
        setBackBtn(new com.tencent.mm.plugin.sns.ui.wsfold.y(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ws_fold_setting, false)) {
            addIconOptionMenu(0, com.tencent.mm.R.string.okk, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.sns.ui.wsfold.z(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWsFoldSettingBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "reportWsFoldSettingBtn >> ".concat("view_exp"));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_3_dot", "view_exp", kz5.q0.f314001d, 33050);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWsFoldSettingBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        ot5.g.c("MicroMsg.SnsWsFoldDetailUIV3", "[" + hashCode() + "] onCreate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        super.onDestroy();
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.M();
        yc4.b0 b0Var = yc4.b0.f460839a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markExitWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        yc4.b0.f460842d = yc4.b0.f460840b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markExitWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        ot5.g.c("MicroMsg.SnsWsFoldDetailUIV3", "[" + hashCode() + "] onCreate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        super.onPause();
        ot5.g.c("MicroMsg.SnsWsFoldDetailUIV3", "[" + hashCode() + "] onCreate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        super.onResume();
        ot5.g.c("MicroMsg.SnsWsFoldDetailUIV3", "[" + hashCode() + "] onCreate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
    }
}

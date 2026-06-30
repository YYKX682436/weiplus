package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsStarListUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes4.dex */
public final class SnsStarListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public boolean f167419d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167420e = "";

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.statistics.b0 f167421f = new com.tencent.mm.plugin.sns.statistics.b0();

    /* renamed from: g, reason: collision with root package name */
    public int f167422g;

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        if (!(keyEvent != null && keyEvent.getKeyCode() == 4) || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
            return dispatchKeyEvent;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUI", "back press in starList UI");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = (com.tencent.mm.plugin.sns.SnsStarListUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.sns.SnsStarListUIC.class);
        snsStarListUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        intent.putExtra("sns_cmd_list", snsStarListUIC.f162552r);
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        return com.tencent.mm.R.layout.ctp;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        java.util.Set D0 = kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.sns.SnsStarListDataUIC.class, com.tencent.mm.plugin.sns.SnsStarListUIC.class});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        return D0;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        this.f167419d = getIntent().getBooleanExtra("KEY_IS_SELF", false);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_USER_NAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f167420e = stringExtra;
        this.f167422g = getIntent().getIntExtra("INTENT_SOURCE_PATH", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarListUITitle", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        if (this.f167419d) {
            setMMTitle(com.tencent.mm.R.string.f493246jf4);
        } else {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) com.tencent.mm.plugin.sns.model.l4.pj()).n(this.f167420e, true);
            java.lang.String v07 = ca4.z0.v0(n17 != null ? n17.g2() : this.f167420e);
            java.lang.String r17 = i65.a.r(this, com.tencent.mm.R.string.f493247jf5);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{v07}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            setMMTitle(format);
        }
        setBackBtn(new com.tencent.mm.plugin.sns.ui.rq(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarListUITitle", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInitRptData", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        boolean h17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(this.f167420e);
        java.util.ArrayList arrayList = ta4.h1.f416750a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentStruct", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct = ta4.h1.f416752c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentStruct", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        snsUserBehaviourInfoStruct.f60773f = h17 ? 1L : 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentStruct", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct2 = ta4.h1.f416752c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentStruct", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        snsUserBehaviourInfoStruct2.f60771d = snsUserBehaviourInfoStruct2.b("OwnerUsername", this.f167420e, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initReporter", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        java.lang.String str = this.f167420e;
        com.tencent.mm.plugin.sns.statistics.b0 b0Var = this.f167421f;
        b0Var.a(str);
        int i17 = this.f167422g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSourcePath50330", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        b0Var.f164831a = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSourcePath50330", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        java.lang.String stringExtra2 = getIntent().getStringExtra("INTENT_ALBUM_COMMENT_SESSION_ID");
        java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        b0Var.f164832b = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        b0Var.f164833c = 9;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = (com.tencent.mm.plugin.sns.SnsStarListUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.sns.SnsStarListUIC.class);
        snsStarListUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReporter", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        snsStarListUIC.f162544g = b0Var;
        sb4.w wVar = snsStarListUIC.f162543f;
        if (wVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            wVar.A = b0Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReporter", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initReporter", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInitRptData", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUI", "initData >> " + this.f167419d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onDestroy();
        this.f167421f.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.tencent.mm.plugin.sns.statistics.b0.f164830k = new java.lang.ref.WeakReference(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onPause();
        this.f167421f.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onResume();
        this.f167421f.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onStart();
        java.util.ArrayList arrayList = ta4.h1.f416750a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("albumPageStart", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        ta4.h1.f416757h = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("albumPageStart", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onStop();
        java.util.ArrayList arrayList = ta4.h1.f416750a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("albumPageStop", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        if (ta4.h1.f416757h != 0) {
            ta4.h1.f416758i += java.lang.System.currentTimeMillis() - ta4.h1.f416757h;
            ta4.h1.f416757h = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("albumPageStop", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }
}

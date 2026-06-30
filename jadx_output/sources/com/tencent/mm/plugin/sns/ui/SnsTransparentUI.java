package com.tencent.mm.plugin.sns.ui;

@db5.a(7)
/* loaded from: classes4.dex */
public class SnsTransparentUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f167480e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f167481d = new java.util.HashMap();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        super.onCreate(bundle);
        this.mController.J();
        android.content.Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("op", -1);
            if (intExtra == 2) {
                java.lang.String stringExtra = intent.getStringExtra("adlandingXml");
                java.lang.String stringExtra2 = intent.getStringExtra("shareTitle");
                java.lang.String stringExtra3 = intent.getStringExtra("shareThumbUrl");
                java.lang.String stringExtra4 = intent.getStringExtra("shareDesc");
                java.lang.String stringExtra5 = intent.getStringExtra("shareUrl");
                java.lang.String stringExtra6 = intent.getStringExtra("statExtStr");
                java.lang.String stringExtra7 = intent.getStringExtra("uxInfo");
                java.lang.String stringExtra8 = intent.getStringExtra("canvasId");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                com.tencent.mars.xlog.Log.i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI");
                com.tencent.mars.xlog.Log.i("SnsTransparentUI.Share", "uxInfo = " + stringExtra7 + ", canvasId = " + stringExtra8);
                java.lang.String r17 = c01.z1.r();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "openAdCanvasPage doTransmit in SnsTransparentUI, uxInfo is " + stringExtra7 + ", selfUserName is " + r17);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Conv_Type", com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE);
                intent2.putExtra("select_is_ret", true);
                j45.l.w(this, ".ui.transmit.SelectConversationUI", intent2, 0, new com.tencent.mm.plugin.sns.ui.at(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, r17, stringExtra8));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                str = "onCreate";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            }
            if (intExtra == 4) {
                java.lang.String stringExtra9 = intent.getStringExtra("phoneNum");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDial", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                com.tencent.mm.pluginsdk.ui.span.q qVar = com.tencent.mm.pluginsdk.ui.span.p.f191273a;
                com.tencent.mm.plugin.sns.ui.bt btVar = new com.tencent.mm.plugin.sns.ui.bt(this);
                android.os.Bundle bundle2 = new android.os.Bundle();
                ((ez.z0) qVar).getClass();
                com.tencent.mm.pluginsdk.ui.span.u0.d(this, stringExtra9, btVar, bundle2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDial", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            }
        }
        str = "onCreate";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
    }
}

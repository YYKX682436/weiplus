package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class SnsAdProxyUI extends com.tencent.mm.ui.MMFragmentActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f166771e = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f166772d = false;

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResources", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        if (getAssets() == null || com.tencent.mm.sdk.platformtools.x2.f193075e == null) {
            android.content.res.Resources resources = super.getResources();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResources", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            return resources;
        }
        android.content.res.Resources resources2 = com.tencent.mm.sdk.platformtools.x2.f193075e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResources", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        return resources2;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.iw5 iw5Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdBlankUI", "intent null!");
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            return;
        }
        int intExtra = intent.getIntExtra("action_type", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdBlankUI", "action=" + intExtra);
        if (intExtra < 0) {
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delAction", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdBlankUI", "delAction， action=" + intExtra);
        if (intExtra == 1) {
            com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
            am.r3 r3Var = dealQBarStrEvent.f54079g;
            r3Var.f7781b = this;
            r3Var.f7780a = intent.getStringExtra("qrcodeStr");
            r3Var.f7782c = intent.getIntExtra("qrcodeType", 0);
            r3Var.f7783d = intent.getIntExtra("qrcodeVer", 0);
            r3Var.f7788i = 30;
            java.lang.String stringExtra = intent.getStringExtra("aid");
            int intExtra2 = intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int intExtra3 = intent.getIntExtra("ad_scene", 0);
            r45.u2 u2Var = new r45.u2();
            u2Var.f386953e = ca4.z0.F0(stringExtra);
            u2Var.f386952d = intExtra3;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdBlankUI", "aid is " + stringExtra + ", scene is " + intExtra2 + ", adScene is " + intExtra3 + ", long type aid is " + u2Var.f386953e);
            jd0.d2 d2Var = (jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class));
            d2Var.getClass();
            d2Var.wi(dealQBarStrEvent);
            r45.bx5 bx5Var = r3Var.f7795p.f372281d;
            bx5Var.f371132d = intExtra2;
            bx5Var.f371136h = u2Var;
            dealQBarStrEvent.e();
            this.f166772d = true;
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.sns.ui.ud(this), 2000L);
        } else if (intExtra == 2) {
            java.lang.String stringExtra2 = intent.getStringExtra(dm.i4.COL_USERNAME);
            java.lang.String stringExtra3 = intent.getStringExtra("url");
            java.lang.String stringExtra4 = intent.getStringExtra("sceneNote");
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = stringExtra2;
            nxVar.f7467b = stringExtra3;
            nxVar.f7469d = 1084;
            nxVar.f7470e = stringExtra4;
            nxVar.f7471f = this;
            startAppBrandUIFromOuterEvent.e();
            finish();
        } else {
            java.lang.String str = "";
            if (intExtra == 3) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOpenProfile", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                byte[] byteArrayExtra = intent.getByteArrayExtra("searchContactResponseByte");
                java.lang.String stringExtra5 = intent.getStringExtra("searchWord");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                try {
                    iw5Var = new r45.iw5();
                    linkedList = iw5Var.E;
                    iw5Var.parseFrom(byteArrayExtra);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdBlankUI", "doOpenProfile, query=" + stringExtra5 + ", count=" + iw5Var.D);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdBlankUI", "parse GetWXUserNameResp exp=" + th6.toString());
                }
                if (iw5Var.D <= 0) {
                    java.lang.String g17 = x51.j1.g(iw5Var.f377356d);
                    if (g17 != null) {
                        str = g17;
                    }
                    if (str.length() > 0) {
                        android.content.Intent intent2 = new android.content.Intent();
                        ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).Ai(intent2, iw5Var, 182);
                        intent2.putExtra("Contact_Scene", 182);
                        intent2.putExtra("add_more_friend_search_scene", 2);
                        j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
                    }
                } else if (linkedList.isEmpty()) {
                    db5.e1.o(this, com.tencent.mm.R.string.icr, 0, true, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOpenProfile", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                    finish();
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).wi(intent3, (r45.gw5) linkedList.getFirst(), 182);
                    j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent3, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOpenProfile", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                finish();
            } else if (intExtra == 4) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                try {
                    java.lang.String stringExtra6 = intent.getStringExtra("finderUsername");
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (stringExtra6 == null) {
                        stringExtra6 = "";
                    }
                    java.lang.String stringExtra7 = intent.getStringExtra("uxInfo");
                    if (stringExtra7 == null) {
                        stringExtra7 = "";
                    }
                    java.lang.String stringExtra8 = intent.getStringExtra("snsIdStr");
                    if (stringExtra8 != null) {
                        str = stringExtra8;
                    }
                    l44.s4.h(this, stringExtra6, stringExtra7, str, intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdBlankUI", "doJumpToFinderProfileUI, exp=" + th7.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                finish();
            } else {
                finish();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delAction", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        super.onStop();
        if (this.f166772d && !isFinishing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdBlankUI", "finish, onStop");
            this.f166772d = false;
            finish();
            overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
    }
}

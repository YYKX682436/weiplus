package com.tencent.mm.plugin.sns.ad.animproxy;

@db5.a(7)
@ul5.d(0)
/* loaded from: classes4.dex */
public class SnsAdAnimProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static t34.f f162628m;

    /* renamed from: d, reason: collision with root package name */
    public t34.f f162629d;

    /* renamed from: e, reason: collision with root package name */
    public t34.a f162630e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f162631f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f162632g = false;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f162633h = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final c84.f f162634i = new t34.c(this);

    public static /* synthetic */ void T6(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        V6(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    public static void V6(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2029, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    public final void U6() {
        com.tencent.mm.plugin.sns.ui.listener.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpLandingPageAndFinish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        if (isFinishing()) {
            com.tencent.mars.xlog.Log.w("SnsAdAnimProxyUI", "doJumpLandingPageAndFinish, activity destroyed");
            V6(11);
        } else {
            com.tencent.mars.xlog.Log.i("SnsAdAnimProxyUI", "doJumpLandingPageAndFinish, handleClick");
            V6(10);
            int i17 = ca4.m0.Y(this.f162629d.f415423b) ? 1 : 2;
            t34.f fVar = this.f162629d;
            w64.n nVar = new w64.n(this, fVar.f415422a, fVar.f415424c, null, fVar.f415427f);
            t34.f fVar2 = this.f162629d;
            nVar.n(fVar2.f415425d, fVar2.f415423b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            nVar.f443320m = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            android.view.View view = this.f162631f;
            w64.l lVar = this.f162629d.f415427f;
            if (lVar == null || lVar.b() == null) {
                com.tencent.mars.xlog.Log.e("SnsAdAnimProxyUI", "onGetAnimContentView==null, use mRoot");
            } else {
                view = this.f162629d.f415427f.b();
            }
            t34.f fVar3 = this.f162629d;
            u74.d dVar = fVar3.f415430i;
            if (dVar != null && (iVar = fVar3.f415429h) != null) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = fVar3.f415423b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                l44.j4 j4Var = null;
                if (ca4.m0.u0(e42.c0.clicfg_sns_full_card_ad_disable_jump_anim_info, 0) == 1) {
                    com.tencent.mars.xlog.Log.i("ClickActionHelper", "disableJumpAnimInfo, do origin logic");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                } else if (snsInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                } else if (dVar == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                } else {
                    j4Var = new l44.j4(snsInfo, dVar, iVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                }
                if (j4Var != null) {
                    nVar.x(j4Var);
                    t34.f fVar4 = this.f162629d;
                    fVar4.f415429h.U(j4Var, fVar4.f415423b.getAdXml().forbiddenCustomAnimation);
                }
            }
            nVar.k(view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delayFinish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            this.f162633h.postDelayed(new t34.b(this), 300L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delayFinish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpLandingPageAndFinish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    public final void W6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActivityStyle", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        try {
            hideActionbarLine();
            getWindow().getDecorView().setSystemUiVisibility(1280);
            setActionbarColor(getColor(com.tencent.mm.R.color.a9e));
            getController().O0(this.f162629d.f415428g);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdAnimProxyUI", "setActivityStyle, exp=" + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActivityStyle", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        com.tencent.mars.xlog.Log.i("SnsAdAnimProxyUI", "finish");
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        return com.tencent.mm.R.layout.coe;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("SnsAdAnimProxyUI", "onDestroy, hash=" + hashCode());
        V6(15);
        this.f162633h.removeCallbacksAndMessages(null);
        f162628m = null;
        t34.a aVar = this.f162630e;
        if (aVar != null) {
            aVar.onDestroy();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("SnsAdAnimProxyUI", "onKeyDown back, isEnableBack=" + this.f162632g);
            if (!this.f162632g) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
                return true;
            }
            V6(14);
        }
        boolean onKeyDown = super.onKeyDown(i17, keyEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        return onKeyDown;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        super.onStop();
        com.tencent.mars.xlog.Log.i("SnsAdAnimProxyUI", "onStop, isFinishing=" + isFinishing() + ", hash=" + hashCode());
        f162628m = null;
        if (!isFinishing()) {
            V6(12);
            finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        super.onWindowFocusChanged(z17);
        if (z17) {
            W6();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setActionbarColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        super.setActionbarColor(i17);
        vj5.o.e(getWindow());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }
}

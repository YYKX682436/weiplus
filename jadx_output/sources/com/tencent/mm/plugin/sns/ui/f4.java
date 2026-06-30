package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class f4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f168290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.c4 f168291e;

    public f4(com.tencent.mm.plugin.sns.ui.c4 c4Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f168291e = c4Var;
        this.f168290d = snsInfo;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.c4 c4Var = this.f168291e;
        c4Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFootSheetCLick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "request deal QBAR string");
        wd4.l1 l1Var = c4Var.f168091h;
        if (l1Var != null && l1Var.g()) {
            c4Var.f168091h.d().u();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f168290d;
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        bundle.putString("stat_msg_id", "sns_" + ca4.z0.t0(snsInfo.field_snsId));
        bundle.putString("stat_chat_talker_username", snsInfo.field_userName);
        bundle.putString("stat_send_msg_user", snsInfo.field_userName);
        bundle.putInt("stat_scene", 3);
        bundle.putInt("pay_qrcode_session_type", 3);
        bundle.putString("pay_qrcode_session_name", snsInfo.field_userName);
        bundle.putString("pay_qrcode_sender_username", snsInfo.field_userName);
        bundle.putString("pay_qrcode_timeline_objid", t07);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("DealQBarString", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "request deal QBAR string snsSvrId: %s", t07);
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        android.app.Activity activity = (android.app.Activity) c4Var.f168087d;
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = activity;
        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = c4Var.f168103w;
        r3Var.f7780a = imageQBarDataBean.f158619d;
        r3Var.f7782c = imageQBarDataBean.f158620e;
        r3Var.f7783d = imageQBarDataBean.f158621f;
        r3Var.f7788i = 38;
        r3Var.f7791l = bundle;
        r3Var.f7792m = imageQBarDataBean.f158627o;
        r3Var.f7794o = true;
        r3Var.f7796q = imageQBarDataBean.f158630r;
        r45.db0 db0Var = new r45.db0();
        r3Var.f7795p = db0Var;
        db0Var.f372282e = t07;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        android.os.Bundle bundle2 = r3Var.f7791l;
        if (bundle2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "addStatInfo4AppBrand, statObj is null");
            bundle2 = new android.os.Bundle();
            r3Var.f7791l = bundle2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "addStatInfo4AppBrand, from sns");
        bundle2.putInt("LaunchCodeScene_ScanScene", 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        dealQBarStrEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("DealQBarString", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFootSheetCLick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$2");
    }
}

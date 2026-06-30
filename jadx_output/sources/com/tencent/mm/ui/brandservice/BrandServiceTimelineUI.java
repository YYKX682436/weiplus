package com.tencent.mm.ui.brandservice;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/brandservice/BrandServiceTimelineUI;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class BrandServiceTimelineUI extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity {

    /* renamed from: u, reason: collision with root package name */
    public final android.os.Handler f198038u = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: v, reason: collision with root package name */
    public boolean f198039v;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.l_);
        super.onCreate(bundle);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347328y);
        ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
        zv.m0 m0Var = zv.m0.f476029a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_brand_service_box_report_cgi_android, false)) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("tl_main_session_holder", "view_clk", kz5.c1.m(m0Var.c(), zv.m0.f476035g), 12, false);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("tl_main_session_holder", "view_clk", kz5.c1.m(m0Var.c(), zv.m0.f476035g), 32424);
        }
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.BrandServiceTimelineUI);
        aVar.Rj(this, iy1.a.BizTimeline);
        ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
        com.tencent.wechat.aff.brand_service.a d17 = yw.a3.f466266a.d();
        java.lang.String b17 = d17 != null ? d17.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        jz5.l lVar = new jz5.l("custom_session_id", b17);
        ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
        aVar.mk(this, kz5.c1.k(lVar, new jz5.l("expose_id", java.lang.String.valueOf(zv.m0.f476030b)), new jz5.l("ui_version", 1)));
        aVar.kk(this, 32, 32424, false);
        getWindow().getDecorView().setBackgroundColor(0);
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f198038u.removeCallbacksAndMessages(null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        boolean z18 = this.f198039v;
        if (z18 || !z17 || z18) {
            return;
        }
        getWindow().getDecorView().post(new com.tencent.mm.ui.brandservice.o(this));
    }
}

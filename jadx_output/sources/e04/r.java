package e04;

/* loaded from: classes9.dex */
public class r implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f246076a;

    public r(e04.p pVar, android.content.Context context) {
        this.f246076a = context;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        if (str.equals("finishAndBack")) {
            boolean optBoolean = ((org.json.JSONObject) obj).optBoolean("toScan", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "finish send hongbao, toScan = %s.", java.lang.Boolean.valueOf(optBoolean));
            if (optBoolean) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
                intent.putExtra("key_scan_report_enter_scene", 32);
                intent.putExtra("key_config_black_interval", true);
                intent.putExtra("key_enable_multi_code", true);
                intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
                intent.putExtra("key_enable_scan_code_product_merge", true);
                j45.l.j(this.f246076a, "scanner", ".ui.BaseScanUI", intent, null);
            }
        }
        return false;
    }
}

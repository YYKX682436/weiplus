package com.tencent.mm.plugin.scanner.ui;

@db5.a(3)
/* loaded from: classes3.dex */
public class ConfirmScanBankCardResultUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f159285h = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f159286d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f159287e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f159288f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f159289g;

    public final void T6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("scan_bankcard_with_confirm_ui", true);
        intent.addFlags(268435456);
        intent.setClass(this, com.tencent.mm.plugin.scanner.ui.ScanCardUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "goBackScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "goBackScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a0_;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.ib6);
        boolean z17 = false;
        if (getIntent() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConfirmScanBankCardResultUI", "intent is null, return");
        } else {
            java.lang.String stringExtra = getIntent().getStringExtra("_image_cache_key_");
            this.f159287e = stringExtra;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp cache key is null or nil");
            } else {
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.HashMap) f159285h).get(this.f159287e);
                this.f159286d = bitmap;
                if (bitmap == null || bitmap.isRecycled()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp invalid, return");
                } else {
                    z17 = true;
                }
            }
        }
        if (!z17) {
            finish();
            return;
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("_card_num_");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConfirmScanBankCardResultUI", "cardNum is null or nil");
            finish();
            return;
        }
        this.f159288f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h8_);
        this.f159289g = (android.widget.EditText) findViewById(com.tencent.mm.R.id.d5t);
        this.f159288f.setImageBitmap(this.f159286d);
        this.f159289g.setText(stringExtra2);
        findViewById(com.tencent.mm.R.id.f483525b36).setOnClickListener(new com.tencent.mm.plugin.scanner.ui.i(this));
        setBackBtn(new com.tencent.mm.plugin.scanner.ui.j(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.widget.ImageView imageView = this.f159288f;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f159287e)) {
            ((java.util.HashMap) f159285h).remove(this.f159287e);
        }
        android.graphics.Bitmap bitmap = this.f159286d;
        if (bitmap != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConfirmScanBankCardResultUI", "bitmap recycle %s", bitmap.toString());
            this.f159286d.recycle();
        }
    }
}

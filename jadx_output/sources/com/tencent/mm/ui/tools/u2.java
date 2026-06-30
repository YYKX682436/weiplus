package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210794d;

    public u2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210794d = cropImageNewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI = this.f210794d;
        if (cropImageNewUI.f210000f == null) {
            return;
        }
        if (cropImageNewUI.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
            android.content.SharedPreferences.Editor edit = cropImageNewUI.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit();
            edit.putBoolean("CropImage_Filter_Show", cropImageNewUI.f210000f.findViewById(com.tencent.mm.R.id.f483991cn3).getVisibility() == 0);
            edit.commit();
        }
        java.lang.String stringExtra = cropImageNewUI.getIntent().getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0.b.m());
            sb6.append(kk.k.g((cropImageNewUI.f210006o + java.lang.System.currentTimeMillis()).getBytes()));
            sb6.append("_fiter.jpg");
            stringExtra = sb6.toString();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImage_Compress_Img", true);
        com.tencent.mm.ui.tools.FilterImageView filterImageView = cropImageNewUI.f210000f;
        if (filterImageView != null) {
            intent.putExtra("CropImage_filterId", filterImageView.getFilterId());
        }
        if (cropImageNewUI.f210000f.getFilterId() == 0) {
            intent.putExtra("CropImage_OutputPath", cropImageNewUI.f210006o);
            cropImageNewUI.setResult(-1, intent);
        } else if (cropImageNewUI.Y6(cropImageNewUI.f210000f.getFilterBmp(), stringExtra, false)) {
            intent.putExtra("CropImage_OutputPath", stringExtra);
            cropImageNewUI.setResult(-1, intent);
        } else {
            cropImageNewUI.setResult(-1);
        }
        cropImageNewUI.finish();
    }
}

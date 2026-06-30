package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public final class x3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159816d;

    public x3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159816d = scanTranslationResultUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159816d;
        if (scanTranslationResultUI.isDestroyed() || scanTranslationResultUI.isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanTranslationResultUI", "receive onMMMenuItemSelected but activity is invalid");
            return;
        }
        boolean z17 = true;
        switch (menuItem.getItemId()) {
            case 32769:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "longClickMenu_cancelTranslation");
                com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.T6(scanTranslationResultUI);
                return;
            case 32770:
                java.lang.String str = scanTranslationResultUI.f159386s;
                java.lang.String str2 = "ScanTranslationResultUI.SettingsRequestSessionId_" + str;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "longClickMenu_changeTranslateLanguage, currentImgPath: " + str);
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    return;
                }
                com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
                settingsTranslateLanguageRequest.f67821d = wd0.k2.IMAGE_OCR_TRANSLATE_RESULT;
                settingsTranslateLanguageRequest.f67822e = str2;
                scanTranslationResultUI.E = settingsTranslateLanguageRequest.clone();
                ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(scanTranslationResultUI, settingsTranslateLanguageRequest);
                return;
            case 32771:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "longClickMenu_translateFeedback");
                dm.aa y07 = scanTranslationResultUI.A == 1 ? ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).cj().y0(com.tencent.mm.sdk.platformtools.w2.a(scanTranslationResultUI.f159386s + com.tencent.mm.vfs.w6.l(scanTranslationResultUI.f159386s))) : scanTranslationResultUI.f159389v;
                if (y07 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ScanTranslationResultUI", "longClickMenu_translateFeedback, TranslationResult is null, source: " + scanTranslationResultUI.A);
                } else {
                    ((pn4.l1) ((mn4.f) i95.n0.c(mn4.f.class))).wi(mn4.e.SCAN, y07.field_originalImageFileId, y07.field_originalImageAesKey, y07.field_resultImageFileId, y07.field_resultImageAesKey);
                }
                dp.a.makeText(scanTranslationResultUI, scanTranslationResultUI.getResources().getString(com.tencent.mm.R.string.lwg), 1).show();
                return;
            case 32772:
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "longClickMenu_saveTranslateResult");
                com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.V6(scanTranslationResultUI);
                return;
            default:
                return;
        }
    }
}

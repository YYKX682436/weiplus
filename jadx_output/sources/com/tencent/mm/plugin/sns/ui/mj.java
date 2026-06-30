package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class mj implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.nj f169923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m33 f169924e;

    public mj(com.tencent.mm.plugin.sns.ui.nj njVar, r45.m33 m33Var) {
        this.f169923d = njVar;
        this.f169924e = m33Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.jj4 jj4Var;
        r45.jj4 jj4Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$2");
        com.tencent.mm.plugin.sns.ui.nj njVar = this.f169923d;
        r45.m33 b17 = njVar.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showMenuForOCRTranslateResult select >> ");
        r45.m33 m33Var = this.f169924e;
        r45.jj4 jj4Var3 = m33Var.f380109d;
        sb6.append(jj4Var3 != null ? jj4Var3.f377855d : null);
        sb6.append(' ');
        sb6.append((b17 == null || (jj4Var2 = b17.f380109d) == null) ? null : jj4Var2.f377855d);
        sb6.append(' ');
        sb6.append(menuItem.getItemId());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageTransSheetManager", sb6.toString());
        r45.jj4 jj4Var4 = m33Var.f380109d;
        if (!r26.i0.q(jj4Var4 != null ? jj4Var4.f377855d : null, (b17 == null || (jj4Var = b17.f380109d) == null) ? null : jj4Var.f377855d, false, 2, null)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageTransSheetManager", "when select current item is no equal bind item");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$2");
            return;
        }
        android.content.Context a17 = njVar.a();
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = a17 instanceof com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI ? (com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI) a17 : null;
        if (snsBaseGalleryUI != null) {
            if (snsBaseGalleryUI.isDestroyed() || snsBaseGalleryUI.isFinishing()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageTransSheetManager", "receive onMMMenuItemSelected but activity is invalid");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$2");
                return;
            }
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageTransSheetManager", "longClickMenu_cancelTranslation");
                m33Var.f380113h = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDataChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                if (snsBaseGalleryUI.f166810o.getGallery() != null && snsBaseGalleryUI.f166810o.getGallery().getAdapter() != null) {
                    snsBaseGalleryUI.f166810o.getGallery().getAdapter().notifyDataSetChanged();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDataChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            } else if (itemId == 2) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SnsImageTrans_");
                r45.jj4 jj4Var5 = m33Var.f380109d;
                sb7.append(jj4Var5 != null ? jj4Var5.f377855d : null);
                java.lang.String sb8 = sb7.toString();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("longClickMenu_changeTranslateLanguage, bindMediaId: ");
                r45.jj4 jj4Var6 = m33Var.f380109d;
                sb9.append(jj4Var6 != null ? jj4Var6.f377855d : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageTransSheetManager", sb9.toString());
                r45.jj4 jj4Var7 = m33Var.f380109d;
                java.lang.String str = jj4Var7 != null ? jj4Var7.f377855d : null;
                if (!(str == null || str.length() == 0)) {
                    com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
                    settingsTranslateLanguageRequest.f67821d = wd0.k2.IMAGE_OCR_TRANSLATE_RESULT;
                    settingsTranslateLanguageRequest.f67822e = sb8;
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(snsBaseGalleryUI, settingsTranslateLanguageRequest);
                }
            } else if (itemId == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageTransSheetManager", "longClickMenu_translateFeedback");
                dp.a.makeText(njVar.a(), i65.a.r(njVar.a(), com.tencent.mm.R.string.lwg), 1).show();
            } else if (itemId == 4) {
                java.lang.String str2 = m33Var.f380114i;
                if (str2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageTransSheetManager", "longClickMenu_saveTranslateResult " + str2);
                    if (str2 != null && com.tencent.mm.vfs.w6.j(str2)) {
                        com.tencent.mm.pluginsdk.ui.tools.l7.a(str2, njVar.a(), null);
                    }
                }
                dp.a.makeText(snsBaseGalleryUI, snsBaseGalleryUI.getString(com.tencent.mm.R.string.i87), 1).show();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$2");
    }
}

package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class ic implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f208917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.kc f208918b;

    public ic(com.tencent.mm.ui.kc kcVar, java.util.HashMap hashMap) {
        this.f208918b = kcVar;
        this.f208917a = hashMap;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMErrorProcessor", "onDialogClick %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            xv.j0 j0Var = (xv.j0) i95.n0.c(xv.j0.class);
            android.app.Activity activity = this.f208918b.f209042d;
            java.util.HashMap hashMap = this.f208917a;
            ((wv.a) j0Var).getClass();
            int i17 = com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService.f142387q;
            try {
                java.lang.String str2 = (java.lang.String) hashMap.get("task_name");
                java.lang.String str3 = (java.lang.String) hashMap.get("task_url");
                java.lang.String str4 = (java.lang.String) hashMap.get("alternative_url");
                long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) hashMap.get("task_size"), 0L);
                java.lang.String str5 = (java.lang.String) hashMap.get("file_md5");
                java.lang.String str6 = (java.lang.String) hashMap.get("extInfo");
                java.lang.String str7 = (java.lang.String) hashMap.get("appid");
                java.lang.String str8 = (java.lang.String) hashMap.get("package_name");
                java.lang.String str9 = (java.lang.String) hashMap.get("thumb_url");
                java.lang.String str10 = (java.lang.String) hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(activity, com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService.class);
                intent.putExtra("task_name", str2);
                intent.putExtra("task_download_type", 1);
                intent.putExtra("app_developer", (java.lang.String) hashMap.get("developer"));
                intent.putExtra("app_version", (java.lang.String) hashMap.get("app_version"));
                intent.putExtra("app_desc", (java.lang.String) hashMap.get("app_desc"));
                intent.putExtra("app_privacy_url", (java.lang.String) hashMap.get("privacy_agreement_url"));
                intent.putExtra("app_permission_url", (java.lang.String) hashMap.get("permission_url"));
                intent.putExtra("task_url", str3);
                intent.putExtra("alternative_url", str4);
                intent.putExtra("task_size", V);
                intent.putExtra("file_md5", str5);
                intent.putExtra("extInfo", str6);
                intent.putExtra("fileType", 1);
                intent.putExtra("appid", str7);
                intent.putExtra("package_name", str8);
                intent.putExtra("thumb_url", str9);
                intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str10);
                intent.putExtra("page_url", (java.lang.String) hashMap.get("page_url"));
                intent.putExtra("notify_type_extra", "mmdiff_download_full_apk_notify");
                intent.putExtra("page_scene", 0);
                activity.startService(intent);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "doAddDownloadTask, e = %s", e17);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 35L, 1L, false);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.lbz), 1).show();
        }
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("update_has_new_package", false);
    }
}

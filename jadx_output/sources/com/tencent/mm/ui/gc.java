package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class gc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208687d;

    public gc(android.app.Activity activity) {
        this.f208687d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SilentDownloadApkAtWiFi"), 0) != 0) {
            return;
        }
        boolean z18 = (((java.lang.Integer) c01.d9.b().p().l(7, 0)).intValue() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0;
        android.app.Activity activity = this.f208687d;
        boolean z19 = com.tencent.mars.comm.NetStatusUtil.isWifi(activity) && z18;
        if ((com.tencent.mm.sdk.platformtools.a0.f192438a & 1) != 0) {
            z19 = false;
        }
        if (z19) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("update_config_prefs", 4);
            long j17 = sharedPreferences.getLong("update_downloading_in_silence", 0L);
            boolean z27 = sharedPreferences.getBoolean("update_download_start_one_immediate", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "hasUnfinishDownloadingInSilence unfinish %s", java.lang.Long.valueOf(j17));
            if (z27 || (j17 != 0 && java.lang.System.currentTimeMillis() - j17 > 3600000)) {
                z17 = true;
            }
            if (z17) {
                activity.runOnUiThread(new com.tencent.mm.ui.fc(this));
            }
        }
    }
}

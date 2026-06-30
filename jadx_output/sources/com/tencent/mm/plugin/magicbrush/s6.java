package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148120d;

    public s6(java.lang.String str) {
        this.f148120d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193059g;
        if (com.tencent.mm.sdk.platformtools.t8.R0(context, str)) {
            com.tencent.mars.xlog.Log.i("MagicBrushPreloadFeatureService", "no need to preload");
            je3.i.x2(je3.k.f299298e, "PreloadMBIsAlive", 1, this.f148120d, 0.0f, 8, null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start preload MB2.0 env for ");
        java.lang.String str2 = this.f148120d;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MagicBrushPreloadFeatureService", sb6.toString());
        je3.i.x2(je3.k.f299298e, "PreloadMBStart", 1, this.f148120d, 0.0f, 8, null);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("appStatus", com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground() ? 1 : 2);
        bundle.putLong("processStartTime", android.os.SystemClock.elapsedRealtime());
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str2);
        com.tencent.mm.ipcinvoker.d0.d(str, bundle, com.tencent.mm.plugin.magicbrush.q6.class, com.tencent.mm.plugin.magicbrush.r6.f148113d);
    }
}

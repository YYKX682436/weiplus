package com.tencent.mm.plugin.magicbrush;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/q6;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
final class q6 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        int i17 = data.getInt("appStatus", 0);
        long j17 = data.getLong("processStartTime", 0L);
        java.lang.String string = data.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "");
        if (i17 != 0 && j17 != 0) {
            kotlin.jvm.internal.o.d(string);
            if (!(string.length() == 0)) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.tencent.mars.xlog.Log.i("MagicBrushPreloadFeatureService", "preload scene " + string + " cost " + elapsedRealtime + " with appStatus " + i17);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, string);
                jSONObject.put("appStatus", i17);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                je3.i.x2(je3.k.f299298e, "PreloadMBDone", (int) elapsedRealtime, r26.i0.u(jSONObject2, ',', ';', false, 4, null), 0.0f, 8, null);
                bf3.g0.f19627a.a();
                com.tencent.mars.xlog.Log.i("MagicBrushPreloadFeatureService", "preload done, mark preload scene");
                synchronized (com.tencent.mm.plugin.magicbrush.a5.f147836a) {
                    if (com.tencent.mm.plugin.magicbrush.a5.f147844i.length() == 0) {
                        com.tencent.mm.plugin.magicbrush.a5.f147844i = string;
                    }
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MagicBrushPreloadFeatureService", "preload mb error");
    }
}

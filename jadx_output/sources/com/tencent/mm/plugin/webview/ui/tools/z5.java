package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class z5 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, final com.tencent.mm.ipcinvoker.r rVar) {
        android.graphics.PointF pointF;
        com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ScanImageData webViewLongClickHelper$ScanImageData = (com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ScanImageData) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "RemoteCallbackRecogQBarTask invoke:" + webViewLongClickHelper$ScanImageData.f183789d);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$RemoteCallbackRecogQBarTask$1
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "mRecogResultListener callback:");
                if (recogQBarOfImageFileResultEvent2 instanceof com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent) {
                    try {
                        am.cq cqVar = recogQBarOfImageFileResultEvent2.f54661g;
                        java.lang.String str = cqVar.f6368a;
                        com.tencent.mm.plugin.webview.ui.tools.b5.f183926s = str;
                        com.tencent.mm.plugin.webview.ui.tools.b5.f183925r = com.tencent.mm.vfs.w6.N(str, 0, -1);
                        com.tencent.mm.vfs.w6.h(cqVar.f6368a);
                        java.util.ArrayList a17 = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a.a(recogQBarOfImageFileResultEvent2);
                        com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ImageQBarData webViewLongClickHelper$ImageQBarData = new com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ImageQBarData(a17, cqVar.f6368a, java.lang.Boolean.TRUE);
                        a17.size();
                        rVar.a(webViewLongClickHelper$ImageQBarData);
                        dead();
                        com.tencent.mm.plugin.webview.ui.tools.b5.f183932y.dead();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewLongClickHelper", e17, "", new java.lang.Object[0]);
                    }
                }
                return false;
            }
        };
        com.tencent.mm.plugin.webview.ui.tools.b5.f183932y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$RemoteCallbackRecogQBarTask$2
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent2 = recogQBarOfImageFileFailedEvent;
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "delete qb recog fail: %s", recogQBarOfImageFileFailedEvent2.f54660g.f6278a);
                am.bq bqVar = recogQBarOfImageFileFailedEvent2.f54660g;
                com.tencent.mm.vfs.w6.h(bqVar.f6278a);
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ImageQBarData(null, bqVar.f6278a, java.lang.Boolean.FALSE));
                dead();
                iListener.dead();
                return false;
            }
        };
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        java.lang.String str = webViewLongClickHelper$ScanImageData.f183789d;
        float f17 = webViewLongClickHelper$ScanImageData.f183791f;
        float f18 = webViewLongClickHelper$ScanImageData.f183792g;
        if (str == null) {
            pointF = new android.graphics.PointF(f17, f18);
        } else {
            int i17 = webViewLongClickHelper$ScanImageData.f183793h;
            if (i17 > 0) {
                f17 /= i17;
            }
            int i18 = webViewLongClickHelper$ScanImageData.f183794i;
            if (i18 > 0) {
                f18 /= i18;
            }
            pointF = new android.graphics.PointF(f17, f18);
        }
        c17.i("key_basescanui_touch_normalize_x", java.lang.Float.valueOf(pointF.x));
        c17.i("key_basescanui_touch_normalize_y", java.lang.Float.valueOf(pointF.y));
        com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
        long j17 = com.tencent.mm.plugin.webview.ui.tools.b5.f183931x;
        am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
        aqVar.f6174a = j17;
        aqVar.f6175b = str;
        aqVar.f6178e = true;
        aqVar.f6179f = 2;
        iListener.alive();
        com.tencent.mm.plugin.webview.ui.tools.b5.f183932y.alive();
        recogQBarOfImageFileEvent.e();
    }
}

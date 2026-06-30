package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public abstract class n8 {
    public static com.tencent.mm.pluginsdk.ui.tools.f4 a(android.content.Context context) {
        java.lang.String str = wo.v1.f447833m.D;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals("surface")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoViewFactory", "match full type surface");
            return new com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView(context, null);
        }
        if (fp.f0.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoViewFactory", "IS MTK platform");
            return new com.tencent.mm.pluginsdk.ui.tools.VideoSightView(context);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoViewFactory", "default settings, use sightview");
        return new com.tencent.mm.pluginsdk.ui.tools.VideoSightView(context);
    }
}

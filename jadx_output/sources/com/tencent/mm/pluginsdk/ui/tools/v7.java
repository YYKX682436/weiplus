package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public abstract class v7 {

    /* renamed from: a, reason: collision with root package name */
    public static int f191957a = -1;

    public static void a(android.view.View view, com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView) {
        if (view != null && videoSightView != null) {
            if (view.getVisibility() == 0) {
                videoSightView.addOnLayoutChangeListener(new com.tencent.mm.pluginsdk.ui.tools.u7(view));
            }
        } else {
            com.tencent.mars.xlog.Log.e("VideoSightHelper", "null view object " + view + "," + videoSightView);
        }
    }
}

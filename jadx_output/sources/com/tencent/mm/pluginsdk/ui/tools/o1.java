package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class o1 {
    public o1(kotlin.jvm.internal.i iVar) {
    }

    public final int a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }
}

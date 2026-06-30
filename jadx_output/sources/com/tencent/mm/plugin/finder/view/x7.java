package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public abstract class x7 {
    public static final void a(android.app.Dialog dialog, android.content.Context context) {
        android.view.WindowManager.LayoutParams attributes;
        kotlin.jvm.internal.o.g(dialog, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        int b17 = b(context);
        android.view.Window window = dialog.getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.width = b17;
        attributes.gravity = 1;
    }

    public static final int b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return java.lang.Math.min(com.tencent.mm.ui.bl.b(context).y, com.tencent.mm.ui.bl.b(context).x);
    }
}

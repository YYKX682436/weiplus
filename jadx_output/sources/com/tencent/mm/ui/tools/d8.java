package com.tencent.mm.ui.tools;

/* loaded from: classes2.dex */
public abstract class d8 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Float f210355a = java.lang.Float.valueOf(0.7f);

    public static void a(android.view.View view) {
        b(view, f210355a.floatValue());
    }

    public static void b(android.view.View view, float f17) {
        if (view == null || f17 <= 0.0f || f17 >= 1.0f) {
            return;
        }
        view.setOnTouchListener(new com.tencent.mm.ui.tools.c8(f17));
    }
}

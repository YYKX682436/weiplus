package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public abstract class pd {
    public static int a(android.content.Context context) {
        float q17 = i65.a.q(context);
        if (java.lang.Float.compare(q17, i65.a.z(context)) > 0) {
            return com.tencent.mm.R.drawable.b8f;
        }
        i65.a.x(context);
        return java.lang.Float.compare(q17, 1.0f) > 0 ? com.tencent.mm.R.drawable.b8h : com.tencent.mm.R.drawable.b8d;
    }

    public static int b(android.content.Context context, int i17) {
        return java.lang.Float.compare(i65.a.q(context), i65.a.z(context)) > 0 ? i17 < 10 ? com.tencent.mm.R.drawable.b8g : com.tencent.mm.R.drawable.b8f : i17 < 10 ? com.tencent.mm.R.drawable.b8e : com.tencent.mm.R.drawable.b8d;
    }
}

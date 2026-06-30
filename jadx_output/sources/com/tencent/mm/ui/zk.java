package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public abstract class zk {

    /* renamed from: a, reason: collision with root package name */
    public static float f212637a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public static float f212638b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseIntArray f212639c = new android.util.SparseIntArray();

    public static int a(android.content.Context context, int i17) {
        return java.lang.Math.round(f(context) * i17);
    }

    public static int b(android.content.Context context, int i17) {
        return java.lang.Math.round(i17 / f(context));
    }

    public static int c(android.content.Context context, int i17) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i17, typedValue, true);
        return typedValue.data;
    }

    public static android.graphics.drawable.Drawable d(android.content.Context context, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i17});
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static int e(android.content.Context context, int i17) {
        if (context == null) {
            com.tencent.mm.ui.yk.b("WeUIResHelper", "get dimension pixel size, resId %d, but context is null" + i17, new java.lang.Object[0]);
            return 0;
        }
        android.util.SparseIntArray sparseIntArray = f212639c;
        int i18 = sparseIntArray.get(i17, 0);
        if (i18 != 0) {
            return i18;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i17);
        sparseIntArray.put(i17, dimensionPixelSize);
        return dimensionPixelSize;
    }

    public static float f(android.content.Context context) {
        if (context != null && f212637a < 0.0f) {
            f212637a = context.getResources().getDisplayMetrics().density;
        }
        return f212637a;
    }
}

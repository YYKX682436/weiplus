package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes11.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.pluginsdk.ui.j1 f192025a;

    public static void a(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarDrawable", "imageView is null");
        } else {
            b(imageView, str, 0.1f, false);
        }
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, float f17, boolean z17) {
        com.tencent.mm.pluginsdk.ui.x xVar;
        if (imageView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarDrawable", "imageView is null");
            return;
        }
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable == null || !(drawable instanceof com.tencent.mm.pluginsdk.ui.x)) {
            xVar = new com.tencent.mm.pluginsdk.ui.x(str, f17);
            xVar.f190897f = z17;
        } else {
            xVar = (com.tencent.mm.pluginsdk.ui.x) drawable;
            xVar.f192086s = f17;
        }
        xVar.b(str);
        imageView.setImageDrawable(xVar);
        imageView.invalidate();
        d(imageView, str);
        if (imageView instanceof com.tencent.mm.ui.tools.MaskImageButton) {
            return;
        }
        if (imageView.isClickable() || imageView.isLongClickable()) {
            try {
                imageView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.t(imageView));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AvatarDrawable", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static com.tencent.mm.pluginsdk.ui.j1 c() {
        iz5.a.g(null, f192025a != null);
        return f192025a;
    }

    public static void d(android.widget.ImageView imageView, java.lang.String str) {
        if (!z65.c.a() || imageView == null || imageView.isLongClickable() || (imageView instanceof com.tencent.mm.pluginsdk.ui.NotCopyUserNameImageView)) {
            return;
        }
        imageView.setOnLongClickListener(new com.tencent.mm.pluginsdk.ui.r(imageView, str));
        if (imageView.isClickable()) {
            return;
        }
        imageView.setOnClickListener(new com.tencent.mm.pluginsdk.ui.s(imageView));
    }
}

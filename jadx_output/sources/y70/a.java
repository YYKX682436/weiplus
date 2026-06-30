package y70;

/* loaded from: classes5.dex */
public abstract class a {
    public static final android.graphics.Bitmap a(android.graphics.Bitmap bitmap, m70.h thumbFileType) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(thumbFileType, "thumbFileType");
        if (bitmap == null) {
            return null;
        }
        if (bitmap.isRecycled()) {
            return bitmap;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int ordinal = thumbFileType.ordinal();
        if (ordinal == 0) {
            str = "Mid";
        } else if (ordinal == 1) {
            str = "HDThumb";
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            str = "Thumb";
        }
        sb6.append(str);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(bitmap.getWidth());
        sb7.append('*');
        sb7.append(bitmap.getHeight());
        sb6.append(sb7.toString());
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        try {
            if (!bitmap.isMutable()) {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Boolean.TRUE);
                arrayList.add(config);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(bitmap, arrayList.toArray(), "com/tencent/mm/feature/img/imgloader/ImgPPCDebugHelper", "debugAppendBitmapInfo", "(Landroid/graphics/Bitmap;Lcom/tencent/mm/feature/image/api/imgloader/ThumbFileType;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
                yj0.a.e(bitmap, copy, "com/tencent/mm/feature/img/imgloader/ImgPPCDebugHelper", "debugAppendBitmapInfo", "(Landroid/graphics/Bitmap;Lcom/tencent/mm/feature/image/api/imgloader/ThumbFileType;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                bitmap = copy;
            }
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            if (width > 0.0f && height > 0.0f) {
                float f17 = height / 10.0f;
                if (f17 < 24.0f) {
                    f17 = 24.0f;
                }
                float f18 = (height - f17) / 2.0f;
                float f19 = f18 + f17;
                android.graphics.RectF rectF = new android.graphics.RectF(0.0f, f18, width, f19);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
                android.graphics.Paint paint = new android.graphics.Paint(1);
                paint.setColor(-1728053248);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                canvas.drawRect(rectF, paint);
                android.graphics.Paint paint2 = new android.graphics.Paint(1);
                paint2.setColor(-1);
                paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
                paint2.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1));
                float f27 = f17 * 0.62f;
                if (f27 < 12.0f) {
                    f27 = 12.0f;
                }
                paint2.setTextSize(f27);
                float f28 = 0.92f * width;
                float measureText = paint2.measureText(sb8);
                if (measureText > f28) {
                    float f29 = f28 / measureText;
                    if (f29 > 1.0f) {
                        f29 = 1.0f;
                    }
                    f27 *= f29;
                    paint2.setTextSize(f27);
                    paint2.measureText(sb8);
                }
                android.graphics.Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
                float f37 = ((f18 + f19) / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
                android.graphics.Paint paint3 = new android.graphics.Paint(paint2);
                paint3.setStyle(android.graphics.Paint.Style.STROKE);
                float f38 = f27 / 12.0f;
                if (f38 < 2.0f) {
                    f38 = 2.0f;
                }
                paint3.setStrokeWidth(f38);
                paint3.setColor(-872415232);
                float f39 = width / 2.0f;
                canvas.drawText(sb8, f39, f37, paint3);
                canvas.drawText(sb8, f39, f37, paint2);
            }
        } catch (java.lang.OutOfMemoryError unused) {
        }
        return bitmap;
    }
}

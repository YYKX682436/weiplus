package iy0;

/* loaded from: classes5.dex */
public interface b {
    default void b(android.graphics.Canvas canvas, java.lang.String firstLineText, java.lang.String secondLineText, android.graphics.RectF textRect, android.text.TextPaint firstLineTextPaint, android.text.TextPaint secondLineTextPaint, int i17, int i18, int i19, android.graphics.Paint paint, float f17, iy0.d textAlignType) {
        float f18;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(firstLineText, "firstLineText");
        kotlin.jvm.internal.o.g(secondLineText, "secondLineText");
        kotlin.jvm.internal.o.g(textRect, "textRect");
        kotlin.jvm.internal.o.g(firstLineTextPaint, "firstLineTextPaint");
        kotlin.jvm.internal.o.g(secondLineTextPaint, "secondLineTextPaint");
        kotlin.jvm.internal.o.g(textAlignType, "textAlignType");
        float f19 = i18 * 2;
        float width = textRect.width() - f19;
        if (width <= 0.0f) {
            return;
        }
        float min = java.lang.Float.min(java.lang.Float.max(firstLineTextPaint.measureText(firstLineText), secondLineTextPaint.measureText(secondLineText)), width) + f19;
        android.graphics.Paint.FontMetrics fontMetrics = firstLineTextPaint.getFontMetrics();
        float f27 = fontMetrics.descent - fontMetrics.ascent;
        android.graphics.Paint.FontMetrics fontMetrics2 = secondLineTextPaint.getFontMetrics();
        float f28 = fontMetrics2.descent - fontMetrics2.ascent;
        if (iy0.a.f295708a[textAlignType.ordinal()] == 1) {
            f18 = textRect.top;
        } else {
            float f29 = textRect.bottom;
            float f37 = textRect.top;
            f18 = (f37 + (((((f29 - f37) - f27) - f28) - i17) / 2)) - i19;
        }
        float f38 = textRect.left;
        float f39 = i17;
        android.graphics.RectF rectF = new android.graphics.RectF(f38, f18, min + f38, f18 + f27 + f28 + f39 + (i19 * 2));
        if (paint != null) {
            canvas.drawRoundRect(rectF, f17, f17, paint);
        }
        float f47 = i18;
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF.left + f47, rectF.top, rectF.right - f47, rectF.bottom);
        canvas.save();
        canvas.clipRect(rectF2);
        float f48 = textRect.left + f47;
        float f49 = rectF2.top;
        float f57 = i19;
        float f58 = (f49 + f57) - fontMetrics.ascent;
        float f59 = (((f49 + f57) + f27) + f39) - fontMetrics2.ascent;
        canvas.drawText(firstLineText, f48, f58, firstLineTextPaint);
        canvas.drawText(secondLineText, f48, f59, secondLineTextPaint);
        canvas.restore();
    }

    default void d(android.graphics.Canvas canvas, java.lang.String contentText, android.graphics.RectF textRect, android.text.TextPaint textPaint, int i17, int i18, android.graphics.Paint paint, float f17, iy0.d textAlignType, boolean z17) {
        float f18;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(contentText, "contentText");
        kotlin.jvm.internal.o.g(textRect, "textRect");
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        kotlin.jvm.internal.o.g(textAlignType, "textAlignType");
        if (contentText.length() == 0) {
            return;
        }
        float f19 = i17 * 2;
        float width = textRect.width() - f19;
        if (width <= 0.0f) {
            return;
        }
        float measureText = textPaint.measureText(contentText);
        if (measureText <= width) {
            android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f27 = fontMetrics.descent - fontMetrics.ascent;
            if (iy0.a.f295708a[textAlignType.ordinal()] == 1) {
                f18 = textRect.top;
            } else {
                float f28 = textRect.bottom;
                float f29 = textRect.top;
                float f37 = 2;
                f18 = (f29 + (((f28 - f29) - (f37 * f27)) / f37)) - i18;
            }
            float f38 = z17 ? textRect.right : f19 + textRect.left + measureText;
            float f39 = textRect.left;
            float f47 = textRect.right;
            if (f38 > f47) {
                f38 = f47;
            }
            android.graphics.RectF rectF = new android.graphics.RectF(f39, f18, f38, f27 + f18 + (i18 * 2));
            if (paint != null) {
                canvas.drawRoundRect(rectF, f17, f17, paint);
            }
            float f48 = i17;
            android.graphics.RectF rectF2 = new android.graphics.RectF(rectF.left + f48, rectF.top, rectF.right - f48, rectF.bottom);
            canvas.save();
            canvas.clipRect(rectF2);
            canvas.drawText(contentText, textRect.left + f48, (rectF2.top + i18) - fontMetrics.ascent, textPaint);
            canvas.restore();
            return;
        }
        float f49 = measureText / 2;
        if (f49 >= width) {
            width = 1.0f + f49;
        }
        int length = contentText.length();
        if (measureText > width) {
            int length2 = contentText.length();
            int i19 = 0;
            while (true) {
                if (i19 >= length2) {
                    break;
                }
                int i27 = i19 + 1;
                java.lang.String substring = contentText.substring(0, i27);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                if (textPaint.measureText(substring) > width) {
                    length = i19;
                    break;
                }
                i19 = i27;
            }
            int length3 = contentText.length();
            int i28 = length;
            while (true) {
                if (i28 >= length3) {
                    break;
                }
                i28++;
                java.lang.String substring2 = contentText.substring(length, i28);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                if (textPaint.measureText(substring2) > width) {
                    length++;
                    break;
                }
            }
        }
        java.lang.String substring3 = contentText.substring(0, length);
        kotlin.jvm.internal.o.f(substring3, "substring(...)");
        java.lang.String substring4 = contentText.substring(length);
        kotlin.jvm.internal.o.f(substring4, "substring(...)");
        b(canvas, substring3, substring4, textRect, textPaint, textPaint, 0, i17, i18, paint, f17, textAlignType);
    }

    default void e(android.graphics.Canvas canvas, java.lang.String text, float f17, float f18, float f19, android.text.TextPaint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f27 = fontMetrics.descent;
        float f28 = fontMetrics.ascent;
        canvas.drawText(text, f17, f18 + ((((f19 - f18) - (f27 - f28)) / 2) - f28), paint);
    }
}

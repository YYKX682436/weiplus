package com.tencent.tavkit.utils;

/* loaded from: classes14.dex */
public class MathUtils {
    public static com.tencent.tav.coremedia.CGRect rect(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tav.coremedia.CGRect cGRect2) {
        com.tencent.tav.coremedia.CGSize size = size(cGRect.size, cGRect2.size);
        android.graphics.PointF pointF = cGRect2.origin;
        float f17 = pointF.x;
        com.tencent.tav.coremedia.CGSize cGSize = cGRect2.size;
        float f18 = cGSize.width;
        float f19 = size.width;
        float f27 = pointF.y;
        float f28 = cGSize.height;
        float f29 = size.height;
        return new com.tencent.tav.coremedia.CGRect(f17 + ((f18 - f19) / 2.0f), f27 + ((f28 - f29) / 2.0f), f19, f29);
    }

    public static com.tencent.tav.coremedia.CGRect rectFill(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tav.coremedia.CGRect cGRect2) {
        com.tencent.tav.coremedia.CGSize sizeFill = sizeFill(cGRect.size, cGRect2.size);
        android.graphics.PointF pointF = cGRect2.origin;
        float f17 = pointF.x;
        com.tencent.tav.coremedia.CGSize cGSize = cGRect2.size;
        float f18 = cGSize.width;
        float f19 = sizeFill.width;
        float f27 = pointF.y;
        float f28 = cGSize.height;
        float f29 = sizeFill.height;
        return new com.tencent.tav.coremedia.CGRect(f17 + ((f18 - f19) / 2.0f), f27 + ((f28 - f29) / 2.0f), f19, f29);
    }

    public static com.tencent.tav.coremedia.CGRect rectFit(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tav.coremedia.CGRect cGRect2) {
        com.tencent.tav.coremedia.CGSize sizeFit = sizeFit(cGRect.size, cGRect2.size);
        android.graphics.PointF pointF = cGRect2.origin;
        float f17 = pointF.x;
        com.tencent.tav.coremedia.CGSize cGSize = cGRect2.size;
        float f18 = cGSize.width;
        float f19 = sizeFit.width;
        float f27 = pointF.y;
        float f28 = cGSize.height;
        float f29 = sizeFit.height;
        return new com.tencent.tav.coremedia.CGRect(f17 + ((f18 - f19) / 2.0f), f27 + ((f28 - f29) / 2.0f), f19, f29);
    }

    public static com.tencent.tav.coremedia.CGSize size(com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.coremedia.CGSize cGSize2) {
        com.tencent.tav.coremedia.CGSize m412clone = cGSize2.m412clone();
        float f17 = cGSize2.width;
        float f18 = cGSize.width;
        float f19 = f17 / f18;
        float f27 = cGSize2.height;
        float f28 = cGSize.height;
        float f29 = f27 / f28;
        if (f29 > f19) {
            m412clone.width = f29 * f18;
        } else if (f19 > f29) {
            m412clone.height = f19 * f28;
        }
        return m412clone;
    }

    public static com.tencent.tav.coremedia.CGSize sizeFill(com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.coremedia.CGSize cGSize2) {
        com.tencent.tav.coremedia.CGSize m412clone = cGSize2.m412clone();
        float f17 = cGSize2.width;
        float f18 = cGSize.width;
        float f19 = f17 / f18;
        float f27 = cGSize2.height;
        float f28 = cGSize.height;
        float f29 = f27 / f28;
        if (f29 > f19) {
            m412clone.width = f29 * f18;
        } else if (f19 > f29) {
            m412clone.height = f19 * f28;
        }
        return m412clone;
    }

    public static com.tencent.tav.coremedia.CGSize sizeFit(com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.coremedia.CGSize cGSize2) {
        com.tencent.tav.coremedia.CGSize m412clone = cGSize2.m412clone();
        float f17 = cGSize2.width / cGSize.width;
        float f18 = cGSize2.height / cGSize.height;
        if (f18 < f17) {
            m412clone.width = java.lang.Math.round(f18 * r2);
        } else if (f17 < f18) {
            m412clone.height = java.lang.Math.round(f17 * r4);
        }
        return m412clone;
    }

    public static com.tencent.tav.coremedia.CGSize sizeScale(com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.coremedia.CGSize cGSize2) {
        return cGSize2;
    }

    public static android.graphics.Matrix transformBySourceRect(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tav.coremedia.CGRect cGRect2) {
        com.tencent.tav.coremedia.CGRect rect = rect(cGRect, cGRect2);
        com.tencent.tav.coremedia.CGSize cGSize = rect.size;
        float f17 = cGSize.width;
        com.tencent.tav.coremedia.CGSize cGSize2 = cGRect.size;
        float f18 = f17 / cGSize2.width;
        float f19 = cGSize.height / cGSize2.height;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(f18, f19);
        android.graphics.PointF pointF = rect.origin;
        float f27 = pointF.x;
        android.graphics.PointF pointF2 = cGRect.origin;
        matrix.postTranslate(f27 - (pointF2.x * f18), pointF.y - (pointF2.y * f19));
        return matrix;
    }

    public static android.graphics.Matrix transformBySourceRectFill(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tav.coremedia.CGRect cGRect2) {
        com.tencent.tav.coremedia.CGRect rectFill = rectFill(cGRect, cGRect2);
        com.tencent.tav.coremedia.CGSize cGSize = rectFill.size;
        float f17 = cGSize.width;
        com.tencent.tav.coremedia.CGSize cGSize2 = cGRect.size;
        float f18 = f17 / cGSize2.width;
        float f19 = cGSize.height / cGSize2.height;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(f18, f19);
        android.graphics.PointF pointF = rectFill.origin;
        float f27 = pointF.x;
        android.graphics.PointF pointF2 = cGRect.origin;
        matrix.postTranslate(f27 - (pointF2.x * f18), pointF.y - (pointF2.y * f19));
        return matrix;
    }

    public static android.graphics.Matrix transformBySourceRectFit(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tav.coremedia.CGRect cGRect2) {
        com.tencent.tav.coremedia.CGRect rectFit = rectFit(cGRect, cGRect2);
        com.tencent.tav.coremedia.CGSize cGSize = rectFit.size;
        float f17 = cGSize.width;
        com.tencent.tav.coremedia.CGSize cGSize2 = cGRect.size;
        float f18 = f17 / cGSize2.width;
        float f19 = cGSize.height / cGSize2.height;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.PointF pointF = rectFit.origin;
        float f27 = pointF.x;
        android.graphics.PointF pointF2 = cGRect.origin;
        float f28 = f27 - (pointF2.x * f18);
        float f29 = pointF.y - (pointF2.y * f19);
        matrix.postScale(f18, f19);
        matrix.postTranslate(f28, f29);
        return matrix;
    }
}

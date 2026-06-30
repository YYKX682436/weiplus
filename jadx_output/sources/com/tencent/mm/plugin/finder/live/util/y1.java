package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes10.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.y1 f115751a = new com.tencent.mm.plugin.finder.live.util.y1();

    public final android.graphics.drawable.Drawable a(com.tencent.mm.plugin.finder.live.util.u1 u1Var, com.tencent.mm.plugin.finder.live.util.u1 u1Var2, float f17, float f18) {
        android.graphics.drawable.ShapeDrawable shapeDrawable;
        android.graphics.drawable.ShapeDrawable shapeDrawable2;
        if (u1Var != null) {
            float[] fArr = new float[8];
            for (int i17 = 0; i17 < 8; i17++) {
                fArr[i17] = f17;
            }
            shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(fArr, null, null));
            shapeDrawable.setShaderFactory(new com.tencent.mm.plugin.finder.live.util.w1(u1Var));
        } else {
            shapeDrawable = null;
        }
        if (u1Var2 != null) {
            float[] fArr2 = new float[8];
            for (int i18 = 0; i18 < 8; i18++) {
                fArr2[i18] = f17;
            }
            android.graphics.RectF rectF = new android.graphics.RectF(f18, f18, f18, f18);
            float[] fArr3 = new float[8];
            for (int i19 = 0; i19 < 8; i19++) {
                float f19 = f17 - f18;
                if (f19 < 0.0f) {
                    f19 = 0.0f;
                }
                fArr3[i19] = f19;
            }
            shapeDrawable2 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(fArr2, rectF, fArr3));
            shapeDrawable2.setShaderFactory(new com.tencent.mm.plugin.finder.live.util.x1(u1Var2));
        } else {
            shapeDrawable2 = null;
        }
        if (shapeDrawable != null) {
            if (shapeDrawable2 != null) {
                return new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.ShapeDrawable[]{shapeDrawable, shapeDrawable2});
            }
        }
        if (shapeDrawable != null) {
            return shapeDrawable;
        }
        if (shapeDrawable2 != null) {
            return shapeDrawable2;
        }
        return null;
    }
}

package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.w5 f210842d;

    public v5(com.tencent.mm.ui.tools.w5 w5Var) {
        this.f210842d = w5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17;
        float f18;
        float f19;
        com.tencent.mm.ui.tools.w5 w5Var = this.f210842d;
        w5Var.f210875c.f210056e.getImageMatrix().getValues(w5Var.f210874b);
        float scale = w5Var.f210875c.f210056e.getScale() * w5Var.f210875c.f210056e.getImageWidth();
        float scale2 = w5Var.f210875c.f210056e.getScale() * w5Var.f210875c.f210056e.getImageHeight();
        float[] fArr = w5Var.f210874b;
        float f27 = fArr[2];
        float f28 = fArr[5];
        float f29 = f27 + scale;
        float f37 = f28 + scale2;
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = w5Var.f210875c;
        int i17 = mMGestureGallery.f210058g;
        float f38 = i17;
        int i18 = mMGestureGallery.f210057f;
        float f39 = i18;
        if (scale2 < i17) {
            float f47 = scale2 / 2.0f;
            f18 = (i17 / 2.0f) - f47;
            f17 = f47 + (i17 / 2.0f);
        } else {
            f17 = f38;
            f18 = 0.0f;
        }
        float f48 = f18 - f28;
        float f49 = f17 - f37;
        if (f48 >= 0.0f) {
            f48 = f49 > 0.0f ? f49 : 0.0f;
        }
        if (scale < i18) {
            float f57 = scale / 2.0f;
            f19 = (i18 / 2.0f) - f57;
            f39 = (i18 / 2.0f) + f57;
        } else {
            f19 = 0.0f;
        }
        float f58 = f19 - f27;
        float f59 = f39 - f29;
        if (f58 >= 0.0f) {
            f58 = f59 > 0.0f ? f59 : 0.0f;
        }
        if (java.lang.Math.abs(f58) > 5.0f || java.lang.Math.abs(f48) > 5.0f) {
            f58 = (f58 >= 0.0f ? (float) (java.lang.Math.abs(f58) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f58)) - 1.0d, 2.0d)) : -((float) (java.lang.Math.abs(f58) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f58)) - 1.0d, 2.0d)))) * 2.0f;
            f48 = (f48 >= 0.0f ? (float) (java.lang.Math.abs(f48) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f48)) - 1.0d, 2.0d)) : -((float) (java.lang.Math.abs(f48) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f48)) - 1.0d, 2.0d)))) * 2.0f;
        } else {
            w5Var.f210600a = true;
        }
        w5Var.f210875c.f210056e.c(f58, f48);
    }
}

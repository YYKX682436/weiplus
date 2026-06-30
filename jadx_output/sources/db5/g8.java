package db5;

/* loaded from: classes15.dex */
public class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.h8 f228353d;

    public g8(db5.h8 h8Var) {
        this.f228353d = h8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17;
        float f18;
        float f19;
        db5.h8 h8Var = this.f228353d;
        h8Var.f228390c.f197608d.getImageMatrix().getValues(h8Var.f228389b);
        float scale = h8Var.f228390c.f197608d.getScale() * h8Var.f228390c.f197608d.getImageWidth();
        float scale2 = h8Var.f228390c.f197608d.getScale() * h8Var.f228390c.f197608d.getImageHeight();
        float[] fArr = h8Var.f228389b;
        float f27 = fArr[2];
        float f28 = fArr[5];
        float f29 = f27 + scale;
        float f37 = f28 + scale2;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = h8Var.f228390c;
        int i17 = mMViewPager.f197613i;
        float f38 = i17;
        int i18 = mMViewPager.f197612h;
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
        db5.f0 f0Var = mMViewPager.f197608d;
        if (f0Var instanceof com.tencent.mm.ui.base.WxImageView) {
            f58 = ((com.tencent.mm.ui.base.WxImageView) f0Var).getTranslationX();
            f48 = ((com.tencent.mm.ui.base.WxImageView) h8Var.f228390c.f197608d).getTranslationY();
        }
        if (java.lang.Math.abs(f58) > 5.0f || java.lang.Math.abs(f48) > 5.0f) {
            f58 = (f58 >= 0.0f ? (float) (java.lang.Math.abs(f58) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f58)) - 1.0d, 2.0d)) : -((float) (java.lang.Math.abs(f58) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f58)) - 1.0d, 2.0d)))) * 2.0f;
            f48 = (f48 >= 0.0f ? (float) (java.lang.Math.abs(f48) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f48)) - 1.0d, 2.0d)) : -((float) (java.lang.Math.abs(f48) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f48)) - 1.0d, 2.0d)))) * 2.0f;
        } else {
            h8Var.f228583a = true;
            db5.f0 f0Var2 = h8Var.f228390c.f197608d;
            if (f0Var2 instanceof com.tencent.mm.ui.base.WxImageView) {
                ((com.tencent.mm.ui.base.WxImageView) f0Var2).setDrawFullSampleSizeBitmap(false);
            }
        }
        h8Var.f228390c.f197608d.c(f58, f48);
        db5.f0 f0Var3 = h8Var.f228390c.f197608d;
        if (f0Var3 instanceof com.tencent.mm.ui.base.WxImageView) {
            ((com.tencent.mm.ui.base.WxImageView) f0Var3).y(-f58, -f48);
        }
    }
}

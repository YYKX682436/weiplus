package db5;

/* loaded from: classes15.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.j8 f228397d;

    public i8(db5.j8 j8Var) {
        this.f228397d = j8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.j8 j8Var = this.f228397d;
        j8Var.f228412c.f197608d.getImageMatrix().getValues(j8Var.f228411b);
        float f17 = j8Var.f228411b[2];
        float scale = j8Var.f228412c.f197608d.getScale() * j8Var.f228412c.f197608d.getImageWidth();
        com.tencent.mm.ui.base.MMViewPager mMViewPager = j8Var.f228412c;
        int i17 = mMViewPager.f197612h;
        float f18 = (scale < ((float) i17) ? (i17 / 2.0f) - (scale / 2.0f) : 0.0f) - f17;
        db5.f0 f0Var = mMViewPager.f197608d;
        if (f0Var instanceof com.tencent.mm.ui.base.WxImageView) {
            f18 = -((com.tencent.mm.ui.base.WxImageView) f0Var).getTranslationX();
        }
        if (f18 >= 0.0f) {
            j8Var.f228583a = true;
            db5.f0 f0Var2 = j8Var.f228412c.f197608d;
            if (f0Var2 instanceof com.tencent.mm.ui.base.WxImageView) {
                ((com.tencent.mm.ui.base.WxImageView) f0Var2).setDrawFullSampleSizeBitmap(false);
            }
        } else if (java.lang.Math.abs(f18) <= 5.0f) {
            j8Var.f228583a = true;
            db5.f0 f0Var3 = j8Var.f228412c.f197608d;
            if (f0Var3 instanceof com.tencent.mm.ui.base.WxImageView) {
                ((com.tencent.mm.ui.base.WxImageView) f0Var3).setDrawFullSampleSizeBitmap(false);
            }
        } else {
            f18 = (-((float) (java.lang.Math.abs(f18) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f18)) - 1.0d, 2.0d)))) * 2.0f;
        }
        j8Var.f228412c.f197608d.c(f18, 0.0f);
        db5.f0 f0Var4 = j8Var.f228412c.f197608d;
        if (f0Var4 instanceof com.tencent.mm.ui.base.WxImageView) {
            ((com.tencent.mm.ui.base.WxImageView) f0Var4).y(f18, 0.0f);
        }
    }
}

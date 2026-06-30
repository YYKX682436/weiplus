package db5;

/* loaded from: classes15.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.f8 f228328d;

    public e8(db5.f8 f8Var) {
        this.f228328d = f8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.f8 f8Var = this.f228328d;
        f8Var.f228334c.f197608d.getImageMatrix().getValues(f8Var.f228333b);
        float scale = f8Var.f228334c.f197608d.getScale() * f8Var.f228334c.f197608d.getImageHeight();
        float f17 = f8Var.f228333b[5] + scale;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = f8Var.f228334c;
        int i17 = mMViewPager.f197613i;
        float f18 = i17;
        if (scale < i17) {
            f18 = (i17 / 2.0f) + (scale / 2.0f);
        }
        float f19 = f18 - f17;
        db5.f0 f0Var = mMViewPager.f197608d;
        if (f0Var instanceof com.tencent.mm.ui.base.WxImageView) {
            f19 = -((com.tencent.mm.ui.base.WxImageView) f0Var).getTranslationY();
        }
        if (f19 <= 0.0f) {
            f8Var.f228583a = true;
        } else if (java.lang.Math.abs(f19) <= 5.0f) {
            f8Var.f228583a = true;
        } else {
            f19 = ((float) (java.lang.Math.abs(f19) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f19)) - 1.0d, 2.0d))) * 2.0f;
        }
        f8Var.f228334c.f197608d.c(0.0f, f19);
        db5.f0 f0Var2 = f8Var.f228334c.f197608d;
        if (f0Var2 instanceof com.tencent.mm.ui.base.WxImageView) {
            ((com.tencent.mm.ui.base.WxImageView) f0Var2).y(0.0f, f19);
        }
    }
}

package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class z5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.a6 f210943d;

    public z5(com.tencent.mm.ui.tools.a6 a6Var) {
        this.f210943d = a6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.a6 a6Var = this.f210943d;
        android.view.View selectedView = a6Var.f210272b.getSelectedView();
        if (selectedView instanceof com.tencent.mm.ui.base.WxImageView) {
            com.tencent.mm.ui.base.WxImageView wxImageView = (com.tencent.mm.ui.base.WxImageView) selectedView;
            float f17 = -wxImageView.getTranslationX();
            if (f17 >= 0.0f) {
                a6Var.f210600a = true;
            } else if (java.lang.Math.abs(f17) <= 5.0f) {
                a6Var.f210600a = true;
            } else {
                f17 = 2.0f * (-((float) (java.lang.Math.abs(f17) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f17)) - 1.0d, 2.0d))));
            }
            wxImageView.y(f17, 0.0f);
        }
    }
}

package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.e6 f210353d;

    public d6(com.tencent.mm.ui.tools.e6 e6Var) {
        this.f210353d = e6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.e6 e6Var = this.f210353d;
        android.view.View selectedView = e6Var.f210375b.getSelectedView();
        if (selectedView instanceof com.tencent.mm.ui.base.WxImageView) {
            com.tencent.mm.ui.base.WxImageView wxImageView = (com.tencent.mm.ui.base.WxImageView) selectedView;
            float f17 = -wxImageView.getTranslationX();
            if (f17 >= 0.0f) {
                e6Var.f210600a = true;
            } else if (java.lang.Math.abs(f17) <= 5.0f) {
                e6Var.f210600a = true;
            } else {
                f17 = 2.0f * ((float) (java.lang.Math.abs(f17) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f17)) - 1.0d, 2.0d)));
            }
            wxImageView.y(f17, 0.0f);
        }
    }
}

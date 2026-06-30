package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.y5 f210904d;

    public x5(com.tencent.mm.ui.tools.y5 y5Var) {
        this.f210904d = y5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.y5 y5Var = this.f210904d;
        y5Var.f210923c.f210056e.getImageMatrix().getValues(y5Var.f210922b);
        float f17 = y5Var.f210922b[2];
        float scale = y5Var.f210923c.f210056e.getScale() * y5Var.f210923c.f210056e.getImageWidth();
        int i17 = y5Var.f210923c.f210057f;
        float f18 = (scale < ((float) i17) ? (i17 / 2.0f) - (scale / 2.0f) : 0.0f) - f17;
        if (f18 >= 0.0f) {
            y5Var.f210600a = true;
        } else if (java.lang.Math.abs(f18) <= 5.0f) {
            y5Var.f210600a = true;
        } else {
            f18 = (-((float) (java.lang.Math.abs(f18) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f18)) - 1.0d, 2.0d)))) * 2.0f;
        }
        y5Var.f210923c.f210056e.c(f18, 0.0f);
    }
}

package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.g6 f210416d;

    public f6(com.tencent.mm.ui.tools.g6 g6Var) {
        this.f210416d = g6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.g6 g6Var = this.f210416d;
        g6Var.f210440c.f210056e.getImageMatrix().getValues(g6Var.f210439b);
        float f17 = g6Var.f210439b[5];
        float scale = g6Var.f210440c.f210056e.getScale() * g6Var.f210440c.f210056e.getImageHeight();
        int i17 = g6Var.f210440c.f210058g;
        float f18 = (scale < ((float) i17) ? (i17 / 2.0f) - (scale / 2.0f) : 0.0f) - f17;
        if (f18 >= 0.0f) {
            g6Var.f210600a = true;
        } else if (java.lang.Math.abs(f18) <= 5.0f) {
            g6Var.f210600a = true;
        } else {
            f18 = (-((float) (java.lang.Math.abs(f18) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f18)) - 1.0d, 2.0d)))) * 2.0f;
        }
        g6Var.f210440c.f210056e.c(0.0f, f18);
    }
}

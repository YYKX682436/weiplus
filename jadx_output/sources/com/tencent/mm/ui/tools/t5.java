package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class t5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.u5 f210772d;

    public t5(com.tencent.mm.ui.tools.u5 u5Var) {
        this.f210772d = u5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.u5 u5Var = this.f210772d;
        u5Var.f210812c.f210056e.getImageMatrix().getValues(u5Var.f210811b);
        float scale = u5Var.f210812c.f210056e.getScale() * u5Var.f210812c.f210056e.getImageHeight();
        float f17 = u5Var.f210811b[5] + scale;
        int i17 = u5Var.f210812c.f210058g;
        float f18 = i17;
        if (scale < i17) {
            f18 = (i17 / 2.0f) + (scale / 2.0f);
        }
        float f19 = f18 - f17;
        if (f19 <= 0.0f) {
            u5Var.f210600a = true;
        } else if (java.lang.Math.abs(f19) <= 5.0f) {
            u5Var.f210600a = true;
        } else {
            f19 = ((float) (java.lang.Math.abs(f19) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f19)) - 1.0d, 2.0d))) * 2.0f;
        }
        u5Var.f210812c.f210056e.c(0.0f, f19);
    }
}

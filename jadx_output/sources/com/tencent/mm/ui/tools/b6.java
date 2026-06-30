package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c6 f210300d;

    public b6(com.tencent.mm.ui.tools.c6 c6Var) {
        this.f210300d = c6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.c6 c6Var = this.f210300d;
        c6Var.f210313c.f210056e.getImageMatrix().getValues(c6Var.f210312b);
        float scale = c6Var.f210313c.f210056e.getScale() * c6Var.f210313c.f210056e.getImageWidth();
        float f17 = c6Var.f210312b[2] + scale;
        int i17 = c6Var.f210313c.f210057f;
        float f18 = i17;
        if (scale < i17) {
            f18 = (i17 / 2.0f) + (scale / 2.0f);
        }
        float f19 = f18 - f17;
        if (f19 <= 0.0f) {
            c6Var.f210600a = true;
        } else if (java.lang.Math.abs(f19) <= 5.0f) {
            c6Var.f210600a = true;
        } else {
            f19 = ((float) (java.lang.Math.abs(f19) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f19)) - 1.0d, 2.0d))) * 2.0f;
        }
        c6Var.f210313c.f210056e.c(f19, 0.0f);
    }
}

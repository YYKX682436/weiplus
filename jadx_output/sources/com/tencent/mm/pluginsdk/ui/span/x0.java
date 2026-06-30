package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.y0 f191298d;

    public x0(com.tencent.mm.pluginsdk.ui.span.y0 y0Var, com.tencent.mm.pluginsdk.ui.span.v0 v0Var) {
        this.f191298d = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.pluginsdk.ui.span.y0.f191300z;
        com.tencent.mm.pluginsdk.ui.span.y0 y0Var = this.f191298d;
        if (y0Var.f191304g != null) {
            y0Var.f191317w.postDelayed(y0Var.f191319y, com.tencent.mm.pluginsdk.ui.span.y0.A - i17);
        }
    }
}

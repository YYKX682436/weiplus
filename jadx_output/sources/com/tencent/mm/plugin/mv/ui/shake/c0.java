package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes10.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f150938d;

    public c0(int i17) {
        this.f150938d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.shake.d0 d0Var = com.tencent.mm.plugin.mv.ui.shake.d0.f150940a;
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReport2Struct shakeActionReport2Struct = com.tencent.mm.plugin.mv.ui.shake.d0.f150941b;
        shakeActionReport2Struct.f60308d = this.f150938d;
        if (shakeActionReport2Struct != null) {
            shakeActionReport2Struct.k();
        }
    }
}

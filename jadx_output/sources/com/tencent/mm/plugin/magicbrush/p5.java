package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.s5 f148098d;

    public p5(com.tencent.mm.plugin.magicbrush.s5 s5Var) {
        this.f148098d = s5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jc3.j0 j0Var = (jc3.j0) this.f148098d.f148116b.get();
        if (j0Var != null) {
            ((rc3.w0) j0Var).pause();
        }
    }
}

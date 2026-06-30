package com.tencent.mm.plugin.scanner;

/* loaded from: classes5.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.m1 f158753d;

    public l1(com.tencent.mm.plugin.scanner.m1 m1Var) {
        this.f158753d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.scanner.m1 m1Var = this.f158753d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(m1Var.f158756d)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.scanner.SubCoreScanner", "accPath == null in onAccountPostReset");
                return;
            }
            com.tencent.mm.sdk.platformtools.t8.i(m1Var.f158756d + "image/scan/img", "scanbook", 604800000L);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|onAccountPostReset";
    }
}

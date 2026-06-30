package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class z1 implements com.tencent.wcdb.support.CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.w1 f213265a;

    public z1(com.tencent.mm.vfs.w1 w1Var) {
        this.f213265a = w1Var;
    }

    @Override // com.tencent.wcdb.support.CancellationSignal.OnCancelListener
    public final void onCancel() {
        com.tencent.mm.vfs.w1 w1Var = this.f213265a;
        synchronized (w1Var) {
            long j17 = w1Var.f213221d;
            if (j17 != 0) {
                com.tencent.mm.vfs.FastList.cancel(j17, true);
            }
        }
    }
}

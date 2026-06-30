package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class y implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188075e;

    public y(com.tencent.mm.plugin.webwx.ui.k0 k0Var, ug3.k kVar) {
        this.f188074d = k0Var;
        this.f188075e = kVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.setHasCallbackToQueue(true);
        iy4.w0 w0Var = (iy4.w0) m1Var;
        com.tencent.mm.plugin.webwx.ui.k0 k0Var = this.f188074d;
        android.animation.Animator animator = k0Var.I;
        if (animator != null) {
            animator.start();
        }
        boolean Zi = ((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(k0Var.f188021d, i17, i18, str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ug3.k kVar = this.f188075e;
        sb6.append(kVar.f392471n);
        sb6.append(", NetSceneExtDeviceControl handleErrMsg:");
        sb6.append(Zi);
        sb6.append(" errType:");
        sb6.append(i17);
        sb6.append(", errCode:");
        sb6.append(i18);
        sb6.append(", errMsg:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceAdapter", sb6.toString());
        if (Zi) {
            return;
        }
        int i19 = w0Var.f296020e;
        if (i17 != 0 || i18 != 0) {
            if (i19 == 1) {
                android.widget.Toast.makeText(k0Var.f188021d, com.tencent.mm.R.string.l7n, 0).show();
                return;
            } else {
                android.widget.Toast.makeText(k0Var.f188021d, com.tencent.mm.R.string.f493675l83, 0).show();
                return;
            }
        }
        boolean z17 = i19 == 1;
        k0Var.K = z17;
        java.lang.String str2 = ug3.i.f427536g;
        kVar.f427554J = z17;
        if (z17) {
            kVar.f392468h |= 4;
        } else {
            kVar.f392468h &= -5;
        }
        k0Var.l(kVar);
        int i27 = kVar.f392471n;
        boolean z18 = k0Var.K;
    }
}

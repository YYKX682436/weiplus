package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.q2 f144908d;

    public v2(com.tencent.mm.plugin.location.ui.impl.q2 q2Var) {
        this.f144908d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.location.ui.impl.q2 q2Var = this.f144908d;
        if (q2Var.K) {
            android.app.ProgressDialog progressDialog = q2Var.L;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            q2Var.H();
        }
        q2Var.K = false;
    }
}

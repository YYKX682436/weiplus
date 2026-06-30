package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176791d;

    public r0(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176791d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.k3 k3Var = this.f176791d.f176534z;
        if (k3Var != null) {
            k3Var.I(false);
        }
    }
}

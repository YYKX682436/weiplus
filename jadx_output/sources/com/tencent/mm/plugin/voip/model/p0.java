package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f176777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f176778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176779f;

    public p0(com.tencent.mm.plugin.voip.model.g1 g1Var, int i17, int i18) {
        this.f176779f = g1Var;
        this.f176777d = i17;
        this.f176778e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.k3 k3Var = this.f176779f.f176534z;
        if (k3Var != null) {
            k3Var.Q(this.f176777d, this.f176778e);
        }
    }
}

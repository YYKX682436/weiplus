package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.v2 f149829d;

    public u2(com.tencent.mm.plugin.multitalk.ilinkservice.v2 v2Var) {
        this.f149829d = v2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149829d.f149837a;
        i4Var.f149637n = 1;
        i4Var.f149638n2 = true;
        i4Var.U(new com.tencent.mm.plugin.multitalk.ilinkservice.t2(this));
    }
}

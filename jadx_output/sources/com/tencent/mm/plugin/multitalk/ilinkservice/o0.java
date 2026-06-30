package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q07 f149735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149736e;

    public o0(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, r45.q07 q07Var) {
        this.f149736e = i4Var;
        this.f149735d = q07Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.j(this.f149736e, new com.tencent.mm.plugin.multitalk.ilinkservice.n0(this));
    }
}

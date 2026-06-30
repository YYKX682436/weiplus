package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c0 f149581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149582e;

    public g(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar, com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        this.f149582e = cVar;
        this.f149581d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149582e;
        if (cVar.f149514a != null) {
            cVar.f149514a.E(cVar.a(this.f149581d));
        }
    }
}

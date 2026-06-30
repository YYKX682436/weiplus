package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f149682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149683f;

    public l(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar, int i17, java.lang.Object obj) {
        this.f149683f = cVar;
        this.f149681d = i17;
        this.f149682e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f149683f.f149514a;
        if (v0Var != null) {
            v0Var.F(this.f149681d, this.f149682e);
        }
    }
}

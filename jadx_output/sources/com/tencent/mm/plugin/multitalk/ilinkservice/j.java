package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149660d;

    public j(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar) {
        this.f149660d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f149660d.f149514a;
        if (v0Var == null || v0Var.f150176s == sj3.e4.Init) {
            return;
        }
        v0Var.f(false, false);
    }
}

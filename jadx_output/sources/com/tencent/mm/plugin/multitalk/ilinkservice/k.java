package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c0 f149668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149669e;

    public k(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar, com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        this.f149669e = cVar;
        this.f149668d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149669e;
        if (cVar.f149514a != null) {
            com.tencent.mm.modeltalkroom.MultiTalkGroup a17 = cVar.a(this.f149668d);
            cVar.f149514a.e(a17, java.lang.Boolean.TRUE);
            cVar.f149514a.E(a17);
        }
    }
}

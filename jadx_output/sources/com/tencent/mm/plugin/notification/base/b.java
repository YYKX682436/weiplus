package com.tencent.mm.plugin.notification.base;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.notification.base.c f152433d;

    public b(com.tencent.mm.plugin.notification.base.c cVar) {
        this.f152433d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.notification.base.c cVar = this.f152433d;
        g0Var.d(11425, java.lang.Integer.valueOf(cVar.f152434a.l()), 2, 0, 0);
        cVar.f152434a.a();
        cVar.f152434a.m();
        cVar.f152434a.w();
        cVar.f152434a.f152444b.a();
    }
}

package com.tencent.mm.plugin.notification.base;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.notification.base.c f152432d;

    public a(com.tencent.mm.plugin.notification.base.c cVar) {
        this.f152432d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.notification.base.c cVar = this.f152432d;
        g0Var.d(11425, java.lang.Integer.valueOf(cVar.f152434a.l()), 3, 0, 0);
        cVar.f152434a.a();
        com.tencent.mm.plugin.notification.base.j jVar = cVar.f152434a;
        jVar.f152443a.b();
        jVar.s();
        jVar.f152444b.e(jVar.f(jVar.f152443a.b()));
        jVar.f152443a.b();
        cVar.f152434a.t();
    }
}

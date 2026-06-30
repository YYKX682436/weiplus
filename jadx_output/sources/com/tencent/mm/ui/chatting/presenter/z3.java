package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f202582g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.b4 f202583h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.c4 f202584i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o3 f202585m;

    public z3(com.tencent.mm.ui.chatting.presenter.o3 o3Var, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, com.tencent.mm.ui.chatting.presenter.b4 b4Var, com.tencent.mm.ui.chatting.presenter.c4 c4Var) {
        this.f202585m = o3Var;
        this.f202579d = str;
        this.f202580e = str2;
        this.f202581f = str3;
        this.f202582g = j17;
        this.f202583h = b4Var;
        this.f202584i = c4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.o3 o3Var = this.f202585m;
        if (o3Var.f202406s.get()) {
            return;
        }
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
        int a17 = o25.y.a(this.f202579d);
        java.lang.String v17 = o72.x1.v(o3Var.f202541d, this.f202580e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17)) {
            v17 = this.f202581f;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o3Var.f202407t;
        long j17 = this.f202582g;
        concurrentHashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(a17));
        o3Var.f202408u.put(java.lang.Long.valueOf(j17), v17);
        com.tencent.mm.ui.chatting.presenter.b4 b4Var = this.f202583h;
        b4Var.getClass();
        b4Var.f202128k = v17;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.y3(this, v17));
    }
}

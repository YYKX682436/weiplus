package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes16.dex */
public final class js implements y00.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ms f204282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f204285d;

    public js(com.tencent.mm.ui.chatting.viewitems.ms msVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, long j17) {
        this.f204282a = msVar;
        this.f204283b = f9Var;
        this.f204284c = str;
        this.f204285d = j17;
    }

    public final void a(java.util.Map freshValues) {
        kotlin.jvm.internal.o.g(freshValues, "freshValues");
        jz5.l b17 = k.b.b(freshValues);
        this.f204282a.c((java.util.List) b17.f302833d, (java.util.List) b17.f302834e, this.f204283b, this.f204284c, this.f204285d);
        b10.d dVar = this.f204282a.f204607f;
        long j17 = this.f204285d;
        dVar.b(j17, freshValues);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardWholeCtrl", "bindProductList: refreshed from latest values, msgSvrId=" + j17);
    }
}

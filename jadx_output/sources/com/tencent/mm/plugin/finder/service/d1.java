package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.s1 f126025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(java.lang.String str, com.tencent.mm.plugin.finder.service.s1 s1Var) {
        super(1);
        this.f126024d = str;
        this.f126025e = s1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zy2.dc it = (zy2.dc) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkContactExpired#result] talker=");
        java.lang.String str = this.f126024d;
        sb6.append(str);
        sb6.append(" nick=");
        sb6.append(((ya2.b2) it).w0());
        com.tencent.mars.xlog.Log.i("Finder.ContactService", sb6.toString());
        this.f126025e.f126201i.remove(str);
        return jz5.f0.f302826a;
    }
}

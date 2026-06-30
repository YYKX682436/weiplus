package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.ya f126214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(zy2.ya yaVar) {
        super(5);
        this.f126214d = yaVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.String sessionIdServer = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(sessionIdServer, "sessionIdServer");
        this.f126214d.a(sessionIdServer, ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Number) obj3).intValue(), ((java.lang.Number) obj4).intValue(), (java.lang.String) obj5);
        return jz5.f0.f302826a;
    }
}

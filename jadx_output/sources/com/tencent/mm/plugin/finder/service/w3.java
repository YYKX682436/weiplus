package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.ya f126242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.x1 f126243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(zy2.ya yaVar, qb2.x1 x1Var) {
        super(4);
        this.f126242d = yaVar;
        this.f126243e = x1Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        zy2.ya yaVar = this.f126242d;
        java.lang.String field_sessionId = this.f126243e.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        yaVar.a(field_sessionId, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).intValue(), (java.lang.String) obj4);
        return jz5.f0.f302826a;
    }
}

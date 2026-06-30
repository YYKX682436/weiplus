package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.b0 f137867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p13.c f137868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.fts.b0 b0Var, p13.c cVar) {
        super(0);
        this.f137867d = b0Var;
        this.f137868e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.fts.b0.f(this.f137867d).remove(this.f137868e);
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yb f119506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f119508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(com.tencent.mm.plugin.finder.live.widget.yb ybVar, java.lang.String str, com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        super(0);
        this.f119506d = ybVar;
        this.f119507e = str;
        this.f119508f = z60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        re2.h1 h1Var = new re2.h1(this.f119506d.H.f120117a.f118090d, this.f119507e);
        re2.j1.f394437a.b(h1Var);
        az2.c cVar = az2.f.f16125d;
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f119508f;
        android.content.Context context = z60Var.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        az2.f a17 = az2.c.a(cVar, context, null, 0L, null, 8, null);
        a17.a();
        h1Var.k(new com.tencent.mm.plugin.finder.live.widget.n60(z60Var, a17, h1Var), new com.tencent.mm.plugin.finder.live.widget.p60(z60Var, a17, h1Var));
        return jz5.f0.f302826a;
    }
}

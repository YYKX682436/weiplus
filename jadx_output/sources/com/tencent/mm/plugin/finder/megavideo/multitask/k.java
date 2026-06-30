package com.tencent.mm.plugin.finder.megavideo.multitask;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f120870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f120871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120872g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, java.util.Map map, android.os.Bundle bundle, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f120869d = context;
        this.f120870e = map;
        this.f120871f = bundle;
        this.f120872g = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n40.o oVar = (n40.o) i95.n0.c(n40.o.class);
        android.content.Context context = this.f120869d;
        kotlin.jvm.internal.o.f(context, "$context");
        ((a03.h0) oVar).ij(context, this.f120870e, false, this.f120871f, null, (java.lang.String) this.f120872g.f310123d);
        return jz5.f0.f302826a;
    }
}

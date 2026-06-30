package com.tencent.mm.sns_compose.page;

/* loaded from: classes4.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f193553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n85.t f193554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f193555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(android.content.Context context, n85.t tVar, androidx.paging.compose.e eVar) {
        super(0);
        this.f193553d = context;
        this.f193554e = tVar;
        this.f193555f = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        m85.b bVar = m85.b.f324828a;
        n85.t tVar = this.f193554e;
        int i17 = tVar.f335725e;
        boolean equals = bVar.l().equals(tVar.f335721a);
        java.lang.String Id = ((n85.s) tVar).f335720l.f377855d;
        kotlin.jvm.internal.o.f(Id, "Id");
        bVar.e(this.f193553d, i17, equals, com.tencent.mm.sns_compose.page.s0.m(Id, this.f193555f));
        return jz5.f0.f302826a;
    }
}

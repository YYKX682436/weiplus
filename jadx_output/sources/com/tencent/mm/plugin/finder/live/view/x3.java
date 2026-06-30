package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.c4 f116792e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(java.lang.String str, com.tencent.mm.plugin.finder.live.view.c4 c4Var) {
        super(4);
        this.f116791d = str;
        this.f116792e = c4Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String link = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(link, "link");
        java.lang.String str = this.f116791d;
        com.tencent.mm.plugin.finder.live.view.c4 c4Var = this.f116792e;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.w3(((java.lang.Number) obj).intValue(), str, link, c4Var, (r45.i23) obj4, (java.lang.String) obj2));
        return jz5.f0.f302826a;
    }
}

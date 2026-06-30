package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f141039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f141040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.util.List list, yz5.l lVar) {
        super(1);
        this.f141039d = list;
        this.f141040e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e0.u0 LazyColumn = (e0.u0) obj;
        kotlin.jvm.internal.o.g(LazyColumn, "$this$LazyColumn");
        com.tencent.mm.plugin.game.ui.y0 y0Var = com.tencent.mm.plugin.game.ui.y0.f141872d;
        java.util.List list = this.f141039d;
        ((e0.y0) LazyColumn).b(list.size(), null, new com.tencent.mm.plugin.game.ui.z0(y0Var, list), u0.j.c(-632812321, true, new com.tencent.mm.plugin.game.ui.a1(list, this.f141040e)));
        return jz5.f0.f302826a;
    }
}

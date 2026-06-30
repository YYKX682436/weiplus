package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bg0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kg0 f112035e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.kg0 kg0Var) {
        super(0);
        this.f112034d = viewGroup;
        this.f112035e = kg0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qo0.c cVar = this.f112035e.f113230p;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return new ni2.j(this.f112034d, (com.tencent.mm.plugin.finder.live.view.k0) cVar);
    }
}

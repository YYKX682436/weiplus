package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class hh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f112811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.th0 f112812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh0(com.tencent.mm.modelbase.f fVar, com.tencent.mm.plugin.finder.live.plugin.th0 th0Var) {
        super(0);
        this.f112811d = fVar;
        this.f112812e = th0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.modelbase.f fVar = this.f112811d;
        java.lang.String str = fVar.f70617c;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.plugin.finder.live.plugin.th0 th0Var = this.f112812e;
        db5.t7.g(th0Var.f365323d.getContext(), !z17 ? fVar.f70617c : th0Var.f365323d.getContext().getString(com.tencent.mm.R.string.f491529de5));
        return jz5.f0.f302826a;
    }
}

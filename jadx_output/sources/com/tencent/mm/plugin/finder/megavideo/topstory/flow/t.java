package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader f121013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.u f121014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f121015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader, com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(1);
        this.f121013d = megaVideoFlowLoader;
        this.f121014e = uVar;
        this.f121015f = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        vn2.k kVar = vn2.l.f438315a;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader = this.f121013d;
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) megaVideoFlowLoader.f120884d).getValue(), null, null, new com.tencent.mm.plugin.finder.megavideo.topstory.flow.s(task, this.f121014e, vn2.k.d(kVar, null, megaVideoFlowLoader.getContextObj(), megaVideoFlowLoader.f120897t, 23, kVar.a(1), null, 32, null), this.f121013d, this.f121015f, null), 3, null);
        return jz5.f0.f302826a;
    }
}

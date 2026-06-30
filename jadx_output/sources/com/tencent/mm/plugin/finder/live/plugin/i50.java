package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i50 implements com.tencent.mm.plugin.finder.live.plugin.q50 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f112918a;

    public i50(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        this.f112918a = r60Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.q50
    public boolean a(cm2.t data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data instanceof cm2.i0;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.q50
    public com.tencent.mm.plugin.finder.live.plugin.ep0 b(cm2.t promoteData) {
        kotlin.jvm.internal.o.g(promoteData, "promoteData");
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f112918a;
        android.content.Context context = r60Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gk2.e S0 = r60Var.S0();
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var2 = this.f112918a;
        return new com.tencent.mm.plugin.finder.live.plugin.gc(context, S0, r60Var2.f114097r, r60Var2, r60Var2.f114094J, promoteData);
    }
}

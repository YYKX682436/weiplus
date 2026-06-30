package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k50 implements com.tencent.mm.plugin.finder.live.plugin.q50 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f113196a;

    public k50(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        this.f113196a = r60Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.q50
    public boolean a(cm2.t data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (zl2.r4.F1(this.f113196a.S0())) {
            return false;
        }
        return data instanceof cm2.y;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.q50
    public com.tencent.mm.plugin.finder.live.plugin.ep0 b(cm2.t promoteData) {
        kotlin.jvm.internal.o.g(promoteData, "promoteData");
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f113196a;
        android.content.Context context = r60Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.z10(context, r60Var.S0(), r60Var.f114097r, r60Var.f114094J, promoteData);
    }
}

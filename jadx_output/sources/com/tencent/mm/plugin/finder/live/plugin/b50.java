package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b50 implements com.tencent.mm.plugin.finder.live.plugin.q50 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f111975a;

    public b50(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        this.f111975a = r60Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.q50
    public boolean a(cm2.t data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data instanceof cm2.d0;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.q50
    public com.tencent.mm.plugin.finder.live.plugin.ep0 b(cm2.t promoteData) {
        kotlin.jvm.internal.o.g(promoteData, "promoteData");
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f111975a;
        android.content.Context context = r60Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.z40(context, r60Var.S0(), r60Var.f114097r, r60Var.f114094J, promoteData);
    }
}

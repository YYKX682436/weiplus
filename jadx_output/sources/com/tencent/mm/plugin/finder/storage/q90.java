package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class q90 extends com.tencent.mm.plugin.finder.convert.eh {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.s90 f127417r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(com.tencent.mm.plugin.finder.storage.s90 s90Var) {
        super(0, null, null, null, 15, null);
        this.f127417r = s90Var;
    }

    @Override // com.tencent.mm.plugin.finder.convert.eh, in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.finder.storage.s90.f(this.f127417r, holder, item);
    }
}

package com.tencent.mm.plugin.finder.search;

/* loaded from: classes.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f125616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(java.util.List list) {
        super(1);
        this.f125616d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed it = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f125616d.add(it);
        return jz5.f0.f302826a;
    }
}

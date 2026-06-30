package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bq.o1 f125721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, bq.o1 o1Var) {
        super(1);
        this.f125720d = finderFeedSearchUI;
        this.f125721e = o1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f125720d.i7(fVar != null ? fVar.f70615a : 0, fVar != null ? fVar.f70616b : 0, this.f125721e, fVar != null ? (r45.tu2) fVar.f70618d : null);
        return jz5.f0.f302826a;
    }
}

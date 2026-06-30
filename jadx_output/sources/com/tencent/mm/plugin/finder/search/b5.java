package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderTopicSearchUI f125639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI) {
        super(1);
        this.f125639d = finderTopicSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f125639d.V6(fVar != null ? fVar.f70615a : 0, fVar != null ? fVar.f70616b : 0, fVar != null ? (r45.tu2) fVar.f70618d : null);
        return jz5.f0.f302826a;
    }
}

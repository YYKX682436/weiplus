package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter f125628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bq.o1 f125629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter, bq.o1 o1Var) {
        super(1);
        this.f125628d = finderMixSearchPresenter;
        this.f125629e = o1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f125628d.i(fVar != null ? fVar.f70615a : 0, fVar != null ? fVar.f70616b : 0, this.f125629e, fVar != null ? (r45.tu2) fVar.f70618d : null);
        return jz5.f0.f302826a;
    }
}

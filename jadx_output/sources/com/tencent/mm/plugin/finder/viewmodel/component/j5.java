package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j5 implements nv2.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.oo f134811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.yj0 f134813c;

    public j5(r45.oo ooVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.storage.yj0 yj0Var) {
        this.f134811a = ooVar;
        this.f134812b = baseFinderFeed;
        this.f134813c = yj0Var;
    }

    @Override // nv2.i1
    public void a(com.tencent.mm.plugin.finder.storage.yj0 comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.i5(this.f134811a, comment, this.f134812b));
    }

    @Override // nv2.i1
    public void b(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.h5(this.f134811a, this.f134813c, this.f134812b, i17, i18, errMsg));
    }
}

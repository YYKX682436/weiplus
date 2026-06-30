package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class r4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.s4 f135763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f135764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.tencent.mm.plugin.finder.viewmodel.component.s4 s4Var, so2.j5 j5Var) {
        super(1);
        this.f135763d = s4Var;
        this.f135764e = j5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f135763d.R6(this.f135764e);
        return jz5.f0.f302826a;
    }
}

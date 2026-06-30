package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f136402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx2.q f136403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(android.content.Context context, gx2.q qVar) {
        super(1);
        this.f136402d = context;
        this.f136403e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String text = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(text, "text");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).mj(this.f136402d, null, 2);
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(this.f136403e, false, null, false, null, 15, null);
        com.tencent.mars.xlog.Log.i("FinderCommonEducationUIC", "onCustomLinkClick ".concat(text));
        return jz5.f0.f302826a;
    }
}

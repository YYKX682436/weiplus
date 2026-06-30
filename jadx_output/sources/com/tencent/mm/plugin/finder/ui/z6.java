package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class z6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderHomeUI f130081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(com.tencent.mm.plugin.finder.ui.FinderHomeUI finderHomeUI) {
        super(0);
        this.f130081d = finderHomeUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(au2.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((au2.q) c17).f14090h = this.f130081d.getTaskId();
        return jz5.f0.f302826a;
    }
}

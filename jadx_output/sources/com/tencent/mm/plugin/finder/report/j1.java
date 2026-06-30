package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.l1 f125086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.plugin.finder.report.l1 l1Var) {
        super(0);
        this.f125086d = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList R0 = this.f125086d.R0();
        synchronized (com.tencent.mm.plugin.finder.report.l1.f125110J) {
            com.tencent.mm.plugin.finder.report.l1.f125110J.addAll(R0);
        }
        return jz5.f0.f302826a;
    }
}

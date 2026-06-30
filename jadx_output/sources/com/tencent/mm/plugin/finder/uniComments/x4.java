package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f130453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.a5 f130454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(boolean z17, com.tencent.mm.plugin.finder.uniComments.a5 a5Var) {
        super(0);
        this.f130453d = z17;
        this.f130454e = a5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f130453d;
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var = this.f130454e;
        if (!z17 || a5Var.l().getFooterMode() != 2) {
            ((com.tencent.mm.plugin.finder.uniComments.u4) a5Var.f130200s).invoke();
        }
        return jz5.f0.f302826a;
    }
}

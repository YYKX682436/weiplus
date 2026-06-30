package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.tc1 f125011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(r45.tc1 tc1Var) {
        super(1);
        this.f125011d = tc1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        sc2.q8 q8Var;
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f3147h;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = p0Var != null ? p0Var.f453234a : null;
        r45.tc1 tc1Var = this.f125011d;
        boolean z17 = false;
        if (kotlin.jvm.internal.o.b(finderJumpInfo, (com.tencent.mm.protocal.protobuf.FinderJumpInfo) tc1Var.getCustom(0))) {
            xc2.p0 p0Var2 = observer.f3147h;
            if (p0Var2 != null && (q8Var = p0Var2.f453233J) != null && q8Var.f406177a) {
                z17 = true;
            }
            if (z17) {
                tc1Var.set(1, 2);
            }
        }
        return jz5.f0.f302826a;
    }
}

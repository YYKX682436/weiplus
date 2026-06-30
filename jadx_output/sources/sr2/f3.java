package sr2;

/* loaded from: classes10.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        super(0);
        this.f411563d = postMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.nf2 nf2Var;
        r45.nf2 nf2Var2;
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411563d;
        dv2.m0 m0Var = (dv2.m0) ((jz5.n) postMainUIC.Q).getValue();
        sr2.e3 e3Var = new sr2.e3(postMainUIC);
        m0Var.getClass();
        m92.b P6 = m0Var.P6();
        java.lang.Boolean bool = null;
        r45.nc4 u07 = P6 != null ? P6.u0() : null;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (u07 == null || (nf2Var2 = (r45.nf2) u07.getCustom(55)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) nf2Var2.getCustom(1);
        boolean z17 = !r26.n0.N(m0Var.f243896i);
        ry2.o k76 = m0Var.S6().k7();
        r45.q23 q23Var = m0Var.S6().k7().P;
        java.lang.String str = q23Var != null ? q23Var.f383585d : null;
        java.lang.Integer num = m0Var.S6().k7().f401420e;
        ov2.b bVar = ov2.b.f349168a;
        int i17 = k76.U;
        int v17 = bVar.v(str, i17, num);
        boolean z18 = false;
        if (v17 != 0) {
            com.tencent.mars.xlog.Log.i("FinderPostAddTagUIC", "skip reminder, reason=%d videoTemplateId=%s enterScene=%d postType=%d", java.lang.Integer.valueOf(v17), str, java.lang.Integer.valueOf(i17), num);
        } else {
            m92.b P62 = m0Var.P6();
            r45.nc4 u08 = P62 != null ? P62.u0() : null;
            if (u08 != null && (nf2Var = (r45.nf2) u08.getCustom(55)) != null) {
                bool = java.lang.Boolean.valueOf(nf2Var.getBoolean(0));
            }
            z18 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        }
        if (!z18 || finderJumpInfo == null || z17) {
            com.tencent.mars.xlog.Log.w("FinderPostAddTagUIC", "tryAddTagBeforeClickPost: alreadyAdd:" + z17);
            e3Var.invoke();
        } else {
            m0Var.f243897m = true;
            java.util.Map Q6 = m0Var.Q6();
            c61.ub ubVar = (c61.ub) ((jz5.n) m0Var.f243894g).getValue();
            kotlin.jvm.internal.o.f(ubVar, "<get-routerService>(...)");
            c61.ub.M8(ubVar, m0Var.getContext(), finderJumpInfo, Q6, null, new dv2.l0(m0Var, e3Var), 8, null);
        }
        return jz5.f0.f302826a;
    }
}

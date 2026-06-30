package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        super(1);
        this.f129891d = finderActivityDescUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        kotlin.jvm.internal.o.g((java.lang.String) obj, "<anonymous parameter 0>");
        com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI = this.f129891d;
        r45.e21 e21Var = finderActivityDescUI.L;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (e21Var == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) e21Var.getCustom(19)) == null) {
            f0Var = null;
        } else {
            finderActivityDescUI.f7(finderActivityDescUI.L, finderJumpInfo);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mm.plugin.finder.ui.FinderActivityDescUI.e7(finderActivityDescUI);
        }
        return f0Var2;
    }
}

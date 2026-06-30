package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class w6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderHomeUI f129978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(com.tencent.mm.plugin.finder.ui.FinderHomeUI finderHomeUI) {
        super(1);
        this.f129978d = finderHomeUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo it = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj;
        kotlin.jvm.internal.o.g(it, "it");
        xc2.y2 y2Var = xc2.y2.f453343a;
        androidx.appcompat.app.AppCompatActivity context = this.f129978d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xc2.y2.i(y2Var, context, new xc2.p0(it), 0, null, 12, null);
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class r4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.v4 f199817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb5.a0 f199818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.tencent.mm.ui.chatting.component.v4 v4Var, sb5.a0 a0Var, java.lang.String str) {
        super(1);
        this.f199817d = v4Var;
        this.f199818e = a0Var;
        this.f199819f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.view.a it = (com.tencent.mm.ui.chatting.view.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int ordinal = it.ordinal();
        java.lang.String str = this.f199819f;
        sb5.a0 a0Var = this.f199818e;
        if (ordinal != 0) {
            com.tencent.mm.ui.chatting.component.v4 v4Var = this.f199817d;
            if (ordinal == 1) {
                ((com.tencent.mm.ui.chatting.ChattingUIFragment) v4Var.f198580d.f460719n).B.p(true, 1000L);
            } else if (ordinal == 2) {
                ((com.tencent.mm.ui.chatting.ChattingUIFragment) v4Var.f198580d.f460719n).B.p(false, 0L);
                ((com.tencent.mm.ui.chatting.component.o4) a0Var).n0(str);
            }
        } else {
            ((com.tencent.mm.ui.chatting.component.o4) a0Var).n0(str);
        }
        return jz5.f0.f302826a;
    }
}

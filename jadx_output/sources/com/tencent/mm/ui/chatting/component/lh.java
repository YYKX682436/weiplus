package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class lh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f199434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.nh f199436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f199437g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.component.nh nhVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199435e = f9Var;
        this.f199436f = nhVar;
        this.f199437g = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.lh(this.f199435e, this.f199436f, this.f199437g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.component.lh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f199434d;
        com.tencent.mm.storage.f9 f9Var = this.f199435e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pt.g0 g0Var = (pt.g0) i95.n0.c(pt.g0.class);
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0());
            this.f199434d = 1;
            ((ot.g) g0Var).getClass();
            obj = pu.f0.f358300m.a().T6(msgIdTalker, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3 && i17 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.MessBoxComponentKt", "doFileRevoke() called cancelResult:" + booleanValue);
        com.tencent.mm.ui.chatting.component.nh nhVar = this.f199436f;
        if (booleanValue) {
            boolean b17 = w11.c1.f441989a.b(f9Var, true);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f199437g;
            if (b17) {
                ((com.tencent.mm.ui.chatting.component.ah) ((sb5.e1) nhVar.f199592a.f460708c.a(sb5.e1.class))).m0(f9Var, nhVar.f199592a.x());
                cd0.c0.b(1, f9Var, 1);
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                com.tencent.mm.ui.chatting.component.ih ihVar = new com.tencent.mm.ui.chatting.component.ih(u3Var, nhVar, null);
                this.f199434d = 2;
                if (kotlinx.coroutines.l.g(g3Var, ihVar, this) == aVar) {
                    return aVar;
                }
            } else {
                kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
                com.tencent.mm.ui.chatting.component.jh jhVar = new com.tencent.mm.ui.chatting.component.jh(f9Var, nhVar, u3Var, null);
                this.f199434d = 3;
                if (kotlinx.coroutines.l.g(g3Var2, jhVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            kotlinx.coroutines.p0 p0Var3 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var3 = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.ui.chatting.component.kh khVar = new com.tencent.mm.ui.chatting.component.kh(nhVar, f9Var, null);
            this.f199434d = 4;
            if (kotlinx.coroutines.l.g(g3Var3, khVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}

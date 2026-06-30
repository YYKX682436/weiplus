package du3;

/* loaded from: classes.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.b0 f243763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(du3.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243763d = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.x(this.f243763d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du3.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        du3.b0 b0Var = this.f243763d;
        b0Var.f243535t = b0Var.f243540y.contains("人物");
        jz5.g gVar = b0Var.f243539x;
        ((du3.q) ((jz5.n) gVar).getValue()).x(b0Var.f243535t);
        du3.q qVar = (du3.q) ((jz5.n) gVar).getValue();
        boolean z17 = b0Var.f243535t;
        qVar.f243682g = z17;
        r45.y86 y86Var = new r45.y86();
        y86Var.set(1, 1);
        y86Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 12053;
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsgetconfigdata";
        lVar.f70664a = y86Var;
        lVar.f70665b = new r45.z86();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(new du3.p(qVar));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.lang.Object value = ((jz5.n) b0Var.f243537v).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        cy1.a aVar2 = (cy1.a) rVar;
        aVar2.fk((android.view.View) value, "yb_content_type", new java.lang.Integer(b0Var.f243535t ? 1 : 2));
        return aVar2;
    }
}

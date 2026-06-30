package dv2;

/* loaded from: classes10.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.g9 f243815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv2.e1 f243816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.m8 f243817f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.finder.assist.g9 g9Var, dv2.e1 e1Var, com.tencent.mm.plugin.finder.assist.m8 m8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243815d = g9Var;
        this.f243816e = e1Var;
        this.f243817f = m8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dv2.b1(this.f243815d, this.f243816e, this.f243817f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dv2.b1 b1Var = (dv2.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dv2.e1 e1Var = this.f243816e;
        int i17 = e1Var.f243839p;
        r45.yx5 yx5Var = new r45.yx5();
        r45.dy5 dy5Var = new r45.dy5();
        dy5Var.f372859h = i17;
        yx5Var.f391480h = dy5Var;
        byte[] byteArray = yx5Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        com.tencent.mm.plugin.finder.assist.g9 g9Var = this.f243815d;
        g9Var.f102206b = byteArray;
        super/*dv2.o1*/.T6(g9Var, this.f243817f);
        return jz5.f0.f302826a;
    }
}

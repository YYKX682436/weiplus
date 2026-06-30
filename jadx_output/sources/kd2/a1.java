package kd2;

/* loaded from: classes2.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f306707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.protocal.protobuf.FinderObject finderObject, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f306707d = finderObject;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kd2.a1(this.f306707d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kd2.a1 a1Var = (kd2.a1) create((r45.av2) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderVideoPassive", "delete see later success");
        pm0.v.X(new kd2.z0(this.f306707d));
        return jz5.f0.f302826a;
    }
}

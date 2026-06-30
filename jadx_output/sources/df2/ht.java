package df2;

/* loaded from: classes10.dex */
public final class ht extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.iy2 f230352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(df2.lt ltVar, r45.iy2 iy2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230351d = ltVar;
        this.f230352e = iy2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ht(this.f230351d, this.f230352e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.ht htVar = (df2.ht) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        htVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> list = this.f230352e.getList(0);
        kotlin.jvm.internal.o.f(list, "getJump_infos(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo : list) {
            kotlin.jvm.internal.o.d(finderJumpInfo);
            arrayList2.add(new dk2.h(finderJumpInfo));
        }
        arrayList.addAll(arrayList2);
        df2.lt ltVar = this.f230351d;
        df2.lt.b7(ltVar, arrayList);
        df2.lt.f7(ltVar, arrayList);
        ym5.a1.f(new df2.gt(ltVar));
        return jz5.f0.f302826a;
    }
}

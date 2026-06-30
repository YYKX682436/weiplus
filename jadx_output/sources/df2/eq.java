package df2;

/* loaded from: classes3.dex */
public final class eq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.gq f230078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f230079f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(df2.gq gqVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230078e = gqVar;
        this.f230079f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.eq(this.f230078e, this.f230079f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.eq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.widget.et a76;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230077d;
        df2.gq gqVar = this.f230078e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f230077d = 1;
            if (df2.gq.Z6(gqVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.fu1 fu1Var = gqVar.f230238n;
        if (fu1Var != null && (a76 = gqVar.a7()) != null) {
            java.util.LinkedList list = fu1Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getItem_list(...)");
            a76.K = list;
            ((com.tencent.mm.plugin.finder.live.widget.vs) ((jz5.n) a76.U).getValue()).notifyDataSetChanged();
            a76.k0();
        }
        yz5.l lVar = this.f230079f;
        if (lVar != null) {
            lVar.invoke(gqVar.f230238n);
        }
        return jz5.f0.f302826a;
    }
}

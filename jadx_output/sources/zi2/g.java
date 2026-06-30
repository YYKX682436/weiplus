package zi2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zi2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473108e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi2.g(this.f473108e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zi2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473107d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            km2.q a76 = ((mm2.o4) this.f473108e.P0(mm2.o4.class)).a7();
            r45.wx5 wx5Var = new r45.wx5();
            wx5Var.set(0, a76.f309170a);
            wx5Var.set(2, java.lang.Integer.valueOf(a76.f309192w));
            linkedList.add(wx5Var);
            java.util.List<km2.q> list = ((mm2.o4) this.f473108e.P0(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                for (km2.q qVar : list) {
                    r45.wx5 wx5Var2 = new r45.wx5();
                    wx5Var2.set(0, qVar.f309170a);
                    wx5Var2.set(1, qVar.f309175f);
                    wx5Var2.set(2, java.lang.Integer.valueOf(qVar.f309192w));
                    linkedList.add(wx5Var2);
                }
            }
            zi2.w wVar = this.f473108e;
            this.f473107d = 1;
            if (wVar.J1(linkedList, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}

package mx3;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332603e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx3.o(this.f332603e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx3.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332602d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                t45.d0 d0Var = new t45.d0();
                d0Var.f415538d = 1;
                t45.e0 e0Var = new t45.e0();
                e0Var.f415547d = this.f332603e;
                d0Var.f415539e = e0Var;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(d0Var);
                ux3.i iVar = new ux3.i(linkedList);
                this.f332602d = 1;
                obj = rm0.h.a(iVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.util.LinkedList linkedList2 = ((t45.c0) obj).f415535d;
            if (linkedList2 != null) {
                t45.a0 a0Var = (t45.a0) linkedList2.getFirst();
                if (a0Var != null) {
                    return a0Var;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }
}

package uh2;

/* loaded from: classes3.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f427950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f427951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.h84 h84Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f427951e = h84Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uh2.a(this.f427951e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uh2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.g84 g84Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f427950d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.LinkedList list = this.f427951e.getList(4);
            if (list != null && (g84Var = (r45.g84) kz5.n0.Z(list)) != null) {
                i95.m c17 = i95.n0.c(zy.u.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
                java.lang.String string = g84Var.getString(1);
                java.lang.String string2 = g84Var.getString(2);
                this.f427950d = 1;
                if (zy.w.Lc(p37, string, true, string2, 0, 0, null, null, this, 120, null) == aVar) {
                    return aVar;
                }
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

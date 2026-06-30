package uh2;

/* loaded from: classes3.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f427952d;

    public b(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        uh2.b bVar = new uh2.b(continuation);
        bVar.f427952d = obj;
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        uh2.b bVar = (uh2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f427952d;
        int i17 = 0;
        int i18 = 4;
        for (java.lang.Object obj2 : uh2.c.f427954b) {
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.h84 h84Var = (r45.h84) obj2;
            if (i18 > 0) {
                kotlinx.coroutines.l.d(y0Var, null, null, new uh2.a(h84Var, null), 3, null);
                i18--;
            }
            i17 = i19;
        }
        return jz5.f0.f302826a;
    }
}

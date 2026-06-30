package cu2;

/* loaded from: classes2.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f222381d;

    /* renamed from: e, reason: collision with root package name */
    public int f222382e;

    public d0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cu2.d0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new cu2.d0((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f222382e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cu2.f0 f0Var = cu2.f0.f222391a;
            it = cu2.f0.f222394d.iterator();
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f222381d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            r45.tl2 tl2Var = (r45.tl2) it.next();
            i95.m c17 = i95.n0.c(zy.u.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
            java.lang.String string = tl2Var.getString(1);
            java.lang.String string2 = tl2Var.getString(2);
            this.f222381d = it;
            this.f222382e = 1;
            if (zy.w.Lc(p37, string, false, string2, 0, 0, null, null, this, 122, null) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}

package xm3;

/* loaded from: classes4.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm3.d f455312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455311d = mvvmList;
        this.f455312e = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.f0(this.f455311d, this.f455312e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xm3.f0 f0Var = (xm3.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        f0Var.invokeSuspend(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455311d;
        java.util.Iterator it = mvvmList.f152066p.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            if (kotlin.jvm.internal.o.b(this.f455312e.v(), ((xm3.d) next).v())) {
                it.remove();
            }
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList.m(mvvmList, xm3.i.f455323f, false, 2, null);
        return jz5.f0.f302826a;
    }
}

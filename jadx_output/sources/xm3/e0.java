package xm3;

/* loaded from: classes4.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f455307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455306d = mvvmList;
        this.f455307e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.e0(this.f455306d, this.f455307e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xm3.e0 e0Var = (xm3.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455306d;
        java.util.Iterator it = mvvmList.f152066p.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            if (this.f455307e.contains(((xm3.d) next).v())) {
                it.remove();
            }
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList.m(mvvmList, xm3.i.f455323f, false, 2, null);
        return jz5.f0.f302826a;
    }
}

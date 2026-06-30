package xm3;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f455333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(yz5.l lVar, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455333d = lVar;
        this.f455334e = mvvmList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.j0(this.f455333d, this.f455334e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xm3.j0 j0Var = (xm3.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455334e;
        this.f455333d.invoke(mvvmList.f152066p);
        com.tencent.mm.plugin.mvvmlist.MvvmList.m(mvvmList, xm3.i.f455322e, false, 2, null);
        return jz5.f0.f302826a;
    }
}

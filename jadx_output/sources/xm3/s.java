package xm3;

/* loaded from: classes4.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455377d = mvvmList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.s(this.f455377d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xm3.s sVar = (xm3.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455377d;
        androidx.lifecycle.n nVar = mvvmList.b().f11605c;
        androidx.lifecycle.n nVar2 = androidx.lifecycle.n.CREATED;
        if (nVar.compareTo(nVar2) < 0) {
            mvvmList.b().i(nVar2);
        }
        return jz5.f0.f302826a;
    }
}

package xm3;

/* loaded from: classes4.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm3.n0 f455302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455301d = mvvmList;
        this.f455302e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.c0(this.f455301d, this.f455302e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xm3.c0 c0Var = (xm3.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455301d;
        if (!mvvmList.f152063m) {
            mvvmList.a(xm3.i.f455325h, this.f455302e);
        }
        return jz5.f0.f302826a;
    }
}

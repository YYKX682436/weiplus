package xm3;

/* loaded from: classes4.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f455284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xm3.d f455286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z17, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455284d = z17;
        this.f455285e = mvvmList;
        this.f455286f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.a0(this.f455284d, this.f455285e, this.f455286f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xm3.a0 a0Var = (xm3.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f455284d;
        xm3.d dVar = this.f455286f;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455285e;
        if (z17) {
            mvvmList.f152066p.add(dVar);
            com.tencent.mm.plugin.mvvmlist.MvvmList.m(mvvmList, xm3.i.f455321d, false, 2, null);
        } else if (!mvvmList.f152066p.contains(dVar)) {
            mvvmList.f152066p.add(dVar);
            com.tencent.mm.plugin.mvvmlist.MvvmList.m(mvvmList, xm3.i.f455321d, false, 2, null);
        }
        return jz5.f0.f302826a;
    }
}

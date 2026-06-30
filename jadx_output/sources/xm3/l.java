package xm3;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f455344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xm3.i f455346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f455347g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xm3.n0 f455348h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.i iVar, int i17, xm3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455345e = mvvmList;
        this.f455346f = iVar;
        this.f455347g = i17;
        this.f455348h = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.l(this.f455345e, this.f455346f, this.f455347g, this.f455348h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xm3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f455344d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455345e;
            mvvmList.k(true);
            xm3.i iVar = xm3.i.f455325h;
            xm3.i iVar2 = this.f455346f;
            if (iVar2 == iVar) {
                mvvmList.f152066p.clear();
            }
            mvvmList.f152057d.onCreate();
            pm0.v.X(new xm3.j(mvvmList));
            mvvmList.h(new ym3.o(ym3.p.f463180e, null), 0);
            ym3.f fVar = mvvmList.f152057d;
            v65.i iVar3 = mvvmList.f152060g;
            int size = mvvmList.f152066p.size();
            xm3.n0 n0Var = this.f455348h;
            kotlinx.coroutines.flow.j r17 = kotlinx.coroutines.flow.l.r(fVar.a(iVar3, new ym3.c(this.f455347g, size, n0Var.f455359d, n0Var.f455361f)), 1);
            xm3.k kVar = new xm3.k(mvvmList, iVar2, n0Var);
            this.f455344d = 1;
            if (((kotlinx.coroutines.flow.x0) r17).a(kVar, this) == aVar) {
                return aVar;
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

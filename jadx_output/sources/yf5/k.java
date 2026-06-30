package yf5;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.m f461892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.x f461893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f461894f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yf5.m mVar, yf5.x xVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461892d = mVar;
        this.f461893e = xVar;
        this.f461894f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf5.k(this.f461892d, this.f461893e, this.f461894f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yf5.k kVar = (yf5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yf5.m mVar = this.f461892d;
        java.lang.String str = mVar.f461908b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("submitInsert, ");
        yf5.x xVar = this.f461893e;
        com.tencent.mm.storage.l4 l4Var = xVar.f461995d;
        sb6.append(l4Var != null ? l4Var.h1() : null);
        sb6.append(", ");
        com.tencent.mm.storage.l4 l4Var2 = xVar.f461995d;
        sb6.append(l4Var2 != null ? new java.lang.Long(l4Var2.G0()) : null);
        sb6.append(", ");
        com.tencent.mm.storage.l4 l4Var3 = xVar.f461995d;
        sb6.append(l4Var3 != null ? new java.lang.Long(l4Var3.w0()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (xVar.f461995d.G0() >= mVar.f461912f.f461863a) {
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = mVar.f461907a.f461962f;
            if (mvvmList != null) {
                mvvmList.o(xVar, false);
            }
        } else {
            mVar.f461911e.put(xVar.f461995d.h1(), new yf5.f(xVar, xm3.i.f455321d, this.f461894f));
        }
        return jz5.f0.f302826a;
    }
}

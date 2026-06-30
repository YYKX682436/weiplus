package yf5;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.m f461899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.x f461900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f461901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f461902g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yf5.m mVar, yf5.x xVar, boolean z17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461899d = mVar;
        this.f461900e = xVar;
        this.f461901f = z17;
        this.f461902g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf5.l(this.f461899d, this.f461900e, this.f461901f, this.f461902g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yf5.l lVar = (yf5.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yf5.m mVar = this.f461899d;
        java.lang.String str = mVar.f461908b;
        yf5.x xVar = this.f461900e;
        com.tencent.mm.storage.l4 l4Var = xVar.f461995d;
        com.tencent.mm.storage.l4 l4Var2 = xVar.f461995d;
        if (l4Var2 != null) {
            new java.lang.Long(l4Var2.G0());
        }
        com.tencent.mm.storage.l4 l4Var3 = xVar.f461995d;
        if (l4Var3 != null) {
            new java.lang.Long(l4Var3.w0());
        }
        if (xVar.f461995d.G0() >= mVar.f461912f.f461863a) {
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = mVar.f461907a.f461962f;
            if (mvvmList != null) {
                mvvmList.y(xVar, this.f461901f);
            }
        } else {
            mVar.f461911e.put(xVar.f461995d.h1(), new yf5.f(xVar, xm3.i.f455322e, this.f461902g));
        }
        return jz5.f0.f302826a;
    }
}

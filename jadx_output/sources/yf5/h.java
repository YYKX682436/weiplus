package yf5;

/* loaded from: classes11.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.m f461885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f461886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f461887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yf5.m mVar, int i17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461885d = mVar;
        this.f461886e = i17;
        this.f461887f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf5.h(this.f461885d, this.f461886e, this.f461887f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf5.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yf5.k0 k0Var = new yf5.k0();
        yf5.m mVar = this.f461885d;
        k0Var.f461897c = mVar.f461912f.f461863a;
        int i17 = this.f461886e;
        k0Var.f461896b = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get convList, requestVersion: ");
        sb6.append(k0Var.f461896b);
        sb6.append(", id: ");
        sb6.append(k0Var.f461895a);
        sb6.append(", flagVersion.version: ");
        yf5.e eVar = mVar.f461912f;
        sb6.append(eVar.f461864b);
        sb6.append(", flag: ");
        sb6.append(k0Var.f461897c);
        com.tencent.mars.xlog.Log.i(mVar.f461908b, sb6.toString());
        int i18 = k0Var.f461896b;
        int i19 = eVar.f461864b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i18 < i19) {
            return f0Var;
        }
        yf5.l0 g17 = mVar.f461907a.g(k0Var);
        java.util.ArrayList arrayList = g17.f461904b;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = arrayList;
        yf5.x xVar = (yf5.x) kz5.n0.k0(arrayList2);
        if (xVar != null && xVar.f461995d != null) {
            mVar.d(k0Var.f461896b, g17.f461906d);
        }
        v65.i.b(mVar.f461910d, null, new yf5.g(mVar, g17, this.f461887f, arrayList2, k0Var, null), 1, null);
        if (g17.f461905c) {
            v65.i.b(mVar.f461909c, null, new yf5.h(mVar, i17, null, null), 1, null);
        } else {
            mVar.d(k0Var.f461896b, Long.MIN_VALUE);
        }
        return f0Var;
    }
}

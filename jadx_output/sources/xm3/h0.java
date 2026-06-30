package xm3;

/* loaded from: classes4.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm3.d f455319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f455320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.d dVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455318d = mvvmList;
        this.f455319e = dVar;
        this.f455320f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.h0(this.f455318d, this.f455319e, this.f455320f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xm3.h0 h0Var = (xm3.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455318d;
        java.util.ArrayList arrayList = mvvmList.f152066p;
        xm3.d dVar = this.f455319e;
        if (arrayList.contains(dVar)) {
            mvvmList.f152066p.remove(dVar);
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            mvvmList.f152066p.add(dVar);
            com.tencent.mm.plugin.mvvmlist.MvvmList.m(mvvmList, xm3.i.f455322e, false, 2, null);
        } else {
            if (this.f455320f) {
                mvvmList.f152066p.add(dVar);
                com.tencent.mm.plugin.mvvmlist.MvvmList.m(mvvmList, xm3.i.f455321d, false, 2, null);
            }
            com.tencent.mars.xlog.Log.i(mvvmList.c(), "submitUpdate not find item: " + dVar.v());
        }
        return jz5.f0.f302826a;
    }
}

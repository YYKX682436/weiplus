package gx0;

/* loaded from: classes5.dex */
public final class gc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw0.d f276465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.kc f276466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(zw0.d dVar, gx0.kc kcVar, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276465e = dVar;
        this.f276466f = kcVar;
        this.f276467g = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.gc(this.f276465e, this.f276466f, this.f276467g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.gc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276464d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.kc kcVar = this.f276466f;
            zw0.d dVar = this.f276465e;
            if (dVar != null) {
                kcVar.getClass();
                com.tencent.mars.xlog.Log.i("HandleBoxUIC", "onPanelClosed: level " + dVar);
                if (gx0.bc.f276243a[dVar.ordinal()] == 1) {
                    ((gx0.x4) ((jz5.n) kcVar.f276632n).getValue()).U6(false);
                }
            }
            ex0.a0 a0Var = kcVar.l7().f276642r;
            if (a0Var != null && (list = a0Var.f257097g.f257178f) != null) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    kcVar.Z6(((ex0.r) it.next()).f257167a);
                }
                gx0.bf k76 = kcVar.k7();
                com.tencent.maas.model.time.MJTime mJTime = this.f276467g;
                this.f276464d = 1;
                if (gx0.bf.d7(k76, null, mJTime, false, this, 5, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}

package gx0;

/* loaded from: classes5.dex */
public final class ye extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f277234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f277235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f277236f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f277237g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f277238h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f277239i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(boolean z17, gx0.bf bfVar, com.tencent.maas.model.time.MJTime mJTime, int i17, com.tencent.maas.model.time.MJTimeRange mJTimeRange, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277234d = z17;
        this.f277235e = bfVar;
        this.f277236f = mJTime;
        this.f277237g = i17;
        this.f277238h = mJTimeRange;
        this.f277239i = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ye(this.f277234d, this.f277235e, this.f277236f, this.f277237g, this.f277238h, this.f277239i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ye) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f277234d;
        gx0.bf bfVar = this.f277235e;
        if (z17 && !bfVar.m7()) {
            return java.lang.Boolean.FALSE;
        }
        gx0.bf bfVar2 = this.f277235e;
        boolean booleanValue = ((java.lang.Boolean) kotlinx.coroutines.l.e(bfVar2.f276252s, new gx0.xe(bfVar2, this.f277236f, this.f277237g, this.f277238h, this.f277239i, null))).booleanValue();
        if (booleanValue) {
            gx0.fd fdVar = gx0.fd.f276432h;
            bfVar.f276256w = fdVar;
            bfVar.f276254u.postValue(fdVar);
        }
        return java.lang.Boolean.valueOf(booleanValue);
    }
}

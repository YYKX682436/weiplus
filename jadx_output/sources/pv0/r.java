package pv0;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pv0.j f358545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pv0.y f358547g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f358548h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f358549i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pv0.j jVar, java.lang.String str, pv0.y yVar, com.tencent.maas.moviecomposing.segments.Segment segment, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358545e = jVar;
        this.f358546f = str;
        this.f358547g = yVar;
        this.f358548h = segment;
        this.f358549i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pv0.r(this.f358545e, this.f358546f, this.f358547g, this.f358548h, this.f358549i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pv0.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        fv0.d c17;
        dw0.c k76;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f358544d;
        pv0.j jVar = this.f358545e;
        pv0.y yVar = this.f358547g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int ordinal = jVar.ordinal();
            if (ordinal == 0) {
                c17 = fv0.e.c(com.tencent.maas.material.g.TimbreVoiceChange);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                c17 = fv0.e.c(com.tencent.maas.material.g.TimbreTTS);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadTTSTimbreList: roleId ");
            java.lang.String str = this.f358546f;
            sb6.append(str);
            sb6.append(" scene ");
            sb6.append(c17);
            com.tencent.mars.xlog.Log.i("TimbrePanelUIC", sb6.toString());
            gw0.e eVar = yVar.f358561o;
            this.f358544d = 1;
            if (eVar.c(str, this.f358548h, c17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.f358549i && (k76 = yVar.k7()) != null) {
            yVar.f358563q.a(null, k76, jVar);
        }
        return jz5.f0.f302826a;
    }
}

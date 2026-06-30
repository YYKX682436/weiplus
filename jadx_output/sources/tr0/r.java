package tr0;

/* loaded from: classes14.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f421349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f421350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f421351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f421352i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tr0.t tVar, int i17, int i18, int i19, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421348e = tVar;
        this.f421349f = i17;
        this.f421350g = i18;
        this.f421351h = i19;
        this.f421352i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tr0.r(this.f421348e, this.f421349f, this.f421350g, this.f421351h, this.f421352i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr0.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421347d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            tr0.t tVar = this.f421348e;
            if (tVar.A) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Camera.Camera1Impl", "is taking picture ignore");
                return null;
            }
            tr0.b bVar = tVar.f421363y;
            tVar.z(bVar.f421286g, bVar.f421284e, 2);
            tr0.t tVar2 = this.f421348e;
            tVar2.A = true;
            int i18 = this.f421349f;
            int i19 = this.f421350g;
            int i27 = this.f421351h;
            boolean z17 = this.f421352i;
            this.f421347d = 1;
            obj = tr0.t.J(tVar2, i18, i19, i27, z17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

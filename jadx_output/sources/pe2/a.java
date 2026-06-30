package pe2;

/* loaded from: classes3.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public float f353609d;

    /* renamed from: e, reason: collision with root package name */
    public int f353610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f353611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView f353612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f353613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView cheerCountDownView, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353611f = j17;
        this.f353612g = cheerCountDownView;
        this.f353613h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pe2.a(this.f353611f, this.f353612g, this.f353613h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f353610e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            f17 = 360.0f / (((float) this.f353611f) / 60.0f);
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f17 = this.f353609d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (true) {
            com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView cheerCountDownView = this.f353612g;
            float f18 = cheerCountDownView.f111526m;
            if (f18 <= 0.0f) {
                com.tencent.mars.xlog.Log.e("CheerCountDownView", "endCountDown");
                this.f353613h.invoke();
                return jz5.f0.f302826a;
            }
            float f19 = f18 - f17;
            cheerCountDownView.f111526m = f19;
            if (f19 < 0.0f) {
                cheerCountDownView.f111526m = 0.0f;
            }
            cheerCountDownView.invalidate();
            if (cheerCountDownView.f111526m > 0.0f) {
                this.f353609d = f17;
                this.f353610e = 1;
                if (kotlinx.coroutines.k1.b(60L, this) == aVar) {
                    return aVar;
                }
            }
        }
    }
}

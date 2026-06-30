package wt3;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.e f449380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f449381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wt3.e eVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449380e = eVar;
        this.f449381f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wt3.b(this.f449380e, this.f449381f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f449379d;
        wt3.e eVar = this.f449380e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            wt3.n0 g17 = eVar.g();
            this.f449379d = 1;
            obj = g17.b(eVar.f449393b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) obj;
        boolean z17 = this.f449381f;
        if (gVar != null) {
            eVar.h(gVar, z17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbsGetRecommendAudioTask", "[getMusicList] get classifyResultData error to getDefaultList");
            eVar.h(null, z17);
        }
        return jz5.f0.f302826a;
    }
}

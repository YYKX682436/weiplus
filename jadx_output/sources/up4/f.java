package up4;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f429869d;

    /* renamed from: e, reason: collision with root package name */
    public int f429870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.videocomposition.play.VideoCompositionPlayView f429872g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429871f = str;
        this.f429872g = videoCompositionPlayView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new up4.f(this.f429871f, this.f429872g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((up4.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.g0 g0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f429870e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playFakeVideo >> workTagId: ");
            java.lang.String str = this.f429871f;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayManager", sb6.toString());
            dm.q0 d17 = zp4.e.f474954a.d(str);
            if ((d17 != null ? d17.field_composition_info : null) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: false, action: 2");
                com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
                snsFakeVideoLogStruct.f60551d = 2;
                snsFakeVideoLogStruct.f60560m = 2;
                snsFakeVideoLogStruct.k();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoByWorkTagId >> workTagId: " + str + " no in db");
                return new java.lang.Long(-1L);
            }
            kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            up4.e eVar = new up4.e(g0Var2, d17, this.f429872g, null);
            this.f429869d = g0Var2;
            this.f429870e = 1;
            if (kotlinx.coroutines.l.g(g3Var, eVar, this) == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = (kotlin.jvm.internal.g0) this.f429869d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoByWorkTagId >> id = " + g0Var.f310121d);
        return new java.lang.Long(g0Var.f310121d);
    }
}

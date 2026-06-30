package up4;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f429858d;

    /* renamed from: e, reason: collision with root package name */
    public int f429859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f429860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f429861g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f429862h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.videocomposition.play.VideoCompositionPlayView f429863i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, boolean z17, int i18, com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429860f = i17;
        this.f429861g = z17;
        this.f429862h = i18;
        this.f429863i = videoCompositionPlayView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new up4.c(this.f429860f, this.f429861g, this.f429862h, this.f429863i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((up4.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.g0 g0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f429859e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playFakeVideo >> snsLocalId: ");
            int i18 = this.f429860f;
            sb6.append(i18);
            sb6.append(", isMute: ");
            sb6.append(this.f429861g);
            sb6.append(", snsCreateTime: ");
            int i19 = this.f429862h;
            sb6.append(i19);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayManager", sb6.toString());
            dm.q0 c17 = zp4.e.f474954a.c(i18, i19);
            if ((c17 != null ? c17.field_composition_info : null) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: false, action: 1");
                com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
                snsFakeVideoLogStruct.f60551d = 1;
                snsFakeVideoLogStruct.f60560m = 2;
                snsFakeVideoLogStruct.k();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoBySnsLocalId >> snsLocalId: " + i18 + " no in db");
                return new java.lang.Long(-1L);
            }
            kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            up4.b bVar = new up4.b(g0Var2, c17, this.f429863i, this.f429861g, null);
            this.f429858d = g0Var2;
            this.f429859e = 1;
            if (kotlinx.coroutines.l.g(g3Var, bVar, this) == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = (kotlin.jvm.internal.g0) this.f429858d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoBySnsLocalId >> id = " + g0Var.f310121d);
        return new java.lang.Long(g0Var.f310121d);
    }
}

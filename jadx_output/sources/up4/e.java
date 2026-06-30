package up4;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f429865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f429866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dm.q0 f429867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.videocomposition.play.VideoCompositionPlayView f429868g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.jvm.internal.g0 g0Var, dm.q0 q0Var, com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429866e = g0Var;
        this.f429867f = q0Var;
        this.f429868g = videoCompositionPlayView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new up4.e(this.f429866e, this.f429867f, this.f429868g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((up4.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f429865d;
        kotlin.jvm.internal.g0 g0Var = this.f429866e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: true, action: 2");
            com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
            snsFakeVideoLogStruct.f60551d = 2;
            snsFakeVideoLogStruct.f60560m = 1;
            snsFakeVideoLogStruct.k();
            up4.g gVar = up4.g.f429873a;
            byte[] field_composition_info = this.f429867f.field_composition_info;
            kotlin.jvm.internal.o.f(field_composition_info, "field_composition_info");
            g0Var.f310121d = gVar.a(field_composition_info, this.f429868g, false);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            up4.d dVar = new up4.d(g0Var, null);
            this.f429865d = 1;
            if (kotlinx.coroutines.l.g(p0Var, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        up4.h hVar = (up4.h) up4.g.f429874b.get(new java.lang.Long(g0Var.f310121d));
        if (hVar == null) {
            return null;
        }
        hVar.f429875a.o(hVar.f429878d.e());
        return jz5.f0.f302826a;
    }
}

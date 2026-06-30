package rp4;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f398664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI f398665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f398666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f398667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer[] f398668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI videoCompositionRemuxUI, java.util.List list, java.util.List list2, java.lang.Integer[] numArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398665e = videoCompositionRemuxUI;
        this.f398666f = list;
        this.f398667g = list2;
        this.f398668h = numArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rp4.h0(this.f398665e, this.f398666f, this.f398667g, this.f398668h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rp4.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f398664d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI videoCompositionRemuxUI = this.f398665e;
            com.tencent.mars.xlog.Log.i(videoCompositionRemuxUI.f176101e, "in IO to init MediaModel");
            videoCompositionRemuxUI.f176103g.f(this.f398666f, this.f398667g, kz5.z.z0(this.f398668h));
            videoCompositionRemuxUI.f176103g.e(rp4.w.f398694d);
            videoCompositionRemuxUI.f176103g.b();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            rp4.g0 g0Var = new rp4.g0(videoCompositionRemuxUI, null);
            this.f398664d = 1;
            if (kotlinx.coroutines.l.g(g3Var, g0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}

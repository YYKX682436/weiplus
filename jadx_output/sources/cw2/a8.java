package cw2;

/* loaded from: classes10.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f223568d;

    /* renamed from: e, reason: collision with root package name */
    public int f223569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rm5.v f223570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView f223571g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(rm5.v vVar, com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView finderVLogCompositionPlayView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f223570f = vVar;
        this.f223571g = finderVLogCompositionPlayView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw2.a8(this.f223570f, this.f223571g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.a8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f223569e;
        com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f223571g;
        rm5.v vVar = this.f223570f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            h0Var2.f310123d = vVar.f397586n;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            cw2.z7 z7Var = new cw2.z7(vVar, finderVLogCompositionPlayView, h0Var2, null);
            this.f223568d = h0Var2;
            this.f223569e = 1;
            if (kotlinx.coroutines.l.g(p0Var, z7Var, this) == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f223568d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        vVar.f397586n = (android.graphics.Bitmap) h0Var.f310123d;
        finderVLogCompositionPlayView.K = false;
        super/*com.tencent.mm.videocomposition.play.VideoCompositionPlayView*/.o(vVar);
        return jz5.f0.f302826a;
    }
}

package mr3;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f330864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f330866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330865e = str;
        this.f330866f = mMRoundCornerImageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mr3.h(this.f330865e, this.f330866f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mr3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f330864d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.graphics.Bitmap b17 = com.tencent.mm.sdk.platformtools.j.b(this.f330865e, 4194304);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            mr3.g gVar = new mr3.g(b17, this.f330866f, null);
            this.f330864d = 1;
            if (kotlinx.coroutines.l.g(g3Var, gVar, this) == aVar) {
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

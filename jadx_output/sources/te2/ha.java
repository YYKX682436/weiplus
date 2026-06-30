package te2;

/* loaded from: classes.dex */
public final class ha extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(te2.hc hcVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418066e = hcVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.ha(this.f418066e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.ha) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418065d;
        te2.hc hcVar = this.f418066e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418065d = 1;
            obj = te2.hc.O6(hcVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
        com.tencent.mm.sdk.platformtools.x.D0((android.graphics.Bitmap) obj, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        ya2.b2 b2Var = hcVar.I;
        ((c61.l7) b6Var).Wk(fj6, b2Var != null ? b2Var.D0() : "", hcVar.getContext());
        return jz5.f0.f302826a;
    }
}

package te2;

/* loaded from: classes.dex */
public final class u4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(te2.p8 p8Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418470e = p8Var;
        this.f418471f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.u4(this.f418470e, this.f418471f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.u4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418469d;
        te2.p8 p8Var = this.f418470e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418469d = 1;
            obj = te2.p8.P6(p8Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = this.f418471f;
        java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
        com.tencent.mm.sdk.platformtools.x.D0((android.graphics.Bitmap) obj, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(fj6)) {
            bitmap = null;
        } else {
            android.graphics.Bitmap j07 = com.tencent.mm.sdk.platformtools.x.j0(fj6, 140, 140, i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a));
            int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(fj6).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            bitmap = com.tencent.mm.sdk.platformtools.x.w0(j07, orientationInDegree);
        }
        ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ni(p8Var.getActivity(), str, bitmap, p8Var.getActivity().getString(com.tencent.mm.R.string.f490551ya), 3, new te2.t4(str, p8Var, fj6)).show();
        return jz5.f0.f302826a;
    }
}

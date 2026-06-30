package te2;

/* loaded from: classes.dex */
public final class o4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418277e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.o4(this.f418277e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.o4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418276d;
        te2.p8 p8Var = this.f418277e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418276d = 1;
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
        java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
        com.tencent.mm.sdk.platformtools.x.D0((android.graphics.Bitmap) obj, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
        p8Var.getClass();
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(p8Var.getActivity(), fj6, new te2.e5(p8Var));
        return jz5.f0.f302826a;
    }
}

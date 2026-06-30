package te2;

/* loaded from: classes.dex */
public final class na extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f418258f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(te2.hc hcVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418257e = hcVar;
        this.f418258f = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.na(this.f418257e, this.f418258f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.na) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418256d;
        te2.hc hcVar = this.f418257e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418256d = 1;
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
        hcVar.getClass();
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(hcVar.getActivity(), fj6, new te2.ra(hcVar));
        this.f418258f.u();
        return jz5.f0.f302826a;
    }
}

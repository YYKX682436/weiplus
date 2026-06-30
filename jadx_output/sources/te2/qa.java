package te2;

/* loaded from: classes.dex */
public final class qa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(te2.hc hcVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418362e = hcVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.qa(this.f418362e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.qa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418361d;
        te2.hc hcVar = this.f418362e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418361d = 1;
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
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", fj6);
        ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Di(intent, hcVar.F, 1);
        j45.l.j(hcVar.getContext(), "sns", ".ui.SnsUploadUI", intent, null);
        return jz5.f0.f302826a;
    }
}

package te2;

/* loaded from: classes.dex */
public final class x4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418528e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418528e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.x4(this.f418528e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.x4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418527d;
        te2.p8 p8Var = this.f418528e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418527d = 1;
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
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_File_Name", fj6);
        intent.putExtra("Retr_Compress_Type", 0);
        intent.putExtra("Retr_Msg_Type", 0);
        ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Di(intent, p8Var.B1, 1);
        android.app.Activity context = p8Var.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        j45.l.x((com.tencent.mm.ui.MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, te2.w4.f418509d);
        return jz5.f0.f302826a;
    }
}

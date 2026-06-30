package fq5;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265669e = transferFileUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fq5.h(this.f265669e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fq5.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f265668d;
        com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = this.f265669e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aq5.p0 p0Var = aq5.p0.f13273a;
            bw5.wd0 wd0Var = transferFileUIC.f214278g;
            this.f265668d = 1;
            obj = p0Var.b(wd0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        aq5.w0 w0Var = (aq5.w0) obj;
        transferFileUIC.f214280i = w0Var.f13330b;
        byte[] bArr = w0Var.f13329a;
        if (bArr != null) {
            int f17 = i65.a.f(transferFileUIC.getContext(), com.tencent.mm.R.dimen.f479683ci);
            android.graphics.Bitmap I = com.tencent.mm.sdk.platformtools.x.I(bArr, f17, f17, null);
            if (I != null) {
                android.graphics.Bitmap o17 = com.tencent.mm.sdk.platformtools.x.o(I, android.graphics.Color.parseColor("#FF2394C5"), android.graphics.Color.parseColor("#FF4372D4"));
                em.j4 j4Var = transferFileUIC.f214276e;
                if (j4Var != null) {
                    if (j4Var.f254487l == null) {
                        j4Var.f254487l = (android.widget.ImageView) j4Var.f254476a.findViewById(com.tencent.mm.R.id.uvr);
                    }
                    android.widget.ImageView imageView = j4Var.f254487l;
                    if (imageView != null) {
                        imageView.post(new fq5.g(transferFileUIC, o17));
                    }
                }
            }
        } else {
            transferFileUIC.V6(5);
        }
        return jz5.f0.f302826a;
    }
}

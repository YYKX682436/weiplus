package jq4;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f301163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f301164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301164e = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jq4.l(this.f301164e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jq4.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f301163d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.widget.ImageView imageView = this.f301164e;
            android.graphics.Bitmap f07 = com.tencent.mm.sdk.platformtools.x.f0(com.tencent.mm.R.drawable.f482207ch5, null, null, null, false, 0.0f, imageView.getWidth(), imageView.getHeight());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            jq4.k kVar = new jq4.k(imageView, f07, null);
            this.f301163d = 1;
            if (kotlinx.coroutines.l.g(g3Var, kVar, this) == aVar) {
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
